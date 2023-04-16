package com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$dynamicOnScrollListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$dynamicOnScrollListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.pagedy.PageDy;
import androidx.fragment.app.FragmentActivity;
import android.content.ComponentName;
import android.app.Activity;
import kotlin.jvm.internal.a;

public final class DynamicComponentAdapter$dynamicOnScrollListener$2 extends Lambda implements a	// class@000a50
{
    public final DynamicComponentAdapter this$0;

    public void DynamicComponentAdapter$dynamicOnScrollListener$2(DynamicComponentAdapter p0){
       this.this$0 = p0;
       super(0);
    }
    public final DynamicComponentAdapter$dynamicOnScrollListener$2$a invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, DynamicComponentAdapter$dynamicOnScrollListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DynamicComponentAdapter$dynamicOnScrollListener$2 tthis$0 = this.this$0;
       String str = PageDy.e().g(tthis$0.p, tthis$0.O0());
       if (str == null) {
          str = "";
       }
       String str1 = str;
       String str2 = this.this$0.O0();
       FragmentActivity uFragmentAct = this.this$0.L0();
       if (uFragmentAct != null) {
          objArray = uFragmentAct.getComponentName();
       }
       a.o(objArray, "activity?.componentName");
       String className = objArray.getClassName();
       a.o(className, "activity?.componentName.className");
       DynamicComponentAdapter$dynamicOnScrollListener$2$a uodynamicOnS = new DynamicComponentAdapter$dynamicOnScrollListener$2$a(this, str1, str2, className, this.this$0.y);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
