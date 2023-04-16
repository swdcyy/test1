package pf.c$b;
import ub.a;
import pf.c;
import com.facebook.imagepipeline.request.ImageRequest;
import pf.c$a;
import uc.b;
import android.graphics.Bitmap$Config;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.lang.Integer;
import java.util.Map;

public class c$b extends a	// class@00291c
{
    public final ImageRequest b;
    public final byte c;
    public int d;
    public final c e;

    public void c$b(c p0,ImageRequest p1){
       this.e = p0;
       super();
       this.b = p1;
       switch (c$a.a[p1.g().g.ordinal()]){
           case 1:
             this.c = 2;
             break;
           case 2:
             this.c = 4;
             break;
           case 3:
             this.c = 8;
             break;
           case 4:
             this.c = 8;
             break;
           case 5:
             this.c = 8;
             break;
           case 6:
             this.c = 4;
             break;
           default:
             this.c = 4;
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$b.class, "1")) {
       }else if(p1 != null && this.e.a.add(this.b.toString())){
          int i = (p1.getHeight() * p1.getWidth()) * this.c;
          this.d = i;
          p1 = this.e;
          c uoc = c.class;
          _monitor_enter(p1);
          if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i), p1, uoc, "3")) {
             _monitor_exit(p1);
          }else {
             p1.c = p1.c + (long)i;
             p1.b.put(p0, Integer.valueOf(i));
             p1.c();
             _monitor_exit(p1);
          }
       }
       return;
    }
    public void onRelease(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       this.e.a.remove(this.b.toString());
       c$b te = this.e;
       _monitor_enter(te);
       if (PatchProxy.applyVoidOneRefs(p0, te, c.class, "4")) {
          _monitor_exit(te);
       }else {
          Integer integer = te.b.get(p0);
          if (integer != null) {
             te.c = te.c - (long)integer.intValue();
             te.b.remove(p0);
             te.c();
          }
          _monitor_exit(te);
       }
       return;
    }
}
