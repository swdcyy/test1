package com.yxcorp.gifshow.relation.feed.presenter.d;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;

public final class d implements r	// class@0018a8
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 != FragmentEvent.STOP && (p0 == FragmentEvent.RESUME || p0 == FragmentEvent.PAUSE))? true: false;
       return b;
    }
}
