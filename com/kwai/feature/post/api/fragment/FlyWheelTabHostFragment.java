package com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import j36.g;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.String;
import j36.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import j36.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.view.View;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import o36.g;

public abstract class FlyWheelTabHostFragment extends TabHostFragment implements g	// class@0013f4
{
    public String B;
    public boolean C;
    public c D;

    public void FlyWheelTabHostFragment(){
       super();
    }
    public String E7(){
       return f.a(this);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FlyWheelTabHostFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       FlyWheelTabHostFragment tD = this.D;
       if (tD != null) {
          tD.c();
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(FlyWheelTabHostFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FlyWheelTabHostFragment.class, "7")) {
          return;
       }
       super.onHiddenChanged(p0);
       FlyWheelTabHostFragment tD = this.D;
       if (tD != null) {
          tD.d(p0);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, FlyWheelTabHostFragment.class, "3")) {
          return;
       }
       super.onStart();
       FlyWheelTabHostFragment tD = this.D;
       if (tD != null) {
          tD.e();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, FlyWheelTabHostFragment.class, "4")) {
          return;
       }
       super.onStop();
       FlyWheelTabHostFragment tD = this.D;
       if (tD != null) {
          tD.f();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FlyWheelTabHostFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.z4() != null) {
          c uoc = new c(this, this);
          this.D = uoc;
          uoc.g();
       }
       return;
    }
    public View r5(){
       Object obj = PatchProxy.apply(null, this, FlyWheelTabHostFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getView();
    }
    public void setUserVisibleHint(boolean p0){
       if (PatchProxy.isSupport(FlyWheelTabHostFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FlyWheelTabHostFragment.class, "6")) {
          return;
       }
       super.setUserVisibleHint(p0);
       FlyWheelTabHostFragment tD = this.D;
       if (tD != null) {
          tD.i(p0);
       }
       return;
    }
    public String z4(){
       Object obj = PatchProxy.apply(null, this, FlyWheelTabHostFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.C == null) {
          this.B = g.c(this);
          this.C = true;
       }
       return this.B;
    }
}
