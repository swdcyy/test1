package com.yxcorp.gifshow.camera.record.tab.CameraTab$3;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import mm6.c;
import eh9.n;

public final class CameraTab$3 extends CameraTab	// class@000f3c
{

    public void CameraTab$3(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public int getItemViewId(){
       return 0x7f0d0190;
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mTabText)) {
          return this.mTabText;
       }
       return "»î¶¯";
    }
    public int getTagStubId(){
       return 0x7f0a00c2;
    }
    public int getTextViewId(){
       return 0x7f0a00c1;
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CameraTab.CAMERA_TAB_VIDEO.newFragment();
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
