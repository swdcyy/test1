package jba.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Tts;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Tts$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.edit.draft.TtsAudio;

public class b extends e	// class@002a42
{

    public void b(File p0,Tts p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       Tts tts = PatchProxy.apply(null, this, b.class, "1");
       if (tts != PatchProxyResult.class) {
       }else {
          Tts$b uob = Tts.newBuilder();
          uob.e(DraftUtils.i());
          tts = uob.build();
       }
       return tts;
    }
    public List j(GeneratedMessageLite p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          for (int i = 0; i < p0.getTtsAudiosCount(); i = i + 1) {
             uArrayList.add(p0.getTtsAudios(i).getFile());
          }
       }
       return uArrayList;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.f().e(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
}
