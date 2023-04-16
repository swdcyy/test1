package com.kuaishou.post.story.entrance.e;
import im8.g;
import java.lang.Object;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import vp4.b;
import t36.f;
import com.kuaishou.post.story.entrance.d$a;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import iq4.p;
import java.util.Map;
import java.util.HashMap;

public class e implements g	// class@000b37
{
    public int b;
    public Integer c;
    public final PublishSubject d;
    public final b e;
    public final f f;
    public final d$a g;
    public final PublishSubject h;
    public String i;
    public String j;
    public MoodTemplateData k;
    public AIVideoBackgroundData l;
    public boolean m;
    public Boolean n;
    public List o;

    public void e(){
       super();
       this.b = 0;
       this.c = Integer.valueOf(2);
       this.d = PublishSubject.g();
       this.e = new b();
       this.f = new f();
       this.g = new d$a();
       this.h = PublishSubject.g();
       this.m = false;
       this.n = Boolean.FALSE;
       this.o = new ArrayList();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new p());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
}
