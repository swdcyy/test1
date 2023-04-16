package kaa.d;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Sticker;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.Text$b;
import haa.f;
import java.lang.StringBuilder;
import q87.c;

public class d extends w	// class@002c26
{
    public final d a;

    public void d(){
       super();
       this.a = new d(2, 1, 4);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       int i = 0;
       for (int i1 = 0; i1 < p0.getStickersCount(); i1 = i1 + 1) {
          Sticker$b uob = p0.getStickers(i1).toBuilder();
          StickerResult$b uob1 = uob.getResult().toBuilder();
          this.c(uob1);
          uob.h(uob1);
          p0.q(i1, uob);
       }
       for (; i < p0.getTextsCount(); i = i + 1) {
          Text$b uob2 = p0.getTexts(i).toBuilder();
          StickerResult$b uob3 = uob2.getResult().toBuilder();
          this.c(uob3);
          uob2.j(uob3);
          p0.s(i, uob2);
       }
       return;
    }
    public final void c(StickerResult$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       float rotate = p0.instance.getRotate();
       p0.s((0xbf800000 * rotate));
       StringBuilder str = "migrateStickerResult originRotate:"+rotate;
       Object[] objArray = new Object[0];
       f.D().w("Migrator214", str+",scale:"+p0.getScale(), objArray);
       return;
    }
}
