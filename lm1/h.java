package lm1.h;
import lm1.i;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Object;

public class h	// class@002fa5
{
    public final i a;
    public final QLiveMessage b;
    public final int c;
    public boolean d;

    public void h(i p0,QLiveMessage p1,int p2){
       super();
       this.d = true;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void h(i p0,QLiveMessage p1,int p2,boolean p3){
       super();
       this.d = true;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public i a(){
       return this.a;
    }
    public QLiveMessage b(){
       return this.b;
    }
    public int c(){
       return this.c;
    }
    public boolean d(){
       return this.d;
    }
}
