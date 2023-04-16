package cj4.b;
import vd4.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import cj4.e;
import com.google.gson.JsonElement;
import cj4.b$e;
import mu4.d;
import cj4.b$f;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import android.animation.ObjectAnimator;
import android.view.View;
import ekd.m1;
import cj4.b$c;
import android.view.View$OnTouchListener;
import com.kuaishou.merchant.bowl.krn.MerchantKrnContainerView;
import cj4.b$d;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cj4.b$a;
import android.animation.Animator$AnimatorListener;
import cj4.b$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import gd4.d;
import rk0.b;
import gd4.d$a;
import ue4.g;

public final class b extends b	// class@000481
{
    public MerchantKrnContainerView A;
    public View B;
    public e C;
    public boolean D;
    public ObjectAnimator E;
    public float F;
    public final String y;
    public View z;

    public void b(Fragment p0){
       super(p0);
       this.y = "MtppPriceDetailContainerViewBinder";
    }
    public void E8(){
       boolean b;
       JsonElement jsonElement1;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "3")) {
          return;
       }
       super.E8();
       b tC = this.C;
       Object obj = PatchProxy.applyOneRefs(tC, this, uob, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tC != null){
          String str = tC.a();
          str = (str == null || !str.length())? 1: null;
          if (!str) {
             str = tC.b();
             JsonElement jsonElement = (str == null || !str.length())? 1: null;
             if (!jsonElement && tC.d() != null) {
                jsonElement1 = tC.d();
                if (jsonElement1 == null || jsonElement1.D() != true) {
                   jsonElement1 = 0;
                label_0060 :
                   if (jsonElement1) {
                      this.t9();
                      b = true;
                   }else {
                      b = false;
                   }
                }
             }
          }
       }
    label_005f :
       jsonElement1 = 1;
       goto label_0060 ;
       if (b) {
          return;
       }else {
          this.X8("mt_purchase_panel_open_price_detail", new b$e(this));
          this.X8("mt_purchase_panel_close_price_detail", new b$f(this));
          tC = this.C;
          a.m(tC);
          if (!PatchProxy.applyVoidOneRefs(tC, this, uob, "7") && this.q9()) {
             uob = this.A;
             if (uob == null) {
                a.S("mMerchantKrnContainerView");
             }
             uob.Vc(this.s9(tC));
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       super.J8();
       b tE = this.E;
       if (tE != null) {
          tE.end();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.doBindView(p0);
       View view = m1.f(p0, R.id.price_detail_container);
       this.z = view;
       if (view == null) {
          a.S("mContainer");
       }
       view.setOnTouchListener(b$c.b);
       this.A = m1.f(p0, 0x7f0a16a4);
       p0 = m1.f(p0, R.id.price_detail_close);
       this.B = p0;
       if (p0 == null) {
          a.S("mCloseView");
       }
       p0.setOnClickListener(new b$d(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.j8();
       this.C = this.s8(e.class);
       return;
    }
    public final void o9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "9")) {
          return;
       }
       float f = 0;
       b tE = this.E;
       if (tE != null) {
          f = (float)1 - this.F;
          a.m(tE);
          tE.end();
       }
       int i = 2;
       b.m9(this, "mt_purchase_panel_price_detail_closed", objArray, i, objArray);
       b tz = this.z;
       if (tz == null) {
          a.S("mContainer");
       }
       float[] uofloatArray = new float[i];
       b tz1 = this.z;
       if (tz1 == null) {
          a.S("mContainer");
       }
       uofloatArray[0] = f * (float)tz1.getHeight();
       b tz2 = this.z;
       if (tz2 == null) {
          a.S("mContainer");
       }
       uofloatArray[1] = (float)tz2.getHeight();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tz, "translationY", uofloatArray);
       this.E = objectAnimat;
       a.m(objectAnimat);
       objectAnimat.setDuration(100);
       tz2 = this.E;
       a.m(tz2);
       tz2.start();
       tz2 = this.E;
       a.m(tz2);
       tz2.addListener(new b$a(this));
       tz2 = this.E;
       a.m(tz2);
       tz2.addUpdateListener(new b$b(this));
       tz2 = this.E;
       a.m(tz2);
       tz2.setInterpolator(new AccelerateInterpolator());
       return;
    }
    public final boolean q9(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.z;
       if (obj == null) {
          a.S("mContainer");
       }
       b = (!obj.getVisibility() && this.D != null)? true: false;
       return b;
    }
    public final Bundle s9(e p0){
       Bundle obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putString("mt_pageId", d.n.a(this.R8()).s0());
       obj.putString("rnData", g.d(p0.d()));
       return obj;
    }
    public final void t9(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       if (!this.q9()) {
          return;
       }
       this.o9();
       return;
    }
}
