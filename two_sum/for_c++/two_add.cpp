class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> mapvec;
        vector<int> ans; 
        for (int i = 0; i < nums.size();i++){
            mapvec.insert(pair<int,int>(nums[i],i));
        }
        for (int i = 0; i < nums.size();i++){
            int temp = target - nums[i];
            if (mapvec.find(temp) != mapvec.end() && mapvec.find(temp)->second != i){
                ans.push_back(i);
                ans.push_back(mapvec.find(temp)->second);
                return ans;
            }
        }
        return ans;
    }
};