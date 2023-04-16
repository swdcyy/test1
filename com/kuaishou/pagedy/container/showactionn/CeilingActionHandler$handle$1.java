package com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$handle$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.ViewGroup;
import com.kuaishou.bowl.core.component.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.pagedy.container.widget.DynamicRootListContainer;
import com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$handle$1$a;
import android.view.View;
import java.lang.Runnable;

public final class CeilingActionHandler$handle$1 extends Lambda implements a	// class@000a5f
{
    public final ViewGroup $container;
    public final a $relatedComponent;

    public void CeilingActionHandler$handle$1(ViewGroup p0,a p1){
       this.$container = p0;
       this.$relatedComponent = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, CeilingActionHandler$handle$1.class, "1")) {
          return;
       }
       if (this.$container.getCeilingHeight() <= 10) {
          a relatedCompo = this.$relatedComponent.relatedComponent;
          if (relatedCompo != null) {
             relatedCompo = relatedCompo.rootView;
             if (relatedCompo != null) {
                relatedCompo.post(new CeilingActionHandler$handle$1$a(relatedCompo, this));
             }
          }
       }
       return;
    }
}
