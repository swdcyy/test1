package com.kwai.platform.krouter.handler.annotation.BaseAnnotationHandler$a;
import qh7.c;
import com.kwai.platform.krouter.handler.annotation.BaseAnnotationHandler;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class BaseAnnotationHandler$a implements c	// class@001291
{
    public final c a;
    public final BaseAnnotationHandler b;

    public void BaseAnnotationHandler$a(BaseAnnotationHandler p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseAnnotationHandler$a.class, "2")) {
          return;
       }
       this.a.a(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, BaseAnnotationHandler$a.class, "1")) {
          return;
       }
       this.a.b();
       return;
    }
}
