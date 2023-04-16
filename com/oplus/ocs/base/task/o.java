package com.oplus.ocs.base.task.o;
import com.oplus.ocs.base.task.Continuation;
import java.util.Collection;
import java.lang.Object;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.utils.d;
import java.util.ArrayList;
import com.oplus.ocs.base.task.Tasks;

public final class o implements Continuation	// class@000b1b
{
    public Collection a;

    public void o(Collection p0){
       super();
       this.a = p0;
    }
    public final Object then(Task p0){
       d.a(p0);
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(this.a);
       return Tasks.forResult(uArrayList);
    }
}
