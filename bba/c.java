package bba.c;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Publish;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Publish$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;

public class c extends e	// class@000448
{

    public void c(File p0,Publish p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       Publish publish = PatchProxy.apply(null, this, c.class, "1");
       if (publish != PatchProxyResult.class) {
       }else {
          Publish$b uob = Publish.newBuilder();
          uob.c(DraftUtils.i());
          publish = uob.build();
       }
       return publish;
    }
    public List j(GeneratedMessageLite p0){
       return null;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.f().c(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
}
