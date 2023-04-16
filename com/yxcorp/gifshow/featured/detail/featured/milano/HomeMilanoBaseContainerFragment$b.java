package com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment$b;
import n9a.b;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import x1a.c;
import e0a.j;

public class HomeMilanoBaseContainerFragment$b implements b	// class@000f18
{
    public final boolean a;
    public final HomeMilanoBaseContainerFragment b;

    public void HomeMilanoBaseContainerFragment$b(HomeMilanoBaseContainerFragment p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (j.r() != null && (j.r().mEnableChangeAnim != null && this.a == null))? true: false;
       return b;
    }
    public boolean b(){
       return true;
    }
}
