class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        for i in range(1,len(digits)+1):
            if digits[-i] != 9:
                digits[-i] += 1
                break
            else:
                digits[-i] = 0
                if len(digits) < i +1:
                    digits.insert(-i,1)
        return digits
