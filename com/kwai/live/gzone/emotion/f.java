package com.kwai.live.gzone.emotion.f;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.widget.e$a;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.c$b;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import x57.e;
import x57.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import f37.o0;
import android.content.res.Configuration;
import android.content.res.Resources;
import u0.d;
import android.content.res.Resources$Theme;
import pd6.a;
import ekd.m1;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import y47.b;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.app.Activity;
import d61.y;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.ArrayList;
import com.kwai.live.gzone.emotion.LiveGzoneAudienceEmotionShopPopup$1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.live.gzone.emotion.f$b;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y47.c;
import n57.a;
import fq5.b;

public class f extends e	// class@000cdf
{
    public k A;
    public f$b B;
    public View C;
    public TextView D;
    public RecyclerView E;
    public View F;
    public c x;
    public String y;
    public b z;

    public void f(e$a p0){
       super(p0);
       p0.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062040)));
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "9")) {
          return;
       }
       f tx = this.x;
       if (tx != null && tx.K()) {
          this.x.q(0);
       }
       a.a().b("LiveAnchorGzoneEmotionShopPopup");
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Context obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, f.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p3 != null && p3.getBoolean("FORCE_DARK", false)) {
          obj = p1.getContext();
          o0 oo0 = o0.class;
          Object obj1 = PatchProxy.applyOneRefs(obj, null, oo0, "14");
          if (obj1 != patchProxyRe) {
          }else {
             d uod = PatchProxy.applyTwoRefs(obj, null, null, oo0, "15");
             if (uod != patchProxyRe) {
             }else {
                Configuration uConfigurati = new Configuration(obj.getResources().getConfiguration());
                uConfigurati.uiMode = 32;
                uod = new d(obj, null);
                a.a(uod, uConfigurati);
             }
             obj1 = uod;
          }
          p1 = p1.cloneInContext(obj1);
       }
       return super.a(p0, p1, p2, p3);
    }
    public int d0(){
       return 0x7f0d0bb4;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a1f73);
       this.D = m1.f(p0, 0x7f0a1f37);
       this.C = m1.f(p0, 0x7f0a1edb);
       this.E = m1.f(p0, 0x7f0a1ee0);
       m1.a(p0, new b(this), R.id.live_gzone_emotion_close);
       return;
    }
    public void f0(View p0,Bundle p1){
       f uof = f.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uof, "3")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.findViewById(R.id.live_gzone_emotion_shop_root).getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new FrameLayout$LayoutParams(-2, -2);
       }
       int i = -1;
       if (y.d(this.u())) {
          layoutParams.height = i;
          layoutParams.width = a1.e(300.00f);
       }else {
          layoutParams.height = a1.e(325.00f);
          layoutParams.width = i;
          this.C.setRotation(90.00f);
       }
       if (p1 != null) {
          String str = "EMOTION_INFO";
          if (p1.containsKey(str)) {
             ArrayList serializable = SerializableHook.getSerializable(p1, str);
             if (!PatchProxy.applyVoidOneRefs(serializable, this, uof, "5")) {
                this.E.setLayoutManager(new LiveGzoneAudienceEmotionShopPopup$1(this, this.u(), 1, false));
                f$b uob = new f$b(this);
                this.B = uob;
                uob.W0(serializable);
                this.E.setAdapter(this.B);
             }
             this.y = p1.getString("AnchorId");
          }
       }
       a.a().a("LiveAnchorGzoneEmotionShopPopup", new c(this));
       this.m0();
       return;
    }
    public String l0(){
       f obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj == null) {
          return "";
       }
       return obj.getLiveStreamId();
    }
    public void m0(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.F.setVisibility(0);
       this.D.setVisibility(8);
       a.a().g("LiveAnchorGzoneEmotionShopPopup", this.l0());
       return;
    }
}
