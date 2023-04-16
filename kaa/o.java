package kaa.o;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.FaceMagicEffect;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FaceMagicEffect$b;

public class o extends w	// class@002c31
{
    public final d a;

    public void o(){
       super();
       this.a = new d(2, 7, 65);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().s("Migrator2765", "current version:"+this.a().toString(), objArray);
       super.b(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, oo, "2")) {
          p0 = p0.a;
          int i = 0;
          while (i < p0.instance.getFaceMagicEffectsCount()) {
             FaceMagicEffect faceMagicEff = p0.instance.getFaceMagicEffects(i);
             if (faceMagicEff.getType() == FaceMagicEffect$Type.UNRECOGNIZED) {
                FaceMagicEffect$b uob = faceMagicEff.toBuilder();
                uob.e(FaceMagicEffect$Type.FACE_MAGIC);
                p0.copyOnWrite();
                p0.instance.setFaceMagicEffects(i, uob);
                Object[] objArray1 = new Object[0];
                f.D().s("Migrator2765", "migrate face magic effect type: "+faceMagicEff+" > "+uob, objArray1);
             }
             i = i + 1;
          }
       }
       return;
    }
}
