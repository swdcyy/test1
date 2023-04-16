package com.kwai.video.player.misc.KsMediaFormat$2;
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

public class KsMediaFormat$2 extends KsMediaFormat$Formatter	// class@000b8a
{
    public final KsMediaFormat this$0;

    public void KsMediaFormat$2(KsMediaFormat p0){
       this.this$0 = p0;
       super(null);
    }
    public String doFormat(KsMediaFormat p0){
       Object[] objArray;
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaFormat$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int integer = p0.getInteger("bitrate");
       if (integer <= 0) {
          return null;
       }
       int i = 1;
       Locale locale = 1000;
       if (integer < locale) {
          objArray = new Object[i];
          objArray[0] = Integer.valueOf(integer);
          return String.format(Locale.US, "%d bit/s", objArray);
       }else {
          objArray = new Object[i];
          objArray[0] = Integer.valueOf((integer / locale));
          return String.format(Locale.US, "%d kb/s", objArray);
       }
    }
}
