package d4c.v$a;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import d4c.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import g9c.a;
import com.kuaishou.android.model.music.Music;
import kotlin.jvm.internal.a;
import kob.r;
import qm9.f0;

public class v$a implements RecyclerViewPager$c	// class@0020df
{
    public final v a;

    public void v$a(v p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       v$a uoa = v$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       Music music = this.a.E.N0(p0);
       if (music != null && !music.equals(this.a.F)) {
          a.h(music, "music");
          String uniqueCode = music.getUniqueCode();
          a.h(uniqueCode, "music.uniqueCode");
          this.a.D.qI(uniqueCode);
          this.a.D.start();
          boolean b = this.a.D.e40();
          v c = this.a.C;
          if (c != null) {
             p0 = (p0 > p1)? 4: 3;
             c.a(b, music, p0);
          }
       }
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
}
