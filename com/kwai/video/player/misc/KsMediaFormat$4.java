package com.kwai.video.player.misc.KsMediaFormat$4;
import com.kwai.video.player.misc.KsMediaFormat$Formatter;
import com.kwai.video.player.misc.KsMediaFormat;
import com.kwai.video.player.misc.KsMediaFormat$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class KsMediaFormat$4 extends KsMediaFormat$Formatter	// class@000b8c
{
    public final KsMediaFormat this$0;

    public void KsMediaFormat$4(KsMediaFormat p0){
       this.this$0 = p0;
       super(null);
    }
    public String doFormat(KsMediaFormat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaFormat$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getString("codec_pixel_format");
    }
}
