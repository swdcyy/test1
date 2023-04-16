package com.yxcorp.gifshow.camera.record.tab.CameraTab$11;
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
import com.yxcorp.gifshow.camera.record.mix.MixCameraFragment;

public final class CameraTab$11 extends CameraTab	// class@000f37
{

    public void CameraTab$11(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$11.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f103df6);
    }
    public boolean isDefaultHide(){
       return true;
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$11.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MixCameraFragment();
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
