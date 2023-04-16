package com.yxcorp.gifshow.profile.fragment.AvatarFragment;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.model.CDNUrl;
import io.reactivex.subjects.PublishSubject;
import t3c.g;
import android.content.Intent;
import h3c.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h3c.a;
import java.util.Objects;
import android.net.Uri;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import java.lang.NullPointerException;
import java.lang.Exception;
import k3c.q;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.UserProfile;
import com.yxcorp.gifshow.profile.activity.AvatarActivity;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b;
import k2b.e0;
import k2b.u1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.res.Configuration;
import lnc.d2;
import jp.a;
import lnc.b5;
import ekd.i;
import android.view.View;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.profile.common.model.ProfilePendant;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$a;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$c;
import wh5.c;
import com.yxcorp.gifshow.profile.presenter.b;

public class AvatarFragment extends BaseFragment implements g	// class@0012ff
{
    public User j;
    public CDNUrl[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public PublishSubject o;
    public BaseFragment p;
    public ProfilePendant q;
    public View r;
    public View s;
    public PresenterV2 t;
    public AvatarFragment$b u;
    public g v;
    public static ProfileStatusInfo w;

    public void AvatarFragment(){
       super();
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.k = uCDNUrlArray;
       this.n = true;
       this.o = PublishSubject.g();
       this.v = new g();
    }
    public int M(){
       return 1;
    }
    public final a$a ch(Intent p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, AvatarFragment.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.c;
       Objects.requireNonNull(obj);
       a$a uoa = PatchProxy.applyOneRefs(p0, obj, a.class, "3");
       if (uoa != patchProxyRe) {
       }else {
          boolean b = false;
          String str = "";
          uoa = new a$a(b, str);
          if (p0 != null) {
             try{
                Uri data = p0.getData();
                if (data != null) {
                   a.o(data, "intent?.data ?: return parseResult");
                   if (Boolean.valueOf(data.getBooleanQueryParameter("isandroidnewuser", b)).booleanValue() && a.b.exists()) {
                      uoa.d(true);
                      uoa.c(str);
                   }else {
                      String queryParamet = data.getQueryParameter("imageurls");
                      if (!TextUtils.isEmpty(queryParamet)) {
                         a.m(queryParamet);
                         String[] stringArray = new String[]{","};
                         String[] stringArray1 = new String[b];
                         Object[] objArray = StringsKt__StringsKt.H4(queryParamet, stringArray, false, 0, 6, null).toArray(stringArray1);
                         if (objArray != null) {
                            object oobject = (objArray.length > 0)? objArray[b]: str;
                            if (new File(oobject).exists()) {
                               str = oobject;
                            }
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                         }
                      }
                      if (!TextUtils.isEmpty(str)) {
                         uoa.c(str);
                         uoa.d(true);
                      }
                   }
                }
             }catch(java.lang.Exception e12){
                e12.printStackTrace();
             }
          }
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AvatarFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, AvatarFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(AvatarFragment.class, new q());
       }else {
          obj.put(AvatarFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 265;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, AvatarFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "has_avatar="+this.l;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       User user = null;
       a$a uoa = (this.getActivity() != null)? this.ch(this.getActivity().getIntent()): user;
       if (uoa != null && (uoa.b() && this.j == null)) {
          this.j = b.a(QCurrentUser.ME);
       }
    label_0037 :
       if (this.j == null) {
          this.getActivity().finish();
          return;
       }else if(uoa.b()){
          AvatarActivity.A3(this.getActivity(), user, user);
          if (TextUtils.x(uoa.a())) {
             a.c.f(this.getContext(), true);
          }else {
             this.u.P8(user, uoa.a());
          }
       }
       u1.L0(this);
       Object[] objArray = new Object[true];
       objArray[0] = this;
       this.t.i(objArray);
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment.class, "8")) {
          return;
       }
       super.onConfigurationChanged(p0);
       d2.n();
       a.e();
       if (d2.i(p0) || b5.a(this.getActivity())) {
          AvatarFragment tr = this.r;
          if (tr != null) {
             tr.requestLayout();
          }
       }else if(i.c() && this.getActivity() != null){
          i.j(this.getActivity(), this.s, false);
       }
       this.o.onNext(Boolean.FALSE);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment.class, "2")) {
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
                this.q = serializable;
             }
             AvatarFragment.w = SerializableHook.getSerializable(p0, "statusInfo");
          }catch(java.lang.ClassCastException e0){
             if (this.getActivity() != null) {
                this.getActivity().finish();
                return;
             }
          }
          AvatarFragment tj = this.j;
          if (tj != null) {
             tj.startSyncWithFragment(this.m());
          }
       }
       this.p = this;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AvatarFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.r == null) {
          this.r = a.g(p0, 0x7f0d00eb, p1, false);
       }
       this.s = this.r.findViewById(0x7f0a3f6a);
       if (i.c() && (!b5.a(this.getActivity()) && this.getActivity() != null)) {
          i.j(this.getActivity(), this.s, false);
       }
    label_004b :
       return this.r;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AvatarFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       this.t.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AvatarFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.t == null) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.t = presenterV2;
          presenterV2.U7(new AvatarFragment$a());
          AvatarFragment$b uob = new AvatarFragment$b(this);
          this.u = uob;
          this.t.U7(uob);
          this.t.U7(new AvatarFragment$c());
          if (!c.j()) {
             this.t.U7(new b(this.q));
          }
          this.t.f(p0);
       }
       return;
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment.class, "5")) {
          return;
       }
       super.y2(p0);
       User user = null;
       a$a uoa = (this.getActivity() != null)? this.ch(p0): user;
       if (uoa != null && uoa.b()) {
          AvatarActivity.A3(this.getActivity(), user, user);
          if (TextUtils.x(uoa.a())) {
             a.c.f(this.getContext(), true);
          }else {
             this.u.P8(user, uoa.a());
          }
       }
       return;
    }
}
