package kgd.c1;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.e0$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import k2b.h;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.e0;

public final class c1 implements u	// class@00177d
{
    public final e0$a b;

    public void c1(e0$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       c1 tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.m("3312897", "VIEW_RECORD_POPUP");
       i3 oi3 = i3.f();
       oi3.c("click_area", Integer.valueOf(3));
       oh.n(oi3.e());
       oh.i(tb.p);
    }
}
