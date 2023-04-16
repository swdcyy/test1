package com.kuaishou.live.core.show.topic.audience.p$a;
import tx1.d;
import com.kuaishou.live.core.show.topic.audience.p;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import tx1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.topic.audience.o;
import ql2.o0;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class p$a implements d	// class@001211
{
    public final p a;

    public void p$a(p p0){
       this.a = p0;
       super();
    }
    public void a(User p0){
       c.g(this, p0);
    }
    public void b(){
       c.b(this);
    }
    public void c(){
       c.e(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, p$a.class, "1")) {
          return;
       }
       this.a.a.p.f.onNext(Boolean.TRUE);
       return;
    }
    public void e(){
       c.h(this);
    }
    public void f(){
       c.d(this);
    }
    public void g(){
       c.c(this);
    }
    public void h(String p0){
       c.f(this, p0);
    }
}
