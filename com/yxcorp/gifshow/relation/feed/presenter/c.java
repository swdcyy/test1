package com.yxcorp.gifshow.relation.feed.presenter.c;
import erd.o;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Boolean;

public final class c implements o	// class@0018a7
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       boolean b = (p0 == FragmentEvent.RESUME)? true: false;
       return Boolean.valueOf(b);
    }
}
