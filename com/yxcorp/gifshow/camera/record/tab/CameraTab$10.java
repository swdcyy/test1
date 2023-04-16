package com.yxcorp.gifshow.camera.record.tab.CameraTab$10;
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
import tkd.b;
import tkd.d;
import bq.a;

public final class CameraTab$10 extends CameraTab	// class@000f36
{

    public void CameraTab$10(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$10.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f100ac6);
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$10.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x7c418b06).IH();
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
