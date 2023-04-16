package bx6.d;
import tw6.a;
import android.database.DataSetObserver;
import bx6.b;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import yw6.h;
import uw6.e;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.library.slide.base.widget.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bx6.e;
import yw6.g;
import qvb.q;
import java.lang.System;
import android.view.View;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import h3.a;
import bx6.c;
import com.kwai.library.slide.base.widget.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import cw6.b;
import fw6.b;
import java.lang.Integer;

public final class d extends DataSetObserver implements a	// class@0004aa
{
    public final a b;
    public final KwaiGrootViewPager c;
    public final h d;
    public final e e;
    public final b f;
    public e g;
    public final List h;

    public void d(b p0,KwaiGrootViewPager p1,h p2,e p3){
       super();
       this.h = new CopyOnWriteArrayList();
       a footerLoadin = p0.getFooterLoadingLayout();
       this.b = footerLoadin;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p0;
       if (p0.d() && !PatchProxy.applyVoid(null, this, d.class, "3")) {
          e uoe = new e(p3, p2, p0);
          this.g = uoe;
          g og = p2.f();
          if (!PatchProxy.applyVoidOneRefs(og, uoe, e.class, "1")) {
             uoe.d();
             uoe.e = og;
             if (og != null) {
                og.M0(uoe);
                uoe.b = System.currentTimeMillis();
             }
          }
          footerLoadin.setContentView(p1);
          p1.j0(this);
          p3.r(this);
          footerLoadin.setOnLoadingMoreListener(new c(this));
          this.c();
       }
       return;
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.l0(this.c.getCurrentItem());
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.d.e().f() - 1);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       g og = this.d.e();
       if (this.b != null && og != null) {
          boolean b = true;
          if (this.a() == this.b() && og.hasMore()) {
             this.c.setDisableShowNoMoreTipsAtBottom(b);
             this.b.d(b, false);
          }else {
             this.c.setDisableShowNoMoreTipsAtBottom(false);
             d tb = this.b;
             if (this.a() >= this.b()) {
                b = false;
             }
             tb.d(false, b);
          }
       }
       return;
    }
    public void d(int p0){
    }
    public void onChanged(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       this.c();
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, d.class, "11")) {
          return;
       }
       this.c();
       return;
    }
}
