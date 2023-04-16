package ly9.h;
import com.kwai.framework.player.core.b$b;
import ly9.k;
import java.lang.Object;
import ly9.m;

public final class h implements b$b	// class@002ebb
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void d(int p0){
       boolean b;
       h tb = this.b;
       if (tb.a()) {
       }else if(p0 == 3){
          b = true;
       }else {
          b = false;
       }
       tb.c.e(b);
       if (b) {
          tb.c();
       }else {
          tb.b();
       }
       return;
    }
}
