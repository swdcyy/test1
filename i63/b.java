package i63.b;
import g77.b;
import com.kwai.live.gzone.tab.page.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import i63.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.os.Bundle;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import v53.a;
import y43.a;
import fq5.b;
import c77.l;
import j63.a;

public abstract class b extends a implements b	// class@002eca
{
    public b j;
    public l k;
    public a l;
    public a m;
    public boolean n;
    public PagerSlidingTabStrip$d o;
    public LiveGzoneTab p;
    public b$a q;
    public boolean r;
    public a s;
    public a t;

    public void b(){
       super();
    }
    public b A(PagerSlidingTabStrip$d p0,LiveGzoneTab p1){
       this.o = p0;
       this.p = p1;
       return this;
    }
    public void B(b$a p0){
       this.q = p0;
    }
    public void a(){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.w(this.c, null);
       return;
    }
    public boolean c(String p0,boolean p1,LiveGzoneTabSource p2){
       b obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.q;
       if (obj != null) {
          return obj.c(p0, p1, p2);
       }else {
          return false;
       }
    }
    public LiveGzoneTab t(){
       return this.p;
    }
    public PagerSlidingTabStrip$d u(){
       return this.o;
    }
    public void v(a p0,a p1,b p2,l p3){
       this.m = p0;
       this.l = p1;
       this.j = p2;
       this.k = p3;
    }
    public void w(View p0,Bundle p1){
    }
    public b x(Bundle p0){
       this.d = p0;
       return this;
    }
    public b y(a p0){
       this.s = p0;
       return this;
    }
    public void z(boolean p0){
       this.r = p0;
    }
}
