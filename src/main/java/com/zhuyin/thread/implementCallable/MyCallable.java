package com.zhuyin.thread.implementCallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	private int start;
	private int end;
	public MyCallable() {
	}
	public MyCallable(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public Integer call() throws Exception {
		int sum=0;
		for(int i=start;i<=end;i++){
			sum+=i;
		}
		return sum;
	}

}
