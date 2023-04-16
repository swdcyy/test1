package com.yxcorp.login.userlogin.fragment.FullScreenLoginFragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import h2d.r;
import e2d.u1;
import h2d.b;
import h2d.c;
import h2d.u;
import h2d.k;
import k2d.s;
import e2d.k;
import g2d.c;
import com.kwai.feature.api.social.login.model.LoginParams;
import g2d.b;
import java.util.Map;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.activity.ComponentActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Activity;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import ekd.p1;
import android.content.res.Resources;
import zf6.l;
import ekd.i;

public class FullScreenLoginFragment extends LoginFragment implements a	// class@001b2c
{

    public void FullScreenLoginFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, FullScreenLoginFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new b());
       obj.U7(new c());
       obj.U7(new r());
       obj.U7(new u());
       obj.U7(new k());
       obj.U7(new s());
       obj.U7(new k());
       if (this.p != null) {
          obj.U7(new c(this.l, true));
       }
       if (this.q != null) {
          obj.U7(new b());
       }
       PatchProxy.onMethodExit(FullScreenLoginFragment.class, "3");
       return obj;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FullScreenLoginFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FullScreenLoginFragment.class, null);
       return objectsByTag;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, FullScreenLoginFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getActivity() != null) {
          this.getActivity().onBackPressed();
       }
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FullScreenLoginFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       int i = (this.p != null)? 0x7f0d053e: 0x7f0d053d;
       return a.g(p0, i, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FullScreenLoginFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       if (QCurrentUser.me().isLogined()) {
          this.getActivity().setResult(-1);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, FullScreenLoginFragment.class, "6")) {
          return;
       }
       super.onResume();
       if (QCurrentUser.me().isLogined()) {
          this.getActivity().finish();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FullScreenLoginFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p1.k(this.getActivity());
       i.h(this.getActivity(), this.getResources().getColor(R.color.arg_RES_7f060a52), l.r());
       return;
    }
}
