package kaa.f;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import haa.f;
import q87.c;
import com.kuaishou.edit.draft.Asset;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Asset$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;

public class f extends w	// class@002c28
{
    public final d a;

    public void f(){
       super();
       this.a = new d(2, 3, 5);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       Workspace$Source source = p0.getSource();
       if (p0.getType() == Workspace$Type.VIDEO && (source == Workspace$Source.CAPTURE || (source == Workspace$Source.SHOP || source == Workspace$Source.INTOWN))) {
          int i = 0;
          Object[] objArray = new Object[i];
          f.D().w("Migrator235", "migrate", objArray);
          for (; i < p0.getAssetsCount(); i = i + 1) {
             Asset assets = p0.getAssets(i);
             Asset$b uob = PatchProxy.applyOneRefs(assets, this, f.class, "2");
             if (uob != PatchProxyResult.class) {
             }else {
                uob = assets.toBuilder();
                double d = assets.getDuration() / 0x408f400000000000;
                uob.i(d);
             }
             p0.g(i, uob);
          }
       }
       return;
    }
}
