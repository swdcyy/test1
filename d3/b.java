package d3.b;
import d3.d;
import java.nio.ByteBuffer;

public final class b extends d	// class@001df8
{

    public void b(){
       super();
    }
    public b f(int p0,ByteBuffer p1){
       this.g(p0, p1);
       return this;
    }
    public void g(int p0,ByteBuffer p1){
       this.a = p0;
       this.b = p1;
    }
    public int h(int p0){
       int i = this.b(16);
       p0 = (i)? this.b.getInt((this.d(i) + (p0 * 4))): 0;
       return p0;
    }
    public int i(){
       int i = this.b(16);
       i = (i)? this.e(i): 0;
       return i;
    }
    public short j(){
       short i = this.b(10);
       i = (i)? this.b.getShort((i + this.a)): 0;
       return i;
    }
    public boolean k(){
       int i = this.b(6);
       boolean b = false;
       if (i && this.b.get((i + this.a))) {
          b = true;
       }
       return b;
    }
    public short l(){
       short i = this.b(14);
       i = (i)? this.b.getShort((i + this.a)): 0;
       return i;
    }
    public int m(){
       int i = this.b(4);
       i = (i)? this.b.getInt((i + this.a)): 0;
       return i;
    }
    public short n(){
       short i = this.b(8);
       i = (i)? this.b.getShort((i + this.a)): 0;
       return i;
    }
    public short o(){
       short i = this.b(12);
       i = (i)? this.b.getShort((i + this.a)): 0;
       return i;
    }
}
