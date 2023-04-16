package kaa.g;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import haa.f;
import q87.c;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Asset;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset$b;
import wba.n0;

public class g extends w	// class@002c29
{
    public final d a;

    public void g(){
       super();
       this.a = new d(2, 4, 5);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.b(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().w("Migrator245", "migrate", objArray);
       p0 = p0.a;
       p0.f("Android");
       Workspace$Type type = p0.getType();
       if (type == Workspace$Type.ATLAS || type == Workspace$Type.LONG_PICTURE) {
          for (; i < p0.getAssetsCount(); i = i + 1) {
             Asset assets = p0.getAssets(i);
             Asset$b uob = assets.toBuilder();
             uob.m(n0.e(assets.getFile()));
             p0.g(i, uob);
          }
       }
       return;
    }
}
