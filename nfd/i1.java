package nfd.i1;
import erd.o;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import nfd.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import android.text.TextUtils;
import brd.t;

public final class i1 implements o	// class@001db8
{
    public final List b;

    public void i1(List p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       i1 tb = this.b;
       CDNUrl uCDNUrl = null;
       ArrayList uArrayList = PatchProxy.applyTwoRefs(p0, tb, uCDNUrl, k1.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList(tb);
          Iterator iterator = uArrayList.iterator();
          while (true) {
             if (iterator.hasNext()) {
                uCDNUrl = iterator.next();
                if (TextUtils.equals(uCDNUrl.getUrl(), p0)) {
                   iterator.remove();
                }
             }
             if (uCDNUrl != null) {
                uArrayList.add(0, uCDNUrl);
                break ;
             }
          }
       }
       return t.just(uArrayList);
    }
}
