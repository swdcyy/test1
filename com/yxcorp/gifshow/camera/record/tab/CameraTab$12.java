package com.yxcorp.gifshow.camera.record.tab.CameraTab$12;
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
import com.yxcorp.gifshow.camera.record.whatsup.WhatsUpFragment;

public final class CameraTab$12 extends CameraTab	// class@000f38
{

    public void CameraTab$12(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$12.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f101a9c);
    }
    public boolean isDefaultHide(){
       return true;
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$12.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WhatsUpFragment();
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
