package com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$c;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.select.l;
import java.util.Map;
import java.util.HashMap;

public class SelectUsersTabHostFragment$c implements g	// class@00198a
{
    public PublishSubject b;
    public PublishSubject c;

    public void SelectUsersTabHostFragment$c(){
       super();
       this.b = PublishSubject.g();
       this.c = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectUsersTabHostFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SelectUsersTabHostFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SelectUsersTabHostFragment$c.class, new l());
       }else {
          obj.put(SelectUsersTabHostFragment$c.class, null);
       }
       return obj;
    }
}
