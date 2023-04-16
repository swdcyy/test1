package nfd.d2;
import erd.g;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper;
import java.lang.Object;
import com.yxcorp.plugin.search.result.danmu.SearchLiveCommentBulletsResponse;
import java.lang.String;
import la6.a;
import java.util.Collection;
import ekd.q;

public final class d2 implements g	// class@001d9c
{
    public final SearchLiveDanmakuHelper b;

    public void d2(SearchLiveDanmakuHelper p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d2 tb = this.b;
       tb.m = false;
       tb.i = p0.mMinRequestIntervalMillis;
       tb.j = p0.mMaxContinuousRequestTimes;
       if (a.a(p0.getCursor())) {
          tb.k = p0.getCursor();
       }
       if (!q.f(p0.mComments)) {
          tb.n = 0;
       }else if(tb.r == null){
          tb.f();
       }
       return;
    }
}
