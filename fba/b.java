package fba.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.AICutTheme;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.AICutTheme$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;
import java.util.Collections;

public class b extends e	// class@0022f3
{

    public void b(File p0,AICutTheme p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       AICutTheme uAICutTheme = PatchProxy.apply(null, this, b.class, "1");
       if (uAICutTheme != PatchProxyResult.class) {
       }else {
          AICutTheme$b uob = AICutTheme.newBuilder();
          uob.a(DraftUtils.i());
          uAICutTheme = uob.build();
       }
       return uAICutTheme;
    }
    public List j(GeneratedMessageLite p0){
       List list = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (list != PatchProxyResult.class) {
       }else {
          list = Collections.singletonList(p0.getDirectory());
       }
       return list;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.f().a(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
}
