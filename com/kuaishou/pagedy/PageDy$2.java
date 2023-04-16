package com.kuaishou.pagedy.PageDy$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.pagedy.PageDy;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PageDy$2 implements DefaultLifecycleObserver	// class@000a3e
{
    public final Fragment b;
    public final PageDy c;

    public void PageDy$2(PageDy p0,Fragment p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageDy$2.class, "1")) {
          return;
       }
       this.c.o(this.b);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
