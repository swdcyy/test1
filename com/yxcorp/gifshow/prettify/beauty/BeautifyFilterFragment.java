package com.yxcorp.gifshow.prettify.beauty.BeautifyFilterFragment;
import im8.g;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import q0c.z;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import xyb.a;
import w46.b;
import p0c.a$a;
import p0c.a;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import o0c.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewParent;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p0c.e;
import oe6.e;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.beauty.m;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import n1c.l;
import android.widget.LinearLayout;
import n1c.k;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.prettify.beauty.r;

public class BeautifyFilterFragment extends FlyWheelBaseFragment implements g	// class@0010ed
{
    public BeautifyFilterFragment n;
    public BeautifyConfig o;
    public a p;
    public PublishSubject q;
    public PublishSubject r;
    public PublishSubject s;
    public BaseFragment t;
    public PostBubbleManager u;
    public View v;
    public PresenterV2 w;
    public m x;
    public static int y;

    public void BeautifyFilterFragment(){
       super();
       this.q = PublishSubject.g();
       this.r = PublishSubject.g();
       this.s = PublishSubject.g();
    }
    public String E7(){
       return "Beautify";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BeautifyFilterFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new z();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BeautifyFilterFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(BeautifyFilterFragment.class, new z());
       }else {
          obj.put(BeautifyFilterFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautifyFilterFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.p == null) {
          ExceptionHandler.handleCaughtException(new Throwable("restore beauty fragment unexpected"));
          Object[] objArray = new Object[0];
          a.D().t("BeautifyFilterFragment", "mBeautyOptionError", objArray);
          this.p = new a$a().a();
       }
       this.o = this.p.r();
       if (this.p.p() != null) {
          this.p.p().f6();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BeautifyFilterFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.n = this;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautifyFilterFragment.class, "10")) {
          BeautifyFilterFragment tv = this.v;
          if (tv == null) {
             this.v = a.g(p0, this.p.a, p1, false);
          }else if(tv.getParent() != null){
             this.v.getParent().removeView(this.v);
          }
       }
       if (this.p.p() != null) {
          this.p.p().W5();
       }
       return this.v;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, BeautifyFilterFragment.class, "9")) {
          return;
       }
       super.onDestroy();
       if (this.p.p() != null) {
          this.p.p().x5();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BeautifyFilterFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       BeautifyFilterFragment tw = this.w;
       if (tw != null) {
          tw.unbind();
          this.w.destroy();
       }
       if (this.p.p() != null) {
          this.p.p().f5();
       }
       if (this.p.m() != null) {
          e.A0(false);
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(BeautifyFilterFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BeautifyFilterFragment.class, "7")) {
          return;
       }
       super.onHiddenChanged(p0);
       BeautifyFilterFragment tx = this.x;
       if (tx != null) {
          Objects.requireNonNull(tx);
          m om = m.class;
          if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tx, om, "16")) {
             tx.r.k(p0);
             if (!p0 && tx.G.b()) {
                tx.G.e();
             }
             tx.b9();
             if (!p0) {
                tx.c9();
                if (!PatchProxy.applyVoid(null, tx, om, "18") && !tx.r.getVisibility()) {
                   tx.P.d(tx.r.getFirstItemVisible(), tx.r.getLastItemVisible());
                }
                tx.X8(tx.E.Q0());
             }else {
                tx.V8();
                tx.W8();
                tx.E.a1(false);
                tx.X = false;
             }
          }
       }
       if (this.p.p() != null) {
          this.p.p().v6(p0);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, BeautifyFilterFragment.class, "5")) {
          return;
       }
       super.onStart();
       if (this.p.p() != null) {
          this.p.p().y6();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, BeautifyFilterFragment.class, "6")) {
          return;
       }
       super.onStop();
       if (this.p.p() != null) {
          this.p.p().u3();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautifyFilterFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.w = new PresenterV2();
       m om = new m();
       this.x = om;
       this.w.U7(om);
       this.w.f(this.v);
       Object[] objArray = new Object[]{this};
       this.w.i(objArray);
       return;
    }
}
