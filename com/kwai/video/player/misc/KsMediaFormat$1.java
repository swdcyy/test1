package com.kwai.video.player.misc.KsMediaFormat$1;
import com.kwai.video.player.misc.KsMediaFormat$Formatter;
import com.kwai.video.player.misc.KsMediaFormat;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.KsMediaMeta$KSYStreamMeta;

public class KsMediaFormat$1 extends KsMediaFormat$Formatter	// class@000b89
{
    public final KsMediaFormat this$0;

    public void KsMediaFormat$1(KsMediaFormat p0){
       this.this$0 = p0;
       super(null);
    }
    public String doFormat(KsMediaFormat p0){
       p0 = PatchProxy.applyOneRefs(p0, this, KsMediaFormat$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.this$0.mMediaFormat.getString("codec_long_name");
    }
}
