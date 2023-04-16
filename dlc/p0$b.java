package dlc.p0$b;
import qvb.q;
import dlc.p0;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.TrendingInfo;
import kotlin.jvm.internal.a;
import xkc.a;
import tkc.i;
import io.reactivex.subjects.PublishSubject;

public final class p0$b implements q	// class@002262
{
    public final p0 b;

    public void p0$b(p0 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       p0$b uob = p0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       p.b(this, p0, p1);
       p0$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, p0.class, "5")) {
          p0 s = tb.s;
          if (s != null) {
             List items = s.getItems();
             if (items != null) {
                Iterator iterator = items.iterator();
                while (iterator.hasNext()) {
                   TrendingInfo trendingInfo = iterator.next();
                   if (trendingInfo != null && !trendingInfo.isTopicTrending()) {
                      s = tb.r;
                      if (s == null) {
                         a.S("mOnTrendingInfoItemClickPublishSubject");
                      }
                      s.onNext(new a(trendingInfo, tb.s));
                      break ;
                   }
                }
             }
          }
       }
       return;
    }
}
