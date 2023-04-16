package o1a.c;
import u07.u;
import o1a.f;
import java.lang.Object;
import u07.t;
import android.view.View;
import k2b.e0;
import java.lang.String;
import k1a.b;
import psb.c;
import psb.a;
import l1a.b;
import brd.t;
import o1a.d;
import sfc.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class c implements u	// class@00326c
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       c tb = this.b;
       b.b(tb.t, "CONFIRM");
       tb.X7(a.a().i(tb.p.mId).subscribe(new d(tb), new a()));
    }
}
