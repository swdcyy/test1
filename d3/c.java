package d3.c;
import d3.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import d3.b;
import java.lang.String;

public final class c extends d	// class@001df9
{

    public void c(){
       super();
    }
    public static c h(ByteBuffer p0){
       c uoc = new c();
       c.i(p0, uoc);
       return uoc;
    }
    public static c i(ByteBuffer p0,c p1){
       p0.order(ByteOrder.LITTLE_ENDIAN);
       p1.f((p0.getInt(p0.position()) + p0.position()), p0);
       return p1;
    }
    public c f(int p0,ByteBuffer p1){
       this.g(p0, p1);
       return this;
    }
    public void g(int p0,ByteBuffer p1){
       this.a = p0;
       this.b = p1;
    }
    public b j(b p0,int p1){
       int i = this.b(6);
       if (i) {
          p0.f(this.a((this.d(i) + (p1 * 4))), this.b);
       }else {
          p0 = null;
       }
       return p0;
    }
    public int k(){
       int i = this.b(6);
       i = (i)? this.e(i): 0;
       return i;
    }
    public String l(){
       int i = this.b(8);
       String str = (i)? this.c((i + this.a)): null;
       return str;
    }
    public int m(){
       int i = this.b(4);
       i = (i)? this.b.getInt((i + this.a)): 0;
       return i;
    }
}
