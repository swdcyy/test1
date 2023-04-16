package e7a.e;
import erd.g;
import e7a.d;
import java.lang.Object;
import lm5.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import android.text.SpannableString;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import android.widget.TextView;

public final class e implements g	// class@002085
{
    public final d b;

    public void e(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       f a;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          a.p(p0, "event");
          f b = p0.b;
          d r = this.b.r;
          if (r == null) {
             a.S("mFragment");
          }
          Fragment parentFragme = r.getParentFragment();
          int i = (parentFragme != null)? parentFragme.hashCode(): 0;
          if (b == i) {
             e tb = this.b;
             if (tb.x != null) {
                a = p0.a;
                String str = null;
                StringBuilder str1 = 1;
                if (a != null && (tb.y <= str1 && p0.c != 4)) {
                   if (a != str1) {
                      p0 = (a != 2)? "Î´Öª": "±ÜÈÃ";
                   }else {
                      p0 = "½ûÖ¹ÏÔÊ¾";
                   }
                   d u = tb.u;
                   if (u != null) {
                      str1 = "ÔÝÎ´Ö§³Öµ¯Ä»£¬Ô­Òò£º"+p0+10;
                      p0 = this.b.s;
                      if (p0 != null) {
                         str = p0.getPhotoId();
                      }
                      u.setText(new SpannableString(str1+str));
                   }
                }else if(tb.y <= str1){
                   p0 = tb.u;
                   if (p0 != null) {
                      r = this.b.s;
                      if (r != null) {
                         str = r.getPhotoId();
                      }
                      p0.setText(new SpannableString(String.valueOf(str)));
                   }
                }
             }
          }
       }
    label_009e :
       return;
    }
}
