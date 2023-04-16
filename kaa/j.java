package kaa.j;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import tkd.b;
import tkd.d;
import r16.a;
import r16.d;
import haa.f;
import java.lang.StringBuilder;
import q87.c;

public class j extends w	// class@002c2c
{
    public final d a;

    public void j(){
       super();
       this.a = new d(2, 6, 0);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       if (!p0.getEditSplitLimitDuration() - null) {
          p0.l(d.a(0x14d6f666).YH());
          Object[] objArray = new Object[0];
          f.D().w("Migrator260", "change edit split limit duration from 0 to "+p0.getEditSplitLimitDuration(), objArray);
       }
       return;
    }
}
