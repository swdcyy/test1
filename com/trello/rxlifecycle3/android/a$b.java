package com.trello.rxlifecycle3.android.a$b;
import erd.o;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import com.trello.rxlifecycle3.android.a$c;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.String;
import com.trello.rxlifecycle3.OutsideLifecycleException;

public final class a$b implements o	// class@000fe1
{

    public void a$b(){
       super();
    }
    public FragmentEvent a(FragmentEvent p0){
       switch (a$c.b[p0.ordinal()]){
           case 1:
             return FragmentEvent.DETACH;
           case 2:
             return FragmentEvent.DESTROY;
           case 3:
             return FragmentEvent.DESTROY_VIEW;
           case 4:
             return FragmentEvent.STOP;
           case 5:
             return FragmentEvent.PAUSE;
           case 6:
             return FragmentEvent.STOP;
           case 7:
             return FragmentEvent.DESTROY_VIEW;
           case 8:
             return FragmentEvent.DESTROY;
           case 9:
             return FragmentEvent.DETACH;
           case 10:
             throw new OutsideLifecycleException("Cannot bind to Fragment lifecycle when outside of it.");
           default:
             throw new UnsupportedOperationException("Binding to "+p0+" not yet implemented");
       }
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
