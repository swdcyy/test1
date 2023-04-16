package com.yxcorp.gifshow.nearby.common.bridge.JS2NResult;
import java.io.Serializable;
import com.yxcorp.gifshow.nearby.common.bridge.JS2NResult$a;
import nsd.u;
import java.lang.Object;

public final class JS2NResult implements Serializable	// class@0020e5
{
    public final int mResult;
    public static final JS2NResult$a Companion;
    public static final JS2NResult ERROR;
    public static final JS2NResult SUCCESS;

    static {
       JS2NResult.Companion = new JS2NResult$a(null);
       JS2NResult.ERROR = new JS2NResult(0);
       JS2NResult.SUCCESS = new JS2NResult(1);
    }
    public void JS2NResult(){
       super(0, 1, null);
    }
    public void JS2NResult(int p0){
       super();
       this.mResult = p0;
    }
    public void JS2NResult(int p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = 0;
       }
       super(p0);
       return;
    }
    public final int getMResult(){
       return this.mResult;
    }
}
