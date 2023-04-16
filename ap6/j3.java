package ap6.j3;
import erd.g;
import com.kwai.imsdk.group.g;
import l85.c;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.imsdk.group.KwaiGroupGeneralInfo;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import cp6.o;
import java.lang.Throwable;

public final class j3 implements g	// class@000343
{
    public final g b;
    public final c c;

    public void j3(g p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       j3 tb = this.b;
       Objects.requireNonNull(tb);
       b.a(this.c.d(" kwaiGroupGeneralInfos size: "+p0.size()));
       ArrayList uArrayList = new ArrayList();
       if (p0.size() > 0) {
          p0 = p0.iterator();
          while (p0.hasNext()) {
             KwaiGroupGeneralInfo kwaiGroupGen = p0.next();
             if (kwaiGroupGen != null && kwaiGroupGen.getGroupInfo() != null) {
                uArrayList.add(kwaiGroupGen.getGroupInfo());
             }
          }
          if (uArrayList.size() > 0) {
             o.a(tb.c).f(uArrayList);
          }
       }
       return;
    }
}
