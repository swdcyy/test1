package com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import ht3.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.merchant.basic.fragment.f;
import gr8.a;
import ht3.a;
import java.lang.String;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelV2Fragment;
import brd.x;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ht3.e;
import android.view.View;
import android.os.Bundle;
import brd.t;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxFragment;
import q74.d;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.live.screenshot.b;
import androidx.lifecycle.Lifecycle$Event;
import ht3.d;
import z1.k;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public abstract class MerchantBaseFragment extends BaseFragment implements b	// class@0015b5
{
    public String j;
    public b k;
    public f l;

    public void MerchantBaseFragment(){
       super();
       this.l = new f(this);
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
    public boolean ch(){
       return this instanceof MerchantPurchasePanelV2Fragment;
    }
    public String dh(){
       return "";
    }
    public x eh(){
       Object obj = PatchProxy.apply(null, this, MerchantBaseFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e(this);
    }
    public void fh(View p0,Bundle p1){
    }
    public t getDispatchDrawObservable(){
       return a.a(this);
    }
    public void onAttach(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantBaseFragment.class, "1")) {
          return;
       }
       super.onAttach(p0);
       d.b(this);
       if (!PatchProxy.applyVoid(null, this, MerchantBaseFragment.class, "2")) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             String str = arguments.getString("preloadTraceId");
             this.j = str;
             if (!TextUtils.isEmpty(str)) {
                this.l.i(this.j);
             }
          }
       }
       this.l.f(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantBaseFragment.class, "4")) {
          return;
       }
       this.l.onPerfLogFragmentEvent(0, 0);
       super.onCreate(p0);
       if (PatchProxy.applyVoid(null, this, MerchantBaseFragment.class, "7") || (this.ch() && this.getActivity() instanceof GifshowActivity)) {
          b uob = new b();
          this.k = uob;
          uob.d(this.getActivity(), Lifecycle$Event.ON_START, this.C1(), new d(this));
       }
    label_004a :
       PageMonitor.INSTANCE.registerPageInfo(this, this.C1(), "", this.D1());
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantBaseFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       MerchantBaseFragment tk = this.k;
       if (tk != null) {
          tk.e();
          this.k = null;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantBaseFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.fh(p0, p1);
       this.l.onPerfLogFragmentEvent(1, 1);
       return;
    }
}
