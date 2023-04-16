package com.yxcorp.gifshow.camera.record.tab.CameraTab$5;
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
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;

public final class CameraTab$5 extends CameraTab	// class@000f3e
{

    public void CameraTab$5(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public int getItemViewId(){
       return 0x7f0d0196;
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f104b8f);
    }
    public int getTextViewId(){
       return 0x7f0a43ec;
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$5.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StandardCameraFragment();
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
