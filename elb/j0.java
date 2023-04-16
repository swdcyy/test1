package elb.j0;
import erd.g;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler;
import java.lang.Object;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$VideoEvaluateTaskOptions;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import gq.a;
import w46.b;
import kotlin.jvm.internal.a;

public final class j0 implements g	// class@002752
{
    public final VideoQualityObserveHandler b;

    public void j0(VideoQualityObserveHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "1")) {
       }else {
          EditorSdk2$VideoEvaluateTaskOptions videoEvaluat = new EditorSdk2$VideoEvaluateTaskOptions();
          videoEvaluat.setTaskType(this.b.h());
          if (this.b.i() == null) {
             Object[] objArray = new Object[0];
             a.D().t("VideoQualityObserveHandler", "startTask: videoProject is null", objArray);
             VideoQualityObserveHandler.b(this.b, 0, 1, null);
          }else {
             a.o(p0, "response");
             this.b.k(p0, videoEvaluat);
          }
       }
       return;
    }
}
