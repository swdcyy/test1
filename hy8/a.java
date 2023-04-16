package hy8.a;
import hy8.a$a;
import nsd.u;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationRule;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import kotlin.jvm.internal.a;
import qw.e;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import android.view.View;
import g59.k0;
import com.kwai.library.widget.popup.common.c;
import k2b.e0;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import lnc.y0;
import yx.j0;
import i2b.a;
import hy8.d;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import qw.f;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import com.kwai.library.widget.popup.common.c$b;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import hy8.b;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import hy8.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@0025ee
{
    public View a;
    public c b;
    public final NeoNavigationRule c;
    public final int d;
    public final WeakReference e;
    public static final a$a f;

    static {
       a.f = new a$a(null);
    }
    public void a(NeoNavigationRule p0,int p1,WeakReference p2,u p3){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public final void a(KwaiImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       if (p0 != null) {
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-commercial:commercial-libraries:commercial-core");
          uoa.d(ImageSource.FEED_COVER);
          a uoa1 = uoa.a();
          a.o(uoa1, "KwaiImageCallerContext.n¡­EED_COVER\)\n      .build\(\)");
          p0.M(e.b.c(p1), uoa1);
       }
       return;
    }
    public final ClientEvent$ElementPackage b(String p0){
       String str;
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "NEO_NAVIGATION_PENDANT";
       i3 oi3 = i3.f();
       a td = this.d;
       if (td != null) {
          if (td != 1) {
             if (td != 2) {
                if (td != 3) {
                label_0033 :
                   str = "UN_KNOW";
                }else {
                   str = "NEO_NOVEL";
                }
             }else {
                str = "NEO_MERCHANT";
             }
          }else {
             str = "NEO_LIVE";
          }
       }else {
          goto label_0033 ;
       }
       oi3.d("from", str);
       oi3.d("view", p0);
       obj.params = oi3.e();
       return obj;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       k0.e(this.a);
       a tb = this.b;
       if (tb != null) {
          tb.o();
       }
       this.b = null;
       return;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       e0 uoe0 = this.e.get();
       if (uoe0 != null) {
          a.o(uoe0, "mILogPage.get\(\) ?: return");
          u1.B(new ClickMetaData().setLogPage(uoe0).setType(1).setElementPackage(this.b(p0)));
       }
       return;
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       e0 uoe0 = this.e.get();
       if (uoe0 != null) {
          a.o(uoe0, "mILogPage.get\(\) ?: return");
          u1.B0(new ShowMetaData().setLogPage(uoe0).setType(1).setElementPackage(this.b(p0)));
       }
       return;
    }
    public final void f(View p0,Activity p1){
       Object[] objArray;
       boolean b;
       SharedPreferences sharedPrefer;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "container");
       String str = "NeoNavigationPendant";
       if (p0.getContext() != null && (!p0 instanceof ViewGroup || y0.o(p1))) {
          objArray = new Object[0];
          j0.c(str, "Illegal container or activity", objArray);
          return;
       }else if(this.a != null){
          Object[] objArray1 = new Object[0];
          j0.f(str, "Duplicate pendant shown", objArray1);
          k0.e(this.a);
       }else {
          View view = PatchProxy.applyOneRefs(p0, this, a.class, "4");
          if (view != patchProxyRe) {
          }else {
             view = a.d(p0.getContext(), R.layout.arg_RES_7f0d0066, p0, 0);
             this.a(view.findViewById(R.id.ad_neo_navigation_pendant_bg), this.c.img);
             view.setOnClickListener(new d(this, p0));
             a.o(view, "KwaiLayoutInflater.infla¡­\n        }\n      }\)\n    }");
          }
          this.a = view;
       }
       a ta = this.a;
       if (ta != null) {
          ta.setVisibility(8);
       }
       p0.addView(this.a);
       objArray = null;
       c obj = PatchProxy.apply(objArray, this, a.class, "7");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!(this.c.cover).length()){
          sharedPrefer = 1;
       }else {
          sharedPrefer = null;
       }
       if (sharedPrefer) {
          b = false;
       }else {
          b = DateUtils.J(f.a.getLong("neo_navigation_last_show_time", 0)) ^ true;
       }
       if (b) {
          a.m(p1);
          if (!PatchProxy.applyVoidOneRefs(p1, this, a.class, "3")) {
             ta = this.a;
             if (ta != null) {
                ta.setVisibility(8);
             }
             obj = PatchProxy.applyOneRefs(p1, this, a.class, "5");
             if (obj != patchProxyRe) {
             }else {
                c$b uob = new c$b(p1);
                uob.z(true);
                uob.w(new ColorDrawable(a1.a(R.color.arg_RES_7f061c17)));
                uob.A(true);
                uob.J(new b(this));
                uob.L(new c(this));
                obj = uob.k();
                a.o(obj, "Popup.Builder\(activity\)\n¡­}\n\n      }\n      .build\(\)");
             }
             obj.Z();
             this.b = obj;
             this.e("cover");
             if (!PatchProxy.applyVoid(objArray, this, a.class, "8")) {
                SharedPreferences$Editor uEditor = f.a.edit();
                uEditor.putLong("neo_navigation_last_show_time", System.currentTimeMillis());
                g.a(uEditor);
             }
          }
       }else {
          a ta1 = this.a;
          if (ta1 != null) {
             ta1.setVisibility(0);
          }
          this.e("pendant");
       }
       return;
    }
}
