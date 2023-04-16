package com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$dynamicOnScrollListener$2$a;
import do4.g;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$dynamicOnScrollListener$2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ju4.d;

public final class DynamicComponentAdapter$dynamicOnScrollListener$2$a extends g	// class@000a4f
{
    public final DynamicComponentAdapter$dynamicOnScrollListener$2 h;

    public void DynamicComponentAdapter$dynamicOnScrollListener$2$a(DynamicComponentAdapter$dynamicOnScrollListener$2 p0,String p1,String p2,String p3,boolean p4){
       this.h = p0;
       super(p1, p2, p3, p4);
    }
    public void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DynamicComponentAdapter$dynamicOnScrollListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "event");
       a.p(p1, "data");
       d.h(p0, p1);
       return;
    }
}
