package com.yxcorp.gifshow.camera.record.tab.CameraTab$9;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import android.app.Application;
import mm6.c;
import android.os.Bundle;
import tkd.b;
import tkd.d;
import um6.i;
import um6.j;

public final class CameraTab$9 extends CameraTab	// class@000f42
{

    public void CameraTab$9(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$9.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f101ade);
    }
    public c newFragment(){
       Bundle obj = PatchProxy.apply(null, this, CameraTab$9.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putBoolean("key_need_frame_adapter", true);
       return d.a(0x6ea9440a).j20(obj);
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
