package com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.RNFetchBlob.RNFetchBlobProgressConfig$ReportType;
import java.lang.Object;
import java.lang.Math;
import java.lang.System;

public class RNFetchBlobProgressConfig	// class@000d58
{
    public long a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public RNFetchBlobProgressConfig$ReportType f;

    public void RNFetchBlobProgressConfig(boolean p0,int p1,int p2,RNFetchBlobProgressConfig$ReportType p3){
       super();
       this.a = 0;
       this.b = 0;
       this.c = -1;
       this.d = -1;
       this.e = false;
       this.f = RNFetchBlobProgressConfig$ReportType.Download;
       this.e = p0;
       this.d = p1;
       this.f = p3;
       this.c = p2;
    }
    public boolean a(float p0){
       RNFetchBlobProgressConfig tc = this.c;
       boolean b = false;
       int i = 1;
       RNFetchBlobProgressConfig rNFetchBlobP = (tc > null && (p0 <= 0 || Math.floor((double)(p0 * (float)tc)) - (double)this.b > 0))? 1: null;
       if ((System.currentTimeMillis() - this.a) - (long)this.d > 0 && (this.e != null && rNFetchBlobP)) {
          b = true;
       }
    label_0033 :
       if (b) {
          this.b = this.b + i;
          this.a = System.currentTimeMillis();
       }
       return b;
    }
}
