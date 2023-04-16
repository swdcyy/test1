package mg.k$o;
import erd.o;
import com.kwai.feature.post.api.feature.bridge.JsGetEditSmartAlbumDataParams;
import java.lang.Object;
import z26.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;

public final class k$o implements o	// class@002627
{
    public final JsGetEditSmartAlbumDataParams b;

    public void k$o(JsGetEditSmartAlbumDataParams p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       k$o tb = this.b;
       JsGetEditSmartAlbumDataParams mMaxCoverWid = tb.mMaxCoverWidth;
       if (mMaxCoverWid > null) {
       }else {
          mMaxCoverWid = 500;
       }
       return p0.Rd(tb.mCount, tb.mPeriod, mMaxCoverWid);
    }
}
