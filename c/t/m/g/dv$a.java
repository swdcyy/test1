package c.t.m.g.dv$a;
import java.lang.Object;
import android.location.Location;
import c.t.m.g.dv;
import java.lang.String;
import c.t.m.g.dv$1;
import c.t.m.g.ed;
import java.lang.Throwable;
import com.tencent.map.geolocation.TencentLocation;
import c.t.m.g.dk;

public class dv$a	// class@000c57
{
    public String a;
    public dv b;
    public int c;
    public String d;
    public Location e;

    public void dv$a(){
       super();
       this.d = "network";
    }
    public dv$a a(int p0){
       this.c = p0;
       return this;
    }
    public dv$a a(Location p0){
       this.e = new Location(p0);
       return this;
    }
    public dv$a a(dv p0){
       this.b = p0;
       return this;
    }
    public dv$a a(String p0){
       this.a = p0;
       return this;
    }
    public dv a(){
       dv uodv = (this.a != null)? new dv(this.a, null): dv.c(this.b);
       dv.a(dv.b(dv.b(uodv, this.c), this.d), this.e);
       dk.a(uodv, this.e);
       return uodv;
    }
    public dv$a b(String p0){
       this.d = p0;
       return this;
    }
}
