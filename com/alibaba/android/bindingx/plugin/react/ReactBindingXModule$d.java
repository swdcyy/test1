package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$d;
import java.lang.Runnable;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$d$a;
import android.content.Context;
import java.lang.String;
import x5.a$d;
import android.util.Pair;
import x5.a;

public class ReactBindingXModule$d implements Runnable	// class@000e24
{
    public final Map b;
    public final List c;
    public final CountDownLatch d;
    public final ReactBindingXModule e;

    public void ReactBindingXModule$d(ReactBindingXModule p0,Map p1,List p2,CountDownLatch p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       this.e.prepareInternal();
       ReactBindingXModule$d te = this.e;
       ReactApplicationContext reactApplica = te.getReactApplicationContext();
       Object[] objArray = new Object[0];
       this.c.add(te.mBindingXCore.b(reactApplica, null, this.b, new ReactBindingXModule$d$a(this), objArray));
       this.d.countDown();
    }
}
