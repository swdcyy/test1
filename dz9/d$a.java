package dz9.d$a;
import erd.g;
import dz9.d;
import e17.i$b;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import java.lang.Number;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;

public final class d$a implements g	// class@00200c
{
    public final d b;
    public final i$b c;

    public void d$a(d p0,i$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          i.z(this.c);
          p0 = this.b.F;
          if (p0 != null) {
             i = p0.intValue();
             d$a tb = this.b;
             Objects.requireNonNull(tb);
             d uod = d.class;
             if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, uod, "3")) {
                uod = tb.G;
                if (i == uod) {
                   tb.F = Integer.valueOf(tb.H);
                   tb.D.setAtMePhotoPrivacyStatus(tb.H);
                }else if(i == tb.H){
                   tb.F = Integer.valueOf(uod);
                   tb.D.setAtMePhotoPrivacyStatus(tb.G);
                }
             }
          }
       }
       return;
    }
}
