package d4c.e;
import erd.g;
import d4c.v;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import a46.b;
import java.util.Objects;
import okd.b;
import qpb.k;
import android.content.Context;
import com.kuaishou.android.model.music.Music;
import com.kwai.feature.post.api.music.data.MusicSource;
import n3d.d;
import kob.r;
import qm9.f0;

public final class e implements g	// class@0020ca
{
    public final v b;
    public final Activity c;
    public final boolean d;
    public final String e;
    public final String f;

    public void e(v p0,Activity p1,boolean p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       e tb = this.b;
       b uob = p0;
       Objects.requireNonNull(tb);
       b.a(0x2d110547).z(this.c, uob.s20(), tb.F, tb.G, uob.xa(), uob).o(this.d).b(true).n(false).f(this.e).g(this.f).K(1001).h();
       p0 = tb.C;
       if (p0 != null) {
          p0.d(tb.D.e40(), tb.F);
       }
       return;
    }
}
