package com.yxcorp.gifshow.childlock.fragment.ChildLockGuideFragment$a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.childlock.fragment.d;
import java.util.Map;
import java.util.HashMap;

public final class ChildLockGuideFragment$a implements g	// class@00107e
{
    public PublishSubject b;

    public void ChildLockGuideFragment$a(){
       super();
       this.b = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChildLockGuideFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ChildLockGuideFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ChildLockGuideFragment$a.class, new d());
       }else {
          obj.put(ChildLockGuideFragment$a.class, null);
       }
       return obj;
    }
}
