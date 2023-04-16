package kaa.q;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.Makeup;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Makeup$b;
import com.kuaishou.edit.draft.Makeup$SubFeatures;
import com.kuaishou.edit.draft.Makeup$SubFeatures$a;
import wkd.b;
import j80.c;
import java.io.File;
import java.lang.CharSequence;

public class q extends w	// class@002c33
{
    public final String a;
    public final d b;

    public void q(){
       super();
       this.a = "Migrator2774";
       this.b = new d(2, 7, 74);
    }
    public d a(){
       return this.b;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       for (int i = 0; i < p0.instance.getMakeupsCount(); i = i + 1) {
          Makeup makeups = p0.instance.getMakeups(i);
          Makeup$b uob = makeups.toBuilder();
          for (int i1 = 0; i1 < makeups.getSubFeaturesCount(); i1 = i1 + 1) {
             Makeup$SubFeatures subFeatures = makeups.getSubFeatures(i1);
             Makeup$SubFeatures$a subFeatures$ = subFeatures.toBuilder();
             String resPath = subFeatures.getResPath();
             int i2 = -1504323719;
             if (resPath.contains(b.a(i2).k().toString())) {
                resPath = resPath.replace(b.a(i2).k().toString(), b.a(i2).m().toString());
             }
             subFeatures$.a(resPath);
             uob.copyOnWrite();
             uob.instance.setSubFeatures(i1, subFeatures$);
          }
          p0.copyOnWrite();
          p0.instance.setMakeups(i, uob);
       }
       return;
    }
}
