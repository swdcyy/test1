package com.smile.gifmaker.mvps.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import com.smile.gifmaker.mvps.presenter.PresenterV2$b;

public abstract class b extends PresenterV2	// class@000c2b
{
    public final List p;
    public static final Map q;

    static {
       HashMap hashMap = new HashMap();
       b.q = hashMap;
       PresenterStateMachine$PresenterState cREATE = PresenterStateMachine$PresenterState.CREATE;
       hashMap.put(cREATE, Collections.singletonList(cREATE));
       PresenterStateMachine$PresenterState bIND = PresenterStateMachine$PresenterState.BIND;
       hashMap.put(bIND, Collections.singletonList(bIND));
       PresenterStateMachine$PresenterState uNBIND = PresenterStateMachine$PresenterState.UNBIND;
       PresenterStateMachine$PresenterState[] presenterSta = new PresenterStateMachine$PresenterState[]{cREATE,bIND,uNBIND};
       hashMap.put(uNBIND, Arrays.asList(presenterSta));
    }
    public void b(){
       super();
       this.p = new ArrayList();
    }
    public void I8(PresenterV2 p0){
       this.p.add(p0);
    }
    public void P8(boolean p0){
       boolean b;
       List list = b.q.get(this.f);
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          PresenterV2 presenterV2 = iterator.next();
          super.I8(presenterV2);
          if (list != null) {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                PresenterStateMachine$PresenterState presenterSta = iterator1.next();
                PresenterV2 tj = this.j;
                b = (presenterSta == this.f && p0)? true: false;
                presenterV2.D8(presenterSta, tj, b);
             }
          }
       }
       this.p.clear();
       return;
    }
}
