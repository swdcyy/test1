package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.f;
import o7c.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePymkPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.e;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnPreDrawListener;
import u4c.d;
import g7c.a;
import com.kwai.robust.PatchProxyResult;
import u4c.d0;
import com.yxcorp.gifshow.pymk.f;
import brd.t;
import a7c.h$a;
import ok.x;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.f$a;
import i7c.f;
import u4c.b;
import u4c.c;
import java.util.Objects;
import a7c.b$a;
import a3c.e;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.c;
import f7c.d;
import android.widget.ImageView;

public class f extends b	// class@001538
{
    public final UserProfilePymkPresenter h;

    public void f(UserProfilePymkPresenter p0){
       this.h = p0;
       super();
    }
    public void P2(){
       f th;
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       View[] viewArray = new View[]{th.D,th.E};
       th = this.h;
       n.Z(0, viewArray);
       f th1 = this.h;
       if (th1.X != null) {
          return;
       }
       th1.X = new e(this);
       th1.C.getViewTreeObserver().addOnPreDrawListener(this.h.X);
       return;
    }
    public Class d(){
       return d.class;
    }
    public a f(){
       f obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj.S == null) {
          obj.S = new d0(this);
       }
       return obj.S;
    }
    public h$a g(f p0,t p1){
       h$a obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h$a(null, p0, true, p1);
       obj.p(new f$a(this, true));
       h$a uoa = obj.e(15, d.class);
       uoa = uoa.e(19, b.class).e(20, c.class);
       f th = this.h;
       Objects.requireNonNull(th);
       b$a uoa1 = PatchProxy.apply(null, th, UserProfilePymkPresenter.class, "15");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = new b$a();
          uoa1.f(true);
          if (e.a(th.N)) {
             uoa1.c(a.b);
             uoa1.d(b.b);
             uoa1.i = c.b;
          }
       }
       uoa.g(uoa1);
       uoa.i(true);
       uoa.f(this.f());
       uoa.m(this);
       return uoa;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
          return;
       }
       f th = this.h;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, UserProfilePymkPresenter.class, "22")) {
          th.z.setEnabled(false);
          th.A.setEnabled(false);
       }
       this.h.R8();
       return;
    }
}
