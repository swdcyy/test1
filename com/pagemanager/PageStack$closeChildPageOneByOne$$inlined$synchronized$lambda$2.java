package com.pagemanager.PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ck8.e;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.lang.Object;
import qrd.l1;
import ck8.a;
import ek8.c;
import java.lang.String;
import ek8.e;
import java.lang.StringBuilder;

public final class PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$2 extends Lambda implements a	// class@000b3d
{
    public final boolean $animated$inlined;
    public final Map $backParam$inlined;
    public final e $parent;
    public final ArrayList $removedSubPage$inlined;
    public final List $subPages$inlined;
    public final e $targetPage$inlined;

    public void PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$2(e p0,List p1,e p2,ArrayList p3,boolean p4,Map p5){
       this.$parent = p0;
       this.$subPages$inlined = p1;
       this.$targetPage$inlined = p2;
       this.$removedSubPage$inlined = p3;
       this.$animated$inlined = p4;
       this.$backParam$inlined = p5;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$2 t$parent = this.$parent;
       a uoa = (t$parent != null)? t$parent.c(): null;
       if (uoa instanceof a && this.$removedSubPage$inlined.size() > 0) {
          uoa.S1(this.$removedSubPage$inlined);
          c.b.b(e.a("PageStack"), "[closeChildPageOneByOne]notify onSubPageRemoved£¬removed size="+this.$removedSubPage$inlined.size());
       }
       return;
    }
}
