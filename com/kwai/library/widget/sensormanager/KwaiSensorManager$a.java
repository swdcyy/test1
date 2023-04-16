package com.kwai.library.widget.sensormanager.KwaiSensorManager$a;
import java.lang.Runnable;
import com.kwai.library.widget.sensormanager.KwaiSensorManager;
import java.lang.Object;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import java.lang.ref.WeakReference;
import v17.b;
import u17.e;
import w17.b;

public class KwaiSensorManager$a implements Runnable	// class@0009f4
{
    public final KwaiSensorManager b;

    public void KwaiSensorManager$a(KwaiSensorManager p0){
       this.b = p0;
       super();
    }
    public void run(){
       Iterator iterator = this.b.b.entrySet().iterator();
       while (iterator.hasNext()) {
          List value = iterator.next().getValue();
          if (this.b.f(value)) {
             continue ;
          }else {
             Iterator iterator1 = value.iterator();
             while (iterator1.hasNext()) {
                WeakReference weakReferenc = iterator1.next();
                if (weakReferenc == null) {
                   continue ;
                }else {
                   b uob = weakReferenc.get();
                   if (uob != null) {
                      uob.f(this.b.e.d);
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       return;
    }
}
