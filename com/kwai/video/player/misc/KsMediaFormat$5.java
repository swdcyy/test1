package com.kwai.video.player.misc.KsMediaFormat$5;
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

public class KsMediaFormat$5 extends KsMediaFormat$Formatter	// class@000b8d
{
    public final KsMediaFormat this$0;

    public void KsMediaFormat$5(KsMediaFormat p0){
       this.this$0 = p0;
       super(null);
    }
    public String doFormat(KsMediaFormat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaFormat$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int integer = p0.getInteger("width");
       int integer1 = p0.getInteger("height");
       int integer2 = p0.getInteger("sar_num");
       int integer3 = p0.getInteger("sar_den");
       if (integer <= 0 || integer1 <= 0) {
          return null;
       }
       if (integer2 <= 0 || integer3 <= 0) {
          Object[] objArray = new Object[]{Integer.valueOf(integer),Integer.valueOf(integer1)};
          return String.format(Locale.US, "%d x %d", objArray);
       }else {
          Object[] objArray1 = new Object[]{Integer.valueOf(integer),Integer.valueOf(integer1),Integer.valueOf(integer2),Integer.valueOf(integer3)};
          return String.format(Locale.US, "%d x %d [SAR %d:%d]", objArray1);
       }
    }
}
