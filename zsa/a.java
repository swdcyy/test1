package zsa.a;
import qsa.i;
import zsa.a$a;
import nsd.u;
import lnc.a1;
import wq6.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gr6.b;
import mr6.b;
import qsa.b;
import zsa.a$c;
import erd.g;
import crd.b;
import brd.t;
import lnc.b9;
import zsa.b;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import gsa.e0;
import wq6.f;
import ysa.a;
import java.lang.Integer;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import java.lang.Boolean;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import wq6.g;
import android.view.View;
import java.lang.Float;
import android.text.TextPaint;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;
import androidx.core.content.ContextCompat;
import android.graphics.Typeface;
import zsa.a$b;
import rua.d;
import ok.h;
import sb5.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import rua.c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import wn5.b;
import tra.a;

public abstract class a extends i	// class@004d8e
{
    public b n;
    public final h o;
    public static final int p;
    public static final a$a q;

    static {
       a.q = new a$a(null);
       a.p = a1.d(0x7f070fdf);
    }
    public void a(h p0){
       a.p(p0, "tab");
       super();
       this.o = p0;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.l();
       this.n = this.d().c.subscribe(new a$c(this));
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       super.m();
       b9.a(this.n);
       return;
    }
    public Object t(){
       a to;
       b uob = b.class;
       b obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       IconifyRadioButtonNew obj1 = this.i(R.id.tab_strip_item);
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip.Tab");
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, uob, "4")) {
          a.p(obj1, "<set-?>");
          obj.c = obj1;
       }
       obj1 = this.y();
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, uob, "2")) {
          a.p(obj1, "<set-?>");
          obj.b = obj1;
       }
       to = this.o;
       if (!PatchProxy.applyVoidOneRefs(to, obj, uob, "6")) {
          a.p(to, "<set-?>");
          obj.d = to;
       }
       return obj;
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "rootPresenter");
       p0.U7(new a(this.y()));
       PatchProxy.onMethodExit(a.class, "3");
       return;
    }
    public void v(e0 p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "4")) {
          return;
       }
       a.p(p0, "homeTabBarViewInfo");
       IconifyRadioButtonNew iconifyRadio = this.y();
       Object[] objArray = a.a(this.o, p0, this.f());
       object oobject = objArray[0];
       Objects.requireNonNull(oobject, "null cannot be cast to non-null type kotlin.Int");
       iconifyRadio.setTextColor(oobject.intValue());
       Object obj = PatchProxy.apply(null, this, uoa, "7");
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          TabIdentifier f = b.f;
          a.o(f, "HomeTabIdentifier.FEATURE");
          b = this.f().O(f) ^ i;
       }
       if (b) {
          oobject = objArray[i];
          String str = "null cannot be cast to non-null type kotlin.Float";
          Objects.requireNonNull(oobject, str);
          this.j().setScaleX(oobject.floatValue());
          object oobject1 = objArray[i];
          Objects.requireNonNull(oobject1, str);
          this.j().setScaleY(oobject1.floatValue());
       }
       iconifyRadio.d.setShadowLayer(p0.A, p0.B, p0.C, p0.D);
       iconifyRadio.invalidate();
       iconifyRadio.j(p0.i);
       iconifyRadio.setRedDotColor(p0.j);
       return;
    }
    public final IconifyRadioButtonNew w(Context p0){
       b uob;
       IconifyRadioButtonNew obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = new IconifyRadioButtonNew(p0);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, a.p);
       layoutParams.gravity = 17;
       obj.setLayoutParams(layoutParams);
       obj.setAutoTextSize(false);
       obj.setTextSize(a.b(this.f()));
       obj.setTriangleRadius((float)a1.e(0x3f000000));
       obj.setTriangleLeftMargin(a1.e(2.00f));
       obj.setTriangleHeight(4.00f);
       obj.setUpTriangleHeight(4.00f);
       obj.setTextColor(ContextCompat.getColor(p0, R.color.arg_RES_7f061680));
       obj.k((float)a1.e(0x3fc00000));
       obj.setTypeface(Typeface.defaultFromStyle(false));
       a$b b = a$b.b;
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(obj, b, Boolean.TRUE, null, d.class, "1")) {
          int i = 0x7f0823c6;
          int i1 = a1.e(((float)81 / 3.00f));
          int i2 = a1.e(((float)45 / 3.00f));
          String str1 = e.e(b, null);
          if (TextUtils.x(str1)) {
             obj.setImageResourceId(i);
          }else {
             a.e(str1, new c(obj, i, i1, i2));
          }
       }
       TextPaint textPaint = obj.getTextPaint();
       a.o(textPaint, "textPaint");
       textPaint.setFakeBoldText(true);
       obj.setTag(this.o.M2());
       TabIdentifier tabIdentifie = this.o.M2();
       String str = "KEY_TAB_NAME_DEST";
       if (a.g(tabIdentifie, b.F)) {
          uob = this.o.a().j().q(str);
       }else if(a.g(tabIdentifie, b.G)){
          Boolean uBoolean = a.f();
          a.o(uBoolean, "userChangedTab");
          uob = (uBoolean.booleanValue())? this.o.a().j().q(str): this.o.q(str);
       }else {
          uob = this.o.q(str);
       }
       obj.setText(uob.d(this.f().x("ato_operate")));
       return obj;
    }
    public final h x(){
       return this.o;
    }
    public abstract IconifyRadioButtonNew y();
}
