package ak8.d;
import ak8.a;
import com.oceanlong.home_perf.cache.MerchantHomeCacheManager;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.util.Objects;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import java.util.List;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import java.util.Map;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentHierarchyInfo;

public final class d implements a	// class@0000a1
{
    public final MerchantHomeCacheManager a;
    public final String b;

    public void d(MerchantHomeCacheManager p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public PageComponentResponse a(PageComponentResponse p0){
       d ta = this.a;
       d tb = this.b;
       Objects.requireNonNull(ta);
       int i = 0x5f2ddeb4;
       try{
          int i1 = 0;
          List list = ta.c(b.a(i).g(tb, PageComponentResponse.class), true);
          if (list != null) {
             list = ta.a(ta.i(list, ta.c(p0, false)));
             PageComponentResponse data = p0.data;
             data.component = ta.b(data.component, list);
             data = p0.data;
             data.data = ta.d(data.data, list);
             data = p0.data;
             data.hierarchy = ta.e(data.hierarchy, list);
          }
          if (!ta.h(p0)) {
             p0 = i1;
          }
          PageComponentResponse pageComponen = p0;
          return i1;
       }catch(java.lang.Exception e0){
       }
    }
}
