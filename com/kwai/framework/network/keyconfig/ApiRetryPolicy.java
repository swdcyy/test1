package com.kwai.framework.network.keyconfig.ApiRetryPolicy;
import java.lang.Object;

public class ApiRetryPolicy	// class@000c13
{
    public int apiRetryIntervalRandMs;
    public int apiRetryTimes;

    public void ApiRetryPolicy(){
       super();
       this.apiRetryTimes = 0;
       this.apiRetryIntervalRandMs = 2000;
    }
}
