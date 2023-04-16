package com.kwai.feature.bridges.common.beans.JsBottomSheetResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class JsBottomSheetResult implements Serializable	// class@0011d5
{
    public String mErrorMsg;
    public int mResult;
    public String mValue;
    public static final long serialVersionUID = 0x23e9b25819cb60c4;

    public void JsBottomSheetResult(){
       super();
       this.mResult = 0;
    }
    public void JsBottomSheetResult(int p0,String p1,String p2){
       super();
       this.mResult = 0;
       this.mResult = p0;
       this.mErrorMsg = p1;
       this.mValue = p2;
    }
}
