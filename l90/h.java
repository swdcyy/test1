package l90.h;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import qkd.b;
import mca.a;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import u80.e;
import java.lang.StringBuilder;
import w46.b;
import brd.g;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;

public final class h implements g	// class@002534
{
    public final String b;
    public final String c;

    public void h(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       h tb = this.b;
       h tc = this.c;
       KSTemplateDetailInfo obj = null;
       Object[] obj1 = PatchProxy.applyTwoRefs(tb, tc, obj, h1.class, "26");
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else {
          int i = 0;
          if (TextUtils.x(tb) || !b.R(new File(tb))) {
             obj1 = new Object[i];
             e.D().t("KuaiShanAPI", "templatePath is not valid:"+tb, obj1);
          }else {
             a.u();
             EditorSdk2MvCreationResult uEditorSdk2M = ClipMvUtils.createProjectWithTemplate(tb, i, i, obj, i);
             if (uEditorSdk2M == null || uEditorSdk2M.getProject() == null) {
                i1.c(new RuntimeException("parseLocalTemplate failed: loadSdkProject returns null"));
             }else {
                obj = new KSTemplateDetailInfo();
                obj.mTemplateId = (TextUtils.x(tc))? "0": tc;
                obj.mName = "Album2022";
                o1 oo1 = new o1(obj, tb);
                oo1.G0(uEditorSdk2M);
                obj = oo1;
             }
          }
       }
       if (obj != null) {
          p0.onNext(obj);
          p0.onComplete();
       }else {
          p0.onError(new KSException(-11, ""));
       }
       return;
    }
}
