package de.i;
import de.f;
import java.lang.Object;
import ce.b;
import java.lang.String;
import java.lang.StringBuilder;

public class i implements f	// class@001e42
{
    public int a;
    public int b;
    public int c;

    public void i(int p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(b p0){
       p0.h(this.b, this.c);
    }
    public String toString(){
       return "RemoveMountItem ["+this.a+"] - parentTag: "+this.b+" - index: "+this.c;
    }
}
