package cl9.o1;
import erd.b;
import cl9.r1;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import njd.a;
import com.yxcorp.retrofit.model.KwaiException;

public final class o1 implements b	// class@000650
{
    public final r1 b;
    public final QComment c;

    public void o1(r1 p0,QComment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0,Object p1){
       o1 tb = this.b;
       o1 tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 instanceof a && p0.b() == 1) {
          tb.V8(tc, false, false);
       }else if(p1 instanceof KwaiException && p1.getErrorCode() == 0x20f5f){
          tb.V8(tc, true, false);
       }else {
          tb.V8(tc, false, true);
       }
       return;
    }
}
