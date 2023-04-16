package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$f;
import java.lang.Runnable;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule;
import java.lang.Object;
import x5.a;

public class ReactBindingXModule$f implements Runnable	// class@000e26
{
    public final ReactBindingXModule b;

    public void ReactBindingXModule$f(ReactBindingXModule p0){
       this.b = p0;
       super();
    }
    public void run(){
       ReactBindingXModule mBindingXCor = this.b.mBindingXCore;
       if (mBindingXCor != null) {
          mBindingXCor.e();
       }
       return;
    }
}
