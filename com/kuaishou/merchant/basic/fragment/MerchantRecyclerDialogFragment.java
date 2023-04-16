package com.kuaishou.merchant.basic.fragment.MerchantRecyclerDialogFragment;
import ht3.b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import com.kuaishou.merchant.basic.fragment.f;
import gr8.a;
import android.view.View;
import android.os.Bundle;
import ht3.a;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawRecyclerView;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawCustomRecyclerView;
import java.util.Map;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import q74.d;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public abstract class MerchantRecyclerDialogFragment extends RecyclerDialogFragment implements b	// class@0015bb
{
    public f z;

    public void MerchantRecyclerDialogFragment(){
       super();
       this.z = new f(this);
    }
    public void Bh(View p0,Bundle p1){
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
       Object obj = PatchProxy.apply(null, this, MerchantRecyclerDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h0() instanceof WatchDispatchDrawRecyclerView) {
          return this.h0().getDispatchDrawObservable();
       }
       if (this.h0() instanceof WatchDispatchDrawCustomRecyclerView) {
          return this.h0().getDispatchDrawObservable();
       }
       return null;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantRecyclerDialogFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MerchantRecyclerDialogFragment.class, null);
       return objectsByTag;
    }
    public void onAttach(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRecyclerDialogFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       d.b(this);
       this.z.f(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRecyclerDialogFragment.class, "4")) {
          return;
       }
       this.z.onPerfLogFragmentEvent(0, 0);
       super.onCreate(p0);
       PageMonitor.INSTANCE.registerPageInfo(this, this.C1(), "", this.D1());
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantRecyclerDialogFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Bh(p0, p1);
       this.z.onPerfLogFragmentEvent(1, 1);
       return;
    }
}
