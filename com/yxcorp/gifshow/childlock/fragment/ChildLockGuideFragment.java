package com.yxcorp.gifshow.childlock.fragment.ChildLockGuideFragment;
import ml8.d;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;
import wh5.c;
import android.view.View;
import xj9.e;
import java.util.Map;
import java.util.HashMap;
import lnc.i3;
import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import lnc.h2;
import com.yxcorp.gifshow.childlock.fragment.ChildLockGuideFragment$a;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import android.os.Bundle;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import wh5.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import k2b.e0;
import yj9.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zj9.w;
import zj9.o;
import zj9.l;
import im8.c;

public class ChildLockGuideFragment extends BaseFragment implements d, g	// class@00107f
{
    public boolean j;
    public TeenageModeConfig k;
    public PresenterV2 l;
    public ChildLockGuideFragment$a m;
    public boolean n;

    public void ChildLockGuideFragment(){
       super();
       this.n = true;
    }
    public int M(){
       return 1;
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, ChildLockGuideFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$FeatureSwitchPackage uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "child_lock";
       uFeatureSwit.on = c.b();
       obj.featureSwitchPackage = uFeatureSwit;
       return obj;
    }
    public void doBindView(View p0){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChildLockGuideFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ChildLockGuideFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ChildLockGuideFragment.class, new e());
       }else {
          obj.put(ChildLockGuideFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, ChildLockGuideFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (c.b())? "ON": "OFF";
       i3 oi3 = i3.f();
       oi3.d("child_setting_model", obj);
       return oi3.e();
    }
    public String o(){
       return "CHILD_PROTECT_SETTING_PAGE";
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildLockGuideFragment.class, "9")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (this.m != null) {
          this.m.b.onNext(Boolean.valueOf(h2.b(this.getActivity())));
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildLockGuideFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.k = a.c();
       if (this.getArguments() != null) {
          this.j = this.getArguments().getBoolean("key_guide_mode");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ChildLockGuideFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d132c, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ChildLockGuideFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       a.a("LEAVE", this);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ChildLockGuideFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.l.destroy();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ChildLockGuideFragment.class, "4")) {
          return;
       }
       super.onResume();
       if (this.n == null) {
          a.a("RESUME", this);
       }
       this.n = false;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChildLockGuideFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.m = new ChildLockGuideFragment$a();
       PresenterV2 presenterV2 = new PresenterV2();
       this.l = presenterV2;
       presenterV2.U7(new w(R.string.arg_RES_7f10471c));
       this.l.U7(new o());
       if (this.j == null) {
          this.l.U7(new l());
       }
       this.l.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this,this.m};
       this.l.i(objArray);
       a.a("ENTER", this);
       return;
    }
}
