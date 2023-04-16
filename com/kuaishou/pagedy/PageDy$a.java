package com.kuaishou.pagedy.PageDy$a;
import su.a;
import com.kuaishou.pagedy.PageDy;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.pagedy.container.component.RootContainerComponent;

public class PageDy$a implements a	// class@000a3f
{
    public final PageDy a;

    public void PageDy$a(PageDy p0){
       this.a = p0;
       super();
    }
    public NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, PageDy$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RootContainerComponent();
    }
}
