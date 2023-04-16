package com.kuaishou.live.lite.anchorinfo.recommendtag.c;
import lnc.a1;
import android.view.View;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import java.lang.Object;
import u83.f;
import u83.e;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.kuaishou.live.lite.anchorinfo.recommendtag.c$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$a;
import jb3.a;
import crd.b;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import ekd.j;
import d61.k;
import com.yxcorp.gifshow.widget.LiveCoverIconView$f;
import com.kuaishou.live.lite.anchorinfo.recommendtag.c$b;
import java.lang.Boolean;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$IconInfo;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$TextInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.kuaishou.live.lite.anchorinfo.recommendtag.d$b;
import com.kuaishou.live.lite.anchorinfo.recommendtag.d;
import com.kuaishou.live.lite.anchorinfo.recommendtag.f;

public class c	// class@001e72
{
    public final LiveCoverIconView a;
    public f b;
    public boolean c;
    public final b d;
    public final Observer e;
    public final Observer f;
    public static final int g;
    public static final int h;

    static {
       c.g = a1.a(0x7f061d80);
       c.h = a1.a(0x7f060649);
    }
    public void c(View p0,LiveLiteGestureService p1){
       super();
       this.c = false;
       this.e = new f(this);
       this.f = new e(this);
       LiveCoverIconView liveCoverIco = p0.findViewById(R.id.live_lite_simple_reco_label);
       this.a = liveCoverIco;
       this.d = p1.a(liveCoverIco, true, a.a(liveCoverIco, new c$a(this)));
    }
    public final Drawable a(LiveSimpleCoverReasonTag p0){
       int h;
       int i2;
       b obj = PatchProxy.applyOneRefs(p0, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.g(KwaiRadiusStyles.R3);
       if (j.h(p0.mBackgroundColor)) {
          obj.v(c.h);
       }else {
          LiveSimpleCoverReasonTag mBackgroundC = p0.mBackgroundColor;
          int i = 0;
          int i1 = 1;
          if (mBackgroundC.length == i1) {
             obj.v(k.c(mBackgroundC[i], c.h));
          }else if(mBackgroundC.length == 2){
             h = c.h;
             i2 = k.c(mBackgroundC[i], h);
             obj.l(i2, k.c(p0.mBackgroundColor[i1], h));
             obj.j(p0.mBackgroundGradientAngle);
          }else {
             h = c.h;
             i2 = k.c(mBackgroundC[i], h);
             i = k.c(p0.mBackgroundColor[i1], h);
             obj.m(i2, i, k.c(p0.mBackgroundColor[2], h));
             obj.j(p0.mBackgroundGradientAngle);
          }
       }
       return obj.a();
    }
    public final LiveCoverIconView$f b(){
       Object obj = PatchProxy.apply(null, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c$b(this);
    }
    public final boolean c(LiveSimpleCoverReasonTag p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.mIconInfo;
       boolean b = (p0 != null && !j.h(p0.mIconUrls))? true: false;
       return b;
    }
    public final boolean d(LiveSimpleCoverReasonTag p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.mTextInfo;
       boolean b = (p0 != null && !TextUtils.x(p0.mContent))? true: false;
       return b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       this.a.setAlpha(0);
       this.a.setVisibility(0);
       this.a.animate().alpha(0x3f800000).setDuration(300).start();
       c tb = this.b;
       if (tb != null) {
          tb.v0(new d$b());
       }
       return;
    }
}
