package com.kwai.video.player.misc.KsMediaFormat$3;
import com.kwai.video.player.misc.KsMediaFormat$Formatter;
import com.kwai.video.player.misc.KsMediaFormat;
import com.kwai.video.player.misc.KsMediaFormat$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class KsMediaFormat$3 extends KsMediaFormat$Formatter	// class@000b8b
{
    public final KsMediaFormat this$0;

    public void KsMediaFormat$3(KsMediaFormat p0){
       this.this$0 = p0;
       super(null);
    }
    public String doFormat(KsMediaFormat p0){
       String obj = PatchProxy.applyOneRefs(p0, this, KsMediaFormat$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getString("codec_profile");
       if (TextUtils.isEmpty(obj)) {
          return null;
       }
       StringBuilder str = obj;
       obj = p0.getString("codec_name");
       if (!TextUtils.isEmpty(obj) && obj.equalsIgnoreCase("h264")) {
          int integer = p0.getInteger("codec_level");
          int i = 10;
          if (integer < i) {
             return str;
          }else {
             str = str+" Profile Level "+((integer / 10) % i);
             integer = integer % i;
             if (integer) {
                str = str+"."+integer;
             }
          }
       }
       return str;
    }
}
