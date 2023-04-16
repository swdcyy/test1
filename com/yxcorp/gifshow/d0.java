package com.yxcorp.gifshow.d0;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.prettify.PrettifyPlugin;
import com.yxcorp.gifshow.camera.record.base.b;
import n0c.a;
import androidx.fragment.app.Fragment;
import lnc.s1;
import com.yxcorp.gifshow.camera.record.base.b$a;
import oc9.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.prettify.i;
import com.yxcorp.gifshow.prettify.e;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.o5;

public class d0 extends RecordPModuleRegister$a	// class@001db9
{

    public void d0(){
       super();
    }
    public void a(CameraBaseFragment p0,RecordPModuleRegister$PModuleSubBiz p1){
       if (PatchProxy.applyVoidTwoRefs(p0, null, this, d0.class, "3")) {
          return;
       }
       if (!d.a(0x76e9c37c).isAvailable()) {
          return;
       }
       p0.ih().c(a.class).g();
       return;
    }
    public void b(CameraBaseFragment p0,RecordPModuleRegister$PModuleSubBiz p1){
       if (PatchProxy.applyVoidTwoRefs(p0, null, this, d0.class, "2")) {
          return;
       }
       if (!d.a(0x76e9c37c).isAvailable()) {
          return;
       }
       b uob = p0.ih();
       if (uob.c(a.class) == null) {
          a uoa = new a();
          uoa.h(p0.hashCode());
          uob.n(a.class, new s1(uoa));
       }
       return;
    }
    public t c(CameraBaseFragment p0,RecordPModuleRegister$PModuleSubBiz p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, d0.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!d.a(0x76e9c37c).isAvailable()) {
          return null;
       }
       if (p0.lh() == CameraPageType.VIDEO) {
          return new i(p0.lh(), p0.ih());
       }
       return new e(p0.lh(), p0.ih());
    }
    public void f(Intent p0){
       int i;
       d0 uod0 = d0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod0, "4")) {
          return;
       }
       super.f(p0);
       if (p0 != null && p0.getData() != null) {
          Uri data = p0.getData();
          String str = x0.a(data, "filterId");
          String str1 = x0.a(data, "filterName");
          String str2 = x0.a(data, "makeUpId");
          String str3 = x0.a(data, "makeUpName");
          String obj = PatchProxy.applyOneRefs(data, this, uod0, "5");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             obj = "magicDownloadSliderStyle";
             int i1 = 0;
             if (!TextUtils.x(x0.a(data, obj))) {
                i = o5.b(x0.a(data, obj), i1);
                boolean b = (i != 1 && (!i || i == 2))? true: false;
                if (!b) {
                label_0069 :
                   i = 0;
                }
             }else {
                goto label_0069 ;
             }
          }
          if (!TextUtils.x(str)) {
             p0.putExtra("filterId", str);
             p0.putExtra("filterName", str1);
             p0.putExtra("showPanelTypeDefault", 3);
             p0.putExtra("magic_download_bar_mode", i);
          }else if(!TextUtils.x(str2)){
             p0.putExtra("makeUpId", str2);
             p0.putExtra("makeUpName", str3);
             p0.putExtra("showPanelTypeDefault", 1);
             p0.putExtra("magic_download_bar_mode", i);
          }
       }
    label_0094 :
       return;
    }
}
