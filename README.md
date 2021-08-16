# Wifi-password-generation

Generate the Wifi password for the hotel. There is rules for generate the password. the password 
should be 4 digit length.
Rule 1: The unit digit of the wifi password is last letter of the customer name.
Rule 2: The 10th digit of the wifi password is unit digit of the room number.
Rule 3: 100th position of the password is symbol(refer the table) based on the 10th position of 
the room number.
1 !
2 @
3 #
4 $
5 %
6 ^
7 &
8 *
9 (
0 )

Rule 4: Sum of the digit of the room number. if it is odd number increment the value.
Example:
Input 1: 105
input 2: bala
output: 6)5a
Note:
1. If the room number less than 100 and greater than 999, password will be '0000'
2. Password should not be exceeding 4 characters and it is case sensitive
