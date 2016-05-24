public class OperateDemo3
{
	public static void main(String [ ] args)
	{
	/*
		比较运算符,运算完成的结果必须是true或者false.
		
		//System.out.println(3>2);//true
		//System.out.println(3<2);//false
		//System.out.println(5==5);//true
		//System.out.println(3==2);//false
		//System.out.println(3!=2);//true    !=是不等于的意思
		//System.out.println(3=2);//输出错误3=2的=为赋值不是等于
	----------------------------------------------------------------------------------------------------
	*/
		
	/*
		//2<x<5	2<x     x<5
		/* 逻辑运算符有什么用?
		用于连接 两个boolean类型的表达式.
		&   :与	|    :或
		
		&	:符号的运算特点
		true & true  =true;
		true & false = false;
		false & true =false;
		false & false =false ;
		&	:运算规律;
		&运算的两边只要有一个是false,结果肯定是false.
		只有两边都为true,结果才是true.
	-------------------------------------------------------------------------------------------
	*/	

	/*
		|	:运算特点:
		true | true = true;
		true | false = true;
		false | true = true;
		false | false = false;
		|	:运算规律;
		|运算的两边只要有一个是true,结果可定时true.
		只有两边都为false,结果是false.
	-------------------------------------------------------------------------------------------
	*/

	/*
		^	:异或:和或有一点不一样.
		^	的运算特点:
		true ^ true = false;
		true ^ false = true;
		false ^	true = true;
		false ^ false = false;
		^异或的运算规律:
		^符号的两边结果如果相同,结果是false.
		两边的结果不同,结果是true.
	-------------------------------------------------------------------------------------------
	*/

	/*
		!	:非运算,判断事物的另一面.
		!true = false
		!false = true
		!!true = true
	-------------------------------------------------------------------------------------------
	*/

	/*
		&&	:的特点和&运算的结果是一样的,但是运算过程有点小区别.
		&	:无论左边的运算结果是什么,右边都参与运算.
		&&	:当左边运算为false时,右边不参与运算.
	-------------------------------------------------------------------------------------------
	*/

	/*
		||	:的特点和&运算的结果是一样的,但是运算过程有点小区别.
		|	:无论左边的运算结果是什么,右边都参与运算.
		||	:当左边运算为true时,右边不参与运算.
	-------------------------------------------------------------------------------------------
	*/
	
		int x = 3;
		//System.out.println(x > 2 & x < 5);//true
		//System.out.println(x < 2  | x > 5);//false
		//System.out.println(x < 4  ^ x > 2);//false
	}
}
