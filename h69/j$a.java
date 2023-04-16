package h69.j$a;
import erd.o;
import java.util.List;
import java.lang.Object;
import pr3.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import pr3.d;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.QMedia;

public final class j$a implements o	// class@00255b
{
    public final List b;

    public void j$a(List p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       j$a uoa = PatchProxy.applyOneRefs(p0, this, j$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "resultList");
          if (p0.b()) {
             int i = 0;
             p0 = p0.f();
             a.o(p0, "resultList.allResult");
             p0 = p0.iterator();
             while (p0.hasNext()) {
                List list = p0.next();
                QMedia qMedia = this.b.get(i);
                QMedia mVideoFrameL = qMedia.mVideoFrameList;
                if (mVideoFrameL == null || mVideoFrameL.size() < list.size()) {
                   qMedia.mVideoFrameList = list;
                }
                i = i + 1;
             }
          }
          uoa = this.b;
       }
       return uoa;
    }
}
