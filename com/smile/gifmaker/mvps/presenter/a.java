package com.smile.gifmaker.mvps.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import com.smile.gifmaker.mvps.presenter.PresenterV2$b;

public abstract class a extends PresenterV2	// class@000c2a
{
    public final List p;
    public static final Map q;

    static {
       HashMap hashMap = new HashMap();
       a.q = hashMap;
       PresenterStateMachine$PresenterState cREATE = PresenterStateMachine$PresenterState.CREATE;
       PresenterStateMachine$PresenterState[] presenterSta = new PresenterStateMachine$PresenterState[]{cREATE};
       hashMap.put(cREATE, Arrays.asList(presenterSta));
       PresenterStateMachine$PresenterState bIND = PresenterStateMachine$PresenterState.BIND;
       PresenterStateMachine$PresenterState[] presenterSta1 = new PresenterStateMachine$PresenterState[]{cREATE,bIND};
       hashMap.put(bIND, Arrays.asList(presenterSta1));
       PresenterStateMachine$PresenterState uNBIND = PresenterStateMachine$PresenterState.UNBIND;
       PresenterStateMachine$PresenterState[] presenterSta2 = new PresenterStateMachine$PresenterState[]{cREATE,bIND,uNBIND};
       hashMap.put(uNBIND, Arrays.asList(presenterSta2));
    }
    public void a(){
       super();
       this.p = new ArrayList();
    }
    public void I8(PresenterV2 p0){
       if (p0 instanceof PresenterV2) {
          this.p.add(p0);
       }
       return;
    }
    public void P8(boolean p0){
       List list = a.q.get(this.f);
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          PresenterV2 presenterV2 = iterator.next();
          super.I8(presenterV2);
          if (list != null) {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                PresenterStateMachine$PresenterState presenterSta = iterator1.next();
                PresenterV2 tj = this.j;
                boolean b = (presenterSta == this.f && p0)? true: false;
                presenterV2.D8(presenterSta, tj, b);
             }
          }
       }
       this.p.clear();
       return;
    }
}
