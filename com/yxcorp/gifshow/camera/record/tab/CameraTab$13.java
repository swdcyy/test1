package com.yxcorp.gifshow.camera.record.tab.CameraTab$13;
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
import com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment;

public final class CameraTab$13 extends CameraTab	// class@000f39
{

    public void CameraTab$13(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$13.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f104b99);
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$13.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AlbumWrapperFragment();
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
