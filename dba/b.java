package dba.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Shoot;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Shoot$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;

public class b extends e	// class@001ee6
{

    public void b(File p0,Shoot p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       Shoot shoot = PatchProxy.apply(null, this, b.class, "1");
       if (shoot != PatchProxyResult.class) {
       }else {
          Shoot$b uob = Shoot.newBuilder();
          uob.a(DraftUtils.i());
          shoot = uob.build();
       }
       return shoot;
    }
    public List j(GeneratedMessageLite p0){
       return null;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.f().a(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
}
