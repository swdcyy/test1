package com.yxcorp.login.userlogin.fragment.RegisterUserInfoSettingFragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import io.reactivex.subjects.PublishSubject;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import y36.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e2d.u1;
import w2d.b;
import w2d.e;
import w2d.q;
import w2d.p;
import w2d.h;
import wu8.p;
import lnc.x6;
import lnc.y6;
import java.util.List;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.login.userlogin.fragment.RegisterUserInfoSettingFragment$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import java.lang.Exception;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.util.Collection;
import ekd.q;
import java.util.Random;
import w2d.r;
import c2d.a;
import o1d.q;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y1d.v4;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import android.content.res.Resources;
import zf6.l;
import android.app.Activity;
import ekd.i;
import i2b.a;

public class RegisterUserInfoSettingFragment extends LoginFragment implements a	// class@001b41
{
    public File r;
    public PublishSubject s;
    public PublishSubject t;
    public PublishSubject u;

    public void RegisterUserInfoSettingFragment(){
       super();
       this.s = PublishSubject.g();
       this.t = PublishSubject.g();
       this.u = PublishSubject.g();
    }
    public PresenterV2 B2(){
       LoginFragment l;
       q b2;
       FragmentActivity uFragmentAct;
       boolean b3;
       boolean b4;
       boolean b5;
       boolean b6;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PresenterV2 obj1 = PatchProxy.applyWithListener(objArray, obj, RegisterUserInfoSettingFragment.class, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = new PresenterV2();
       obj1.U7(new u1());
       obj1.U7(new b());
       obj1.U7(new e());
       obj1.U7(new q());
       obj1.U7(new p());
       obj1.U7(new h());
       boolean b = p.d().c("postNewUserVideo", false);
       boolean b1 = (y6.r(b.class) != null && y6.r(b.class).E00())? true: false;
       Object obj2 = PatchProxy.apply(objArray, obj, RegisterUserInfoSettingFragment.class, "3");
       if (obj2 != patchProxyRe) {
       }else {
          try{
             obj2 = a.t().getValue("newUserPublishTemplate", new RegisterUserInfoSettingFragment$1(obj).getType(), new ArrayList());
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             obj2 = new ArrayList();
          }
       }
    }
    public int M(){
       return 1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RegisterUserInfoSettingFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v4();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, RegisterUserInfoSettingFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(RegisterUserInfoSettingFragment.class, new v4());
       }else {
          obj.put(RegisterUserInfoSettingFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0x7d47;
    }
    public boolean onBackPressed(){
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RegisterUserInfoSettingFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = 0x7f060bcc;
       i.h(this.getActivity(), this.getResources().getColor(i), l.r());
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       i.h(this.getActivity(), this.getResources().getColor(i), l.r());
       return a.g(p0, 0x7f0d0eb7, p1, false);
    }
}
