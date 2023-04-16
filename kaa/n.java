package kaa.n;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Text;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.Cover;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.Music$b;
import com.kuaishou.edit.draft.EditLyric;
import com.kuaishou.edit.draft.EditLyric$b;
import java.util.Collections;
import com.kuaishou.edit.draft.Karaoke;
import com.kuaishou.edit.draft.Karaoke$b;
import com.kuaishou.edit.draft.KaraokeAsset;
import com.kuaishou.edit.draft.KaraokeAsset$b;

public class n extends w	// class@002c30
{
    public final d a;

    public void n(){
       super();
       this.a = new d(2, 7, 58);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       StickerResult$b uob1;
       StickerResult$b uob3;
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().s("Migrator2758", "current version:"+this.a().toString(), objArray);
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       int i1 = 0;
       int i2 = 0;
       while (i1 < p0.getTextsCount()) {
          Text$b uob = p0.getTexts(i1).toBuilder();
          uob1 = uob.getResult().toBuilder();
          if (!uob1.getViewScale() - i2) {
             uob1.v(0x3f800000);
             uob.j(uob1);
             p0.s(i1, uob);
          }
          i1 = i1 + 1;
       }
       i1 = 0;
       while (i1 < p0.getCoversCount()) {
          Cover covers = p0.getCovers(i1);
          Iterator iterator = covers.getTextsList().iterator();
          while (iterator.hasNext()) {
             Text$b uob2 = iterator.next().toBuilder();
             uob3 = uob2.getResult().toBuilder();
             if (uob3.getViewScale() - i2) {
                continue ;
             }
             uob3.v(0x3f800000);
             uob2.j(uob3);
             Cover$b uob4 = covers.toBuilder();
             uob4.g(i1, uob2);
             p0.j(i1, uob4);
          }
          i1 = i1 + 1;
       }
       i1 = 0;
       while (i1 < p0.getStickersCount()) {
          Sticker$b uob5 = p0.getStickers(i1).toBuilder();
          uob1 = uob5.getResult().toBuilder();
          if (!uob1.getViewScale() - i2) {
             uob1.v(0x3f800000);
             uob5.h(uob1);
             p0.q(i1, uob5);
          }
          i1 = i1 + 1;
       }
       for (i1 = 0; i1 < p0.getMusicsCount(); i1 = i1 + 1) {
          Music$b uob6 = p0.getMusics(i1).toBuilder();
          EditLyric$b uob7 = uob6.instance.getEditLyric().toBuilder();
          Iterator iterator1 = Collections.unmodifiableList(uob7.instance.getStickerResultsList()).iterator();
          while (iterator1.hasNext()) {
             uob3 = iterator1.next().toBuilder();
             if (uob3.getViewScale() - i2) {
                continue ;
             }
             uob3.v(0x3f800000);
             uob7.l(i1, uob3);
          }
          uob6.copyOnWrite();
          uob6.instance.setEditLyric(uob7);
          p0.o(i1, uob6);
       }
       Karaoke$b uob8 = p0.getKaraoke().toBuilder();
       KaraokeAsset$b uob9 = uob8.getAsset().toBuilder();
       while (i < uob9.instance.getKtvLyricCount()) {
          Text$b uob10 = uob9.instance.getKtvLyric(i).toBuilder();
          StickerResult$b uob11 = uob10.getResult().toBuilder();
          if (!uob11.getViewScale() - i2) {
             uob11.v(0x3f800000);
             uob10.j(uob11);
             uob9.copyOnWrite();
             uob9.instance.setKtvLyric(i, uob10);
          }
          i = i + 1;
       }
       uob8.a(uob9);
       p0.n(uob8);
       return;
    }
}
