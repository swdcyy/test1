package co2.m;
import erd.g;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import zo2.m0;
import java.util.Objects;

public final class m implements g	// class@00059e
{
    public final h b;

    public void m(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a()) {
          int i = (p0.b())? 7: 5;
          tb.b(i);
       }
       return;
    }
}
