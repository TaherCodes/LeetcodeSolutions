/*
Example of the Problem: 
Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
*/

////////////////////////////////////////////// MY SOLUTION //////////////////////////////////////////////
class Solution {
    public String defangIPaddr(String address) {
        String newAddress = address.replace(".", "[.]");
        return newAddress;

    }
}
