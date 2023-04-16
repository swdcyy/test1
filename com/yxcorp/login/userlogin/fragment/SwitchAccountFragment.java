package com.yxcorp.login.userlogin.fragment.SwitchAccountFragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import com.yxcorp.login.userlogin.presenter.switchaccount.a;
import com.yxcorp.login.userlogin.presenter.switchaccount.SwitchAccountAvatarPresenter;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;

public class SwitchAccountFragment extends LoginFragment implements a	// class@001b4a
{

    public void SwitchAccountFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, SwitchAccountFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new a());
       obj.U7(new SwitchAccountAvatarPresenter());
       PatchProxy.onMethodExit(SwitchAccountFragment.class, "2");
       return obj;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwitchAccountFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SwitchAccountFragment.class, null);
       return objectsByTag;
    }
    public boolean onBackPressed(){
       return false;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SwitchAccountFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d159b, p1, false);
    }
}
