package com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import ht3.b;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.kuaishou.merchant.basic.fragment.f;
import gr8.a;
import ht3.a;
import java.lang.String;
import brd.x;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ht3.f;
import android.view.View;
import android.os.Bundle;
import brd.t;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import q74.d;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public abstract class MerchantBottomSheetFragment extends BottomSheetFragment implements b	// class@0015b6
{
    public f A;
    public String z;

    public void MerchantBottomSheetFragment(){
       super();
       this.A = new f(this);
    }
    public boolean C2(){
       return a.d(this);
    }
    public String D1(){
       return a.c(this);
    }
    public x Ih(){
       Object obj = PatchProxy.apply(null, this, MerchantBottomSheetFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
    public void Jh(View p0,Bundle p1){
    }
    public String Kb(){
       return a.b(this);
    }
    public t getDispatchDrawObservable(){
       return a.a(this);
    }
    public void onAttach(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantBottomSheetFragment.class, "1")) {
          return;
       }
       super.onAttach(p0);
       d.b(this);
       if (!PatchProxy.applyVoid(null, this, MerchantBottomSheetFragment.class, "2")) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             String str = arguments.getString("preloadTraceId");
             this.z = str;
             if (!TextUtils.isEmpty(str)) {
                this.A.i(this.z);
             }
          }
       }
       this.A.f(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantBottomSheetFragment.class, "4")) {
          return;
       }
       this.A.onPerfLogFragmentEvent(0, 0);
       super.onCreate(p0);
       PageMonitor.INSTANCE.registerPageInfo(this, this.C1(), "", this.D1());
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantBottomSheetFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Jh(p0, p1);
       this.A.onPerfLogFragmentEvent(1, 1);
       return;
    }
}
