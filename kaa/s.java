package kaa.s;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.Music$Type;
import com.kuaishou.edit.draft.EditLyric;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wba.u;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Music$b;

public class s extends w	// class@002c35
{
    public final String a;
    public final d b;

    public void s(){
       super();
       this.a = "Migrator286";
       this.b = new d(2, 8, 6);
    }
    public d a(){
       return this.b;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       int musicsCount = p0.getMusicsCount();
       if (musicsCount <= 0) {
          return;
       }
       int i = 0;
       Music musics = p0.getMusics(i);
       if (musics.getType() == Music$Type.RECORD && !TextUtils.x(musics.getEditLyric().getStyleId())) {
          EditLyric editLyric = musics.getEditLyric();
          int i1 = 0;
          while (true) {
             StringBuilder str = -1;
             if (i1 < musicsCount) {
                if (!u.j(p0.getMusics(i1))) {
                label_004e :
                   if (i1 != str) {
                      Object[] objArray = new Object[i];
                      f.D().w("Migrator286", "migrate edit lyric draft index = "+i1, objArray);
                      Music$b uob = p0.getMusics(i1).toBuilder();
                      uob.e(editLyric);
                      p0.o(i1, uob);
                      break ;
                   }
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i1 = -1;
                goto label_004e ;
             }
          }
       }
       return;
    }
}
