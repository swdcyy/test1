package bf1.h;
import bf1.j;
import df1.c;
import android.view.View;
import df1.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import i2b.a;
import com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.HighFluencyWeakStyleView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle;
import bf1.g;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle;
import ne1.k;
import lnc.a1;
import android.widget.TextView;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import java.lang.CharSequence;
import android.graphics.Typeface;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import y51.e;
import android.text.style.ReplacementSpan;
import cf1.a;
import java.util.Map;
import ok.x;
import d61.r;
import cf1.b;
import android.text.style.ClickableSpan;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.text.SpannableStringBuilder;
import com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.a;
import ok.h;
import android.graphics.Paint;
import bf1.f;
import android.view.View$OnClickListener;

public class h extends j	// class@000376
{

    public void h(){
       super();
    }
    public View h(c p0){
       int i2;
       int i3;
       BitmapDrawable obj4;
       int i4;
       Context uContext;
       LiveSpannable liveSpannabl1;
       int i5;
       Drawable drawable;
       Object obj = this;
       Object obj1 = p0;
       h oh = h.class;
       View view = PatchProxy.applyOneRefs(obj1, obj, oh, "1");
       if (view != PatchProxyResult.class) {
       }else {
          View view1 = a.a(this.k(), 0x7f0d0c12);
          view1.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
          Object[] objArray = null;
          String str = "2";
          HighFluencyWeakStyleView obj2 = PatchProxy.apply(objArray, obj, oh, str);
          if (obj2 == PatchProxyResult.class) {
             obj2 = k0.a(this.n(), g.a).orNull();
          }
          Object obj3 = obj2;
          if (!PatchProxy.applyVoidTwoRefs(obj1, obj3, view1, HighFluencyWeakStyleView.class, str)) {
             int i = 0x7f07034b;
             int i1 = 0;
             if (k.b()) {
                obj2 = view1.e;
                i2 = a1.d(i);
                i3 = 0x7f0702e3;
                i = (view1.c(obj1))? a1.d(i3): a1.d(i);
                obj2.setPadding(i2, i1, i, i1);
                view1.e.setMinimumHeight(a1.d(R.dimen.arg_RES_7f0702c5));
                view1.d.setPadding(i1, a1.d(R.dimen.arg_RES_7f0702ac), i1, a1.d(i3));
                view1.d.setShadowLayer(3.00f, 0, 3.00f, a1.a(R.color.arg_RES_7f060197));
             }else {
                obj2 = view1.e;
                i2 = a1.d(i);
                i3 = 0x7f07030a;
                i = (view1.c(obj1))? a1.d(i3): a1.d(i);
                obj2.setPadding(i2, i1, i, i1);
                view1.e.setMinimumHeight(a1.d(R.dimen.arg_RES_7f0702cc));
                view1.d.setPadding(i1, a1.d(i3), i1, a1.d(i3));
             }
             HighFluencyWeakStyleView d = view1.d;
             i3 = 1;
             if (PatchProxy.applyVoidThreeRefs(d, obj1, obj3, view1, HighFluencyWeakStyleView.class, "6")) {
                obj4 = obj3;
                i4 = 0;
             }else {
                String str1 = TextUtils.N((long)obj1.c.count);
                Object[] objArray1 = new Object[i3];
                objArray1[i1] = str1;
                String[] stringArray = (String.format(obj1.c.text, objArray1)).split(str1);
                LiveSpannable liveSpannabl = new LiveSpannable();
                view1.a(liveSpannabl, stringArray[i1], obj3);
                HighFluencyWeakStyleView highFluencyW = d;
                i4 = 0;
                Object obj5 = obj3;
                Object[] objArray2 = objArray;
                if (!PatchProxy.applyVoidThreeRefs(liveSpannabl, str1, obj3, view1, HighFluencyWeakStyleView.class, "11")) {
                   LiveSpannable$b uob = new LiveSpannable$b(str1);
                   uob.g(a1.d(R.dimen.arg_RES_7f070295));
                   uob.a();
                   uob.h(Typeface.create(Typeface.SANS_SERIF, i3));
                   uob.c(view1.b(obj5));
                   liveSpannabl.j(uob).e();
                }
                if (stringArray.length >= 2) {
                   view1.a(liveSpannabl, stringArray[i3], obj5);
                }
                HighFrequencyActionGuide giftId = obj1.c.giftId;
                Object[] objArray3 = (giftId <= null)? objArray2: a.a(giftId);
                HighFluencyWeakStyleView obj6 = -3;
                if (objArray3 != null && !TextUtils.x(objArray3.mName)) {
                   Context context = highFluencyW.getContext();
                   uContext = context;
                   Context uContext1 = context;
                   if (!PatchProxy.applyVoidThreeRefs(liveSpannabl, objArray3, uContext, view1, HighFluencyWeakStyleView.class, "12")) {
                      Bitmap uBitmap = a.b(objArray3.mId);
                      obj4 = (uBitmap != null && !uBitmap.isRecycled())? new BitmapDrawable(uContext1.getResources(), uBitmap): ContextCompat.getDrawable(uContext1, R.drawable.arg_RES_7f0814c2);
                      LiveSpannable$a uoa1 = new LiveSpannable$a(obj4).c(a1.d(R.dimen.arg_RES_7f0702a4));
                      uoa1.b(obj6);
                      liveSpannabl.e().h(uoa1);
                   }
                   uContext = 1;
                }else {
                   uContext = 0;
                }
                if (view1.c(obj1)) {
                   if (k.a()) {
                      if (uContext) {
                         liveSpannabl.a(new e(a1.d(R.dimen.arg_RES_7f070334)));
                      }else {
                         liveSpannabl.e();
                      }
                   }else {
                      liveSpannabl.c();
                   }
                   liveSpannabl1 = liveSpannabl;
                   obj4 = obj5;
                   i5 = 2;
                   if (!PatchProxy.applyVoidThreeRefs(liveSpannabl, obj1, obj5, view1, HighFluencyWeakStyleView.class, "7")) {
                      giftId = obj1.c.actionText;
                      Object obj7 = PatchProxy.applyTwoRefs(giftId, obj4, view1, HighFluencyWeakStyleView.class, "14");
                      if (obj7 != PatchProxyResult.class) {
                      }else {
                         obj7 = r.b(view1.b, giftId, new a(obj4, giftId));
                      }
                      LiveSpannable$a uoa = new LiveSpannable$a(obj7);
                      uoa.a(new b(view1));
                      if (k.a()) {
                         uoa.b(-2);
                      }else {
                         uoa.b(-3);
                      }
                      liveSpannabl1.c().h(uoa);
                   }
                   obj6 = highFluencyW;
                   obj6.setMovementMethod(LinkMovementMethod.getInstance());
                }else {
                   obj6 = highFluencyW;
                   liveSpannabl1 = liveSpannabl;
                   obj4 = obj5;
                   i5 = 2;
                }
                obj6.setText(liveSpannabl1.k());
             }
             if (!PatchProxy.applyVoidOneRefs(obj4, view1, HighFluencyWeakStyleView.class, "3")) {
                LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle[] highFluencyS = new LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle[]{obj4,HighFluencyWeakStyleView.h};
                view1.g.setColor(HighFluencyWeakStyleView.d(a.b, highFluencyS));
             }
          }
          view1.setOnActionButtonClickListener(new f(obj, obj1));
          view = view1;
       }
       return view;
    }
    public String toString(){
       return "HighFluencyWeakStyleHandler{}";
    }
}
