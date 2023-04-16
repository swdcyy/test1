package jw8.m;
import erd.o;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y26.b$a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.io.File;
import java.lang.Object;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.yxcorp.gifshow.activity.preview.f;
import gq.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.media.model.PhotoMovieEncodeConfig;
import q46.l;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import wba.b;
import mca.a;
import brd.t;
import com.yxcorp.gifshow.activity.preview.g;

public final class m implements o	// class@0029c4
{
    public final Workspace$Type b;
    public final Workspace c;
    public final GifshowActivity d;
    public final b$a e;
    public final c f;
    public final File g;

    public void m(Workspace$Type p0,Workspace p1,GifshowActivity p2,b$a p3,c p4,File p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final Object apply(Object p0){
       EncodeRequest$a a;
       m tb = this.b;
       m tc = this.c;
       m td = this.d;
       m te = this.e;
       m tf = this.f;
       m tg = this.g;
       int i = 0;
       String str = "ReviewWorkspaceHelper";
       if (!f.j(tb)) {
          Object[] objArray = new Object[i];
          a.D().w(str, "Share video workspace", objArray);
          File uFile = DraftFileManager.E().J(tc);
          p0.t(td.getIntent());
          a = p0.A;
          if (a != null) {
             te.x(a.toFullJson());
          }
          long id = (tb == Workspace$Type.PHOTO_MOVIE || tb == Workspace$Type.KTV_SONG)? l.e().getId(): GSConfig.c().getId();
          tf.d1().T0(id);
          VideoEncodeSDKInfo mProject = p0.l.mProject;
          te.m(id);
          te.J(uFile);
          te.L((long)(EditorSdk2UtilsV2.getDisplayDuration(mProject) * 0x408f400000000000));
          p0 = g.a(tf, te, p0, b.m(tf, mProject), a.s(mProject), a.r(mProject));
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "Share atlas workspace", objArray1);
          if (tg != null) {
             te.J(tg);
          }
          if (tb == Workspace$Type.SINGLE_PICTURE) {
             p0 = g.a(tf, te, p0, 0x3f800000, p0.n, p0.o);
          }else {
             p0 = t.just(p0);
          }
       }
       return p0;
    }
}
