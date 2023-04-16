package com.yxcorp.gifshow.camera.record.tab.CameraTab$2;
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
import com.yxcorp.gifshow.camera.record.activity.HtmlCameraFragment;

public final class CameraTab$2 extends CameraTab	// class@000f3b
{

    public void CameraTab$2(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public int getItemViewId(){
       return 0x7f0d0192;
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mTabText)) {
          return this.mTabText;
       }
       return "»î¶¯";
    }
    public int getTagStubId(){
       return 0x7f0a00c8;
    }
    public int getTextViewId(){
       return 0x7f0a00c7;
    }
    public c newFragment(){
       Object obj = PatchProxy.apply(null, this, CameraTab$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HtmlCameraFragment();
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
