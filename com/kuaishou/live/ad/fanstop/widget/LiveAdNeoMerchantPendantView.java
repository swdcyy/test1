package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView;
import ml8.d;
import android.widget.FrameLayout;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import qw.e;
import android.net.Uri;
import lnc.a1;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView$b;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class LiveAdNeoMerchantPendantView extends FrameLayout implements d	// class@0009d6
{
    public TextView b;
    public View c;
    public View d;
    public KwaiImageView e;
    public TextView f;
    public String g;
    public HashMap h;
    public static final LiveAdNeoMerchantPendantView$a i;

    static {
       LiveAdNeoMerchantPendantView.i = new LiveAdNeoMerchantPendantView$a(null);
    }
    public void LiveAdNeoMerchantPendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveAdNeoMerchantPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveAdNeoMerchantPendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.g = "";
    }
    public void LiveAdNeoMerchantPendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoMerchantPendantView.class, "1")) {
          return;
       }
       try{
          View view = m1.f(p0, R.id.neo_count_down_image_group);
          a.o(view, "ViewBindUtils.bindWidget¡­o_count_down_image_group\)");
          this.c = view;
          view = m1.f(p0, R.id.neo_count_down_text_group);
          a.o(view, "ViewBindUtils.bindWidget¡­eo_count_down_text_group\)");
          this.d = view;
          view = m1.f(p0, R.id.neo_count_down_bg_image);
          a.o(view, "ViewBindUtils.bindWidget¡­.neo_count_down_bg_image\)");
          this.e = view;
          view = m1.f(p0, R.id.neo_count_down_text);
          a.o(view, "ViewBindUtils.bindWidget¡­R.id.neo_count_down_text\)");
          this.b = view;
          TextView textView = m1.f(p0, R.id.neo_task_amount);
          this.f = textView;
          if (textView != null) {
             textView.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          }
          this.setPendentBgImg("https://static.yximgs.com/udata/pkg/ad-res/neo_live_pendent/live_neo_pendent_bg.0ead9a8e4e1e40fe.webp");
          return;
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveAdNeoMerchantPendantView.class, "5")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public final void setPendentBgImg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoMerchantPendantView.class, "2")) {
          return;
       }
       if (TextUtils.n(p0, this.g)) {
          return;
       }
       this.g = p0;
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-commercial:commercial-live");
       uoa.d(ImageSource.ICON);
       a uoa1 = uoa.a();
       a.o(uoa1, "KwaiImageCallerContext.n¡­urce.ICON\)\n      .build\(\)");
       LiveAdNeoMerchantPendantView te = this.e;
       if (te == null) {
          a.S("mPendentBgImg");
       }
       te.E(Uri.parse(e.b.c(p0)), uoa1, a1.d(R.dimen.arg_RES_7f07015d), a1.d(R.dimen.arg_RES_7f07015c), new LiveAdNeoMerchantPendantView$b(p0));
       return;
    }
}
