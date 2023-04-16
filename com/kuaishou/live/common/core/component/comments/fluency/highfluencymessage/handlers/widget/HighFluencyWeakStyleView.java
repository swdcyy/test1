package com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.HighFluencyWeakStyleView;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle;
import lnc.a1;
import java.lang.String;
import ef1.d;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import android.graphics.RectF;
import android.graphics.Paint;
import ok.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.b;
import df1.f;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import android.graphics.Canvas;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;

public class HighFluencyWeakStyleView extends FrameLayout	// class@001082
{
    public final Map b;
    public final RectF c;
    public TextView d;
    public View e;
    public View$OnClickListener f;
    public final Paint g;
    public static final LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle h;
    public static final int i;
    public static final int j;

    static {
       LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle highFluencyS = new LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle();
       HighFluencyWeakStyleView.h = highFluencyS;
       HighFluencyWeakStyleView.i = a1.d(0x7f070420);
       HighFluencyWeakStyleView.j = a1.d(0x7f07042c);
       highFluencyS.mTextColor = d.a(a1.a(0x7f0620c7));
       highFluencyS.mBackgroundColor = d.a(a1.a(0x7f060846));
       highFluencyS.mButtonBackgroundColor = d.a(a1.a(0x7f0620c7));
    }
    public void HighFluencyWeakStyleView(Context p0){
       super(p0, null);
    }
    public void HighFluencyWeakStyleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HighFluencyWeakStyleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new HashMap();
       this.c = new RectF();
       this.g = new Paint(1);
       this.setWillNotDraw(false);
    }
    public static int d(h p0,LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle[] p1){
       String str;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, HighFluencyWeakStyleView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return -1;
          }
          object oobject = p1[i];
          if (oobject != null) {
             str = p0.apply(oobject);
             if (!TextUtils.x(str)) {
                break ;
             }
          }
          i = i + 1;
       }
       try{
          return Color.parseColor(str);
       }catch(java.lang.Exception e0){
       }
    }
    public final void a(LiveSpannable p0,String p1,LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, HighFluencyWeakStyleView.class, "8")) {
          return;
       }
       LiveSpannable$b uob = new LiveSpannable$b(p1);
       uob.c(this.b(p2));
       uob.g(this.getTextSizePx());
       p0.j(uob);
       return;
    }
    public final int b(LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HighFluencyWeakStyleView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle[] highFluencyS = new LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle[]{p0,HighFluencyWeakStyleView.h};
       return HighFluencyWeakStyleView.d(b.b, highFluencyS);
    }
    public final boolean c(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HighFluencyWeakStyleView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.c;
       boolean b = (!TextUtils.x(p0.actionText) && !TextUtils.x(p0.actionUrl))? true: false;
       return b;
    }
    public final int getTextSizePx(){
       Object obj = PatchProxy.apply(null, this, HighFluencyWeakStyleView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070283);
    }
    public void onDraw(Canvas p0){
       int j;
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, HighFluencyWeakStyleView.class, "4")) {
          return;
       }
       HighFluencyWeakStyleView tc = this.c;
       tc.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       if (this.d.getLineCount() == Float.MIN_VALUE) {
          j = HighFluencyWeakStyleView.j;
          f = (float)j;
          p0.drawRoundRect(tc, f, (float)j, this.g);
       }else {
          j = HighFluencyWeakStyleView.i;
          f = (float)j;
          p0.drawRoundRect(tc, f, (float)j, this.g);
       }
       super.onDraw(p0);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, HighFluencyWeakStyleView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.e = this;
       this.d = this.findViewById(0x7f0a095f);
       return;
    }
    public void setOnActionButtonClickListener(View$OnClickListener p0){
       this.f = p0;
    }
}
