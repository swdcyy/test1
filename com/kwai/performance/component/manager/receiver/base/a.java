package com.kwai.performance.component.manager.receiver.base.a;
import java.util.Comparator;
import java.lang.Object;
import java.util.Map$Entry;
import com.kwai.performance.component.manager.receiver.base.DispatchReceiver;
import android.content.IntentFilter;

public final class a implements Comparator	// class@001054
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i;
       if (p0.getValue().getPriority() > p1.getValue().getPriority()) {
          i = -1;
       }else if(p0.getValue().getPriority() < p1.getValue().getPriority()){
          i = 1;
       }else {
          i = 0;
       }
       return i;
    }
}
