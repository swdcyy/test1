package ou1.c;
import android.view.View;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.widget.ImageView;
import qrd.l1;
import android.widget.TextView;
import lnc.a1;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Runnable;
import ou1.c$a;
import com.kuaishou.live.common.core.basic.tools.l;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextPaint;
import java.lang.CharSequence;

public final class c	// class@00358f
{
    public KwaiImageView a;
    public TextView b;
    public Animator c;
    public Animator d;
    public long e;
    public long f;
    public Runnable g;
    public final View h;
    public final View i;
    public final ViewGroup j;
    public final LiveMultiPkViewStyle k;
    public final a l;

    public void c(View p0,View p1,ViewGroup p2,LiveMultiPkViewStyle p3,a p4){
       a.p(p0, "scoreViewContainer");
       a.p(p1, "scoreView");
       a.p(p2, "parent");
       a.p(p3, "viewStyle");
       a.p(p4, "skinManager");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.l = p4;
       KwaiImageView kwaiImageVie = new KwaiImageView(p2.getContext());
       kwaiImageVie.setVisibility(8);
       this.a = kwaiImageVie;
       TextView textView = new TextView(p2.getContext());
       textView.setTextSize(1, 12.00f);
       textView.setTextColor(-1);
       textView.setShadowLayer((float)a1.e(0x3f800000), (float)a1.e(0x3f800000), (float)a1.e(0x3f800000), a1.a(R.color.arg_RES_7f061c12));
       textView.setVisibility(8);
       this.b = textView;
       a.m(textView);
       this.e(p0, p1, "0", p2, textView);
       c ta = this.a;
       a.m(ta);
       this.d(p0, p1, p2, ta);
    }
    public final void a(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "11")) {
          return;
       }
       if (p0 != null && p0.isRunning()) {
          p0.cancel();
       }
       return;
    }
    public final void b(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.h.removeCallbacks(this.g);
       c$a uoa = new c$a(this, p0);
       this.g = uoa;
       this.h.post(uoa);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.h.removeCallbacks(this.g);
       c tb = this.b;
       if (tb != null) {
          tb.setVisibility(8);
       }
       this.a(this.c);
       this.a(this.d);
       l.j(this.a);
       tb = this.a;
       if (tb != null) {
          tb.setVisibility(8);
       }
       return;
    }
    public final void d(View p0,View p1,ViewGroup p2,KwaiImageView p3){
       ViewGroup$LayoutParams layoutParams2;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "7")) {
          return;
       }
       int measuredWidt = p1.getMeasuredWidth();
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
       Objects.requireNonNull(layoutParams, str);
       ViewGroup$MarginLayoutParams topMargin = layoutParams.topMargin;
       ViewGroup$LayoutParams layoutParams1 = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams1, str);
       ViewGroup$MarginLayoutParams leftMargin = layoutParams1.leftMargin;
       int i = a1.e(70.00f);
       int i1 = a1.e(50.00f);
       if (p3.getLayoutParams() != null) {
          layoutParams2 = p3.getLayoutParams();
          Objects.requireNonNull(layoutParams2, str);
       }else {
          layoutParams2 = new ViewGroup$MarginLayoutParams(i1, i);
       }
       int i2 = (topMargin - i) + a1.e(6.00f);
       layoutParams2.topMargin = i2;
       if (this.k == LiveMultiPkViewStyle.SIMPLE) {
          layoutParams2.topMargin = i2 + a1.e(2.00f);
       }
       layoutParams2.leftMargin = (int)((float)leftMargin - ((float)(i1 - measuredWidt) * 0x3f000000)) + a1.e(6.00f);
       leftMargin = (p2.indexOfChild(p3) != -1)? 1: 0;
       if (!leftMargin) {
          p2.addView(p3, layoutParams2);
       }
       return;
    }
    public final void e(View p0,View p1,String p2,ViewGroup p3,TextView p4){
       ViewGroup$LayoutParams layoutParams2;
       c uoc = c.class;
       int i = 0;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "6")) {
             return;
          }
       }
       int measuredWidt = p1.getMeasuredWidth();
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
       Objects.requireNonNull(layoutParams, str);
       ViewGroup$MarginLayoutParams topMargin = layoutParams.topMargin;
       ViewGroup$LayoutParams layoutParams1 = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams1, str);
       ViewGroup$MarginLayoutParams leftMargin = layoutParams1.leftMargin;
       int i1 = a1.e(15.00f);
       if (p4.getLayoutParams() != null) {
          layoutParams2 = p4.getLayoutParams();
          Objects.requireNonNull(layoutParams2, str);
       }else {
          layoutParams2 = new ViewGroup$MarginLayoutParams(-2, i1);
       }
       int i2 = (topMargin - i1) + a1.e(6.00f);
       layoutParams2.topMargin = i2;
       if (this.k == LiveMultiPkViewStyle.SIMPLE) {
          layoutParams2.topMargin = i2 + a1.e(2.00f);
       }
       layoutParams2.leftMargin = (int)((float)leftMargin - ((p4.getPaint().measureText(p2) - (float)measuredWidt) * 0x3f000000)) + a1.d(0x7f070859);
       p4.setText(p2);
       if (p3.indexOfChild(p4) != -1) {
          i = 1;
       }
       if (!i) {
          p3.addView(p4, layoutParams2);
       }
       return;
    }
}
