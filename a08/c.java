package a08.c;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import l08.c;
import java.lang.Object;
import q08.a$a;
import java.util.Objects;
import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;
import f08.f;
import a08.p;
import com.kwaishou.merchant.daccore.PendantHolder;

public final class c implements g	// class@000008
{
    public final b b;
    public final c c;
    public final boolean d;

    public void c(b p0,c p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       Objects.requireNonNull(tb);
       boolean b = false;
       if (p0 == null) {
       }else if(p0.b == null && p0.a().contains("render_main_view")){
          b = true;
       }
       f.c(tb.l, tc.e(), "component render result:isWaitRendered:"+td+" isCanMount:"+b);
       if (td != null && b) {
          tb.c.c(tc);
       }
       if (td == null && !b) {
          tb.c.a(tb.b.j(tc.e()));
          f.c(tb.l, tc.e(), "render failed,try to remove pendant");
       }
       return;
    }
}
