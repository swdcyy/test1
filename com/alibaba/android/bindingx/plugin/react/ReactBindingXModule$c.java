package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$c;
import java.lang.Runnable;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule;
import java.lang.Object;

public class ReactBindingXModule$c implements Runnable	// class@000e22
{
    public final ReactBindingXModule b;

    public void ReactBindingXModule$c(ReactBindingXModule p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.prepareInternal();
    }
}
