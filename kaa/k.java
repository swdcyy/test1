package kaa.k;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import java.lang.System;
import com.kuaishou.edit.draft.Text$b;

public class k extends w	// class@002c2d
{
    public final d a;

    public void k(){
       super();
       this.a = new d(2, 7, 19);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       for (int i = 0; i < p0.getTextsCount(); i = i + 1) {
          Text texts = p0.getTexts(i);
          StickerResult$b uob = texts.getResult().toBuilder();
          uob.k(String.valueOf(System.currentTimeMillis()));
          Text$b uob1 = texts.toBuilder();
          uob1.j(uob);
          p0.s(i, uob1);
       }
       return;
    }
}
