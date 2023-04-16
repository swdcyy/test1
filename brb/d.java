package brb.d;
import msd.a;
import brb.e;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public final class d implements a	// class@00043c
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final Object invoke(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       e[] uoeArray = new e[]{tb};
       return Lists.e(uoeArray);
    }
}
