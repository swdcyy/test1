package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import w46.b;

public final class LyricAEResourceDownloader$c implements g	// class@00109f
{
    public static final LyricAEResourceDownloader$c b;

    static {
       LyricAEResourceDownloader$c.b = new LyricAEResourceDownloader$c();
    }
    public void LyricAEResourceDownloader$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LyricAEResourceDownloader$c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().t("LyricAEResourceDownloader", "download fail exception: "+p0.getMessage(), objArray);
       }
       return;
    }
}
