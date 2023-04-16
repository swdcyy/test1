package com.yxcorp.gifshow.camera.record.tab.CameraTab$4;
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
import com.yxcorp.gifshow.util.PostExperimentUtils;
import eh9.n;

public final class CameraTab$4 extends CameraTab	// class@000f3d
{

    public void CameraTab$4(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f104b94);
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$4.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CameraTab.CAMERA_TAB_VIDEO.newFragment();
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
