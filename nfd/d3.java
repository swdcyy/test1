package nfd.d3;
import nfd.b0;
import android.app.Activity;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import nfd.i3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMeta;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import com.yxcorp.plugin.search.SearchPage;
import nfd.l0;
import w7d.i;
import x6d.e;
import com.yxcorp.plugin.search.b;

public class d3 implements b0	// class@001d9d
{
    public final Activity a;
    public final SearchItem b;

    public void d3(Activity p0,SearchItem p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i3 oi3 = i3.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, d3.class, str)) {
          return;
       }
       d3 tb = this.b;
       Object obj = PatchProxy.applyOneRefs(tb, objArray, oi3, str);
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(tb != null){
          SearchItem mTemplateMet1 = tb.mTemplateMeta;
          if (mTemplateMet1 != null && !TextUtils.isEmpty(mTemplateMet1.mSlideLinkUrl)) {
             Uri uri = Uri.parse(tb.mTemplateMeta.mSlideLinkUrl);
             if (i3.a(uri)) {
                b = ("gotab").equals(uri.getHost());
             }
          }
       }
       b = false;
       if (b) {
          tb = this.b;
          Object obj1 = PatchProxy.applyOneRefs(tb, objArray, oi3, "4");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else if(tb != null){
             SearchItem mTemplateMet = tb.mTemplateMeta;
             if (mTemplateMet != null && !TextUtils.isEmpty(mTemplateMet.mSlideLinkUrl)) {
                objArray = l0.a(tb.mTemplateMeta.mSlideLinkUrl);
             }
          }
          i.c(objArray, this.a);
       }else {
          i.c(SearchPage.LIVE, this.a);
       }
       return;
    }
    public boolean isEnable(){
       d3 obj = PatchProxy.apply(null, this, d3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj instanceof e) {
          b uob = obj.C();
          if (uob != null && uob.t != null) {
             return false;
          }
       }
       return true;
    }
}
