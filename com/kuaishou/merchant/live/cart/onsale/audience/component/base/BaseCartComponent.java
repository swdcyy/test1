package com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent;
import r34.c;
import com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent$b;
import nsd.u;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent$view$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent$rootPresenter$2;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import android.view.ViewGroup;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.c;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import y8c.f;
import com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.DynamicEmptyView;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;

public abstract class BaseCartComponent implements c	// class@001932
{
    public ViewGroup a;
    public ComponentInfo b;
    public boolean c;
    public final p d;
    public final p e;
    public static final BaseCartComponent$b f;

    static {
       BaseCartComponent.f = new BaseCartComponent$b(null);
    }
    public void BaseCartComponent(){
       super();
       this.d = s.c(new BaseCartComponent$view$2(this));
       this.e = s.c(new BaseCartComponent$rootPresenter$2(this));
    }
    public List a(){
       Object obj = PatchProxy.apply(null, this, BaseCartComponent.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
    public View b(ViewGroup p0,ComponentInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BaseCartComponent.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a = p0;
       this.b = p1;
       this.f().f(this.g());
       return this.g();
    }
    public void c(Object p0,ComponentInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCartComponent.class, "8")) {
          return;
       }
       this.b = p1;
       if (!this.f().R1()) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          uArrayList.add(p0);
       }
       uArrayList.add(new c("LIVE_CART_COMPONENT_INFO", p1));
       p0 = p1.getData();
       if (p0 != null) {
          uArrayList.add(p0);
       }
       uArrayList.addAll(this.a());
       p0 = new Object[0];
       p0 = uArrayList.toArray(p0);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Array<T>");
       this.f().i(Arrays.copyOf(p0, p0.length));
       return;
    }
    public f d(ViewGroup p0,ComponentInfo p1){
       BaseCartComponent$a obj = PatchProxy.applyTwoRefs(p0, p1, this, BaseCartComponent.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a = p0;
       this.b = p1;
       obj = new BaseCartComponent$a(this);
       if (!this.h(p0, p1)) {
          obj.setIsRecyclable(false);
       }
       return obj;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, BaseCartComponent.class, "10")) {
          return;
       }
       this.f().destroy();
       return;
    }
    public final ComponentInfo e(){
       BaseCartComponent obj = PatchProxy.apply(null, this, BaseCartComponent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("componentInfo");
       }
       return obj;
    }
    public final PresenterV2 f(){
       Object obj = PatchProxy.applyWithListener(null, this, BaseCartComponent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(BaseCartComponent.class, "4");
       return this.e.getValue();
    }
    public final View g(){
       Object obj = PatchProxy.apply(null, this, BaseCartComponent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final boolean h(ViewGroup p0,ComponentInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BaseCartComponent.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a = p0;
       this.b = p1;
       return (this.g() instanceof DynamicEmptyView ^ 0x01);
    }
    public abstract PresenterV2 i();
    public abstract View j(ViewGroup p0);
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, BaseCartComponent.class, "9")) {
          return;
       }
       if (!this.f().R1()) {
          return;
       }
       try{
          this.f().unbind();
       }catch(java.lang.Exception e0){
          a.l(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "BaseCartComponent", "unbind fail", e0);
       }
       return;
    }
}
