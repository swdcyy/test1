package bc7.a;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.ProjectThumbnailOptionsBuilder;
import kotlin.jvm.internal.a;
import com.kwai.video.editorsdk2.ProjectThumbnailOptions;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class a	// class@000402
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final int a(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0 != null && p0.projectOutputHeight() > 0)? p0.projectOutputHeight(): EditorSdk2UtilsV2.getComputedHeight(p0);
       return i;
    }
    public static final int b(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0 != null && p0.projectOutputWidth() > 0)? p0.projectOutputWidth(): EditorSdk2UtilsV2.getComputedWidth(p0);
       return i;
    }
    public static final void d(ThumbnailGenerator p0,EditorSdk2V2$VideoEditorProject p1,Boolean p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "8")) {
          return;
       }
       if (p0 == null || p1 == null) {
          a.a.c(new RuntimeException("setThumbnailProject videoEditorProject or thumbnailGenerator is null"));
          return;
       }else {
          p1.setProjectOutputWidth(a.b(p1));
          p1.setProjectOutputHeight(a.a(p1));
          p0.updateProject(p1);
          p0.updateProject(p1, ThumbnailGenerator.newProjectThumbnailOptionsBuilder().setIgnoreAEEffects(a.g(p2, Boolean.TRUE)).build());
          p1.setProjectOutputWidth(p1.projectOutputWidth());
          p1.setProjectOutputHeight(p1.projectOutputHeight());
          return;
       }
    }
    public final void c(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       Log.k(p0);
       return;
    }
}
