package com.kuaishou.krn.delegate.KrnDelegate$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import ek0.d;
import com.kuaishou.krn.context.KrnViewTagManager;
import lj0.c;

public class KrnDelegate$a implements Runnable	// class@000857
{
    public int b;

    public void KrnDelegate$a(int p0){
       super();
       this.b = p0;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KrnDelegate$a.class, "1")) {
          return;
       }
       d.e("ÒÆ³ýµôRootViewTag: "+this.b);
       KrnViewTagManager.INSTANCE.remove(this.b);
       return;
    }
}
