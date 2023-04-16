package com.kwai.page.component.task.PageTaskRegistry;
import fe7.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.util.HashMap;
import java.lang.ref.WeakReference;
import fe7.b;
import java.util.Map;
import fe7.c;
import java.util.Set;
import java.util.Iterator;
import java.util.Objects;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public class PageTaskRegistry implements a, DefaultLifecycleObserver	// class@001043
{
    public final Map b;
    public final WeakReference c;

    public void PageTaskRegistry(LifecycleOwner p0){
       super();
       this.b = new HashMap();
       this.c = new WeakReference(p0);
    }
    public void a(b p0){
       this.b.put(p0, null);
    }
    public void b(b p0,c p1){
       this.b.put(p0, p1);
    }
    public void onCreate(LifecycleOwner p0){
       Iterator iterator = this.b.keySet().iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       Iterator iterator = this.b.keySet().iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       if (this.c.get() != null) {
          this.c.get().getLifecycle().removeObserver(this);
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       Iterator iterator = this.b.keySet().iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       Iterator iterator = this.b.keySet().iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       Iterator iterator = this.b.keySet().iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       Iterator iterator = this.b.keySet().iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
}
