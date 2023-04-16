package dlc.x0$a;
import df5.b;
import dlc.x0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import sy6.a;
import com.yxcorp.gifshow.entity.TrendingInfo;
import tkc.f;
import im8.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.trending.inject.event.OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.trending.inject.event.OnPlayTrendingInfoChangeEvent;
import brd.y;
import xkc.b;
import io.reactivex.subjects.PublishSubject;

public class x0$a implements b	// class@002279
{
    public final x0 a;

    public void x0$a(x0 p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
    }
    public void b(QPhoto p0){
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction sLIDE_UP;
       if (PatchProxy.applyVoidOneRefs(p0, this, x0$a.class, "1")) {
          return;
       }
       x0$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, x0.class, "2")) {
          x0 p = ta.p;
          int i = p.q(p.M(p0));
          String photoId = p0.getPhotoId();
          TrendingInfo trendingInfo = ta.s.O(i);
          String str = "";
          String wrapperId = (trendingInfo != null)? trendingInfo.getWrapperId(): str;
          if (ta.t.get() != null) {
             str = ta.t.get().getWrapperId();
          }
          if (TextUtils.x(str) || !str.equals(wrapperId)) {
             x0 w = ta.w;
             int b = true;
             if ((i - w) == b) {
                sLIDE_UP = OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.SLIDE_UP;
             }else if((w - i) == b){
                sLIDE_UP = OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.SLIDE_DOWN;
             }else {
                sLIDE_UP = OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.JUMP_TO_NEXT;
             }
             if (sLIDE_UP != null) {
                List list = ta.s.p2();
                if (!q.f(list)) {
                   b = 0;
                   while (b < list.size()) {
                      TrendingInfo trendingInfo1 = list.get(b);
                      if ((trendingInfo1.getWrapperId()).equals(wrapperId)) {
                         ta.t.set(trendingInfo1);
                         ta.r.onNext(new OnPlayTrendingInfoChangeEvent(trendingInfo1, sLIDE_UP, photoId));
                         break ;
                      }
                      b = b + 1;
                   }
                }
             }
          }
          ta.w = i;
          ta.u.onNext(new b(ta.s.y2(p0), ta.s.x2(p0)));
       }
       return;
    }
    public void c(QPhoto p0){
    }
}
