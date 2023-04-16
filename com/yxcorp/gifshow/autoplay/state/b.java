package com.yxcorp.gifshow.autoplay.state.b;
import erd.o;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Boolean;

public final class b implements o	// class@001c39
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       boolean b = (p0 == FragmentEvent.RESUME)? true: false;
       return Boolean.valueOf(b);
    }
}
