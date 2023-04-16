package com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsQueryStickyOnTopResult;
import java.io.Serializable;
import java.lang.Object;

public class JsQueryStickyOnTopResult implements Serializable	// class@001666
{
    public String mErrorMsg;
    public final int mResult;
    public boolean mStickyOnTop;
    public static final long serialVersionUID = 0xb37aaeb6a969480b;

    public void JsQueryStickyOnTopResult(int p0,boolean p1){
       super();
       this.mResult = p0;
       this.mStickyOnTop = p1;
    }
    public void JsQueryStickyOnTopResult(boolean p0){
       super();
       this.mResult = 1;
       this.mStickyOnTop = p0;
    }
}
