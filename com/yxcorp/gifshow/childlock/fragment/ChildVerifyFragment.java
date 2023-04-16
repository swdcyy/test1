package com.yxcorp.gifshow.childlock.fragment.ChildVerifyFragment;
import ml8.d;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xj9.p;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zj9.w;
import zj9.a0;
import im8.c;

public class ChildVerifyFragment extends BaseFragment implements d, g	// class@001082
{
    public PresenterV2 j;
    public String k;

    public void ChildVerifyFragment(){
       super();
    }
    public void doBindView(View p0){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChildVerifyFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ChildVerifyFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ChildVerifyFragment.class, new p());
       }else {
          obj.put(ChildVerifyFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildVerifyFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.k = this.getArguments().getString("key_verify_source", "");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ChildVerifyFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d078f, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChildVerifyFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       PresenterV2 presenterV2 = new PresenterV2();
       this.j = presenterV2;
       presenterV2.U7(new w(R.string.arg_RES_7f10054f));
       this.j.U7(new a0());
       this.j.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
       this.j.i(objArray);
       return;
    }
}
