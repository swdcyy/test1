package com.google.gson.internal.Excluder$1;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.Gson;
import el.a;
import zk.j;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.b;

public class Excluder$1 extends TypeAdapter	// class@00194b
{
    public TypeAdapter a;
    public final boolean b;
    public final boolean c;
    public final Gson d;
    public final a e;
    public final Excluder f;

    public void Excluder$1(Excluder p0,boolean p1,boolean p2,Gson p3,a p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public final TypeAdapter a(){
       Excluder$1 ta = this.a;
       if (ta != null) {
       }else {
          ta = this.d.l(this.f, this.e);
          this.a = ta;
       }
       return ta;
    }
    public Object read(a p0){
       if (this.b == null) {
          return this.a().read(p0);
       }
       p0.Q();
       return null;
    }
    public void write(b p0,Object p1){
       if (this.c != null) {
          p0.u();
          return;
       }else {
          this.a().write(p0, p1);
          return;
       }
    }
}
