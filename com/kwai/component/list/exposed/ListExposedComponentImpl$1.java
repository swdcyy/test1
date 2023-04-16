package com.kwai.component.list.exposed.ListExposedComponentImpl$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.component.list.exposed.ListExposedComponentImpl;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.a;

public class ListExposedComponentImpl$1 implements DefaultLifecycleObserver	// class@0009a4
{
    public final ListExposedComponentImpl b;

    public void ListExposedComponentImpl$1(ListExposedComponentImpl p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ListExposedComponentImpl$1.class, "1")) {
          return;
       }
       this.b.f.dispose();
       return;
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ListExposedComponentImpl$1.class, "2")) {
          return;
       }
       this.b.c(false, false);
       return;
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
