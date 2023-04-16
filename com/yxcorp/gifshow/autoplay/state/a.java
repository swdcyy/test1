package com.yxcorp.gifshow.autoplay.state.a;
import erd.o;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Boolean;

public final class a implements o	// class@001c38
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       boolean b = (p0 == FragmentEvent.STOP || p0 == FragmentEvent.PAUSE)? true: false;
       return Boolean.valueOf(b);
    }
}
