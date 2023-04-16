package bb2.b;
import ok.o;
import java.util.Set;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import kp.r1;
import com.yxcorp.utility.TextUtils;

public final class b implements o	// class@0003c3
{
    public final Set b;
    public final QPhoto c;

    public void b(Set p0,QPhoto p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       boolean b;
       b tc = this.c;
       Iterator iterator = this.b.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (!uEntry.getValue().booleanValue() && (p0 == null || (!TextUtils.n(uEntry.getKey(), r1.U1(p0.mEntity)) || (tc != null && (tc.getPhotoId()).equals(p0.getPhotoId()))))) {
                continue ;
             }else {
                b = true;
                break ;
             }
          }else {
             b = false;
             break ;
          }
       }
       return b;
    }
}
