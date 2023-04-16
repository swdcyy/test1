package com.kwai.yoda.function.system.GetLocationFunction$LocationResultParams;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.system.GetLocationFunction$LocationResultParams$a;
import nsd.u;
import java.lang.String;

public final class GetLocationFunction$LocationResultParams extends FunctionResultParams	// class@0011e7
{
    public String mLatitude;
    public String mLongitude;
    public static final GetLocationFunction$LocationResultParams$a Companion;
    public static final long serialVersionUID;

    static {
       GetLocationFunction$LocationResultParams.Companion = new GetLocationFunction$LocationResultParams$a(null);
    }
    public void GetLocationFunction$LocationResultParams(){
       super();
    }
    public final String getMLatitude(){
       return this.mLatitude;
    }
    public final String getMLongitude(){
       return this.mLongitude;
    }
    public final void setMLatitude(String p0){
       this.mLatitude = p0;
    }
    public final void setMLongitude(String p0){
       this.mLongitude = p0;
    }
}
