package ftd.c$b;
import ftd.i;
import ftd.c;
import ftd.c$a;
import java.lang.Throwable;
import ftd.c1;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class c$b extends i	// class@000e75
{
    public final c$a[] b;
    public final c c;

    public void c$b(c p0,c$a[] p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void a(Throwable p0){
       this.b();
    }
    public final void b(){
       c$b tb = this.b;
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          tb[i].d0().dispose();
       }
       return;
    }
    public Object invoke(Object p0){
       this.a(p0);
       return l1.a;
    }
    public String toString(){
       return "DisposeHandlersOnCancel["+this.b+']';
    }
}
