package c.t.m.g.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public class d	// class@000c36
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public void d(int p0,int p1,int p2,long p3,int p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.d = p4;
       this.f = p5;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || (this.c != p0.c || this.e - p0.e))) {
          b = false;
       }
       return b;
    }
    public String toString(){
       return "CellCoreInfo{MCC="+this.a+", MNC="+this.b+", LAC="+this.c+", RSSI="+this.d+", CID="+this.e+", PhoneType="+this.f+'}';
    }
}
