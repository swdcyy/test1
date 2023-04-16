package de.a;
import de.f;
import ze.n0;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import ze.m0;
import java.lang.Object;
import ce.b;
import java.lang.StringBuilder;

public class a implements f	// class@001e3a
{
    public final String a;
    public final int b;
    public final int c;
    public final n0 d;
    public final ReadableMap e;
    public final m0 f;
    public final boolean g;

    public void a(n0 p0,int p1,int p2,String p3,ReadableMap p4,m0 p5,boolean p6){
       super();
       this.d = p0;
       this.a = p3;
       this.b = p1;
       this.c = p2;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public void a(b p0){
       p0.a(this.d, this.a, this.c, this.e, this.f, this.g);
    }
    public String toString(){
       return "CreateMountItem ["+this.c+"] - component: "+this.a+" - rootTag: "+this.b+" - isLayoutable: "+this.g;
    }
}
