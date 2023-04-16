package com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.HighFluencyStrongStyleView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle$StrongStyle;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$DisplayPosition;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.google.common.collect.s;
import ok.x;
import java.lang.Number;
import lnc.a1;
import com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.HighFluencyStrongStyleView$a;
import java.lang.Enum;
import va1.l0;
import java.util.List;
import java.util.Iterator;
import android.view.View$OnClickListener;
import android.widget.ImageView;

public class HighFluencyStrongStyleView extends FrameLayout	// class@001081
{
    public KwaiImageView b;
    public TextView c;
    public KwaiImageView d;
    public FrameLayout e;
    public FrameLayout f;
    public View g;
    public boolean h;
    public final List i;

    public void HighFluencyStrongStyleView(Context p0){
       super(p0, null);
    }
    public void HighFluencyStrongStyleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HighFluencyStrongStyleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = new ArrayList();
       if (PatchProxy.applyVoid(null, this, HighFluencyStrongStyleView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c11, this);
          if (!PatchProxy.applyVoidOneRefs(this, this, HighFluencyStrongStyleView.class, "2")) {
             this.g = m1.f(this, 0x7f0a0923);
             this.b = m1.f(this, 0x7f0a130c);
             this.c = m1.f(this, 0x7f0a0093);
             this.d = m1.f(this, 0x7f0a0094);
             this.e = m1.f(this, 0x7f0a3f2c);
             this.f = m1.f(this, 0x7f0a3bf5);
          }
       }
       return;
    }
    public final HighFluencyDescriptionBinder a(LiveAudienceDelayInfosResponse$HighFluencyStyle$StrongStyle p0,HighFluencyDescriptionBinder$DisplayPosition p1,HighFrequencyActionGuide$TextDescription p2,FrameLayout p3){
       int i;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HighFluencyDescriptionBinder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, HighFluencyStrongStyleView.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = HighFluencyDescriptionBinder.a.get(p1, Integer.valueOf(p2.displayStyle)).get();
       p3.removeAllViews();
       obj.g(this.getContext(), p3, p2);
       p2 = PatchProxy.applyTwoRefs(p0, p1, this, HighFluencyStrongStyleView.class, "10");
       HighFluencyStrongStyleView highFluencyS = 1;
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else {
          i = a1.a(p1.mDefaultColorRes);
          if (p0 != null) {
             i = (HighFluencyStrongStyleView$a.a[p1.ordinal()] != highFluencyS)? l0.j(p0.mSubTitleTextColor, i): l0.j(p0.mTitleTextColor, i);
          }
       }
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, this, HighFluencyStrongStyleView.class, "6");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          int i2 = a1.a(p1.mDefaultShadowColor);
          if (p0 == null) {
             i1 = i2;
          }else if(HighFluencyStrongStyleView$a.a[p1.ordinal()] != highFluencyS){
             i1 = l0.j(p0.mSubTitleShadowTextColor, i2);
          }else {
             i1 = l0.j(p0.mTitleShadowTextColor, i2);
          }
       }
       obj.c(i, i1, p1, this.h);
       this.i.add(obj);
       return obj;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, HighFluencyStrongStyleView.class, "12")) {
          return;
       }
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       this.i.clear();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, HighFluencyStrongStyleView.class, "11")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b();
       this.f.removeAllViews();
       this.e.removeAllViews();
       return;
    }
    public void setActionButtonClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighFluencyStrongStyleView.class, "3")) {
          return;
       }
       this.c.setOnClickListener(p0);
       this.d.setOnClickListener(p0);
       return;
    }
    public void setIsEnableShadow(boolean p0){
       this.h = p0;
    }
}
