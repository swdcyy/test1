package com.kwai.video.player.misc.KsMediaFormat;
import com.kwai.video.player.misc.IMediaFormat;
import java.util.HashMap;
import com.kwai.video.player.KsMediaMeta$KSYStreamMeta;
import java.lang.Object;
import com.kwai.video.player.misc.KsMediaFormat$1;
import java.util.Map;
import com.kwai.video.player.misc.KsMediaFormat$2;
import com.kwai.video.player.misc.KsMediaFormat$3;
import com.kwai.video.player.misc.KsMediaFormat$4;
import com.kwai.video.player.misc.KsMediaFormat$5;
import com.kwai.video.player.misc.KsMediaFormat$6;
import com.kwai.video.player.misc.KsMediaFormat$7;
import com.kwai.video.player.misc.KsMediaFormat$8;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.player.misc.KsMediaFormat$Formatter;

public class KsMediaFormat implements IMediaFormat	// class@000b92
{
    public final KsMediaMeta$KSYStreamMeta mMediaFormat;
    public static final Map sFormatterMap;

    static {
       KsMediaFormat.sFormatterMap = new HashMap();
    }
    public void KsMediaFormat(KsMediaMeta$KSYStreamMeta p0){
       super();
       Map sFormatterMa = KsMediaFormat.sFormatterMap;
       sFormatterMa.put("ks-codec-long-name-ui", new KsMediaFormat$1(this));
       sFormatterMa.put("ks-bit-rate-ui", new KsMediaFormat$2(this));
       sFormatterMa.put("ks-profile-level-ui", new KsMediaFormat$3(this));
       sFormatterMa.put("ks-pixel-format-ui", new KsMediaFormat$4(this));
       sFormatterMa.put("ks-resolution-ui", new KsMediaFormat$5(this));
       sFormatterMa.put("ks-frame-rate-ui", new KsMediaFormat$6(this));
       sFormatterMa.put("ks-sample-rate-ui", new KsMediaFormat$7(this));
       sFormatterMa.put("ks-channel-ui", new KsMediaFormat$8(this));
       this.mMediaFormat = p0;
    }
    public int getInteger(String p0){
       KsMediaFormat obj = PatchProxy.applyOneRefs(p0, this, KsMediaFormat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mMediaFormat;
       if (obj == null) {
          return 0;
       }
       return obj.getInt(p0);
    }
    public String getString(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, KsMediaFormat.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mMediaFormat == null) {
          return null;
       }
       obj = KsMediaFormat.sFormatterMap;
       if (obj.containsKey(p0)) {
          return obj.get(p0).format(this);
       }
       return this.mMediaFormat.getString(p0);
    }
}
