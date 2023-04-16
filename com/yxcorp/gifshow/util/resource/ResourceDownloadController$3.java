package com.yxcorp.gifshow.util.resource.ResourceDownloadController$3;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController;
import java.lang.String;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;

public class ResourceDownloadController$3 implements DefaultLifecycleObserver	// class@000cd4
{
    public final String b;
    public final ResourceDownloadController c;

    public void ResourceDownloadController$3(ResourceDownloadController p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       this.c.h(this.b);
    }
    public void onResume(LifecycleOwner p0){
       this.c.i(this.b, 1);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
