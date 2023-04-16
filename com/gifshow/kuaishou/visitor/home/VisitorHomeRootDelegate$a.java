package com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate$a;
import fr6.i;
import com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class VisitorHomeRootDelegate$a implements i	// class@0015da
{
    public final VisitorHomeRootDelegate a;

    public void VisitorHomeRootDelegate$a(VisitorHomeRootDelegate p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       h.b(this, p0, p1, p2, p3, p4);
    }
    public void c(h p0,int p1){
       if (PatchProxy.isSupport(VisitorHomeRootDelegate$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, VisitorHomeRootDelegate$a.class, "1")) {
          return;
       }
       this.a.n(p0);
       return;
    }
}
