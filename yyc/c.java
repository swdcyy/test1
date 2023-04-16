package yyc.c;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Float;
import java.lang.Math;

public abstract class c implements ViewPager$i	// class@0045db
{
    public final String b;
    public int c;
    public int d;

    public void c(){
       super();
       this.b = "OnPageChange";
    }
    public abstract int a();
    public abstract void b(int p0,int p1,float p2);
    public abstract void c(int p0);
    public final void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport(c.class)) {
          PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, c.class, "4");
       }
       return;
    }
    public final void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, c.class, "1")) {
          return;
       }
       c tc = this.c;
       int i = -1;
       c uoc = null;
       if (p0 == tc && !p1 - uoc) {
          uoc = this.d;
          if (uoc != tc) {
             this.c(uoc);
             this.b(p0, this.d, p1);
          }else {
             this.b(p0, i, p1);
          }
          this.d = p0;
          return;
       }else if(p0 == tc || (!p1 - uoc || tc < p0)){
          this.c(tc);
          this.c = p0;
          tc = p0;
       }
       int i1 = Math.abs((this.c - p0));
       if (i1 > 1 && i1 != (this.a() - 1)) {
          this.c(tc);
          this.c = this.d;
       }
       uoc = this.c;
       if (uoc == p0) {
          i = uoc + 1;
          tc = uoc;
       }else if(uoc > p0){
          if (uoc == (this.a() - 1) && (!p0 && this.a() != 2)) {
             i = this.c;
             tc = p0;
          }else {
             i = this.c;
             tc = i - 1;
          }
       }
       this.b(tc, (i % this.a()), p1);
       this.d = p0;
       return;
    }
    public final void onPageSelected(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       this.c = p0;
       return;
    }
}
