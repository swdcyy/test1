package fva.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import jva.i;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import lnc.a1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import fva.t$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem$IconInfo;
import ekd.j;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import fva.u;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class t extends PresenterV2	// class@002a2d
{
    public HotSpotItem p;
    public i q;
    public final HotSpotModel r;
    public final HotSpotFragment s;

    public void t(HotSpotModel p0,HotSpotFragment p1){
       a.p(p1, "page");
       super();
       this.r = p0;
       this.s = p1;
    }
    public static final HotSpotItem P8(t p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("data");
       }
       return p0;
    }
    public void E8(){
       t ot = t.class;
       if (PatchProxy.applyVoid(null, this, ot, "2")) {
          return;
       }
       t tp = this.p;
       String str = "data";
       if (tp == null) {
          a.S(str);
       }
       int i = 8;
       int i1 = 0;
       String str1 = "binding";
       if (tp.mNormalIndex < null) {
          tp = this.q;
          if (tp == null) {
             a.S(str1);
          }
          tp.n1().setVisibility(i);
       }else {
          tp = this.q;
          if (tp == null) {
             a.S(str1);
          }
          tp.n1().setVisibility(i1);
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          if (tp.mNormalIndex == null) {
             tp = this.q;
             if (tp == null) {
                a.S(str1);
             }
             tp.o1().setVisibility(i1);
             tp = this.q;
             if (tp == null) {
                a.S(str1);
             }
             tp.p1().setVisibility(i);
          }else {
             tp = this.q;
             if (tp == null) {
                a.S(str1);
             }
             tp.p1().setVisibility(i1);
             tp = this.q;
             if (tp == null) {
                a.S(str1);
             }
             tp.o1().setVisibility(i);
             tp = this.q;
             if (tp == null) {
                a.S(str1);
             }
             TextView textView = tp.p1();
             t tp4 = this.p;
             if (tp4 == null) {
                a.S(str);
             }
             textView.setText(String.valueOf(tp4.mNormalIndex));
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             HotSpotItem mNormalIndex = tp.mNormalIndex;
             if (mNormalIndex != 1) {
                if (mNormalIndex != 2) {
                   if (mNormalIndex != 3) {
                      tp = this.q;
                      if (tp == null) {
                         a.S(str1);
                      }
                      tp.p1().setTextColor(a1.a(R.color.arg_RES_7f0607d6));
                   }else {
                      tp = this.q;
                      if (tp == null) {
                         a.S(str1);
                      }
                      tp.p1().setTextColor(a1.a(R.color.arg_RES_7f060359));
                   }
                }else {
                   tp = this.q;
                   if (tp == null) {
                      a.S(str1);
                   }
                   tp.p1().setTextColor(a1.a(R.color.arg_RES_7f060428));
                }
             }else {
                tp = this.q;
                if (tp == null) {
                   a.S(str1);
                }
                tp.p1().setTextColor(a1.a(R.color.arg_RES_7f0607c5));
             }
          }
       }
       tp = this.q;
       if (tp == null) {
          a.S(str1);
       }
       Objects.requireNonNull(tp);
       i oi = PatchProxy.apply(null, tp, i.class, "7");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = tp.f;
          if (oi == null) {
             a.S("title");
          }
       }
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       oi.setText(tp.mKeyWord);
       tp = this.q;
       if (tp == null) {
          a.S(str1);
       }
       tp.l1().setOnClickListener(new t$a(this));
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       if (tp.mIconInfo != null) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          if (!j.h(tp.mIconInfo.mIconUrl)) {
             tp = this.q;
             if (tp == null) {
                a.S(str1);
             }
             tp.q1().setVisibility(i1);
             tp = this.q;
             if (tp == null) {
                a.S(str1);
             }
             KwaiImageView kwaiImageVie = tp.q1();
             t tp1 = this.p;
             if (tp1 == null) {
                a.S(str);
             }
             HotSpotItem$IconInfo mIconWidth = tp1.mIconInfo.mIconWidth;
             t tp2 = this.p;
             if (tp2 == null) {
                a.S(str);
             }
             HotSpotItem$IconInfo mIconHeight = tp2.mIconInfo.mIconHeight;
             t tp3 = this.p;
             if (tp3 == null) {
                a.S(str);
             }
             HotSpotItem$IconInfo mIconUrl = tp3.mIconInfo.mIconUrl;
             if (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidFourRefs(kwaiImageVie, Integer.valueOf(mIconWidth), Integer.valueOf(mIconHeight), mIconUrl, this, t.class, "3")) {
                ViewGroup$LayoutParams layoutParams = kwaiImageVie.getLayoutParams();
                layoutParams.height = mIconHeight;
                layoutParams.width = mIconWidth;
                a.m(mIconUrl);
                kwaiImageVie.Y(mIconUrl, null, new u(layoutParams, kwaiImageVie));
             }
          }else {
          label_01cc :
             ot = this.q;
             if (ot == null) {
                a.S(str1);
             }
             ot.q1().setVisibility(i);
          }
       }else {
          goto label_01cc ;
       }
       return;
    }
    public final HotSpotModel R8(){
       return this.r;
    }
    public final HotSpotFragment S8(){
       return this.s;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       Object obj = this.q8(HotSpotItem.class);
       a.o(obj, "inject\(HotSpotItem::class.java\)");
       this.p = obj;
       obj = this.q8(i.class);
       a.o(obj, "inject\(HotSpotTodayListItemV2::class.java\)");
       this.q = obj;
       return;
    }
}
