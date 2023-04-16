package com.kwai.feature.api.feed.growth.model.JsMobileResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsMobileResult implements Serializable	// class@000ecf
{
    public final String mPhone;
    public final int mResult;
    public static final long serialVersionUID = 0x9470fd780b5a00da;

    public void JsMobileResult(int p0,String p1){
       super();
       this.mResult = p0;
       this.mPhone = p1;
    }
}
