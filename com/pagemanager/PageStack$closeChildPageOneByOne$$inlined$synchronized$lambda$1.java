package com.pagemanager.PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ck8.e;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import qrd.l1;
import ck8.d;
import ek8.c;
import java.lang.String;
import ek8.e;
import java.lang.StringBuilder;
import gk8.a;
import java.util.HashMap;
import java.lang.Throwable;
import android.util.Log;

public final class PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$1 extends Lambda implements a	// class@000b3c
{
    public final boolean $animated$inlined;
    public final Map $backParam$inlined;
    public final Ref$BooleanRef $isFirstClose;
    public final Object $nativePage;
    public final e $page;
    public final ArrayList $removedSubPage$inlined;
    public final List $subPages$inlined;
    public final e $targetPage$inlined;

    public void PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$1(Object p0,e p1,Ref$BooleanRef p2,List p3,e p4,ArrayList p5,boolean p6,Map p7){
       this.$nativePage = p0;
       this.$page = p1;
       this.$isFirstClose = p2;
       this.$subPages$inlined = p3;
       this.$targetPage$inlined = p4;
       this.$removedSubPage$inlined = p5;
       this.$animated$inlined = p6;
       this.$backParam$inlined = p7;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       String str = "[closeChildPageOneByOne]subpage[";
       String str1 = "PageStack";
       if (this.$nativePage instanceof d) {
          c.b.b(e.a(str1), str+this.$page+"] use custom closer");
          a a = a.a;
          HashMap hashMap = new HashMap();
          str1 = "subpage";
          hashMap.put(str1, this.$page.d());
          a.a(a, "page_subpage_nativeback_start", hashMap, null, null, 12, null);
          boolean b = false;
          if (this.$isFirstClose.element != null) {
             this.$nativePage.a(this.$animated$inlined, this.$backParam$inlined);
             this.$isFirstClose.element = b;
          }else {
             this.$nativePage.a(b, this.$backParam$inlined);
          }
          hashMap = new HashMap();
          hashMap.put(str1, this.$page.d());
          hashMap.put("codeStack", Log.getStackTraceString(new Throwable()));
          a.a(a, "page_subpage_nativeback_end", hashMap, null, null, 12, null);
       }else {
          c.b.a(e.a(str1), str+this.$page+"] has no closer");
       }
       return;
    }
}
