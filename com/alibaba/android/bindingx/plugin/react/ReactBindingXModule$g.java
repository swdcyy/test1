package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$g;
import java.lang.Runnable;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule;
import java.lang.Object;
import x5.a;

public class ReactBindingXModule$g implements Runnable	// class@000e27
{
    public final ReactBindingXModule b;

    public void ReactBindingXModule$g(ReactBindingXModule p0){
       this.b = p0;
       super();
    }
    public void run(){
       ReactBindingXModule mBindingXCor = this.b.mBindingXCore;
       if (mBindingXCor != null) {
          mBindingXCor.j();
       }
       return;
    }
}
