package eub.r$b;
import laa.f;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;

public final class r$b implements f	// class@002835
{
    public final double a;

    public void r$b(double p0){
       this.a = p0;
       super();
    }
    public void a(GeneratedMessageLite$Builder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$b.class, "1")) {
       }else {
          p0.h(Cover$Type.VIDEO);
          VideoCoverParam$b uob = VideoCoverParam.newBuilder();
          uob.a(this.a);
          p0.i(uob);
       }
       return;
    }
}
