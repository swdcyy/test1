package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$h;
import erd.o;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import android.media.MediaMetadataRetriever;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import gp.a;
import q87.c;

public final class SwapMagicAlbumActivity$h implements o	// class@001c20
{
    public final SwapMagicAlbumActivity b;

    public void SwapMagicAlbumActivity$h(SwapMagicAlbumActivity p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       int i;
       SwapMagicAlbumActivity$h obj = PatchProxy.applyOneRefs(p0, this, SwapMagicAlbumActivity$h.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj;
       }else {
          obj = this.b;
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(p0, obj, SwapMagicAlbumActivity.class, "9") && p0 != null) {
             MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
             mediaMetadat.setDataSource(p0.path);
             String str = mediaMetadat.extractMetadata(18);
             a.m(str);
             a.o(str, "retriever.extractMetadat¡­TADATA_KEY_VIDEO_WIDTH\)!!");
             int i1 = Integer.parseInt(str);
             String str1 = mediaMetadat.extractMetadata(19);
             a.m(str1);
             a.o(str1, "retriever.extractMetadat¡­ADATA_KEY_VIDEO_HEIGHT\)!!");
             int i2 = Integer.parseInt(str1);
             String str2 = mediaMetadat.extractMetadata(24);
             a.m(str2);
             a.o(str2, "retriever.extractMetadat¡­ATA_KEY_VIDEO_ROTATION\)!!");
             int i3 = Integer.parseInt(str2);
             if (i3 == 90 || i3 == 270) {
                Object[] objArray = new Object[0];
                a.C().s("SwapMagicAlbumActivity", "getVideoSize swap width&height", objArray);
                i2 = i1;
                i1 = i2;
             }
             p0.mWidth = i1;
             p0.mHeight = i2;
          }
       }
       return i;
    }
}
