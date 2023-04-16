package com.yxcorp.gifshow.relation.explore.search.ExploreSearchFragment$b;
import s2b.a;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.search.a;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.log.model.CommonParams;
import android.view.View;
import k2b.u1;

public class ExploreSearchFragment$b implements a	// class@00186f
{
    public final ExploreSearchFragment a;

    public void ExploreSearchFragment$b(ExploreSearchFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreSearchFragment$b.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "3")) {
          for (int i = 0; i < p0.size(); i = i + 1) {
             ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
             uAreaPackage.name = "SEARCH_RESULT";
             uAreaPackage.params = a.a;
             u1.E0("", null, 3, a.a(p0.get(i), "USER_CARD"), uAreaPackage, null, null, null, false, null);
          }
       }
       return;
    }
    public boolean b(Object p0){
       if (p0.b == null) {
          p0.b = true;
       }else {
          boolean b = false;
       }
       return true;
    }
}
