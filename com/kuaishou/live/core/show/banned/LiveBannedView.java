package com.kuaishou.live.core.show.banned.LiveBannedView;
import android.widget.FrameLayout;
import java.lang.String;
import d61.j;
import android.content.Context;
import android.util.AttributeSet;
import o32.l;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import lnc.a1;
import com.facebook.drawee.generic.RoundingParams;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import com.kuaishou.live.core.show.banned.LiveBannedView$a;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import d61.c0;
import com.kuaishou.live.core.show.banned.LiveBannedView$b;

public class LiveBannedView extends FrameLayout	// class@0009df
{
    public TextView b;
    public TextView c;
    public KwaiImageView d;
    public KwaiImageView e;
    public TextView f;
    public TextView g;
    public LiveBannedView$b h;
    public int i;
    public Runnable j;
    public static final String k;

    static {
       LiveBannedView.k = j.a("https://static.yximgs.com/udata/pkg/kwai-client-image/live_banned_top_view_palce_holder.png");
    }
    public void LiveBannedView(Context p0){
       super(p0, null);
    }
    public void LiveBannedView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveBannedView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = 0;
       this.j = new l(this);
       a.d(p0, R.layout.arg_RES_7f0d0a6d, this, true);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveBannedView.class, "4")) {
          return;
       }
       k1.m(this.j);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveBannedView.class, "3")) {
          return;
       }
       if (this.i != null) {
          this.b.setVisibility(0);
          this.b.setText(String.valueOf(this.i));
          this.c();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveBannedView.class, "9")) {
          return;
       }
       k1.r(this.j, 1000);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveBannedView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveBannedView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a1a6e);
       this.c = this.findViewById(0x7f0a1a72);
       this.d = this.findViewById(0x7f0a1a6f);
       this.e = this.findViewById(0x7f0a1a69);
       this.f = this.findViewById(0x7f0a1a71);
       this.g = this.findViewById(0x7f0a1a70);
       this.d.getHierarchy().L(RoundingParams.b((float)a1.e(6.00f), (float)a1.e(6.00f), 0, 0));
       return;
    }
    public void setLiveBannedBottomContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBannedView.class, "7")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.g.setText(p0);
       }
       return;
    }
    public void setLiveBannedCountDownSecond(int p0){
       this.i = p0;
    }
    public void setLiveBannedImageUrls(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBannedView.class, "6")) {
          return;
       }
       if (!j.h(p0)) {
          this.d.a0(p0, new LiveBannedView$a(this));
       }else {
          d0.b(this.d, LiveBannedView.k);
       }
       this.e.L(c0.a.b("udata/pkg/kwai-client-image/live_common/live_banned_forbidden_image.webp"));
       return;
    }
    public void setLiveBannedTopContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBannedView.class, "8")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.f.setText(p0);
       }
       return;
    }
    public void setLiveBannedViewCountDownListener(LiveBannedView$b p0){
       this.h = p0;
    }
    public void setLiveBannedWarningContentString(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBannedView.class, "5")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.c.setText(p0);
       }
       return;
    }
}
