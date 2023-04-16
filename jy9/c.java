package jy9.c;
import erd.g;
import jy9.d;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import iz5.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import dz5.e;

public final class c implements g	// class@002b83
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       p0 = tb.u;
       if (p0 != null && tb.v != null) {
          a.b(1, p0, false, "");
          e.d(tb.u, tb.v, "DESCRIPTION");
       }
       return;
    }
}
