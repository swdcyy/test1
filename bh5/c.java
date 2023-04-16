package bh5.c;
import java.lang.String;
import com.kwai.framework.abtest.f;
import com.kwai.sdk.switchconfig.a;

public final class c	// class@0004a5
{
    public static final boolean a;
    public static final boolean b;

    static {
       c.a = f.a("enableCommentPanelHigh");
       c.b = a.t().d("enableCommentPanelMutiTabCacheOpt", false);
    }
    public static boolean a(){
       return c.a;
    }
}
