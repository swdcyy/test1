package com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$dynamicLoadMoreListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$dynamicLoadMoreListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DynamicComponentAdapter$dynamicLoadMoreListener$2 extends Lambda implements a	// class@000a4e
{
    public final DynamicComponentAdapter this$0;

    public void DynamicComponentAdapter$dynamicLoadMoreListener$2(DynamicComponentAdapter p0){
       this.this$0 = p0;
       super(0);
    }
    public final DynamicComponentAdapter$dynamicLoadMoreListener$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, DynamicComponentAdapter$dynamicLoadMoreListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DynamicComponentAdapter$dynamicLoadMoreListener$2$a(this, this.this$0.r);
    }
    public Object invoke(){
       return this.invoke();
    }
}
