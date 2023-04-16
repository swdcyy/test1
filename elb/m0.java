package elb.m0;
import erd.g;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$VideoEvaluateTaskOptions;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.encode.v0;
import xvc.f;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;
import qba.d;
import com.yxcorp.gifshow.activity.preview.f;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import gq.a;
import w46.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler;

public final class m0 implements g	// class@002758
{
    public final VideoQualityObserveHandler b;
    public final EditorSdk2$ExportOptions c;

    public void m0(VideoQualityObserveHandler p0,EditorSdk2$ExportOptions p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "1")) {
       }else {
          Object[] first = p0.getFirst();
          a.o(first, "pair.first");
          p0 = p0.getSecond();
          a.o(p0, "pair.second");
          EditorSdk2$VideoEvaluateTaskOptions videoEvaluat = new EditorSdk2$VideoEvaluateTaskOptions();
          videoEvaluat.setTaskType(this.b.h());
          m0 tc = this.c;
          if (tc != null) {
             videoEvaluat.setExportOptions(tc);
          }
          if (this.b.j() == -1) {
             this.b.j = first.a(p0.a1(), p0.T0());
          }
          c[] uocArray = new c[]{p0};
          f uof = new f(CollectionsKt__CollectionsKt.r(uocArray));
          uof.k(p0);
          d uod = f.i(0, 0);
          String str = "PreviewEncodeUtil.getWor¡­oaderConfig\(false, false\)";
          a.o(uod, str);
          uof.f(p0, uod, null);
          uod = f.i(0, 0);
          a.o(uod, str);
          p0 = uof.i(p0, uod);
          this.b.l = p0.getProject();
          if (this.b.i() == null) {
             first = new Object[0];
             a.D().t("VideoQualityObserveHandler", "startTask: videoProject is null", first);
             VideoQualityObserveHandler.b(this.b, 0, 1, null);
          }else {
             p0 = a.a();
             a.o(p0, "AppEnv.get\(\)");
             if (!ClipVideoQualityEvaluateTaskHandler.shouldRunVideoQualityEvaluateTask(p0.a(), this.b.i(), this.b.j(), videoEvaluat)) {
                first = new Object[0];
                a.D().t("VideoQualityObserveHandler", "startTask: videoProject can\'t make task", first);
                VideoQualityObserveHandler.b(this.b, 0, 1, null);
             }else {
                this.b.k(first, videoEvaluat);
             }
          }
       }
       return;
    }
}
