package htd.a$e;
import ftd.i;
import htd.a;
import htd.x;
import java.lang.Throwable;
import ltd.o;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class a$e extends i	// class@000fae
{
    public final x b;
    public final a c;

    public void a$e(a p0,x p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void a(Throwable p0){
       if (this.b.U()) {
          this.c.Z();
       }
       return;
    }
    public Object invoke(Object p0){
       this.a(p0);
       return l1.a;
    }
    public String toString(){
       return "RemoveReceiveOnCancel["+this.b+']';
    }
}
