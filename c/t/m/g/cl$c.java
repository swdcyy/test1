package c.t.m.g.cl$c;
import com.tencent.map.geolocation.fence.TxGeofenceManagerState;
import c.t.m.g.cl;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;
import c.t.m.g.cl$1;
import com.tencent.map.geolocation.TencentLocation;
import c.t.m.g.dv;
import java.lang.System;
import c.t.m.g.cl$b;
import java.util.Map;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.util.Collection;

public final class cl$c implements TxGeofenceManagerState	// class@000c15
{
    public LinkedList a;
    public List b;
    public final cl c;

    public void cl$c(cl p0){
       this.c = p0;
       super();
       this.a = new LinkedList();
       this.b = new ArrayList();
    }
    public void cl$c(cl p0,cl$1 p1){
       super(p0);
    }
    public void add(int p0,TencentLocation p1){
       if (!p0) {
          this.a.add(p1);
       }else {
          this.a.add(dv.a.a(System.currentTimeMillis()));
       }
       return;
    }
    public long getLastInterval(){
       return this.c.a.c;
    }
    public TencentLocation getLastLocation(){
       if (this.a.isEmpty()) {
          return dv.a;
       }
       return this.a.getLast();
    }
    public long getLastLocationTime(){
       if (this.a.isEmpty()) {
          return 0;
       }
       return this.a.getLast().getTime();
    }
    public Map getLastSummary(){
       if (this.b.isEmpty()) {
          return Collections.emptyMap();
       }
       cl$c tb = this.b;
       return tb.get((tb.size() - 1));
    }
    public String getLocationTimes(){
       int i = this.a.size();
       Iterator iterator = this.a.iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          if (iterator.next() == dv.a) {
             i1 = i1 + 1;
          }
       }
       return i+"/"+i1;
    }
    public List getLocations(){
       return new ArrayList(this.a);
    }
    public long getNextLocationTime(){
       return (this.getLastLocationTime() + this.c.a.c);
    }
    public double getSpeed(){
       return cl.c(this.c);
    }
    public List getSummary(){
       return this.b;
    }
    public void reset(){
    }
}
