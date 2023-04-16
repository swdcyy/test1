package com.yxcorp.login.userlogin.fragment.SetPasswordFragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import t2d.j;
import t2d.g;
import y1d.n5;
import java.util.Map;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;

public class SetPasswordFragment extends LoginFragment implements a	// class@001b49
{
    public String r;
    public String s;
    public String t;

    public void SetPasswordFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, SetPasswordFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new j());
       obj.U7(new g());
       PatchProxy.onMethodExit(SetPasswordFragment.class, "3");
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SetPasswordFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n5();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, SetPasswordFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(SetPasswordFragment.class, new n5());
       }else {
          obj.put(SetPasswordFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0x75f7;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, SetPasswordFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.getActivity().setResult(0);
       this.getActivity().finish();
       return 0;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SetPasswordFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.r = p0.getString("setPasswordFragmentTitle");
          this.s = p0.getString("resetToken");
          this.t = p0.getString("authToken");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SetPasswordFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d14c0, p1, false);
    }
}
