package com.kuaishou.android.model.mix.HotspotParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class HotspotParams implements Serializable	// class@000ca8
{
    public int mConnectType;
    public String mId;
    public String mName;
    public static final long serialVersionUID = 0xa25bb77aac89c594;

    public void HotspotParams(){
       super();
    }
    public int getConnectType(){
       return this.mConnectType;
    }
    public String getId(){
       return this.mId;
    }
    public String getName(){
       return this.mName;
    }
    public boolean isValid(){
       HotspotParams obj = PatchProxy.apply(null, this, HotspotParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mId;
       boolean b = (obj != null && (this.mName != null && (!obj.isEmpty() && !(this.mName).isEmpty())))? true: false;
       return b;
    }
}
