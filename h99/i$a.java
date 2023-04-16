package h99.i$a;
import oy5.b;
import h99.i;
import java.lang.Object;
import com.kwai.feature.component.entry.SearchEntryParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.feature.component.entry.a;
import com.yxcorp.gifshow.entity.QPhoto;
import oy5.i;
import oy5.e;

public class i$a implements b	// class@002575
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public SearchEntryParams a(int p0){
       i$a obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       SearchEntryParams searchEntryP = PatchProxy.apply(null, obj, i.class, "1");
       if (searchEntryP != patchProxyRe) {
       }else {
          searchEntryP = SearchEntryParams.Instance().entrySource(a.b("search_entrance_atlasDetail_button"));
          i d = obj.d;
          if (d != null) {
             searchEntryP.referVideoId(d.getPhotoId());
          }
       }
       return searchEntryP;
    }
    public i b(int p0,int p1){
       i$a obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       i oi = PatchProxy.apply(null, obj, i.class, "2");
       if (oi != patchProxyRe) {
       }else {
          oi = new i();
          oi.b = obj.c;
          oi.a = obj.d;
       }
       return oi;
    }
    public void c(e p0){
    }
}
