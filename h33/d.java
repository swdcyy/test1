package h33.d;
import n3d.a;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import android.content.Intent;
import brd.t;
import h33.g;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class d implements a	// class@002c1f
{
    public final y b;
    public final SlipSwitchButton c;

    public void d(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       d tb = this.b;
       t ot = tb.c();
       g og = new g(tb, this.c);
       ot.subscribe(og, Functions.d());
    }
}
