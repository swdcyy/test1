package gra.y;
import gra.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog;
import fra.f;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.TextView;
import java.lang.CharSequence;
import android.widget.ImageView;
import gra.y$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcPopType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;
import gra.y$a;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.Boolean;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import gra.w;
import java.lang.Enum;
import android.text.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import nna.a;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;
import dra.c;
import gra.y$d;
import erd.a;
import gra.y$e;
import erd.g;
import crd.b;
import t45.d;
import brd.z;
import gra.x;
import erd.o;
import gra.y$c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;

public final class y extends b	// class@002bd4
{
    public final String r;
    public f s;
    public boolean t;

    public void y(){
       super();
       this.r = "GrowthVfcTipPresenter";
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y.class, "4")) {
          return;
       }
       y ts = this.s;
       if (ts == null) {
          a.S("mCallContext");
       }
       NonReceiveCouponDialog nonReceiveCo = ts.b();
       if (nonReceiveCo != null) {
          View view = this.m8();
          a.o(view, "rootView");
          this.Y8(view, nonReceiveCo.btnText, null);
          TextView textView = this.k8(R.id.btn_title);
          if (textView != null) {
             textView.setText(nonReceiveCo.title);
          }
          textView = this.k8(R.id.content);
          if (textView != null) {
             textView.setText(nonReceiveCo.desc);
          }
       }
       ImageView imageView = this.k8(R.id.btn_close);
       if (imageView != null) {
          imageView.setOnClickListener(new y$b(this));
       }
       GrowthVfcLogger.a.f(GrowthVfcLogger$VfcPopType.TYPE4, null);
       return;
    }
    public void Y8(View p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, null, this, y.class, "5")) {
          return;
       }
       a.p(p0, "view");
       TextView textView = p0.findViewById(R.id.btn_positive);
       if (textView != null) {
          textView.setText(p1);
          textView.setOnClickListener(new y$a(this, p1));
       }
       return;
    }
    public String c9(){
       Object[] objArray = null;
       y obj = PatchProxy.apply(objArray, this, y.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mCallContext");
       }
       NonReceiveCouponDialog nonReceiveCo = obj.b();
       if (nonReceiveCo != null) {
          objArray = nonReceiveCo.vUserId;
       }
       return objArray;
    }
    public t d9(){
       Object obj = PatchProxy.apply(null, this, y.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(Boolean.TRUE);
    }
    public final f e9(){
       y obj = PatchProxy.apply(null, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mCallContext");
       }
       return obj;
    }
    public void j6(){
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "6")) {
          return;
       }
       if (this.t != null) {
          return;
       }
       boolean b = true;
       this.t = b;
       y ts = this.s;
       String str = "mCallContext";
       if (ts == null) {
          a.S(str);
       }
       NonReceiveCouponDialog nonReceiveCo = ts.b();
       if (nonReceiveCo != null) {
          Object[] objArray1 = new Object[0];
          w.C().t(this.r, "onBtnClick action is "+nonReceiveCo.action, objArray1);
          int i = w.a[nonReceiveCo.action.ordinal()];
          if (i != b) {
             if (i != 2) {
                this.t = false;
                oy = this.s;
                if (oy == null) {
                   a.S(str);
                }
                NonReceiveCouponDialog nonReceiveCo1 = oy.b();
                if (!(b ^ TextUtils.isEmpty(nonReceiveCo.linkUrl))) {
                   nonReceiveCo1 = objArray;
                }
                if (nonReceiveCo1 != null) {
                   RxBus f = RxBus.f;
                   nonReceiveCo1 = nonReceiveCo1.linkUrl;
                   if (nonReceiveCo1 != null) {
                      objArray = new a(nonReceiveCo1);
                   }
                   f.b(objArray);
                }
                c uoc = this.X8();
                if (uoc != null) {
                   GrowthVfcUtilKt.a(uoc);
                }
             }else {
                Object[] objArray2 = new Object[0];
                w.C().t(this.r, "onBtnClick OPEN_ACTIVITY_ACTION", objArray2);
                if (nonReceiveCo.vUserId != null) {
                   this.t = b;
                   oy = this.s;
                   if (oy == null) {
                      a.S(str);
                   }
                   this.X7(c.a(oy.c(), nonReceiveCo.vUserId, "").doFinally(new y$d(nonReceiveCo, this)).subscribe(new y$e(nonReceiveCo, this)));
                }
             }
          }else {
             Object[] objArray3 = new Object[0];
             w.C().t(this.r, "onBtnClick AWARD_ACTION", objArray3);
             t ot = PatchProxy.apply(objArray, this, oy, "7");
             if (ot != PatchProxyResult.class) {
             }else {
                ot = this.W8().observeOn(d.b).flatMap(new x(this));
                a.o(ot, "callLogin\(\).observeOn\(Kw¡­just\(false\)\n      }\n    }");
             }
             this.X7(ot.doFinally(new y$c(this)).subscribe());
          }
       }
       GrowthVfcLogger$a.d(GrowthVfcLogger.a, GrowthVfcLogger$VfcButtonType.MAIN_BUTTON, GrowthVfcLogger$VfcPopType.TYPE4, null, 4, null);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "3")) {
          return;
       }
       super.j8();
       Object obj = this.r8("GROWTH_VFC_DIALOG_CONTEXT");
       a.o(obj, "inject\(GrowthVfcDialog.GROWTH_VFC_DIALOG_CONTEXT\)");
       this.s = obj;
       return;
    }
}
