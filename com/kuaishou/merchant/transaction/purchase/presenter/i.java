package com.kuaishou.merchant.transaction.purchase.presenter.i;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;

public final class i implements r	// class@000980
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (FragmentEvent.RESUME == p0)? true: false;
       return b;
    }
}
