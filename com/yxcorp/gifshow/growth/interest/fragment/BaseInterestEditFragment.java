package com.yxcorp.gifshow.growth.interest.fragment.BaseInterestEditFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yna.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.view.View;
import android.os.Bundle;

public abstract class BaseInterestEditFragment extends BaseFragment	// class@0013c0
{
    public PresenterV2 j;
    public g k;

    public void BaseInterestEditFragment(){
       super(null, null, null, null, 15, null);
    }
    public int M(){
       return 1;
    }
    public abstract void ch(PresenterV2 p0);
    public void dh(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseInterestEditFragment.class, "2")) {
          return;
       }
       a.p(p0, "caller");
       this.k = p0;
       return;
    }
    public String getPageParams(){
       String str1;
       BaseInterestEditFragment obj = PatchProxy.apply(null, this, BaseInterestEditFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       String str = "mCallerContext";
       if (obj == null) {
          a.S(str);
       }
       if (!TextUtils.isEmpty(obj.g())) {
          str1 = "source=";
          BaseInterestEditFragment tk = this.k;
          if (tk == null) {
             a.S(str);
          }
          return str1+tk.g();
       }else {
          str1 = super.getPageParams();
          a.o(str1, "super.getPageParams\(\)");
          return str1;
       }
    }
    public String o(){
       return "TAG_SETTINGS";
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, BaseInterestEditFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       BaseInterestEditFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       this.j = null;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BaseInterestEditFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       BaseInterestEditFragment tj = this.j;
       if (tj != null) {
          tj.unbind();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseInterestEditFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.j = presenterV2;
       this.ch(presenterV2);
       presenterV2.f(p0);
       BaseInterestEditFragment tk = this.k;
       if (tk != null) {
          Object[] objArray = new Object[2];
          objArray[0] = this;
          if (tk == null) {
             a.S("mCallerContext");
          }
          objArray[1] = tk;
          presenterV2.i(objArray);
       }
       return;
    }
}
