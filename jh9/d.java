package jh9.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jh9.d$a;
import nsd.u;
import lnc.a1;
import jh9.d$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import jh9.d$c;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import jh9.d$d;
import android.widget.ImageView;
import jh9.d$e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import kotlin.jvm.internal.a;
import jh9.d$f;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Boolean;
import lnc.b9;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfigRepo;
import com.kwai.robust.PatchProxyResult;
import hb0.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import jb7.b;
import qrd.p;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import ih9.t;
import erd.o;
import jh9.d$g;
import jh9.d$h;
import jh9.d$i;
import erd.a;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.SharedPreferences;
import oe6.n;
import com.yxcorp.gifshow.util.PostUtils;
import oa0.a;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.app.Activity;
import android.content.Intent;
import androidx.core.view.ViewKt;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lh9.a;
import android.widget.TextView;
import io.reactivex.subjects.PublishSubject;
import java.lang.Number;

public final class d extends PresenterV2	// class@002adf
{
    public final Application$ActivityLifecycleCallbacks A;
    public PublishSubject p;
    public String q;
    public View r;
    public ViewGroup s;
    public ViewGroup t;
    public KwaiImageView u;
    public b v;
    public ToolBoxHeaderConfig w;
    public e0 x;
    public int y;
    public boolean z;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final d$a E;

    static {
       d.E = new d$a(null);
       d.B = a1.e(12.00f);
       d.C = a1.d(0x7f07031b);
       d.D = a1.d(0x7f070271);
    }
    public void d(){
       super();
       this.A = new d$b(this);
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
          a.B.registerActivityLifecycleCallbacks(this.A);
       }
       uod = this.t;
       if (uod != null) {
          uod.setOnClickListener(new d$c(this));
       }
       uod = this.u;
       if (uod != null) {
          uod.setOnClickListener(new d$d(this));
       }
       uod = this.s;
       if (uod != null) {
          uod.setOnClickListener(new d$e(this));
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIBRARY_AICUT_ENTRANCE";
       u1.C0("", this.x, 6, uElementPack, objArray);
       this.P8(CachePolicy.NETWORK_ELSE_CACHE);
       uod = this.p;
       if (uod == null) {
          a.S("refreshPublishSubject");
       }
       this.X7(uod.subscribe(new d$f(this)));
       return;
    }
    public void J8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
          a.B.unregisterActivityLifecycleCallbacks(this.A);
       }
       return;
    }
    public final void P8(CachePolicy p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       d tv = this.v;
       Object obj = null;
       if (tv != null) {
          Boolean uBoolean = (tv != null)? Boolean.valueOf(tv.isDisposed()): obj;
          a.m(uBoolean);
          if (!uBoolean.booleanValue()) {
             b9.a(this.v);
          }
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ToolBoxHeaderConfigRepo toolBoxHeade = ToolBoxHeaderConfigRepo.class;
       t ot = PatchProxy.applyOneRefs(p0, obj, toolBoxHeade, "2");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "policy");
          long l = a1.k();
          Object[] objArray = new Object[0];
          a.D().s("ToolBoxHeaderConfigRepo", "st"+a1.k(), objArray);
          ToolBoxHeaderConfigRepo b = ToolBoxHeaderConfigRepo.b;
          Objects.requireNonNull(b);
          obj = PatchProxy.apply(obj, b, toolBoxHeade, "1");
          if (obj != patchProxyRe) {
          }else {
             obj = ToolBoxHeaderConfigRepo.a.getValue();
          }
          ot = obj.a(p0).observeOn(d.c).map(new t(l));
          a.o(ot, "resourceManager.fetch\(po¡­\"\"\)\n          }\n        }");
       }
       this.v = ot.observeOn(d.a).subscribe(new d$g(this), d$h.b, new d$i(this));
       return;
    }
    public final void R8(View p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.topMargin = p1;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       d obj;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.template_header_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­d.template_header_layout\)");
       this.r = view;
       this.s = m1.f(p0, 0x7f0a0e55);
       this.t = m1.f(p0, 0x7f0a3d84);
       this.u = m1.f(p0, 0x7f0a164b);
       boolean b = false;
       int booleanx = n.b().getBoolean(PostUtils.s("showKaraokeEntryGuide"), b);
       long l = a.z();
       if (!a.z() - null) {
          l = System.currentTimeMillis();
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putLong("first_show_ktv_guide_time", l);
          g.a(uEditor);
       }
       d tt = this.t;
       Object[] objArray = null;
       if (tt != null) {
          if (booleanx && (!a.a.getBoolean("is_clicked_close_ktv_guide", b) && (System.currentTimeMillis() - l) - 0x240c8400 < 0)) {
             obj = PatchProxy.apply(objArray, this, uod, "13");
             if (obj != PatchProxyResult.class) {
                booleanx = obj.booleanValue();
             }else {
                Activity activity1 = this.getActivity();
                if (activity1 != null) {
                   Intent intent = activity1.getIntent();
                   if (intent != null) {
                      booleanx = intent.getBooleanExtra("panel_disabled", b);
                   label_00ac :
                      booleanx = booleanx ^ 1;
                   }
                }
                booleanx = 1;
                goto label_00ac ;
             }
             if (booleanx) {
                booleanx = true;
             label_00b2 :
                ViewKt.g(tt, booleanx);
             }
          }
       label_00b1 :
          booleanx = false;
          goto label_00b2 ;
       }
       obj = this.t;
       String str = "postTemplateHeaderView";
       if (obj != null) {
          if (!obj.getVisibility()) {
             b = true;
          }
          if (b == true) {
             obj = this.r;
             if (obj == null) {
                a.S(str);
             }
             this.R8(obj, d.C);
          label_00dd :
             KwaiImageView kwaiImageVie = m1.f(p0, R.id.filming_btn_bg);
             if (kwaiImageVie != null) {
                a$a uoa = a.d();
                uoa.b(":ks-features:ft-post:toolbox");
                uoa.d(ImageSource.TOOLBOX_FILM);
                kwaiImageVie.M("https://js2.a.yximgs.com/bs2/ztMaterial/NULL_NULL_3C7BF92C45274BB887075112A85EF465.png", uoa.a());
             }
             if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "9")) {
                uod = this.s;
                if (uod != null) {
                   a.m(uod);
                   ViewGroup$LayoutParams layoutParams = uod.getLayoutParams();
                   if (layoutParams != null) {
                      layoutParams.height = (int)((float)a.b * a.d);
                   }
                   obj = this.s;
                   a.m(obj);
                   obj.setLayoutParams(layoutParams);
                   View view1 = p0.findViewById(R.id.header_item_icon);
                   a.o(view1, "view.findViewById\(R.id.header_item_icon\)");
                   ViewGroup$LayoutParams layoutParams1 = view1.getLayoutParams();
                   layoutParams1.height = (int)a.a();
                   layoutParams1.width = (int)a.a();
                   view1.setLayoutParams(layoutParams1);
                   view1 = p0.findViewById(R.id.header_item_title);
                   a.o(view1, "view.findViewById\(R.id.header_item_title\)");
                   view1.setTextSize((a.d * 17.00f));
                   p0 = p0.findViewById(R.id.header_item_subtitle);
                   a.o(p0, "view.findViewById\(R.id.header_item_subtitle\)");
                   p0.setTextSize((a.d * 13.00f));
                }
             }
             Activity activity = this.getActivity();
             if (activity instanceof e0) {
                objArray = activity;
             }
             this.x = objArray;
             return;
          }
       }
       obj = this.r;
       if (obj == null) {
          a.S(str);
       }
       this.R8(obj, d.D);
       goto label_00dd ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Object obj = this.r8("refresh_subject");
       a.o(obj, "inject\(PostToolBoxConst.ACCESS_ID_REFRESH_SUBJECT\)");
       this.p = obj;
       obj = this.r8("task_id");
       a.o(obj, "inject\(PostToolBoxConst.TASK_ID\)");
       this.q = obj;
       obj = this.r8("recordByMusicRequestDuartion");
       a.o(obj, "inject\(CameraConstants.R¡­Y_MUSIC_REQUEST_DURATION\)");
       this.y = obj.intValue();
       return;
    }
}
