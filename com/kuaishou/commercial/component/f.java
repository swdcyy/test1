package com.kuaishou.commercial.component.f;
import android.os.Build$VERSION;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import com.kuaishou.commercial.component.f$a;
import ow.s;
import com.kuaishou.commercial.component.f$b;
import com.kuaishou.commercial.component.e;
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
import ow.t;
import nl9.i0;
import com.kwai.framework.model.feed.BaseFeed;
import zl9.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import mxb.i;
import com.kuaishou.commercial.component.d;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import ow.r;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class f	// class@00149f
{
    public final AdYodaConfig a;
    public o b;
    public TransparentBgDialogFragment c;
    public i0 d;
    public int e;
    public final b f;
    public b g;
    public g h;
    public g i;
    public Runnable j;
    public final Runnable k;
    public final b l;
    public final Runnable m;
    public static final int n;

    static {
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 26) {
          f.n = 4000;
       }else if(sDK_INT >= 23){
          f.n = 7000;
       }else {
          f.n = 0x2710;
       }
    }
    public void f(){
       super();
       this.a = new AdYodaConfig();
       this.e = -1;
       this.f = new f$a(this);
       this.k = new s(this);
       this.l = new f$b(this);
       this.m = new e(this);
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "11")) {
          return;
       }
       k1.m(this.k);
       Object[] objArray = new Object[0];
       j0.l("TransparentBgWebViewHelper", "dismissDialogOnError£¬ msg: "+p0, objArray);
       f tc = this.c;
       if (tc != null && (tc.getDialog() != null && this.c.getDialog().isShowing())) {
          this.c.dismissAllowingStateLoss();
          JsToastParams jsToastParam = new JsToastParams();
          jsToastParam.mType = JsToastParams$Type.NORMAL;
          jsToastParam.mText = f.o(0x7f1038e5).toString();
          this.b(jsToastParam);
       }
    label_005d :
       tc = this.h;
       if (tc != null) {
          try{
             tc.accept(String.valueOf(this.e));
             this.h = null;
          }catch(java.lang.Exception e3){
             j0.b("TransparentBgWebViewHelper", "fail callback exception", e3);
          }
       }
    }
    public void b(JsToastParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.j = new t(p0);
       return;
    }
    public DialogFragment c(i0 p0,BaseFeed p1,c p2,g p3,g p4){
       i0 f;
       AdDataWrapper$AdLogParamAppender adLogParamAp;
       i0 oi0 = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       int i = 1;
       if (PatchProxy.isSupport(f.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          Object obj = PatchProxy.apply(objArray, oi0, f.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       oi0.d = oobject;
       oi0.i = oobject3;
       oi0.h = oobject4;
       TransparentBgDialogFragment transparentB = new TransparentBgDialogFragment();
       oi0.c = transparentB;
       if (oi0.d.i != null) {
          transparentB.vh(i);
       }
       f a = oi0.a;
       f d = oi0.d;
       if (!PatchProxy.applyVoidThreeRefs(a, p1, d, this, f.class, "8")) {
          a.mFeed = oobject1;
          a.mUrl = d.c;
          a.mAdPosition = d.g;
          a.mWebSource = 3;
          a.mEntrySource = 3;
          f = d.f;
          AdDataWrapper$AdLogParamAppender uAdLogParamA = PatchProxy.applyOneRefs(f, oi0, f.class, "12");
          if (uAdLogParamA != PatchProxyResult.class) {
          }else if(f != null){
             adLogParamAp = f.getAdLogParamAppender();
          }else {
             adLogParamAp = 0;
          }
          uAdLogParamA = adLogParamAp;
          a.mLogParamAppender = uAdLogParamA;
          a.mAdClickTime = k1.i();
          a.mEnterTime = k1.i();
          a.mAutoRegisterFragmentLifecycle = false;
       }
       oi0.c.yh(new d(oi0, oobject, oobject2, oobject1));
       oi0.c.nh(0);
       oi0.c.Cb(oobject.b, oobject.d);
       k1.r(oi0.k, (long)f.n);
       oi0.g = oi0.c.m().subscribe(new r(oi0), Functions.e);
       return oi0.c;
    }
}
