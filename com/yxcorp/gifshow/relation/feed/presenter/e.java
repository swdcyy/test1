package com.yxcorp.gifshow.relation.feed.presenter.e;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;

public final class e implements r	// class@0018a9
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == FragmentEvent.DESTROY_VIEW)? true: false;
       return b;
    }
}
