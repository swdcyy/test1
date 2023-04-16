package nb3.b;
import n93.a;
import nb3.b$a;
import nsd.u;
import java.lang.String;
import d61.j;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import msd.a;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$a;
import mb3.c;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.View;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$HighFrequencyActionStyle;
import lnc.a1;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import nb3.d;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.content.Context;
import zm1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.n;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$DisplayPosition;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder;
import pb3.b;
import java.util.Iterator;
import java.util.List;
import java.lang.Number;
import nb3.c;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import java.lang.Integer;
import com.google.common.collect.s;
import ok.x;
import android.view.ViewGroup;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import java.lang.StringBuilder;

public abstract class b extends a	// class@00360e
{
    public final List j;
    public final HighFrequencyActionGuide k;
    public final a l;
    public final HighFluencyDescriptionBinder$a m;
    public final c n;
    public static final String o;
    public static final b$a p;

    static {
       b.p = new b$a(null);
       String str = j.a("https://static.yximgs.com/kos/nlav10954/lite_high_frequency_guide/button_background_v2.png");
       a.o(str, "LiveCDNUrlUtils.composeC¡­_background_v2.png\"\n    \)");
       b.o = str;
    }
    public void b(HighFrequencyActionGuide p0,a p1,HighFluencyDescriptionBinder$a p2,c p3){
       a.p(p0, "actionGuide");
       a.p(p1, "actionStyleProvider");
       a.p(p2, "giftIconProvider");
       a.p(p3, "delegate");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.j = new ArrayList();
    }
    public void F2(){
       boolean b;
       LiveLiteDelayInfoResponse$HighFrequencyActionStyle highFrequenc;
       boolean b1;
       Object[] objArray1;
       Object[] objArray2;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0987);
       if (!PatchProxy.applyVoid(objArray, this, uob, "2")) {
          View view = this.A2(R.id.container);
          String str = "4";
          b = false;
          if (!PatchProxy.applyVoidOneRefs(view, this, uob, str)) {
             highFrequenc = this.l.invoke();
             highFrequenc = (highFrequenc != null)? highFrequenc.mBackgroundColor: objArray;
             b uob1 = new b();
             uob1.l(this.b3(highFrequenc, a1.a(R.color.arg_RES_7f0604ca)), this.b3(highFrequenc, a1.a(R.color.arg_RES_7f0604ca)));
             uob1.j(b);
             uob1.g(KwaiRadiusStyles.R12);
             view.setBackground(uob1.a());
          }
          KwaiImageView kwaiImageVie = this.A2(R.id.icon);
          highFrequenc = this.l.invoke();
          if (highFrequenc != null) {
             highFrequenc = highFrequenc.mLeftIconUrls;
             if (highFrequenc == null) {
             label_0075 :
                String str1 = this.X2();
                CDNUrl[] uCDNUrlArray1 = (str1 != null)? e0.h(str1): objArray;
             }
          }else {
             goto label_0075 ;
          }
          if (highFrequenc != null) {
             kwaiImageVie.U(highFrequenc);
          }
          TextView textView = this.A2(R.id.action_button);
          KwaiImageView kwaiImageVie1 = this.A2(R.id.action_button_background);
          if (!PatchProxy.applyVoidTwoRefs(textView, kwaiImageVie1, this, uob, "5")) {
             LiveLiteDelayInfoResponse$HighFrequencyActionStyle highFrequenc1 = this.l.invoke();
             highFrequenc1 = (highFrequenc1 != null)? highFrequenc1.mButtonTextColor: objArray;
             textView.setTextColor(this.b3(highFrequenc1, a1.a(R.color.arg_RES_7f060753)));
             highFrequenc1 = this.l.invoke();
             if (highFrequenc1 != null) {
                highFrequenc1 = highFrequenc1.mButtonBackgroundUrls;
                if (highFrequenc1 != null) {
                label_00d2 :
                   kwaiImageVie1.U(highFrequenc1);
                }
             }
             CDNUrl[] uCDNUrlArray = e0.h(b.o);
             goto label_00d2 ;
          }
          textView.setText(this.k.actionText);
          textView.setOnClickListener(new d(this));
          FrameLayout uFrameLayout = this.A2(R.id.title);
          Context uContext = this.D2();
          HighFrequencyActionGuide obj = PatchProxy.applyOneRefs(uContext, objArray, a.class, str);
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(n.z(uContext) >= a1.e(360.00f)){
             b = true;
          }
          b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "HighFluencyStrongStyleView.isLargeScreen", "isLargeScreen", Boolean.valueOf(b));
          b1 = b;
          obj = (b1)? this.k.titleLarge: this.k.titleSmall;
          a.o(obj, "title");
          HighFluencyDescriptionBinder highFluencyD = this.a3(HighFluencyDescriptionBinder$DisplayPosition.Title, obj, uFrameLayout);
          if (this instanceof b) {
             highFluencyD.e(this.k.giftId, this.m);
          }
          obj = this.k.subTitle;
          a.o(obj, "subTitle");
          this.a3(HighFluencyDescriptionBinder$DisplayPosition.SubTitle, obj, this.A2(R.id.subtitle));
       }
       return;
    }
    public void J2(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
          Iterator iterator = this.j.iterator();
          while (iterator.hasNext()) {
             iterator.next().f();
          }
          this.j.clear();
       }
       return;
    }
    public final int W2(LiveLiteDelayInfoResponse$HighFrequencyActionStyle p0,HighFluencyDescriptionBinder$DisplayPosition p1,boolean p2){
       HighFluencyDescriptionBinder$DisplayPosition obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p1, "position");
       obj = (p2)? p1.mDefaultShadowColor: p1.mDefaultColorRes;
       int i = a1.a(obj);
       if (p0 != null) {
          int i1 = c.a[p1.ordinal()];
          if (i1 != 1) {
             if (i1 == 2) {
                p0 = (p2)? p0.mSubTitleShadowTextColor: p0.mSubTitleTextColor;
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else if(p2){
             p0 = p0.mTitleShadowTextColor;
          }else {
             p0 = p0.mTitleTextColor;
          }
          return this.b3(p0, i);
       }else {
          return i;
       }
    }
    public abstract String X2();
    public final c Y2(){
       return this.n;
    }
    public abstract void Z2(HighFrequencyActionGuide p0);
    public final HighFluencyDescriptionBinder a3(HighFluencyDescriptionBinder$DisplayPosition p0,HighFrequencyActionGuide$TextDescription p1,FrameLayout p2){
       HighFluencyDescriptionBinder obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p2.removeAllViews();
       obj = HighFluencyDescriptionBinder.a.get(p0, Integer.valueOf(p1.displayStyle)).get();
       obj.g(this.D2(), p2, p1);
       obj.c(this.W2(this.l.invoke(), p0, false), this.W2(this.l.invoke(), p0, true), p0, true);
       obj.d(p1);
       a.o(obj, "binder");
       this.j.add(obj);
       return obj;
    }
    public final int b3(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!TextUtils.x(p0)) {
          try{
             p1 = Color.parseColor(p0);
          }catch(java.lang.IllegalArgumentException e0){
             b.B(LiveLogTag.LIVE_ERROR_LOG_TAG, "parseColorSafelyError:"+p0);
          }
       }
    }
}
