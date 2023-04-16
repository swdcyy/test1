package com.yxcorp.gifshow.reminder.widget.c;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;

public final class c implements r	// class@001b06
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == FragmentEvent.PAUSE)? true: false;
       return b;
    }
}
