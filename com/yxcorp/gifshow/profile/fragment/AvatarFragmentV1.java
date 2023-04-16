package com.yxcorp.gifshow.profile.fragment.AvatarFragmentV1;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.model.CDNUrl;
import io.reactivex.subjects.PublishSubject;
import t3c.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import qa6.a;
import k3c.d0;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;
import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import lnc.d2;
import jp.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import lnc.b5;
import ekd.i;
import android.view.View;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.List;
import com.yxcorp.gifshow.profile.common.model.ProfilePendant;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i4c.h;
import i4c.k;
import i4c.n;
import h3c.g;
import tkd.b;
import tkd.d;
import gx5.d;
import i4c.o;
import i4c.i1;
import wh5.c;
import i4c.e;
import k3c.r;
import android.view.View$OnClickListener;
import k2b.e0;
import k2b.u1;

public class AvatarFragmentV1 extends BaseFragment implements g	// class@001300
{
    public User j;
    public CDNUrl[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public PublishSubject o;
    public BaseFragment p;
    public g q;
    public ProfilePendant r;
    public ProfileStatusInfo s;
    public View t;
    public View u;
    public PresenterV2 v;
    public static final int w;

    public void AvatarFragmentV1(){
       super();
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.k = uCDNUrlArray;
       this.n = true;
       this.o = PublishSubject.g();
       this.q = new g();
    }
    public int M(){
       return 1;
    }
    public final boolean ch(){
       Object obj = PatchProxy.apply(null, this, AvatarFragmentV1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.b(this.j);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AvatarFragmentV1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, AvatarFragmentV1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(AvatarFragmentV1.class, new d0());
       }else {
          obj.put(AvatarFragmentV1.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 265;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, AvatarFragmentV1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "has_avatar="+this.l;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragmentV1.class, "5")) {
          return;
       }
       super.onConfigurationChanged(p0);
       d2.n();
       a.e();
       if (d2.i(p0) || b5.a(this.getActivity())) {
          AvatarFragmentV1 tt = this.t;
          if (tt != null) {
             tt.requestLayout();
          }
       }else if(i.c() && this.getActivity() != null){
          i.j(this.getActivity(), this.u, false);
       }
       this.o.onNext(Boolean.FALSE);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragmentV1.class, "2")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          try{
             this.j = SerializableHook.getSerializable(p0, "user");
             Serializable serializable = SerializableHook.getSerializable(p0, "bigAvatars");
             int i = 0;
             if (serializable != null) {
                CDNUrl[] uCDNUrlArray = new CDNUrl[i];
                this.k = serializable.toArray(uCDNUrlArray);
             }
             this.m = p0.getBoolean("showKwaiId", i);
             this.l = p0.getBoolean("defaultHead", i);
             this.n = p0.getBoolean("showModifyAlias", true);
             serializable = SerializableHook.getSerializable(p0, "pendantInfo");
             if (serializable != null) {
                this.r = serializable;
             }
             this.s = SerializableHook.getSerializable(p0, "statusInfo");
          }catch(java.lang.ClassCastException e0){
             if (this.getActivity() != null) {
                this.getActivity().finish();
                return;
             }
          }
          AvatarFragmentV1 tj = this.j;
          if (tj != null) {
             tj.startSyncWithFragment(this.m());
          }
       }
       this.p = this;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AvatarFragmentV1.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.t == null) {
          i = (this.ch())? 0x7f0d0f60: 0x7f0d1653;
          this.t = a.g(p0, i, p1, false);
       }
       this.u = this.t.findViewById(0x7f0a3f6a);
       if (i.c() && (!b5.a(this.getActivity()) && this.getActivity() != null)) {
          i.j(this.getActivity(), this.u, false);
       }
    label_0055 :
       return this.t;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AvatarFragmentV1.class, "6")) {
          return;
       }
       super.onDestroyView();
       AvatarFragmentV1 tv = this.v;
       if (tv != null) {
          tv.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AvatarFragmentV1.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.j == null) {
          this.getActivity().finish();
          return;
       }else if(this.v == null){
          PresenterV2 presenterV2 = new PresenterV2();
          this.v = presenterV2;
          presenterV2.U7(new h());
          this.v.U7(new k());
          if (this.ch()) {
             this.v.U7(new n());
             presenterV2 = PatchProxy.apply(null, null, g.class, "2");
             boolean b = (presenterV2 != PatchProxyResult.class)? presenterV2.booleanValue(): d.a(-1188553266).kD();
             if (b) {
                this.v.U7(new o());
             }
          }else {
             this.v.U7(new i1());
          }
          if (!c.j()) {
             this.v.U7(new e());
          }
          this.v.f(p0);
       }
       Object[] objArray = new Object[]{this};
       this.v.i(objArray);
       this.t.setOnClickListener(new r(this));
       u1.L0(this);
       return;
    }
}
