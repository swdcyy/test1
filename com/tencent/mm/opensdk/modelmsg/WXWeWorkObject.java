package com.tencent.mm.opensdk.modelmsg.WXWeWorkObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;

public class WXWeWorkObject implements WXMediaMessage$IMediaObject	// class@000f09
{
    public byte[] data;
    public String extInfo;
    public int subType;

    public void WXWeWorkObject(){
       super();
    }
    public boolean checkArgs(){
       return true;
    }
    public void serialize(Bundle p0){
       p0.putByteArray("_wxenterprise_object_data", this.data);
       p0.putString("_wxenterprise_object_extinfo", this.extInfo);
       p0.putInt("_wxenterprise_object_subType", this.subType);
    }
    public int type(){
       return 49;
    }
    public void unserialize(Bundle p0){
       this.data = p0.getByteArray("_wxenterprise_object_data");
       this.extInfo = p0.getString("_wxenterprise_object_extinfo");
       this.subType = p0.getInt("_wxenterprise_object_subType");
    }
}
