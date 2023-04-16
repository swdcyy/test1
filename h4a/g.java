package h4a.g;
import com.kwai.framework.player.helper.b$b;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$c;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;

public final class g implements b$b	// class@002562
{
    public final PLCLogHelper$c a;

    public void g(PLCLogHelper$c p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       g ta = this.a;
       if (p0) {
          ta.b.n();
       }else {
          ta.b.o();
       }
       return;
    }
}
