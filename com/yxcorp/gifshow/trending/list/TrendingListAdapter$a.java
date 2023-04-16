package com.yxcorp.gifshow.trending.list.TrendingListAdapter$a;
import y8c.f$b;
import com.yxcorp.gifshow.trending.list.TrendingListAdapter;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.trending.list.e;
import java.util.Map;

public class TrendingListAdapter$a extends f$b	// class@001da9
{
    public PublishSubject h;
    public PublishSubject i;
    public PublishSubject j;
    public final TrendingListAdapter k;

    public void TrendingListAdapter$a(TrendingListAdapter p0,f$b p1,PublishSubject p2,PublishSubject p3,PublishSubject p4){
       this.k = p0;
       super(p1);
       this.h = p2;
       this.i = p3;
       this.j = p4;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TrendingListAdapter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, TrendingListAdapter$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(TrendingListAdapter$a.class, new e());
       }else {
          obj.put(TrendingListAdapter$a.class, null);
       }
       return obj;
    }
}
