package com.tencent.mm.opensdk.modelmsg.WXLocationObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;

public class WXLocationObject implements WXMediaMessage$IMediaObject	// class@000efa
{
    public double lat;
    public double lng;

    public void WXLocationObject(){
       super(0, 0);
    }
    public void WXLocationObject(double p0,double p1){
       super();
       this.lat = p0;
       this.lng = p1;
    }
    public boolean checkArgs(){
       return true;
    }
    public void serialize(Bundle p0){
       p0.putDouble("_wxlocationobject_lat", this.lat);
       p0.putDouble("_wxlocationobject_lng", this.lng);
    }
    public int type(){
       return 30;
    }
    public void unserialize(Bundle p0){
       this.lat = p0.getDouble("_wxlocationobject_lat");
       this.lng = p0.getDouble("_wxlocationobject_lng");
    }
}
