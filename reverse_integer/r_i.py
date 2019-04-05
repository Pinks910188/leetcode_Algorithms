class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x > 0 :
            ans = int(str(x)[::-1])
        if x <= 0:
            ans = -1 * int(str(x * -1)[::-1])
        minans = -2**31  
        maxans= 2**31 - 1
        if ans < minans or ans > maxans:
            return 0
        else:
            return ans
