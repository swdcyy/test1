package com.yxcorp.gifshow.camera.record.tab.CameraTab$1;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import mm6.c;
import tkd.b;
import tkd.d;
import a36.a;
import a36.b;

public final class CameraTab$1 extends CameraTab	// class@000f3a
{

    public void CameraTab$1(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public int getItemViewId(){
       return 0x7f0d0194;
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f1036b1);
    }
    public int getTextViewId(){
       return 0x7f0a2bef;
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-291827557).Wl();
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
