package com.trello.rxlifecycle3.android.a$a;
import erd.o;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import com.trello.rxlifecycle3.android.a$c;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.String;
import com.trello.rxlifecycle3.OutsideLifecycleException;

public final class a$a implements o	// class@000fe0
{

    public void a$a(){
       super();
    }
    public ActivityEvent a(ActivityEvent p0){
       switch (a$c.a[p0.ordinal()]){
           case 1:
             return ActivityEvent.DESTROY;
           case 2:
             return ActivityEvent.STOP;
           case 3:
             return ActivityEvent.PAUSE;
           case 4:
             return ActivityEvent.STOP;
           case 5:
             return ActivityEvent.DESTROY;
           case 6:
             throw new OutsideLifecycleException("Cannot bind to Activity lifecycle when outside of it.");
           default:
             throw new UnsupportedOperationException("Binding to "+p0+" not yet implemented");
       }
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
