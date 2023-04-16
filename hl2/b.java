package hl2.b;
import msd.l;
import com.kuaishou.live.core.show.template.a;
import java.lang.Object;
import java.lang.Boolean;
import qy1.a;
import pp.c;
import qy1.a$a;
import java.lang.String;
import java.lang.Integer;
import java.util.List;
import java.util.Arrays;
import zq5.b;

public final class b implements l	// class@002dbc
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       a s = this.b.s;
       if (s != null) {
          Integer[] integerArray = new Integer[]{Integer.valueOf(3),Integer.valueOf(6)};
          s.ln(a.K0.a().getName(), p0.booleanValue(), Arrays.asList(integerArray));
       }
       return null;
    }
}
