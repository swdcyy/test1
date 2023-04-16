package nfd.u2$a;
import ok.x;
import e7d.h;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import e7d.a;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import java.util.Objects;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import org.json.JSONException;

public class u2$a implements x	// class@001e12
{
    public final WeakReference b;

    public void u2$a(h p0){
       super();
       this.b = new WeakReference(p0);
    }
    public Object get(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       JSONObject jSONObject = PatchProxy.apply(objArray, this, u2$a.class, "1");
       if (jSONObject != patchProxyRe) {
       }else {
          try{
             jSONObject = new JSONObject();
             if (this.b.get() != null) {
                jSONObject.put("search_session_id", this.b.get().k());
                jSONObject.put("keyword", this.b.get().f().mMajorKeyword);
                jSONObject.put("query_id", this.b.get().i());
                h oh = this.b.get();
                Objects.requireNonNull(oh);
                String str = PatchProxy.apply(objArray, oh, h.class, "16");
                if (str != patchProxyRe) {
                }else {
                   a b = oh.b;
                   str = (b instanceof SearchResultFragment)? b.getBizType(): "";
                }
                jSONObject.put("tab_name", str);
             }
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
          }
       }
    }
}
