package com.yxcorp.gifshow.childlock.fragment.ChildLockSettingFragment;
import ml8.d;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kwai.library.widget.edittext.SettingPasswordEdit;
import com.kwai.robust.PatchProxyResult;
import xj9.m;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import xj9.i;
import java.lang.Runnable;
import ekd.k1;
import android.content.Context;
import android.widget.EditText;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zj9.w;
import zj9.r;
import zj9.q;
import zj9.s;
import zj9.c;
import im8.c;

public class ChildLockSettingFragment extends BaseFragment implements d, g	// class@001081
{
    public SettingPasswordEdit j;
    public boolean k;
    public boolean l;
    public PresenterV2 m;
    public static final int n;

    public void ChildLockSettingFragment(){
       super();
       this.l = false;
    }
    public int M(){
       return 1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildLockSettingFragment.class, "1")) {
          return;
       }
       this.j = m1.f(p0, 0x7f0a38ac);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChildLockSettingFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ChildLockSettingFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ChildLockSettingFragment.class, new m());
       }else {
          obj.put(ChildLockSettingFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, ChildLockSettingFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getArguments() != null && this.getArguments().getBoolean("try_to_open_lock")) {
          return 106;
       }
       return 108;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildLockSettingFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.k = this.getArguments().getBoolean("try_to_open_lock");
          this.l = this.getArguments().getBoolean("dismiss_tips", false);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ChildLockSettingFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d132d, p1, false);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, ChildLockSettingFragment.class, "6")) {
          return;
       }
       super.onPause();
       FragmentActivity activity = this.getActivity();
       n.C(activity);
       if (this.l != null && activity != null) {
          k1.r(new i(activity), 100);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ChildLockSettingFragment.class, "5")) {
          return;
       }
       super.onResume();
       this.j.d();
       n.b0(this.getContext(), this.j.getEditText(), true);
       this.j.a();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChildLockSettingFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       PresenterV2 presenterV2 = new PresenterV2();
       this.m = presenterV2;
       presenterV2.U7(new w(-1));
       this.m.U7(new r());
       if (this.k != null) {
          this.m.U7(new q());
       }else if(this.l != null){
          this.m.U7(new s());
       }else {
          this.m.U7(new c());
       }
       this.m.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
       this.m.i(objArray);
       return;
    }
}
