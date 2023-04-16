package jw8.i;
import java.util.concurrent.Callable;
import java.io.File;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import mca.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b;
import qba.d;
import com.yxcorp.gifshow.activity.preview.f;
import java.lang.Exception;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.String;
import wba.d0;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;

public final class i implements Callable	// class@0029c0
{
    public final File b;
    public final b$a c;
    public final c d;

    public void i(File p0,b$a p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       if (!tb.exists()) {
          tb.mkdirs();
       }
       a.u();
       EditorSdk2V2$VideoEditorProject videoEditorP = null;
       if (tc != null) {
          videoEditorP = tc.getProject();
       }
       if (videoEditorP == null) {
          b$a uoa = new b(td, f.h()).b();
          if (uoa.getProject() == null) {
             Exception uException = (uoa.h() != null)? uoa.h(): new DraftEditException("Unknown error in WorkspaceLoader");
             throw uException;
          }else {
             videoEditorP = uoa.getProject();
          }
       }
       if (d0.m(videoEditorP, td) <= 0) {
          videoEditorP = EditorSdk2UtilsV2.loadProject(videoEditorP);
       }
       return videoEditorP;
    }
}
