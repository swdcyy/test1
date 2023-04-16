package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyJoinFragment$a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.audience.f;
import java.util.Map;
import java.util.HashMap;

public class LiveGzoneAccompanyJoinFragment$a implements g	// class@000b57
{
    public k0$g b;
    public LiveGzoneAccompanyTabHostFragment$e c;
    public c d;
    public p0$e e;

    public void LiveGzoneAccompanyJoinFragment$a(){
       super();
       this.d = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyJoinFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyJoinFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveGzoneAccompanyJoinFragment$a.class, new f());
       }else {
          obj.put(LiveGzoneAccompanyJoinFragment$a.class, null);
       }
       return obj;
    }
}
