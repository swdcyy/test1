package com.kwai.feature.post.api.fragment.FlyWheelKwaiDialogFragment;
import j36.g;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.String;
import j36.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j36.c;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.view.View;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o36.g;

public class FlyWheelKwaiDialogFragment extends KwaiDialogFragment implements g	// class@0013f3
{
    public String p;
    public boolean q;
    public c r;

    public void FlyWheelKwaiDialogFragment(){
       super();
    }
    public String E7(){
       return f.a(this);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FlyWheelKwaiDialogFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       FlyWheelKwaiDialogFragment tr = this.r;
       if (tr != null) {
          tr.c();
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(FlyWheelKwaiDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FlyWheelKwaiDialogFragment.class, "7")) {
          return;
       }
       super.onHiddenChanged(p0);
       FlyWheelKwaiDialogFragment tr = this.r;
       if (tr != null) {
          tr.d(p0);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, FlyWheelKwaiDialogFragment.class, "3")) {
          return;
       }
       super.onStart();
       FlyWheelKwaiDialogFragment tr = this.r;
       if (tr != null) {
          tr.e();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, FlyWheelKwaiDialogFragment.class, "4")) {
          return;
       }
       super.onStop();
       FlyWheelKwaiDialogFragment tr = this.r;
       if (tr != null) {
          tr.f();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FlyWheelKwaiDialogFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.z4() != null) {
          c uoc = new c(this, this);
          this.r = uoc;
          uoc.g();
       }
       return;
    }
    public View r5(){
       Object obj = PatchProxy.apply(null, this, FlyWheelKwaiDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getView();
    }
    public void setUserVisibleHint(boolean p0){
       if (PatchProxy.isSupport(FlyWheelKwaiDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FlyWheelKwaiDialogFragment.class, "6")) {
          return;
       }
       super.setUserVisibleHint(p0);
       FlyWheelKwaiDialogFragment tr = this.r;
       if (tr != null) {
          tr.i(p0);
       }
       return;
    }
    public String z4(){
       Object obj = PatchProxy.apply(null, this, FlyWheelKwaiDialogFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.q == null) {
          this.p = g.c(this);
          this.q = true;
       }
       return this.p;
    }
}
