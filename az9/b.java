package az9.b;
import hka.a;
import az9.i0;
import java.lang.Object;
import qp7.b;

public final class b implements a	// class@00031d
{
    public final i0 b;

    public void b(i0 p0){
       this.b = p0;
    }
    public final boolean onBackPressed(){
       boolean b;
       b tb = this.b;
       if (tb.m != null) {
          tb.o0();
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
