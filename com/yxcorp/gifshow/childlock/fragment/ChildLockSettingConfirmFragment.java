package com.yxcorp.gifshow.childlock.fragment.ChildLockSettingConfirmFragment;
import ml8.d;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xj9.h;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zj9.w;
import zj9.f;
import im8.c;

public class ChildLockSettingConfirmFragment extends BaseFragment implements d, g	// class@001080
{
    public String j;
    public PresenterV2 k;

    public void ChildLockSettingConfirmFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public void doBindView(View p0){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChildLockSettingConfirmFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ChildLockSettingConfirmFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ChildLockSettingConfirmFragment.class, new h());
       }else {
          obj.put(ChildLockSettingConfirmFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 107;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildLockSettingConfirmFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.j = this.getArguments().getString("key_password", "");
       }
       if (TextUtils.x(this.j) && this.getActivity() != null) {
          this.getActivity().finish();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ChildLockSettingConfirmFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d132e, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChildLockSettingConfirmFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       PresenterV2 presenterV2 = new PresenterV2();
       this.k = presenterV2;
       presenterV2.U7(new w(-1));
       this.k.U7(new f());
       this.k.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
       this.k.i(objArray);
       return;
    }
}
