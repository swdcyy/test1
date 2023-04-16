package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$k;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$k$a;
import java.lang.Object;

public class ReactBindingXModule$k extends HandlerThread	// class@000e2d
{
    public Handler b;

    public void ReactBindingXModule$k(String p0){
       super(p0);
       this.start();
       this.b = new Handler(this.getLooper());
    }
    public void a(Runnable p0){
       if (p0 != null && (this.b != null && this.isAlive())) {
          this.b.post(new ReactBindingXModule$k$a(this, p0));
       }
    label_0016 :
       return;
    }
    public boolean quit(){
       ReactBindingXModule$k tb = this.b;
       if (tb != null) {
          tb.removeCallbacksAndMessages(null);
       }
       return super.quit();
    }
}
