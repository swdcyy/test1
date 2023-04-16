package com.kuaishou.live.preview.item.presenter.m;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import com.kuaishou.live.preview.item.presenter.n;

public final class m implements r	// class@000e2f
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == FragmentEvent.RESUME)? true: false;
       return b;
    }
}
