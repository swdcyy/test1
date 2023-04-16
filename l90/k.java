package l90.k;
import erd.o;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import lnc.g7;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import kotlin.Pair;
import java.lang.Integer;
import brd.t;
import com.kuaishou.gifshow.kuaishan.logic.h1;

public final class k implements o	// class@002537
{
    public final String b;
    public final String c;

    public void k(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       k tc = this.c;
       p0 = (g7.b(p0))? t.just(new Pair(Integer.valueOf(100), new o1(p0, KSDownloadHelperX.n(p0)))): h1.c(tb, tc);
       return p0;
    }
}
