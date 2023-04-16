package com.kuaishou.live.core.basic.liveslide.a;
import z41.b;
import com.kuaishou.live.core.basic.liveslide.b;
import com.kuaishou.live.core.basic.liveslide.a$a;
import io.reactivex.subjects.PublishSubject;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z41.c;
import z41.d;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.basic.liveslide.b$a;
import z41.a;

public class a extends b implements b	// class@00083b
{
    public final a$a d;
    public final PublishSubject e;
    public final PublishSubject f;

    public void a(){
       super();
       this.d = new a$a(this);
       this.e = PublishSubject.g();
       this.f = PublishSubject.g();
    }
    public static a k(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(p0).a(a.class);
    }
    public static a n(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b(p0).a(a.class);
    }
    public b$a a(){
       return this.j();
    }
    public void b(){
       a.a(this);
    }
    public a$a j(){
       return this.d;
    }
}
