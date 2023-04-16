package com.yxcorp.gifshow.camera.record.tab.CameraTab$6;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import android.app.Application;
import mm6.c;
import eh9.n;

public final class CameraTab$6 extends CameraTab	// class@000f3f
{

    public void CameraTab$6(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PostExperimentUtils.b() == 1) {
          return a.a().a().getString(0x7f104b93);
       }
       return a.a().a().getString(0x7f104b8b);
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$6.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CameraTab.CAMERA_TAB_VIDEO.newFragment();
    }
}
