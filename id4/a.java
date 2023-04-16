package id4.a;
import hd4.d;
import com.kuaishou.bowl.core.component.NativeComponent;
import id4.a$b;
import nsd.u;
import id4.a$a;
import hd4.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.ViewGroup;
import com.kuaishou.bowl.core.component.a;
import java.lang.Boolean;
import hd4.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gd4.c;
import id4.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import lf4.f;
import java.lang.Integer;
import java.lang.ref.WeakReference;
import xm4.a;
import java.lang.Number;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import java.util.Map;
import lnc.o5;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import java.lang.StringBuilder;
import nv.c;

public abstract class a extends NativeComponent implements d	// class@002d14
{
    public final String b;
    public final a$a c;
    public final d d;
    public static final a$b e;

    static {
       a.e = new a$b(null);
    }
    public void a(){
       super(null, 1, null);
    }
    public void a(d p0){
       super();
       this.d = p0;
       this.b = "BaseComponent";
       this.c = new a$a(this);
    }
    public void a(d p0,int p1,u p2){
       a uoa = (p1 & 0x01)? new a(): null;
       super(uoa);
       return;
    }
    public View b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.b(p0);
    }
    public View d(Context p0,ViewGroup p1,View p2,a p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uoa, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.d(p0, p1, p2, p3, p4);
    }
    public void g(View p0){
       c.a(this, p0);
    }
    public PresenterV2 getPresenterV2(View p0){
       PresenterV2 obj = PatchProxy.applyOneRefsWithListener(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          c uoc = b.a(p0);
          if (uoc != null) {
             obj = uoc.a();
          }
          PatchProxy.onMethodExit(a.class, "11");
          return obj;
       }else {
          PatchProxy.onMethodExit(a.class, "11");
          return obj;
       }
    }
    public void h(Context p0,View p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "14")) {
          return;
       }
       this.d.h(p0, p1, p2);
       return;
    }
    public final Fragment l(FragmentActivity p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.getCurFragment();
    }
    public abstract int m();
    public boolean n(){
       return (this instanceof f ^ 0x01);
    }
    public void o(a p0,View p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "5")) {
          return;
       }
       c uoc = b.a(p1);
       if (uoc != null) {
          p2.a = p0.getInstanceId();
          if (p0.getModelObj() != null) {
             Object[] objArray = new Object[]{this.c,p0.getModelObj()};
             uoc.a().i(objArray);
          }else {
             Object[] objArray1 = new Object[]{this.c};
             uoc.a().i(objArray1);
          }
       }
       return;
    }
    public void onBindView(a p0,View p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "4")) {
          return;
       }
       this.o(p0, p1, p2);
       a td = this.d;
       a tcurActivity = this.curActivity;
       FragmentActivity uFragmentAct = (tcurActivity != null)? tcurActivity.get(): null;
       td.h(uFragmentAct, p1, p0);
       return;
    }
    public final View onCreateView(FragmentActivity p0,ViewGroup p1){
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p1 == null) {
          return new View(p0);
       }
       View view = PatchProxy.applyOneRefs(p1, this, a.class, "2");
       if (view != patchProxyRe) {
       }else {
          view = a.e(p1, this.m());
       }
       View view1 = this.d.d(p0, p1, view, this, this.n());
       if (!PatchProxy.applyVoidTwoRefs(view, view1, null, uob, "3")) {
          view.setTag(R.id.transaction_base_id_item_root_view, view1);
       }
       this.p(p0, view);
       Fragment uFragment = this.l(p0);
       if (uFragment != null) {
          PresenterV2 presenterV2 = this.q(uFragment);
          if (presenterV2 != null) {
             this.r(presenterV2);
             presenterV2.f(view);
             c uoc = PatchProxy.applyTwoRefsWithListener(view, presenterV2, this, a.class, "3");
             if (uoc != patchProxyRe) {
             }else {
                PageDyComponentInfo obj1 = PatchProxy.apply(null, this, a.class, "9");
                int i = 1;
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else {
                   a tcomponentDa = this.componentData;
                   if (tcomponentDa != null) {
                      PageDyComponentInfo style = tcomponentDa.style;
                      if (style != null) {
                         obj1 = (style.isEmpty() ^ i)? style: null;
                         if (obj1 != null) {
                            Object obj2 = style.get("span");
                            if (obj2 != null) {
                               if (!obj2 instanceof String) {
                                  obj2 = null;
                               }
                               if (obj2 != null) {
                                  i = o5.b(obj2, i);
                               }
                            }
                         }
                      }
                   }
                }
                uoc = new c(presenterV2, i);
                PatchProxy.onMethodExit(a.class, "3");
             }
             if (!PatchProxy.applyVoidTwoRefs(view1, uoc, null, uob, "2")) {
                view1.setTag(R.id.transaction_base_component_view_binder_id, uoc);
             }
          }
       }else {
          a.g(MerchantTransactionLogBiz.BASE, this.b, "fragment null");
       }
       return view1;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       super.onDestroy();
       c.f(this.getComponentName()+" onDestroy");
       a trootView = this.rootView;
       if (trootView != null) {
          c uoc = b.a(trootView);
          if (uoc != null) {
             PresenterV2 presenterV2 = uoc.a();
             if (presenterV2 != null) {
                presenterV2.destroy();
             }
          }
       }
       return;
    }
    public void onUnbind(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       super.onUnbind();
       c uoc = b.a(this.rootView);
       if (uoc != null) {
          PresenterV2 presenterV2 = uoc.a();
          if (presenterV2 != null) {
             presenterV2.unbind();
          }
       }
       return;
    }
    public void onViewAppear(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       super.onViewAppear(p0);
       this.d.g(p0);
       return;
    }
    public final void onViewChanged(){
    }
    public void p(FragmentActivity p0,View p1){
    }
    public abstract PresenterV2 q(Fragment p0);
    public void r(PresenterV2 p0){
    }
}
