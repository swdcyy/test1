package de.g;
import de.f;
import ze.n0;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import ze.m0;
import java.lang.Object;
import ce.b;
import be.c;
import java.lang.StringBuilder;
import cb.a;
import ce.b$a;
import java.lang.IllegalStateException;

public class g implements f	// class@001e40
{
    public final String a;
    public final int b;
    public final int c;
    public final ReadableMap d;
    public final m0 e;
    public final n0 f;
    public final boolean g;

    public void g(n0 p0,int p1,int p2,String p3,ReadableMap p4,m0 p5,boolean p6){
       super();
       this.f = p0;
       this.a = p3;
       this.b = p1;
       this.d = p4;
       this.e = p5;
       this.c = p2;
       this.g = p6;
    }
    public void a(b p0){
       if (c.w) {
          a.a("FabricUIManager", "Executing pre-allocation of: "+this.toString());
       }
       g tf = this.f;
       g ta = this.a;
       g tc = this.c;
       g td = this.d;
       g te = this.e;
       g tg = this.g;
       if (p0.d(tc) == null) {
          p0.a(tf, ta, tc, td, te, tg);
          return;
       }else {
          throw new IllegalStateException("View for component "+ta+" with tag "+tc+" already exists.");
       }
    }
    public String toString(){
       return "PreAllocateViewMountItem ["+this.c+"] - component: "+this.a+" rootTag: "+this.b+" isLayoutable: "+this.g;
    }
}
