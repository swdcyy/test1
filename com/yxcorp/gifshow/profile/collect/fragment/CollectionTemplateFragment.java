package com.yxcorp.gifshow.profile.collect.fragment.CollectionTemplateFragment;
import k3c.v1;
import com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionBaseFragment;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionTemplateFragment$a;
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
import com.yxcorp.gifshow.profile.collect.fragment.CollectionTemplateFragment$b;
import s1c.r0;
import y2c.a;
import p2c.g1;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import i2c.h0;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import qa6.a;
import i26.b;
import i2c.e0;
import com.trello.rxlifecycle3.android.FragmentEvent;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragment;
import crd.b;
import eoc.f;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import qvb.i;
import qvb.q;
import qvb.j;
import com.kwai.library.widget.refresh.RefreshLayout;
import y8c.g;
import g2c.h;
import o2c.l;
import qvb.a;

public class CollectionTemplateFragment extends ProfileCollectionBaseFragment implements v1	// class@0012ae
{
    public String H;
    public r0 I;
    public boolean J;
    public int K;
    public final q L;
    public static final int M;

    public void CollectionTemplateFragment(){
       super();
       this.H = "TEMPLATE";
       this.J = false;
       this.K = 0;
       this.L = new CollectionTemplateFragment$a(this);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionTemplateFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new w());
       obj.U7(new a());
       PatchProxy.onMethodExit(CollectionTemplateFragment.class, "1");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, CollectionTemplateFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CollectionTemplateFragment$b(this, this, this.I);
    }
    public void Fc(r0 p0){
       this.I = p0;
    }
    public PresenterV2 Gh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionTemplateFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a());
       obj.U7(new g1());
       PatchProxy.onMethodExit(CollectionTemplateFragment.class, "4");
       return obj;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public List fg(){
       CollectionTemplateFragment tI;
       Object[] obj = PatchProxy.apply(null, this, CollectionTemplateFragment.class, "2");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, CollectionTemplateFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CollectionTemplateFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CollectionTemplateFragment.class, new h0());
       }else {
          obj.put(CollectionTemplateFragment.class, null);
       }
       return obj;
    }
    public boolean h9(){
       return this.J;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CollectionTemplateFragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, CollectionTemplateFragment.class, "8");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          CollectionTemplateFragment tI = this.I;
          b = (tI != null && a.b(tI.b))? true: false;
       }
       if (b) {
          f.c(b.class, new e0(this), this, FragmentEvent.DESTROY_VIEW);
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CollectionTemplateFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       if (this.q() != null) {
          this.q().f(this.L);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectionTemplateFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Ac().setBackgroundResource(R.color.arg_RES_7f061b13);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, CollectionTemplateFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this.I.b.getId());
    }
    public boolean x0(){
       return false;
    }
    public i yh(){
       l obj = PatchProxy.apply(null, this, CollectionTemplateFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new l(this.I.b.getId());
       obj.h(this.L);
       return obj;
    }
}
