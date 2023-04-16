package com.oplus.ocs.base.task.p;
import com.oplus.ocs.base.task.Continuation;
import java.util.Collection;
import java.lang.Object;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.utils.d;
import java.util.ArrayList;
import java.util.Iterator;

public final class p implements Continuation	// class@000b1c
{
    public Collection a;

    public void p(Collection p0){
       super();
       this.a = p0;
    }
    public final Object then(Task p0){
       d.a(p0);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getResult());
       }
       return uArrayList;
    }
}
