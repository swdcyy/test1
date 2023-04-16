package com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b$a;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class LifecycleRecyclerAdapter$b$a extends SubLifecycleController	// class@000d08
{
    public final LifecycleRecyclerAdapter$b f;
    public final LifecycleOwner g;

    public void LifecycleRecyclerAdapter$b$a(LifecycleRecyclerAdapter$b p0,LifecycleOwner p1,LifecycleOwner p2){
       this.f = p0;
       this.g = p1;
       super(p2);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LifecycleRecyclerAdapter$b$a.class, "3")) {
          return;
       }
       Objects.requireNonNull(this.f);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LifecycleRecyclerAdapter$b$a.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.f);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LifecycleRecyclerAdapter$b$a.class, "2")) {
          return;
       }
       Objects.requireNonNull(this.f);
       return;
    }
}
