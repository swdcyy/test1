package bb0.b0;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ra0.b;
import q87.c;
import java.util.Map;
import java.util.LinkedHashMap;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import fb0.l;

public final class b0 implements g	// class@000254
{
    public final e b;

    public void b0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "9")) {
       }else {
          Object[] objArray = new Object[0];
          b.D().s("SmartAlbumHorizontalListLoggerPresenter", "doLoggers: ", objArray);
          if (tb.G != null) {
             p0 = tb.P8();
             String str = (tb.D != null)? "initiative_show": "passive_show";
             p0.put("show_type", str);
             l.i(5, "SHOW_INTELLIGENT_ALBUM", l.n(p0), l.a(tb.J));
          }
       }
       return;
    }
}
