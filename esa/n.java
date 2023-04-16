package esa.n;
import im8.g;
import com.kwai.kcube.decorator.IContainerDecorator;
import io.reactivex.subjects.PublishSubject;
import crd.a;
import esa.n$a;
import java.lang.Boolean;
import wq6.f;
import wq6.e;
import wq6.g;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import on5.n;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import wq6.l;
import on5.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pr6.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.g;
import ib5.q;
import brd.t;
import java.util.Objects;
import esa.j;
import erd.g;
import crd.b;
import esa.a;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import esa.n$b;
import fr6.i;
import as6.a;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.core.view.ScrollStrategy;
import android.view.ViewGroup;
import java.util.List;
import br6.a;
import so5.a;
import com.kwai.kcube.ext.actionbar.bottom.BottomActionBar;
import android.content.Context;
import o56.a;
import android.widget.TextView;
import android.widget.FrameLayout;
import java.lang.CharSequence;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView;
import com.kwai.written.view.IWrittenLayout;
import com.kwai.kcube.ext.MvpDecoratorViewHolder;
import esa.i;
import esa.m;
import z1.a;
import msd.a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import esa.q;
import java.util.Map;
import java.util.HashMap;
import lnc.b9;

public class n extends IContainerDecorator implements g	// class@0027d0
{
    public a h;
    public f i;
    public final PublishSubject j;
    public final a k;
    public boolean l;
    public final g m;

    public void n(){
       super();
       this.j = PublishSubject.g();
       this.k = new a();
       this.m = new n$a(this);
    }
    public static Boolean i(n p0){
       return p0.k();
    }
    private Boolean k(){
       e uoe = this.c().N();
       if (!n.b(uoe.M2())) {
          return Boolean.FALSE;
       }
       return Boolean.valueOf(c.a(this.b()).d().o(uoe.M2(), b.B));
    }
    public void f(){
       boolean b;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "7")) {
          return;
       }
       this.i = this.c();
       this.e().g().k3(this.m);
       n tj = this.j;
       Objects.requireNonNull(tj);
       b uob = q.p0(this.e().g()).r0().subscribe(new j(tj));
       if (!PatchProxy.applyVoidOneRefs(uob, this, on, "9")) {
          this.k.c(uob);
       }
       if (!PatchProxy.applyVoid(objArray, this, on, "8")) {
          a uoa = new a();
          this.h = uoa;
          uoa.e = this.j.hide();
          if (this.e().g() != null && this.e().g().getIntent() != null) {
             this.h.b = j0.a(this.e().g().getIntent(), "kwai_from_push", false);
          }
       }
       this.c().W(new n$b(this));
       h oh = this.c().R(b.B);
       if (oh == null) {
          return;
       }else {
          TabIdentifier f = b.f;
          if (a.o(oh, f)) {
             Object obj = PatchProxy.applyTwoRefs(oh, "ato_operate", objArray, a.class, "12");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                a.p(oh, "container");
                a.p("ato_operate", "targetType");
                b = oh.a().F4("ato_operate");
             }
             if (b && "ato_operate".equals(oh.a().U((oh.a().h() - 1)).M2().getType())) {
                this.c().I0(ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL);
             }else if(a.o(oh, f)){
                this.c().I0(ScrollStrategy.DISABLE_ALL_TOUCH);
             }else {
                this.c().I0(ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL);
             }
          }else {
             goto label_0108 ;
          }
          return;
       }
    }
    public List g(ViewGroup p0){
       BottomActionBar uBottomActio;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       a[] obj = PatchProxy.applyOneRefs(p0, this, on, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new a[1];
       MvpDecoratorViewHolder mvpDecorator = PatchProxy.applyOneRefs(p0, this, on, "2");
       if (mvpDecorator != patchProxyRe) {
       }else if(a.a().booleanValue()){
          uBottomActio = new BottomActionBar(p0.getContext());
          if (!PatchProxy.applyVoidOneRefs(uBottomActio, this, on, "11") && a.d()) {
             TextView textView = new TextView(uBottomActio.getContext());
             textView.setText("µ×µ¼ÓÅ»¯");
             FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2, 85);
             layoutParams.rightMargin = a1.e(20.00f);
             textView.setTextSize(10.00f);
             textView.setGravity(17);
             textView.setTextColor(-5592406);
             textView.setAlpha(0x3f000000);
             uBottomActio.addView(textView, layoutParams);
          }
       }else {
          uBottomActio = new BottomBarView(p0.getContext()).l1();
       }
       mvpDecorator = new MvpDecoratorViewHolder(uBottomActio, 3, new i(this), new m(this));
       obj[0] = mvpDecorator;
       return Lists.e(obj);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(n.class, new q());
       }else {
          obj.put(n.class, null);
       }
       return obj;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, n.class, "10")) {
          return;
       }
       this.e().g().t3(this.m);
       b9.a(this.k);
       return;
    }
    public final boolean j(TabIdentifier p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c().O(p0);
    }
}
