package com.kuaishou.live.ad.fanstop.widget.AdNeoTaskCountView;
import android.widget.FrameLayout;
import com.kuaishou.live.ad.fanstop.widget.AdNeoTaskCountView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.commercial.response.magnetic.LivePendentTaskInfo;
import java.lang.CharSequence;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import qw.e;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class AdNeoTaskCountView extends FrameLayout	// class@0009c4
{
    public View b;
    public TextView c;
    public TextView d;
    public KwaiImageView e;
    public HashMap f;
    public static final AdNeoTaskCountView$a g;

    static {
       AdNeoTaskCountView.g = new AdNeoTaskCountView$a(null);
    }
    public void AdNeoTaskCountView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AdNeoTaskCountView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AdNeoTaskCountView(Context p0,AttributeSet p1,int p2){
       View view;
       a.p(p0, "context");
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoTaskCountView.class, "1")) {
       }else {
          p0 = p0.getSystemService("layout_inflater");
          Objects.requireNonNull(p0, "null cannot be cast to non-null type android.view.LayoutInflater");
          view = a.g(p0, R.layout.arg_RES_7f0d0cd8, this, true);
          a.o(view, "KwaiLayoutInflater.infla¡­m,\n      this, true\n    \)");
          this.b = view;
          String str = "mRootView";
          if (view == null) {
             a.S(str);
          }
          view = view.findViewById(R.id.live_neo_task_item_text);
          a.o(view, "mRootView.findViewById\(R¡­.live_neo_task_item_text\)");
          this.c = view;
          AdNeoTaskCountView tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          view = tb.findViewById(R.id.live_neo_task_item_description);
          a.o(view, "mRootView.findViewById\(R¡­eo_task_item_description\)");
          this.d = view;
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          view = tb.findViewById(R.id.live_neo_task_item_icon);
          a.o(view, "mRootView.findViewById\(R¡­.live_neo_task_item_icon\)");
          this.e = view;
       }
       return;
    }
    public void AdNeoTaskCountView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void setData(LivePendentTaskInfo p0){
       AdNeoTaskCountView tb;
       b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoTaskCountView.class, "2")) {
          return;
       }
       a.p(p0, "taskInfo");
       AdNeoTaskCountView tc = this.c;
       if (tc == null) {
          a.S("mIdTextView");
       }
       tc.setText(p0.name);
       tc = this.d;
       if (tc == null) {
          a.S("mDescription");
       }
       tc.setText(p0.amount);
       String str = "mRootView";
       if (p0.received != null) {
          this.setIconBgImg("https://static.yximgs.com/udata/pkg/ad-res/neo_live_pendent/live_neo_pendent_dialog_item_light.png");
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          uob = new b();
          uob.g(KwaiRadiusStyles.R8);
          uob.v(a1.a(R.color.arg_RES_7f0614c6));
          tb.setBackground(uob.a());
          tb = this.d;
          if (tb == null) {
             a.S("mDescription");
          }
          tb.setTextColor(a1.a(R.color.arg_RES_7f0614ca));
          tb = this.c;
          if (tb == null) {
             a.S("mIdTextView");
          }
          tb.setTextColor(a1.a(R.color.arg_RES_7f0614c8));
       }else {
          this.setIconBgImg("https://static.yximgs.com/udata/pkg/ad-res/neo_live_pendent/live_neo_pendent_dialog_item_grey.png");
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          uob = new b();
          uob.g(KwaiRadiusStyles.R8);
          uob.v(a1.a(R.color.arg_RES_7f0614c5));
          tb.setBackground(uob.a());
          tb = this.d;
          if (tb == null) {
             a.S("mDescription");
          }
          tb.setTextColor(a1.a(R.color.arg_RES_7f0614c9));
          tb = this.c;
          if (tb == null) {
             a.S("mIdTextView");
          }
          tb.setTextColor(a1.a(R.color.arg_RES_7f0614c7));
       }
       return;
    }
    public final void setIconBgImg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoTaskCountView.class, "3")) {
          return;
       }
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-commercial:commercial-live");
       uoa.d(ImageSource.ICON);
       a uoa1 = uoa.a();
       a.o(uoa1, "KwaiImageCallerContext.n¡­urce.ICON\)\n      .build\(\)");
       AdNeoTaskCountView te = this.e;
       if (te == null) {
          a.S("mIcon");
       }
       te.M(e.b.c(p0), uoa1);
       return;
    }
}
