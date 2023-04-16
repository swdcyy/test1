package ml9.d$a;
import com.yxcorp.gifshow.comment.e$b;
import ml9.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.c1;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ek9.l1;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.c0;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import zf6.k;
import ml9.f;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import java.lang.Throwable;

public class d$a implements e$b	// class@00304b
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       c1.e(this, p0, p1);
    }
    public void N1(QPhoto p0,QComment p1){
       c1.b(this, p0, p1);
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       boolean b1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       if (!PatchProxy.applyVoidOneRefs(p1, tb, uod, "5") && l1.g() < 3) {
          d b = tb.b;
          if (b != null && (!b.isFinishing() && !tb.b.isDestroyed())) {
             QComment mComment = p1.mComment;
             uod = PatchProxy.applyOneRefs(mComment, tb, uod, "8");
             if (uod != PatchProxyResult.class) {
                b1 = uod.booleanValue();
             }else {
                b1 = false;
                if (mComment != null && d.e != null) {
                   Matcher matcher = c0.a.matcher(mComment);
                   while (matcher.find()) {
                      int i = 2;
                      if (matcher.groupCount() >= i && d.e.contains(matcher.group(i))) {
                         b1 = true;
                         break ;
                      }
                   }
                }
             }
             if (b1 && p1.isSub()) {
                String str = (k.d())? "https://static.yximgs.com/udata/pkg/kwai-client-image/thanos/reco_god_comment_guide_bg_dark.png": "https://static.yximgs.com/udata/pkg/kwai-client-image/thanos/reco_god_comment_guide_bg_light.png";
                a.e(str, new f(tb));
             }
          }
       }
    label_008f :
       return;
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       c1.a(this, p0, p1, p2);
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       c1.f(this, p0, p1, p2);
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       c1.d(this, p0, p1, p2);
    }
}
