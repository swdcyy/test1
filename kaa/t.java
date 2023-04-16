package kaa.t;
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
import com.kuaishou.edit.draft.Preview;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import wba.e0;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Preview$b;
import haa.f;
import java.lang.StringBuilder;
import q87.c;

public class t extends w	// class@002c36
{
    public final String a;
    public final d b;

    public void t(){
       super();
       this.a = "Migrator2911";
       this.b = new d(2, 9, 11);
    }
    public d a(){
       return this.b;
    }
    public void b(c p0){
       boolean b;
       t ot = t.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ot, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       Preview preview = p0.instance.getPreview();
       if (preview != null) {
          Size obj = PatchProxy.applyOneRefs(p0, this, ot, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             Workspace$Type type = p0.getType();
             Workspace$Source source = p0.getSource();
             if (type != Workspace$Type.PHOTO_MOVIE) {
                Workspace$Source cAPTURE = Workspace$Source.CAPTURE;
                if (source == cAPTURE || (source == Workspace$Source.IMPORT_MIXED || (source == Workspace$Source.IMPORT || (source != Workspace$Source.FOLLOW_SHOOT && (source == Workspace$Source.IM_MESSAGE && (type == Workspace$Type.VIDEO || (type != Workspace$Type.LONG_VIDEO && (type != Workspace$Type.AI_CUT || (source == Workspace$Source.IMPORT_MIXED || (source != cAPTURE && source != Workspace$Source.IMPORT)))))))))) {
                   b = false;
                }
             }
          label_006a :
             b = true;
          }
          if (b) {
             obj = e0.c((float)preview.getWidth(), (float)preview.getHeight());
             Preview$b uob = preview.toBuilder();
             uob.g(obj.b);
             uob.d(obj.c);
             p0.copyOnWrite();
             p0.instance.setPreview(uob);
             Object[] objArray = new Object[0];
             f.D().s("Migrator2911", "preview size: Width "+obj.b+",Height "+obj.c, objArray);
          }
       }
       return;
    }
}
