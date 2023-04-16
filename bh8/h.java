package bh8.h;
import erd.g;
import bh8.m;
import com.mini.plcmanager.PlcModel;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.mini.network.api.MiniApiException;

public final class h implements g	// class@000366
{
    public final m b;
    public final PlcModel c;

    public void h(m p0,PlcModel p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       boolean b = false;
       if (p0 instanceof MiniApiException) {
          p0 = p0.errorCode;
          if (p0 == 0x9897af) {
             tb.d(tc.j, tc.k, p0, true);
          label_0028 :
             return;
          }
       }else {
          int i = 0;
       }
       tb.d(tc.j, tc.k, p0, b);
       goto label_0028 ;
    }
}
