package com.yxcorp.gifshow.activity.share.model.LocationResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LocationResponse implements CursorResponse, Serializable	// class@001391
{
    public String mCityName;
    public String mCursor;
    public List mLocations;
    public static final long serialVersionUID = 0xd32a8a5301fa0be1;

    public void LocationResponse(){
       super();
    }
    public String getCityName(){
       return this.mCityName;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mLocations;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LocationResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public void setCityName(String p0){
       this.mCityName = p0;
    }
    public void setCursor(String p0){
       this.mCursor = p0;
    }
    public void setLocations(List p0){
       this.mLocations = p0;
    }
}
