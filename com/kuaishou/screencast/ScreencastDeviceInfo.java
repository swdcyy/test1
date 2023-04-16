package com.kuaishou.screencast.ScreencastDeviceInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.StringBuilder;

public class ScreencastDeviceInfo implements Serializable	// class@000eff
{
    public String mDeviceIp;
    public String mDeviceName;
    public String mDeviceUid;
    public static final long serialVersionUID = 0xf0f75c6530b9d83b;

    public void ScreencastDeviceInfo(String p0,String p1,String p2){
       super();
       this.mDeviceName = p0;
       this.mDeviceIp = p1;
       this.mDeviceUid = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ScreencastDeviceInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 != null && this.getClass() == p0.getClass()) {
          ScreencastDeviceInfo tmDeviceUid = this.mDeviceUid;
          if (tmDeviceUid != null) {
             ScreencastDeviceInfo mDeviceUid = p0.mDeviceUid;
             if (mDeviceUid != null && TextUtils.equals(tmDeviceUid, mDeviceUid)) {
                return true;
             }
          }
          if (TextUtils.equals(this.mDeviceIp, p0.mDeviceIp) && TextUtils.equals(this.mDeviceName, p0.mDeviceName)) {
             return true;
          }
       }
    label_004b :
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ScreencastDeviceInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.mDeviceIp+"_"+this.mDeviceName+"_"+this.mDeviceUid).hashCode();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ScreencastDeviceInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ScreencastDeviceInfo{mDeviceName=\'"+this.mDeviceName+'''+", mDeviceIp=\'"+this.mDeviceIp+'''+", mDeviceUid=\'"+this.mDeviceUid+'''+'}';
    }
}
