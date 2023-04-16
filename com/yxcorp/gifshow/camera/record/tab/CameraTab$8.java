package com.yxcorp.gifshow.camera.record.tab.CameraTab$8;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.framework.abtest.f;
import o56.c;
import o56.a;
import android.app.Application;
import mm6.c;
import qs5.d;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.os.Bundle;
import com.yxcorp.gifshow.camera.record.live.LiveEntryWrapperFragment;
import androidx.fragment.app.Fragment;
import jd6.g;
import tkd.b;
import tkd.d;
import os5.g;
import com.kwai.plugin.dva.Dva;

public final class CameraTab$8 extends CameraTab	// class@000f41
{

    public void CameraTab$8(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public int getItemViewId(){
       Object obj = PatchProxy.apply(null, this, CameraTab$8.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (f.a("enableDeleteLiveTabNoticeAdr"))? 0x7f0d018d: 0x7f0d018c;
       return i;
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$8.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f101ce3);
    }
    public int getTextViewId(){
       return 0x7f0a247c;
    }
    public c newFragment(){
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, CameraTab$8.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = d.d;
       Objects.requireNonNull(obj);
       boolean a = d.a;
       Object obj1 = PatchProxy.apply(objArray, objArray, d.class, "7");
       long l = (obj1 != patchProxyRe)? obj1.longValue(): a.t().u("SOURCE_LIVE").b("delayAnchorEntranceLoadMills", 0);
       Object[] objArray1 = new Object[0];
       a.D().w("LiveEntryWrapperFragment", "delayLoadPlugin : delayMs="+l+" hadLoaded="+a, objArray1);
       if (!a && l > 0) {
          Objects.requireNonNull(obj);
          d.a = true;
          Bundle uBundle = new Bundle();
          uBundle.putLong("liveAnchorPluginDelayLoadMs", l);
          LiveEntryWrapperFragment liveEntryWra = new LiveEntryWrapperFragment();
          liveEntryWra.setArguments(uBundle);
          return liveEntryWra;
       }else {
          String str = "live_anchor_plugin";
          int i = 0x3652a147;
          if (g.e(str)) {
             objArray2 = new Object[0];
             a.D().w("LiveEntryWrapperFragment", "isSourceMode, launch source...", objArray2);
             return d.a(i).Lh();
          }else if(Dva.instance().isLoaded(str)){
             objArray2 = new Object[0];
             a.D().w("LiveEntryWrapperFragment", "isPluginMode, isLoaded...", objArray2);
             return d.a(i).Lh();
          }else {
             objArray2 = new Object[0];
             a.D().w("LiveEntryWrapperFragment", "isPluginMode, launch plugin...", objArray2);
             return new LiveEntryWrapperFragment();
          }
       }
    }
}
