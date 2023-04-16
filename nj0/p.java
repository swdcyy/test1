package nj0.p;
import java.lang.Runnable;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.model.LaunchModel;
import lj0.c;
import android.os.Bundle;
import java.lang.System;
import java.lang.String;

public final class p implements Runnable	// class@00333d
{
    public final k b;

    public void p(k p0){
       this.b = p0;
    }
    public final void run(){
       Bundle uBundle = this.b.e.m().g();
       if (uBundle != null) {
          uBundle.putLong("onLoadBundleTimestamp", System.currentTimeMillis());
       }
       return;
    }
}
