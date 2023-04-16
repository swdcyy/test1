package com.yxcorp.gifshow.profile.collect.fragment.CollectionTagFragment;
import k3c.v1;
import com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionBaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import p2c.w;
import p2c.a;
import y8c.t;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionTagFragment$a;
import s1c.r0;
import y2c.a;
import p2c.c1;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import i2c.d0;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import qa6.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import ip5.b;
import brd.t;
import t45.d;
import brd.z;
import i2c.a0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import lnc.b9;
import com.kwai.library.widget.refresh.RefreshLayout;
import y8c.g;
import g2c.g;
import qvb.i;
import o2c.i;

public class CollectionTagFragment extends ProfileCollectionBaseFragment implements v1	// class@0012ab
{
    public String H;
    public r0 I;
    public boolean J;
    public b K;

    public void CollectionTagFragment(){
       super();
       this.H = "EVENT";
       this.J = false;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionTagFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new w());
       obj.U7(new a());
       PatchProxy.onMethodExit(CollectionTagFragment.class, "1");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, CollectionTagFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CollectionTagFragment$a(this, this, this.I);
    }
    public void Fc(r0 p0){
       this.I = p0;
    }
    public PresenterV2 Gh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionTagFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a());
       obj.U7(new c1());
       PatchProxy.onMethodExit(CollectionTagFragment.class, "4");
       return obj;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public List fg(){
       CollectionTagFragment tI;
       Object[] obj = PatchProxy.apply(null, this, CollectionTagFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this,tI,tI.e};
       tI = this.I;
       return Lists.e(obj);
    }
    public void ga(boolean p0){
       this.J = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CollectionTagFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CollectionTagFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CollectionTagFragment.class, new d0());
       }else {
          obj.put(CollectionTagFragment.class, null);
       }
       return obj;
    }
    public boolean h9(){
       return this.J;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CollectionTagFragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, CollectionTagFragment.class, "8");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          CollectionTagFragment tI = this.I;
          b = (tI != null && a.b(tI.b))? true: false;
       }
       if (b) {
          this.K = RxBus.f.f(b.class).observeOn(d.a).subscribe(new a0(this));
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CollectionTagFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.K);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectionTagFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Ac().setBackgroundResource(R.color.arg_RES_7f061b13);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, CollectionTagFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g(this.I.b.getId());
    }
    public boolean x0(){
       return false;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, CollectionTagFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(this.I.b.getId());
    }
}
