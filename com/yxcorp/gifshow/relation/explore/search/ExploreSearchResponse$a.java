package com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse$a;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.explore.search.g;
import java.util.Map;
import java.util.HashMap;

public class ExploreSearchResponse$a implements g	// class@001871
{
    public boolean b;
    public int mRank;
    public User mUser;

    public void ExploreSearchResponse$a(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExploreSearchResponse$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ExploreSearchResponse$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ExploreSearchResponse$a.class, new g());
       }else {
          obj.put(ExploreSearchResponse$a.class, null);
       }
       return obj;
    }
}
