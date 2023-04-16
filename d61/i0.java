package d61.i0;
import java.lang.Object;
import com.kwai.framework.model.user.UserVerifiedDetail;
import android.widget.ImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class i0	// class@001f20
{

    public void i0(){
       super();
    }
    public static void a(UserVerifiedDetail p0,ImageView p1,boolean p2){
       int i;
       if (PatchProxy.isSupport(i0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, i0.class, "1")) {
          return;
       }
       if (p0 != null) {
          if (p2) {
             p0 = p0.mIconType;
             if (p0 != 1) {
                if (p0 != 2) {
                   if (p0 != 3) {
                   label_004c :
                      i = -1;
                   }else {
                      i = 0x7f0814d3;
                   }
                }else {
                   i = 0x7f0814ae;
                }
             }else {
                i = 0x7f0814d6;
             }
          }else {
             p0 = p0.mIconType;
             if (p0 != 1) {
                if (p0 != 2) {
                   if (p0 != 3) {
                      goto label_004c ;
                   }else {
                      i = 0x7f080a68;
                   }
                }else {
                   i = 0x7f080a67;
                }
             }else {
                i = 0x7f080a69;
             }
          }
       }else {
          goto label_004c ;
       }
       if (i != -1) {
          p1.setImageResource(i);
          p1.setVisibility(0);
       }else {
          p1.setVisibility(8);
       }
       return;
    }
}
