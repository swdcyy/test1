package naa.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Beauty;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Beauty$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;

public class b extends e	// class@003124
{

    public void b(File p0,Beauty p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       Beauty uBeauty = PatchProxy.apply(null, this, b.class, "1");
       if (uBeauty != PatchProxyResult.class) {
       }else {
          Beauty$b uob = Beauty.newBuilder();
          uob.c(DraftUtils.i());
          uBeauty = uob.build();
       }
       return uBeauty;
    }
    public List j(GeneratedMessageLite p0){
       return null;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.f().c(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
}
