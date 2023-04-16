package h99.g;
import im8.b;
import java.lang.Object;
import h99.f;
import java.lang.String;
import im8.e;
import com.kwai.framework.model.channel.HotChannel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.IllegalArgumentException;
import im8.f;
import java.lang.Class;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Set;
import java.util.HashSet;

public final class g implements b	// class@002573
{
    public Set a;
    public Set b;

    public void g(){
       super();
    }
    public void a(Object p0,Object p1){
       String str = "feed_channel";
       if (e.e(p1, str)) {
          p0.e = e.c(p1, str);
       }
       str = "DETAIL_FRAGMENT";
       if (e.e(p1, str)) {
          BaseFragment uBaseFragmen = e.c(p1, str);
          if (uBaseFragmen != null) {
             p0.f = uBaseFragmen;
          }else {
             throw new IllegalArgumentException("mFragment 不能为空");
          }
       }
       str = "LOG_LISTENER";
       if (e.e(p1, str)) {
          p0.d = e.f(p1, str, f.class);
       }
       if (e.d(p1, PhotoDetailParam.class)) {
          p1 = e.b(p1, PhotoDetailParam.class);
          if (p1 != null) {
             p0.c = p1;
          }else {
             throw new IllegalArgumentException("mParam 不能为空");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          HashSet hashSet = new HashSet();
          this.a = hashSet;
          hashSet.add("DETAIL_FRAGMENT");
          this.a.add("LOG_LISTENER");
       }
       return this.a;
    }
    public void c(Object p0){
       p0.e = null;
       p0.f = null;
       p0.d = null;
       p0.c = null;
    }
    public final Set d(){
       if (this.b == null) {
          HashSet hashSet = new HashSet();
          this.b = hashSet;
          hashSet.add(PhotoDetailParam.class);
       }
       return this.b;
    }
}
