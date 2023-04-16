package com.kwai.video.player.misc.KsMediaFormat$8;
import com.kwai.video.player.misc.KsMediaFormat$Formatter;
import com.kwai.video.player.misc.KsMediaFormat;
import com.kwai.video.player.misc.KsMediaFormat$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import java.lang.Integer;

public class KsMediaFormat$8 extends KsMediaFormat$Formatter	// class@000b90
{
    public final KsMediaFormat this$0;

    public void KsMediaFormat$8(KsMediaFormat p0){
       this.this$0 = p0;
       super(null);
    }
    public String doFormat(KsMediaFormat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaFormat$8.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int integer = p0.getInteger("channel_layout");
       if (integer <= 0) {
          return null;
       }
       long l = (long)integer;
       if (!l - 4) {
          return "mono";
       }
       if (!l - 3) {
          return "stereo";
       }
       Object[] objArray = new Object[]{Integer.valueOf(integer)};
       return String.format(Locale.US, "%x", objArray);
    }
}
