package hx3.o;
import com.kuaishou.bowl.core.component.NativeComponent;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.DynamicPresenterView;
import iv.a;
import com.kuaishou.bowl.core.component.a;
import java.lang.Integer;
import io4.e;
import go4.a;
import ww3.a;
import f04.a;
import java.util.ArrayList;
import hx3.d;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import androidx.fragment.app.FragmentActivity;
import android.view.ViewGroup;
import android.content.Context;

public abstract class o extends NativeComponent	// class@002c4e
{

    public void o(){
       super();
    }
    public abstract PresenterV2 a();
    public PresenterV2 getPresenterV2(View p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0 instanceof DynamicPresenterView) {
          p0 = null;
       }
       if (p0 != null) {
          PatchProxy.onMethodExit(o.class, "5");
          return p0.getRootPresenter();
       }else {
          PatchProxy.onMethodExit(o.class, "5");
          return null;
       }
    }
    public a l(a p0){
       return p0;
    }
    public abstract Object m(a p0);
    public abstract int n();
    public void onBindView(a p0,View p1,int p2){
       Integer integer;
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, o.class, "2")) {
          return;
       }
       if (p0 != null) {
          a uoa = null;
          if (!p1 instanceof DynamicPresenterView) {
             p1 = uoa;
          }
          if (p1 == null) {
             a rootView = p0.rootView;
             if (rootView instanceof DynamicPresenterView) {
                uoa = rootView;
             }
             rootView = uoa;
          }
          if (p1 != null) {
             a uoa1 = new a();
             uoa1.a(this.m(p0));
             uoa1.d("ADAPTER_POSITION", Integer.valueOf(p2));
             e uoe = a.k(p0);
             if (a.a()) {
                if (a.c()) {
                   integer = uoe.e();
                   if (integer != null && integer.intValue() == 2) {
                      integer = Integer.valueOf(3);
                   label_0071 :
                      uoe.h(integer);
                   }
                }
                integer = Integer.valueOf(2);
                goto label_0071 ;
             }
             uoa1.d("MERCHANT_HOME_FEED_STYLE", uoe);
             uoa1.d("MERCHANT_HOME_WIDGET_COMPONENT", p0);
             p0 = p0.callerContext;
             if (p0 != null) {
                uoa1.e(this.l(p0));
             }
             ArrayList uArrayList = d.a(uoa1);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, p1, DynamicPresenterView.class, "1")) {
                Object[] objArray = new Object[0];
                Object[] objArray1 = uArrayList.toArray(objArray);
                Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                p1.b.i(Arrays.copyOf(objArray1, objArray1.length));
             }
          }
       }
    label_00ae :
       return;
    }
    public View onCreateView(FragmentActivity p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DynamicPresenterView uDynamicPres = (p1 != null)? new DynamicPresenterView(p1.getContext(), this): new View(p0);
       return uDynamicPres;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "4")) {
          return;
       }
       super.onDestroy();
       a trootView = this.rootView;
       if (trootView instanceof DynamicPresenterView) {
          objArray = trootView;
       }
       if (objArray != null) {
          objArray.b();
       }
       return;
    }
    public void onUnbind(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "3")) {
          return;
       }
       super.onUnbind();
       a trootView = this.rootView;
       if (!trootView instanceof DynamicPresenterView) {
          trootView = objArray;
       }
       if (trootView != null && !PatchProxy.applyVoid(objArray, trootView, DynamicPresenterView.class, "2")) {
          trootView.b.unbind();
       }
       return;
    }
    public void onViewChanged(){
    }
}
