package boc.s;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse;
import java.lang.Object;
import boc.k;
import doc.a;
import java.util.List;
import com.yxcorp.gifshow.util.resource.p;
import java.util.ArrayList;
import java.util.Iterator;
import boc.b;
import java.lang.String;
import java.util.Set;
import qfc.a;
import java.lang.StringBuilder;
import q87.c;

public final class s implements Runnable	// class@00044e
{
    public final YlabModelConfigResponse b;

    public void s(YlabModelConfigResponse p0){
       this.b = p0;
    }
    public final void run(){
       s tb = this.b;
       if (tb != null) {
          Iterator iterator = p.e(tb).iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             k.a.add(uob.getResourceDir());
             Object[] objArray = new Object[0];
             a.C().w("ResourceCacheUtils", "add unSupportCleanModel : "+uob.getResourceName(), objArray);
          }
       }
       return;
    }
}
