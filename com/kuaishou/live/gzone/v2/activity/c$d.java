package com.kuaishou.live.gzone.v2.activity.c$d;
import c77.a;
import com.kuaishou.live.gzone.v2.activity.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import w53.b;
import androidx.viewpager.widget.ViewPager;
import c77.n;
import com.kuaishou.live.gzone.v2.activity.c$e;
import j63.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;
import c77.a$a;
import java.util.Set;
import androidx.viewpager.widget.ViewPager$i;

public class c$d implements a	// class@001cb6
{
    public final c a;

    public void c$d(c p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.C.c(p0) == this.a.q.getCurrentItem())? true: false;
       return b;
    }
    public n b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c$e(this.a, p0);
    }
    public void c(boolean p0){
       c$d uod = c$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "5")) {
          return;
       }
       c q = this.a.q;
       if (q instanceof a) {
          q.h(p0, LiveGzoneTab$TabType.ACTIVITY.mTypeValue);
       }
       return;
    }
    public void d(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "4")) {
          return;
       }
       this.a.E.remove(p0);
       return;
    }
    public void e(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "3")) {
          return;
       }
       this.a.E.add(p0);
       return;
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "2")) {
          return;
       }
       this.a.q.removeOnPageChangeListener(p0);
       return;
    }
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       this.a.q.addOnPageChangeListener(p0);
       return;
    }
}
