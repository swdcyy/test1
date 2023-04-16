package com.kuaishou.post.story.publish.i;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.io.File;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.VideoEditorSession;
import o56.c;
import o56.a;
import android.app.Application;
import wba.d0;
import android.content.Context;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequestBuilder;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequest;
import com.kwai.video.editorsdk2.ThumbnailGeneratorResult;
import android.graphics.Bitmap;
import qkd.b;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class i	// class@000b87
{

    public void i(){
       super();
    }
    public static String a(EditorSdk2V2$VideoEditorProject p0,File p1){
       VideoEditorSession obj = PatchProxy.applyTwoRefs(p0, p1, null, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new VideoEditorSession();
       ThumbnailGenerator thumbnailGen = obj.createThumbnailGenerator(a.a().a(), 0x3ff0000000000000, d0.l(p0), d0.j(p0), 0x989680);
       d0.w(thumbnailGen, p0, false);
       Bitmap thumbnailBit = thumbnailGen.getThumbnailSync(thumbnailGen.newRequestBuilder().setUseMetadataRetriever(true).setPositionByPositionIndex(false).build()).getThumbnailBitmap();
       thumbnailGen.release();
       obj.release();
       if (thumbnailBit == null) {
          return "";
       }
       p1 = b.X(p1, ".jpg");
       BitmapUtil.M(thumbnailBit, p1.getAbsolutePath(), 85);
       return p1.getAbsolutePath();
    }
}
