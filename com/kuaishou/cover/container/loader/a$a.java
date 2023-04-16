package com.kuaishou.cover.container.loader.a$a;
import com.kuaishou.tachikoma.TKViewContainerWrapView$a;
import com.kuaishou.cover.container.loader.a;
import java.lang.Object;
import com.kuaishou.tachikoma.TKViewContainerWrapView;
import java.lang.Throwable;
import tx4.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.cover.container.loader.b;

public class a$a implements TKViewContainerWrapView$a	// class@0016d8
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(TKViewContainerWrapView p0,int p1,Throwable p2,w p3){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, a$a.class, "2")) {
          return;
       }
       this.a.m(p2);
       return;
    }
    public void b(TKViewContainerWrapView p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       this.a.n();
       return;
    }
}
