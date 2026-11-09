package com.bits.leave;

public class LeaveCalculator {
	public int calculatedLeaveBalance(int totalLeaves, int usedLeaves){
		if(usedLeaves <0 || usedLeaves > totalLeaves){
			throw new IllegalArgumentException("Invalid used leaves amount");
		}
		return totalLeaves - usedLeaves;
	}

	public double calculateEncashment(int totalLeaves, int usedLeaves, double perDaySalary){
		int balance = calculatedLeaveBalance(totalLeaves, usedLeaves);
		return balance * perDaySalary;
	}
}

