package com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.DetailAtmosphereViewBinder;
import xf4.b;
import androidx.fragment.app.Fragment;
import gi4.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.DetailAtmosphereViewBinder$mTimerCallback$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import nh4.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.AtmosphereInfo;
import android.text.SpannableStringBuilder;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import mt3.a;
import lnc.a1;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import ot3.p0;
import android.graphics.Typeface;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.StyleInfo;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.DetailAtmosphereViewBinder$mTimerCallback$2$a;
import java.util.Objects;
import crd.b;
import gi4.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import ei4.k;
import android.view.View;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeTextView;

public final class DetailAtmosphereViewBinder extends b	// class@000764
{
    public b A;
    public final p B;
    public j x;
    public SelectShapeTextView y;
    public SelectShapeTextView z;

    public void DetailAtmosphereViewBinder(Fragment p0){
       super(p0);
       this.A = new b();
       this.B = s.c(new DetailAtmosphereViewBinder$mTimerCallback$2(this));
    }
    public void E8(){
       String str;
       DetailAtmosphereViewBinder tz1;
       DetailAtmosphereViewBinder tz2;
       DetailAtmosphereViewBinder uDetailAtmos = DetailAtmosphereViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDetailAtmos, "4")) {
          return;
       }
       super.E8();
       b d = this.u.d;
       if (!PatchProxy.applyVoidOneRefs(d, this, uDetailAtmos, "5")) {
          int i = 0x7f0604b8;
          if (!PatchProxy.applyVoidOneRefs(d, this, uDetailAtmos, "6")) {
             SpannableStringBuilder spannableStr = new SpannableStringBuilder();
             spannableStr.append(a.j(TextUtils.k(d.getMTagContent())).f(a1.d(R.dimen.arg_RES_7f070283)).a().h());
             SpannableStringBuilderUtils.i(spannableStr, a1.d(R.dimen.arg_RES_7f0702e3));
             spannableStr.append(a.j("гд").f(a1.d(R.dimen.arg_RES_7f070283)).h());
             SpannableStringBuilderUtils.i(spannableStr, a1.d(R.dimen.arg_RES_7f0702ac));
             spannableStr.append(a.j(p0.m(d.getMTagPrice())).f(a1.d(R.dimen.arg_RES_7f07029e)).i(p0.l()).a().h());
             tz2 = this.y;
             str = "mTagTextView";
             if (tz2 == null) {
                a.S(str);
             }
             tz2.setText(spannableStr);
             StyleInfo mStyle1 = d.getMStyle();
             if (mStyle1 != null) {
                tz2 = this.y;
                if (tz2 == null) {
                   a.S(str);
                }
                tz2.setTextColor(TextUtils.J(mStyle1.getMTagTextColor(), a1.a(R.color.arg_RES_7f061e52)));
                tz2 = this.y;
                if (tz2 == null) {
                   a.S(str);
                }
                b uob2 = new b();
                uob2.v(TextUtils.J(mStyle1.getMTagBgColor(), a1.a(i)));
                uob2.g(KwaiRadiusStyles.TL4_BL4);
                tz2.setBackground(uob2.a());
             }
          }
          if (!PatchProxy.applyVoidOneRefs(d, this, uDetailAtmos, "7")) {
             StyleInfo mStyle = d.getMStyle();
             str = "mDescTextView";
             if (mStyle != null) {
                DetailAtmosphereViewBinder tz = this.z;
                if (tz == null) {
                   a.S(str);
                }
                tz.setTextColor(TextUtils.J(mStyle.getMDescTextColor(), a1.a(i)));
                tz1 = this.z;
                if (tz1 == null) {
                   a.S(str);
                }
                b uob = new b();
                uob.v(TextUtils.J(mStyle.getMDescBgColor(), a1.a(R.color.arg_RES_7f0605c9)));
                uob.g(KwaiRadiusStyles.TR4_BR4);
                tz1.setBackground(uob.a());
             }
             tz1 = this.A;
             tz2 = this.z;
             if (tz2 == null) {
                a.S(str);
             }
             List mDescPattern = d.getMDescPattern();
             DetailAtmosphereViewBinder$mTimerCallback$2$a omTimerCallb = PatchProxy.apply(objArray, this, uDetailAtmos, "1");
             if (omTimerCallb == PatchProxyResult.class) {
                omTimerCallb = this.B.getValue();
             }
             Objects.requireNonNull(tz1);
             b uob1 = PatchProxy.applyThreeRefs(tz2, mDescPattern, omTimerCallb, tz1, b.class, "2");
             if (uob1 != PatchProxyResult.class) {
             }else {
                uob1 = tz1.d(tz2, mDescPattern, omTimerCallb, 0);
             }
             this.X7(uob1);
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, DetailAtmosphereViewBinder.class, "3")) {
          return;
       }
       this.x = this.S8();
       return;
    }
    public void V8(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailAtmosphereViewBinder.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.y = m1.f(p0, 0x7f0a0ab3);
       this.z = m1.f(p0, 0x7f0a0ab2);
       return;
    }
}
