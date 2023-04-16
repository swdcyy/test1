package com.kwai.video.player.misc.KsMediaFormat$Formatter;
import java.lang.Object;
import com.kwai.video.player.misc.KsMediaFormat$1;
import com.kwai.video.player.misc.KsMediaFormat;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;

public abstract class KsMediaFormat$Formatter	// class@000b91
{

    public void KsMediaFormat$Formatter(){
       super();
    }
    public void KsMediaFormat$Formatter(KsMediaFormat$1 p0){
       super();
    }
    public abstract String doFormat(KsMediaFormat p0);
    public String format(KsMediaFormat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaFormat$Formatter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = this.doFormat(p0);
       if (TextUtils.isEmpty(str)) {
          str = this.getDefaultString();
       }
       return str;
    }
    public String getDefaultString(){
       return "N/A";
    }
}
