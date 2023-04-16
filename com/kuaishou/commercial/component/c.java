package com.kuaishou.commercial.component.c;
import android.os.Build$VERSION;
import java.lang.Object;
import ow.k;
import com.kuaishou.commercial.component.c$a;
import com.kuaishou.commercial.component.c$b;
import com.kuaishou.commercial.component.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import java.lang.StringBuilder;
import yx.j0;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.commercial.component.TransparentBgDialogFragment;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.JsToastParams;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.JsToastParams$Type;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.f;
import erd.g;
import java.lang.Throwable;
import mxb.i;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.kwai.robust.PatchProxyResult;
import nl9.i0;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import mxb.i0;
import ow.j;
import o49.d;
import ow.l;
import zl9.c;
import com.kuaishou.commercial.component.a;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import ow.i;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class c	// class@001499
{
    public TransparentBgDialogFragment a;
    public i0 b;
    public int c;
    public b d;
    public g e;
    public g f;
    public Runnable g;
    public final Runnable h;
    public final b i;
    public final b j;
    public t k;
    public final Runnable l;
    public static final int m;

    static {
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 26) {
          c.m = 4000;
       }else if(sDK_INT >= 23){
          c.m = 7000;
       }else {
          c.m = 0x2710;
       }
    }
    public void c(){
       super();
       this.c = -1;
       this.h = new k(this);
       this.i = new c$a(this);
       this.j = new c$b(this);
       this.l = new b(this);
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "11")) {
          return;
       }
       k1.m(this.h);
       Object[] objArray = new Object[0];
       j0.l("TransparentBgWebViewHelper", "dismissDialogOnError£¬ msg: "+p0, objArray);
       c ta = this.a;
       if (ta != null && (ta.getDialog() != null && this.a.getDialog().isShowing())) {
          this.a.dismissAllowingStateLoss();
          JsToastParams jsToastParam = new JsToastParams();
          jsToastParam.mType = JsToastParams$Type.NORMAL;
          jsToastParam.mText = f.o(0x7f1038e5).toString();
          this.d(jsToastParam);
       }
    label_005d :
       ta = this.e;
       if (ta != null) {
          try{
             ta.accept(String.valueOf(this.c));
             this.e = null;
          }catch(java.lang.Exception e3){
             j0.b("TransparentBgWebViewHelper", "fail callback exception", e3);
          }
       }
    }
    public final AdDataWrapper$AdLogParamAppender b(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AdDataWrapper$AdLogParamAppender adLogParamAp = (p0 != null)? p0.getAdLogParamAppender(): null;
       return adLogParamAp;
    }
    public final void c(i0 p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "9")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       i0.a().e(50, p1).f(this.b(p0.f)).d(new j(p0)).a();
       d.b(p1, p0.c);
       return;
    }
    public void d(JsToastParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.g = new l(p0);
       return;
    }
    public DialogFragment e(i0 p0,BaseFeed p1,c p2,g p3,g p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b = p0;
       this.f = p3;
       this.e = p4;
       TransparentBgDialogFragment transparentB = new TransparentBgDialogFragment();
       this.a = transparentB;
       transparentB.yh(new a(this, p0, p2, p1));
       this.a.nh(0);
       this.a.Cb(p0.b, p0.d);
       k1.r(this.h, (long)c.m);
       this.d = this.a.m().subscribe(new i(this), Functions.e);
       return this.a;
    }
}
