package com.kwai.video.player.misc.KsMediaFormat$6;
import com.kwai.video.player.misc.KsMediaFormat$Formatter;
import com.kwai.video.player.misc.KsMediaFormat;
import com.kwai.video.player.misc.KsMediaFormat$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class KsMediaFormat$6 extends KsMediaFormat$Formatter	// class@000b8e
{
    public final KsMediaFormat this$0;

    public void KsMediaFormat$6(KsMediaFormat p0){
       this.this$0 = p0;
       super(null);
    }
    public String doFormat(KsMediaFormat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaFormat$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int integer = p0.getInteger("fps_num");
       int integer1 = p0.getInteger("fps_den");
       if (integer <= 0 || integer1 <= 0) {
          return null;
       }
       return String.valueOf(((float)integer / (float)integer1));
    }
}
