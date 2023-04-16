package com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b$a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Lifecycle;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelStore;

public abstract class LifecycleRecyclerAdapter$b extends RecyclerView$ViewHolder implements LifecycleOwner, ViewModelStoreOwner	// class@000d09
{
    public final LifecycleRecyclerAdapter$b$a b;
    public final MutableLiveData c;
    public final LiveData d;

    public void LifecycleRecyclerAdapter$b(View p0,LifecycleOwner p1){
       a.p(p0, "itemView");
       a.p(p1, "parentLifecycleOwner");
       super(p0);
       this.b = new LifecycleRecyclerAdapter$b$a(this, p1, p1);
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.c = mutableLiveD;
       this.d = mutableLiveD;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LifecycleRecyclerAdapter$b.class, "6")) {
          return;
       }
       this.b.a();
       return;
    }
    public final LiveData b(){
       return this.d;
    }
    public Lifecycle getLifecycle(){
       Object obj = PatchProxy.apply(null, this, LifecycleRecyclerAdapter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getLifecycle();
    }
    public ViewModelStore getViewModelStore(){
       Object obj = PatchProxy.apply(null, this, LifecycleRecyclerAdapter$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getViewModelStore();
    }
}
