package c03.f;
import erd.g;
import c03.k;
import sz2.a;
import java.lang.String;
import c03.l;
import java.lang.Object;
import com.kuaishou.live.basic.resourcemanager.LiveCommonResourceResult;
import java.util.Objects;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import sz2.g;
import c03.k$b;
import java.lang.StringBuilder;
import com.kuaishou.live.effect.resource.download.v2.Status;
import xz2.a;

public final class f implements g	// class@00048c
{
    public final k b;
    public final a c;
    public final String d;
    public final l e;
    public final int f;

    public void f(k p0,a p1,String p2,l p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       f tf = this.f;
       Objects.requireNonNull(tb);
       List list = tc.a();
       b.T(tb.a, "[download] ", "liveCommonResourceResult", p0, "downloadList", list);
       LiveCommonResourceResult mResMap = p0.mResMap;
       ArrayList uArrayList = new ArrayList();
       if (mResMap != null) {
          tc.b(mResMap);
          uArrayList.addAll(mResMap.keySet());
       }
       String str = g.b(tc.a());
       k$b uob = tb.b.get(td);
       if (uob == null) {
          b.r(tb.a, "[download], downloadStatus = null£¬dependKey = "+td);
       }else if(p0.mIsAllSuccess == null){
          uob.b(str, Status.DOWNLOAD_FAIL);
       }else {
          uob.b(str, Status.DOWNLOAD_SUCCESS);
       }
       tb.a(uob, te, tf);
       list.removeAll(uArrayList);
       a.a(td, p0.mIsAllSuccess, uArrayList, list, tf, 0);
       return;
    }
}
