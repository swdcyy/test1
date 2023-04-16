package com.yxcorp.gifshow.dialog.kem.h$c;
import com.kwai.library.widget.popup.common.PopupInterface$e;
import com.yxcorp.gifshow.dialog.kem.h;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.app.Activity;
import x9a.d0;
import za5.c;
import java.util.Objects;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import com.yxcorp.gifshow.model.response.dialog.KemCommonVideoDialogResponse;
import te6.b;
import com.kwai.framework.perf.degrade.DegradeScenes;
import ac6.a;
import ac6.d;

public final class h$c implements PopupInterface$e	// class@001abd
{
    public final h a;

    public void h$c(h p0){
       this.a = p0;
       super();
    }
    public final boolean a(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h$c obj = PatchProxy.apply(objArray, this, h$c.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!c.d(this.a.a())) {
          obj = this.a;
          Objects.requireNonNull(obj);
          String obj1 = PatchProxy.apply(objArray, obj, h.class, "2");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             h d = obj.d;
             obj1 = d.B(obj.b().mMaterialUrl);
             DegradeScenes uDegradeScen = (obj1 == null || !obj1.length())? 1: null;
             if (!uDegradeScen || (!d.b(DegradeScenes.GLOBAL_POPUP).a() && d.t(obj.b().mVideoUrl))) {
                b1 = true;
             }else {
                b1 = false;
             }
          }
          if (b1) {
          label_0076 :
             return b;
          }
       }
       b = false;
       goto label_0076 ;
    }
}
