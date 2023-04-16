package hd2.r$d;
import pp.c;
import hd2.r;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class r$d implements c	// class@002d74
{
    public final r b;

    public void r$d(r p0){
       this.b = p0;
       super();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       Object obj = PatchProxy.apply(null, this, r$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePkAudienceSeiHandler "+this.b.hashCode();
    }
}
