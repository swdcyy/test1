package androidx.media.MediaBrowserServiceCompat$e;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class MediaBrowserServiceCompat$e	// class@000837
{
    public final String a;
    public final Bundle b;
    public static final String c = "android.service.media.extra.SUGGESTION_KEYWORDS";

    public void MediaBrowserServiceCompat$e(String p0,Bundle p1){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
       }
       this.a = p0;
       this.b = p1;
       return;
    }
    public Bundle a(){
       return this.b;
    }
    public String b(){
       return this.a;
    }
}
