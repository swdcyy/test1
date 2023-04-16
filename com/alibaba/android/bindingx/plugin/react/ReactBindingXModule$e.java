package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$e;
import java.lang.Runnable;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import x5.a;

public class ReactBindingXModule$e implements Runnable	// class@000e25
{
    public final ReadableMap b;
    public final ReactBindingXModule c;

    public void ReactBindingXModule$e(ReactBindingXModule p0,ReadableMap p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       ReactBindingXModule mBindingXCor = this.c.mBindingXCore;
       if (mBindingXCor != null) {
          mBindingXCor.g(this.b.toHashMap());
       }
       return;
    }
}
