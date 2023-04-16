package com.yxcorp.gifshow.profile.collect.fragment.CollectionPOIFragment;
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
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPOIFragment$a;
import s1c.r0;
import y2c.a;
import p2c.t0;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import i2c.g;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import qa6.a;
import lnc.u1;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.webview.jsmodel.JsEmitParameter;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.widget.refresh.RefreshLayout;
import y8c.g;
import g2c.c;
import qvb.i;
import com.yxcorp.gifshow.profile.collect.network.a;

public class CollectionPOIFragment extends ProfileCollectionBaseFragment implements v1	// class@0012a1
{
    public String H;
    public r0 I;
    public boolean J;

    public void CollectionPOIFragment(){
       super();
       this.H = "POI";
       this.J = false;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionPOIFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new w());
       obj.U7(new a());
       PatchProxy.onMethodExit(CollectionPOIFragment.class, "1");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, CollectionPOIFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CollectionPOIFragment$a(this, this, this.I);
    }
    public void Fc(r0 p0){
       this.I = p0;
    }
    public PresenterV2 Gh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionPOIFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a());
       obj.U7(new t0());
       PatchProxy.onMethodExit(CollectionPOIFragment.class, "4");
       return obj;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public List fg(){
       CollectionPOIFragment tI;
       Object[] obj = PatchProxy.apply(null, this, CollectionPOIFragment.class, "2");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, CollectionPOIFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CollectionPOIFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CollectionPOIFragment.class, new g());
       }else {
          obj.put(CollectionPOIFragment.class, null);
       }
       return obj;
    }
    public boolean h9(){
       return this.J;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CollectionPOIFragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, CollectionPOIFragment.class, "8");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          CollectionPOIFragment tI = this.I;
          b = (tI != null && a.b(tI.b))? true: false;
       }
       if (b) {
          u1.a(this);
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CollectionPOIFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       u1.b(this);
       return;
    }
    public void onEventMainThread(JsEmitParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionPOIFragment.class, "7")) {
          return;
       }
       if (TextUtils.n("h5_channel_poi", p0.mType)) {
          this.a();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectionPOIFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Ac().setBackgroundResource(R.color.arg_RES_7f061b13);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, CollectionPOIFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.I.b.getId());
    }
    public boolean x0(){
       return false;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, CollectionPOIFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.I.b.getId());
    }
}
