package com.kuaishou.commercial.search.CommercialSearchPhotoShowConsumer$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.commercial.search.CommercialSearchPhotoShowConsumer;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.i;
import py.h;
import java.lang.Runnable;
import android.view.ViewGroup;

public class CommercialSearchPhotoShowConsumer$1 implements DefaultLifecycleObserver	// class@001543
{
    public final CommercialSearchPhotoShowConsumer b;

    public void CommercialSearchPhotoShowConsumer$1(CommercialSearchPhotoShowConsumer p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       p0.l = false;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialSearchPhotoShowConsumer$1.class, "1")) {
          return;
       }
       CommercialSearchPhotoShowConsumer$1 tb = this.b;
       tb.l = true;
       tb.b.post(new h(this));
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
