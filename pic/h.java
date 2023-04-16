package pic.h;
import pic.h$a;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.ImageObject;
import mhc.x;
import java.lang.String;
import java.io.File;

public interface abstract h	// class@003c50
{
    public static final h$a B0;

    static {
       h.B0 = h$a.b;
    }
    t B0(KwaiOperator p0);
    t H(WebpageObject p0,TextObject p1,ImageObject p2,KwaiOperator p3);
    x getForward();
    t i(KwaiOperator p0);
    WebpageObject i0(String p0,String p1,String p2,File p3);
    t l(KwaiOperator p0);
    TextObject r(String p0);
    t w(KwaiOperator p0);
}
