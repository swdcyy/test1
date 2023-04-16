package com.kuaishou.live.core.basic.liveslide.b$b;
import com.kuaishou.live.core.basic.liveslide.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import b51.d;
import com.kuaishou.live.basic.liveslide.a;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import cw6.b;
import pw6.a;
import cw6.c;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;

public class b$b	// class@00083d
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.c()) {
          return -1;
       }
       return this.a.e().o().l0(this.a.e().q().getCurrentItem());
    }
    public a b(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, b$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.c()) {
          return objArray;
       }
       obj = this.a.e().o().C(this.a.e().q().getCurrentItem());
       if (obj == null) {
          obj = this.a.e().o().z();
       }
       return obj;
    }
    public boolean c(){
       b obj = PatchProxy.apply(null, this, b$b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.a;
       boolean b = (obj != null && obj.o() != null)? true: false;
       return b;
    }
    public void d(int p0,boolean p1){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uob, "7")) {
          return;
       }
       this.a.e().q().I(p0, p1);
       return;
    }
    public void e(boolean p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "11")) {
          return;
       }
       this.a.e().s(p0);
       return;
    }
}
