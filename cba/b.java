package cba.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Scrawl;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Scrawl$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;

public class b extends e	// class@00059c
{

    public void b(File p0,Scrawl p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       Scrawl scrawl = PatchProxy.apply(null, this, b.class, "1");
       if (scrawl != PatchProxyResult.class) {
       }else {
          Scrawl$b uob = Scrawl.newBuilder();
          uob.a(DraftUtils.i());
          scrawl = uob.build();
       }
       return scrawl;
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
