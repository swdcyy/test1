package com.kuaishou.merchant.basic.fragment.MerchantLazyInitSupportFragment;
import ht3.b;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kuaishou.merchant.basic.fragment.f;
import gr8.a;
import ht3.a;
import java.lang.String;
import brd.t;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.trello.rxlifecycle3.components.support.RxFragment;
import q74.d;
import android.os.Bundle;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import android.view.View;

public abstract class MerchantLazyInitSupportFragment extends LazyInitSupportedFragment implements b	// class@0015b8
{
    public f s;

    public void MerchantLazyInitSupportFragment(){
       super();
       this.s = new f(this);
    }
    public boolean C2(){
       return a.d(this);
    }
    public String D1(){
       return a.c(this);
    }
    public String Kb(){
       return a.b(this);
    }
    public t getDispatchDrawObservable(){
       return a.a(this);
    }
    public void onAttach(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLazyInitSupportFragment.class, "1")) {
          return;
       }
       super.onAttach(p0);
       d.b(this);
       this.s.f(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLazyInitSupportFragment.class, "3")) {
          return;
       }
       this.s.onPerfLogFragmentEvent(0, 0);
       super.onCreate(p0);
       PageMonitor.INSTANCE.registerPageInfo(this, this.C1(), "", this.D1());
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantLazyInitSupportFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.s.onPerfLogFragmentEvent(1, 1);
       return;
    }
}
