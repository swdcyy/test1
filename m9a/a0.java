package m9a.a0;
import erd.o;
import java.lang.String;
import java.lang.Object;
import ak5.j;
import java.util.List;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.util.Iterator;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.CDNUrl;

public final class a0 implements o	// class@002f70
{
    public final String b;

    public void a0(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       a0 tb = this.b;
       p0 = j.o().n(1);
       if (p0.size() > 0) {
          p0 = p0.get(0).mEmotions.iterator();
          while (true) {
             if (p0.hasNext()) {
                EmotionInfo uEmotionInfo = p0.next();
                if (tb.equals(uEmotionInfo.mId) && !q.f(uEmotionInfo.mEmotionImageBigUrl)) {
                   p0 = uEmotionInfo.mEmotionImageBigUrl.get(0).getUrl();
                   break ;
                }
             }
          }
          return p0;
       }
       p0 = null;
       goto label_004a ;
    }
}
