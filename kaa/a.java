package kaa.a;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Music;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Music$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Music$Type;
import com.kuaishou.edit.draft.ImportMusicParam;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.ImportMusicParam$b;
import com.kuaishou.edit.draft.Song;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.webkit.URLUtil;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.kuaishou.edit.draft.OnlineMusicParam$b;
import com.kuaishou.edit.draft.OperationMusicParam;
import com.kuaishou.edit.draft.OperationMusicParam$b;
import java.util.List;

public class a extends w	// class@002c23
{
    public final d a;

    public void a(){
       super();
       this.a = new d(1, 1, 4);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       c a;
       double this;
       TimeRange$b uob1;
       double d;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.b(p0);
       Workspace$Type type = p0.a.getType();
       a = p0.a;
       a.f("Android");
       for (int i = 0; i < p0.a.getMusicsCount(); i = i + 1) {
          Music musics = a.getMusics(i);
          Music$b uob = PatchProxy.applyThreeRefs(type, musics, p0, this, a.class, "2");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = musics.toBuilder();
             this = 0x408f400000000000;
             if (musics.getType() == Music$Type.IMPORT) {
                if (musics.getImportParam().hasSelectedRange()) {
                   uob1 = musics.getImportParam().getSelectedRange().toBuilder();
                   d = uob1.getStart() / this;
                   uob1.b(d);
                   d = uob1.getDuration() / this;
                   uob1.a(d);
                   ImportMusicParam$b uob2 = musics.getImportParam().toBuilder();
                   uob2.a(uob1);
                   uob.j(uob2);
                }
                if (musics.getImportParam().hasSong() && (!TextUtils.x(musics.getImportParam().getSong().getFile()) && !URLUtil.isNetworkUrl(musics.getImportParam().getSong().getFile()))) {
                label_0195 :
                   str = 1;
                label_0198 :
                   if (type == Workspace$Type.VIDEO || (type != Workspace$Type.LONG_VIDEO && (type != Workspace$Type.PHOTO_MOVIE || (str && !PatchProxy.applyVoidTwoRefs(uob, p0, this, a.class, "3"))))) {
                      str = uob.getFile();
                      if (!TextUtils.x(str)) {
                         p0.b.add(str);
                         uob.copyOnWrite();
                         uob.instance.clearFile();
                      }
                   }
                }
             }else if(musics.getType() == Music$Type.ONLINE){
                if (musics.getOnlineParam().hasSelectedRange()) {
                   uob1 = musics.getOnlineParam().getSelectedRange().toBuilder();
                   d = uob1.getStart() / this;
                   uob1.b(d);
                   d = uob1.getDuration() / this;
                   uob1.a(d);
                   OnlineMusicParam$b uob3 = musics.getOnlineParam().toBuilder();
                   uob3.a(uob1);
                   uob.l(uob3);
                }
                if (musics.getOnlineParam().hasSong() && (!TextUtils.x(musics.getOnlineParam().getSong().getFile()) && !URLUtil.isNetworkUrl(musics.getOnlineParam().getSong().getFile()))) {
                   goto label_0195 ;
                }
             }else if(musics.getType() == Music$Type.OPERATION){
                if (musics.getOperationParam().hasSelectedRange()) {
                   uob1 = musics.getOperationParam().getSelectedRange().toBuilder();
                   d = uob1.getStart() / this;
                   uob1.b(d);
                   d = uob1.getDuration() / this;
                   uob1.a(d);
                   OperationMusicParam$b uob4 = musics.getOperationParam().toBuilder();
                   uob4.a(uob1);
                   uob.m(uob4);
                }
                if (musics.getOperationParam().hasSong() && (!TextUtils.x(musics.getOperationParam().getSong().getFile()) && !URLUtil.isNetworkUrl(musics.getOperationParam().getSong().getFile()))) {
                   goto label_0195 ;
                }
             }
          label_0197 :
             str = null;
             goto label_0198 ;
          }
       label_01c8 :
          a.o(i, uob);
       }
       return;
    }
}
