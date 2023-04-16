package h33.c;
import n3d.a;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import android.content.Intent;

public final class c implements a	// class@002c1e
{
    public final y b;
    public final SlipSwitchButton c;

    public void c(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       c tb = this.b;
       c tc = this.c;
       if (p1 == -1) {
          tb.b(tc);
       }else {
          tb.f(tc);
       }
       return;
    }
}
