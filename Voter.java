/*
initialize 25 and 18 for age and vage respectively.
age more than or equal to vage then print "Old enough to vote!".
age less than the vage then print "Not old enough to vote"
*/
class Voter
{
public static void main(String args[])
{
int age=25,vage=18;
if(age>=vage)  //age is greater than the vage execute if block
{
System.out.println("Old enough to vote!");
}
else  // if age is less than the vage then execute else statement
{
System.out.println("Not old enough to vote");
}
}
}
