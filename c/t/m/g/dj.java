package c.t.m.g.dj;
import c.t.m.g.di;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import c.t.m.g.db;

public class dj extends di	// class@000c46
{
    public final List b;
    public final long c;
    public final int d;
    public static final dj a;

    static {
       dj.a = new dj(Collections.emptyList(), 0, 0);
    }
    public void dj(List p0,long p1,int p2){
       super();
       this.c = p1;
       this.d = p2;
       this.b = new ArrayList(p0);
    }
    public long a(){
       return this.c;
    }
    public boolean a(long p0,long p1){
       boolean b = ((p0 - this.c) - p1 < 0)? true: false;
       return b;
    }
    public boolean a(dj p0){
       if (p0 == null) {
          return false;
       }
       p0 = p0.b;
       dj tb = this.b;
       if (p0 == null || (tb != null && (!p0.size() || !tb.size()))) {
          return false;
       }
       return (db.a(p0, tb) ^ 0x01);
    }
    public int b(){
       return this.d;
    }
    public List c(){
       return Collections.unmodifiableList(this.b);
    }
}
