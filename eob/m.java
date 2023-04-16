package eob.m;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.mix.Location;
import java.lang.Object;
import java.lang.Integer;
import eob.t;
import tkd.b;
import tkd.d;
import ru5.a;
import android.app.Activity;

public final class m implements o	// class@002795
{
    public final GifshowActivity b;
    public final Location c;

    public void m(GifshowActivity p0,Location p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       m tb = this.b;
       m tc = this.c;
       if (t.b(p0.intValue())) {
          d.a(-774600034).HY(tb, tc);
       }
       return p0;
    }
}
