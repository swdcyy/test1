package com.kwai.feature.api.platform.bridge.beans.JsSelectCityResult;
import java.io.Serializable;
import com.kwai.feature.api.platform.bridge.beans.JsSelectCityResult$SelectCityData;
import java.lang.Object;

public class JsSelectCityResult implements Serializable	// class@001067
{
    public final JsSelectCityResult$SelectCityData mData;
    public final int mResult;
    public static final long serialVersionUID = 0xc930286c4526effe;

    public void JsSelectCityResult(JsSelectCityResult$SelectCityData p0){
       super();
       this.mResult = 1;
       this.mData = p0;
    }
}
