package com.kuaishou.live.core.basic.activity.x$a;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;

public class x$a implements x	// class@001857
{
    public LivePlayFragment a;

    public void x$a(LivePlayFragment p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.eh();
    }
    public FragmentActivity getActivity(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getActivity();
    }
    public c getChildFragmentManager(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getChildFragmentManager();
    }
    public boolean isAdded(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.isAdded();
    }
    public long s0(){
       return this.a.b1;
    }
    public LivePlayFragment t0(){
       return this.a;
    }
    public BaseFragment t0(){
       return this.t0();
    }
    public LifecycleOwner u0(){
       return this.a;
    }
    public boolean v0(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!e.s(this.a.getActivity())) {
          return this.a.isResumed();
       }
       boolean b = (this.a.isResumed() && this.a())? true: false;
       return b;
    }
    public boolean w0(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.q1;
    }
}
