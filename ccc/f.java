package ccc.f;
import java.lang.Object;
import mrd.a;
import xl8.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.relation.user.model.UserListParam;
import y8c.t;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;

public class f	// class@000573
{
    public c a;
    public c b;
    public c c;
    public c d;
    public c e;
    public c f;
    public b g;
    public b h;

    public void f(){
       super();
       this.a = a.g();
       this.b = a.g();
       this.c = a.g();
       this.d = a.g();
       this.e = a.g();
       this.f = a.g();
       this.g = new b("");
       this.h = new b(Boolean.FALSE);
    }
    public Map a(RecyclerFragment p0,UserListParam p1,t p2){
       HashMap obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("FRAGMENT", p0);
       obj.put("userListParam", p1);
       obj.put("favoriteEditObservable", this.a);
       obj.put("searchObservable", this.b);
       obj.put("closeSearch", this.c);
       obj.put("setKeyword", this.d);
       obj.put("setFriendSelected", this.e);
       obj.put("friendSelected", this.f);
       obj.put("keyword", this.g);
       obj.put("keywordHistory", this.h);
       if (p2 != null) {
          obj.put("tipsHelper", p2);
       }
       return obj;
    }
}
