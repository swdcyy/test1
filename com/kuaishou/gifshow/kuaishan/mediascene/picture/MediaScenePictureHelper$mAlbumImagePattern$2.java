package com.kuaishou.gifshow.kuaishan.mediascene.picture.MediaScenePictureHelper$mAlbumImagePattern$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.regex.Pattern;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MediaScenePictureHelper$mAlbumImagePattern$2 extends Lambda implements a	// class@001a89
{
    public static final MediaScenePictureHelper$mAlbumImagePattern$2 INSTANCE;

    static {
       MediaScenePictureHelper$mAlbumImagePattern$2.INSTANCE = new MediaScenePictureHelper$mAlbumImagePattern$2();
    }
    public void MediaScenePictureHelper$mAlbumImagePattern$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Pattern invoke(){
       Object obj = PatchProxy.apply(null, this, MediaScenePictureHelper$mAlbumImagePattern$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Pattern.compile(".*\\.\(gif\)$", 2);
    }
}
