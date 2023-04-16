package eub.o;
import java.lang.Object;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import java.io.File;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import zxa.a;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import android.content.Context;
import lnc.a1;
import wba.d0;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequestBuilder;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequest;
import com.kwai.video.editorsdk2.ThumbnailGeneratorResult;
import android.graphics.Bitmap;
import qkd.b;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class o	// class@002830
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public final String a(b$a p0,File p1,double p2){
       String obj1;
       Object obj = p1;
       double d = p2;
       if (PatchProxy.isSupport(o.class)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Double.valueOf(p2), this, o.class, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = "result";
       a.p(p0, obj1);
       a.p(obj, "outputDirectory");
       Object[] objArray = new Object[0];
       p3.D().w("EditPageNoUiPublishUtils", "generateCover outputDirectory:"+obj+", coverTime:"+d, objArray);
       EditorSdk2V2$VideoEditorProject project = p0.getProject();
       if (project != null) {
          a.o(project, "result.getProject\(\) ?: return \"\"");
          new a().a(p0.d(), p0.a());
          ThumbnailGenerator thumbnailGen = new ThumbnailGenerator(a1.c(), 0x3ff0000000000000, d0.l(project), d0.j(project), 0x989680);
          d0.w(v3, p0.getProject(), 0);
          ThumbnailGeneratorResult thumbnailSyn = v3.getThumbnailSync(v3.newRequestBuilder().setUseMetadataRetriever(true).setPositionByPlaybackPositionSec(d).build());
          a.o(thumbnailSyn, obj1);
          Bitmap thumbnailBit = thumbnailSyn.getThumbnailBitmap();
          v3.release();
          if (thumbnailBit != null) {
             File uFile = b.X(obj, ".jpg");
             a.o(uFile, "FileUtils.newFile\(outputDirectory, \".jpg\"\)");
             BitmapUtil.M(thumbnailBit, uFile.getAbsolutePath(), GSConfig.b());
             obj1 = uFile.getAbsolutePath();
             a.o(obj1, "coverFile.absolutePath");
             return obj1;
          }else {
             Object[] objArray1 = new Object[0];
             p3.D().w("EditPageNoUiPublishUtils", "generateCover bitmap is null", objArray1);
          }
       }
       return "";
    }
}
