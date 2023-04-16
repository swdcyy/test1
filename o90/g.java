package o90.g;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import java.util.List;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import kotlin.jvm.internal.a;
import java.lang.RuntimeException;

public final class g implements Runnable	// class@002771
{
    public final KuaiShanEditActivityV2 b;

    public void g(KuaiShanEditActivityV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "1")) {
          return;
       }
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, KuaiShanEditActivityV2.class, "12")) {
          String absolutePath = new File(PostUtils.f(), "media_scene_template").getAbsolutePath();
          if (b.S(new File(absolutePath))) {
             EditorSdk2MvCreationResult uEditorSdk2M = h1.m(absolutePath, false, null, true, null, false, null, 0);
             if (uEditorSdk2M != null) {
                KSTemplateDetailInfo kSTemplateDe = new KSTemplateDetailInfo();
                kSTemplateDe.mTemplateId = "0";
                kSTemplateDe.mName = "Test";
                o1 oo1 = new o1(kSTemplateDe, absolutePath);
                oo1.G0(uEditorSdk2M);
                m1 om1 = m1.w0();
                a.o(om1, "KuaiShanManager.getInstance\(\)");
                om1.y0(oo1);
                tb.K3(kSTemplateDe);
             }else {
                throw new RuntimeException("parseLocalTemplate failed: loadSdkProject returns null");
             }
          }else {
             throw new RuntimeException("parseLocalTemplate failed: template file did not found");
          }
       }
       return;
    }
}
