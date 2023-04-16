package ci7.f;
import java.lang.String;
import ci7.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public class f	// class@000563
{
    public a a;
    public long[] b;
    public long[] c;
    public static String[] d;
    public static int[] e;
    public static String[] f;
    public static int[] g;

    static {
       String[] stringArray = new String[]{"0~2","2~4","4~5","5+"};
       f.d = stringArray;
       f.e = new int[4]{0,2000,4000,5000};
       String[] stringArray1 = new String[]{"0~2","2~4","4~5","5+"};
       f.f = stringArray1;
       f.g = new int[4]{0,2000,4000,5000};
    }
    public void f(a p0){
       super();
       long[] olongArray = new long[f.d.length];
       this.b = olongArray;
       olongArray = new long[f.f.length];
       this.c = olongArray;
       this.a = p0;
    }
    public void a(){
       int i = 0;
       for (int i1 = 0; i1 < f.g.length; i1 = i1 + 1) {
          this.c[i1] = 0;
       }
       for (; i < f.e.length; i = i + 1) {
          this.b[i] = 0;
       }
       return;
    }
    public void b(long p0){
       f tb;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "3")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "2")) {
          long audioCachedD = this.a.getAudioCachedDuration();
          int i2 = 0;
          int[] e = f.e;
          while (i2 < e.length) {
             if (audioCachedD - (long)e[i2] >= 0) {
                int i3 = e.length - 1;
                if (i2 == i3) {
                   tb = this.b;
                   tb[i2] = tb[i2] + p0;
                   break ;
                }else {
                   i3 = i2 + 1;
                   if (audioCachedD - (long)e[i3] < 0) {
                      tb = this.b;
                      tb[i2] = tb[i2] + p0;
                      break ;
                   }
                }
             }
             i2 = i2 + 1;
          }
       }
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "1")) {
          long videoCachedD = this.a.getVideoCachedDuration();
          int[] g = f.g;
          while (i < g.length) {
             if (videoCachedD - (long)g[i] >= 0) {
                int i1 = g.length - 1;
                if (i == i1) {
                   uof = this.c;
                   uof[i] = uof[i] + p0;
                   break ;
                }else {
                   i1 = i + 1;
                   if (videoCachedD - (long)g[i1] < 0) {
                      uof = this.c;
                      uof[i] = uof[i] + p0;
                      break ;
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
