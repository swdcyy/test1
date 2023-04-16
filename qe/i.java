package qe.i;
import qe.a;
import java.lang.Object;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.Cookie;
import okhttp3.Headers$Builder;
import java.util.Collections;

public class i implements a	// class@0029cd
{
    public CookieJar a;

    public void i(){
       super();
       this.a = null;
    }
    public void a(CookieJar p0){
       this.a = p0;
    }
    public void b(){
       this.a = null;
    }
    public List loadForRequest(HttpUrl p0){
       i obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          return Collections.emptyList();
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = obj.loadForRequest(p0).iterator();
       while (iterator.hasNext()) {
          Cookie uCookie = iterator.next();
          try{
             new Headers$Builder().add(uCookie.name(), uCookie.value());
             uArrayList.add(uCookie);
          }catch(java.lang.IllegalArgumentException e0){
             goto label_0020 ;
          }
       }
       return uArrayList;
    }
    public void saveFromResponse(HttpUrl p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "1")) {
          return;
       }
       i ta = this.a;
       if (ta != null) {
          ta.saveFromResponse(p0, p1);
       }
       return;
    }
}
