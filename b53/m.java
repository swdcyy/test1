package b53.m;
import oq5.c;
import com.kuaishou.live.gzone.barrage.h;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;

public final class m implements c	// class@000318
{
    public final h b;

    public void m(h p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0.orientation == 2)? true: false;
       tb.S8(b);
       return;
    }
}
