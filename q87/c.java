package q87.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import q87.d;
import com.kwai.logger.KwaiLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public class c	// class@002247
{
    public final String a;
    public final boolean b;

    public void c(String p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void A(String p0,String p1,Object[] p2){
       this.p(8, p0, p1, p2);
    }
    public void e(String p0,String p1,Throwable p2){
       this.o(16, p0, p1, p2);
    }
    public final void o(int p0,String p1,String p2,Throwable p3){
       this.q(KwaiLog.j(this.a, p0, p1, p2, p3));
    }
    public final void p(int p0,String p1,String p2,Object[] p3){
       this.q(KwaiLog.k(this.a, p0, p1, p2, p3));
    }
    public final void q(d p0){
       KwaiLog.a(p0);
    }
    public void r(String p0,String p1,Throwable p2){
       this.o(2, p0, p1, p2);
    }
    public void s(String p0,String p1,Object[] p2){
       this.p(2, p0, p1, p2);
    }
    public void t(String p0,String p1,Object[] p2){
       this.p(16, p0, p1, p2);
    }
    public void u(String p0,Throwable p1,Object[] p2){
       ArrayList uArrayList = new ArrayList((p2.length + 1));
       uArrayList.addAll(Arrays.asList(p2));
       uArrayList.add(p1);
       Object[] objArray = new Object[0];
       this.t(p0, "", uArrayList.toArray(objArray));
    }
    public void v(String p0,String p1,Throwable p2){
       this.o(4, p0, p1, p2);
    }
    public void w(String p0,String p1,Object[] p2){
       this.p(4, p0, p1, p2);
    }
    public void x(String p0,String p1,Throwable p2){
       this.o(1, p0, p1, p2);
    }
    public void y(String p0,String p1,Object[] p2){
       this.p(1, p0, p1, p2);
    }
    public void z(String p0,String p1,Throwable p2){
       this.o(8, p0, p1, p2);
    }
}
