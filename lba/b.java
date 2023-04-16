package lba.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.OriginalVoice;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.OriginalVoice$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;

public class b extends e	// class@002da5
{

    public void b(File p0,OriginalVoice p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       OriginalVoice originalVoic = PatchProxy.apply(null, this, b.class, "1");
       if (originalVoic != PatchProxyResult.class) {
       }else {
          OriginalVoice$b uob = OriginalVoice.newBuilder();
          uob.d(0x3f800000);
          uob.a(DraftUtils.i());
          originalVoic = uob.build();
       }
       return originalVoic;
    }
    public List j(GeneratedMessageLite p0){
       List list = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (list != PatchProxyResult.class) {
       }else {
          list = p0.getAudioAssetsList();
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
