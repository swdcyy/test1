package com.yxcorp.gifshow.local.sub.entrance.sizer.model.NearbySubSizerResponse;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CloneNotSupportedException;

public class NearbySubSizerResponse implements Serializable, Cloneable	// class@001ac2
{
    public FestivalIcon mFestivalIcon;
    public WeatherBar mWeatherBar;
    public static final long serialVersionUID = 0x207e6c836dccb62b;

    public void NearbySubSizerResponse(){
       super();
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, NearbySubSizerResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
}
