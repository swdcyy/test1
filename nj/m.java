package nj.m;
import b56.y;
import com.gifshow.tuna.player.component.a;
import java.lang.Object;
import android.view.View;
import nj.a;
import nj.g;
import com.kwai.framework.player.core.b;

public final class m implements y	// class@002719
{
    public final a a;

    public void m(a p0){
       this.a = p0;
    }
    public final void a(boolean p0,View p1){
       m ta = this.a;
       a a = ta.a;
       if (a != null && a.b != null) {
          a c = ta.c;
          if (c != null) {
             if (p0) {
                c.start();
             }else {
                c.pause();
             }
          }
       }
       return;
    }
}
