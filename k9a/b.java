package k9a.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.label.tag.hashtag.a;
import eya.b;
import b89.a;
import com.yxcorp.gifshow.topic.c;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.SpannableStringBuilder;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.framework.model.feed.BaseFeed;
import wh5.c;
import com.kwai.framework.model.user.User;
import jya.a;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;
import jya.c;
import jya.b;
import com.yxcorp.gifshow.util.ColorURLSpan;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import rnc.i;
import android.text.Spannable;
import java.util.List;
import oe6.b;
import java.util.Map;
import b89.a$c;

public class b	// class@002c1d
{
    public final SpannableStringBuilder a;
    public final a b;
    public final b c;
    public final a d;
    public final c e;
    public final QPhoto f;
    public Map g;
    public List h;
    public List i;
    public String j;

    public void b(QPhoto p0,a p1,b p2,a p3,c p4){
       int i;
       char c;
       Boolean tRUE;
       super();
       this.j = "";
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SpannableStringBuilder spannableStr = PatchProxy.apply(objArray, this, uob, "3");
       if (spannableStr != patchProxyRe) {
       }else {
          spannableStr = new SpannableStringBuilder();
          if (d.a(-1694791652).LN(p0.getEntity()) || !c.f()) {
             p0.getUserName();
          }else {
             User user = p0.getUser();
             String str1 = "name";
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray1 = new Object[]{user,str1,Integer.valueOf(0),p0,tRUE,tRUE};
                tRUE = Boolean.TRUE;
                if (PatchProxy.apply(objArray1, objArray, uoa, "5") != patchProxyRe) {
                }
             }
             c uoc = b.a(user);
             ColorURLSpan uColorURLSpa = uoc.b();
             uColorURLSpa.e(1);
             uColorURLSpa.r = true;
             uoc.a(str1, 0, p0);
          }
          String caption = p0.getCaption();
          if (!TextUtils.x(caption)) {
             uob = PatchProxy.applyOneRefs(caption, this, uob, "4");
             if (uob != patchProxyRe) {
                caption = uob;
             }else if(TextUtils.x(caption)){
                StringBuilder str = "";
                i = 0;
                int i1 = 0;
                int i2 = 0;
                while (i < caption.length()) {
                   c = caption.charAt(i);
                   if (32 == c) {
                      i1 = i1 + 1;
                      if (i1 > 2) {
                         i2 = 0;
                      }else {
                      label_00cb :
                         i2 = 0;
                      label_00cc :
                         str = str+c;
                      }
                   }else if(10 == c){
                      i2 = i2 + 1;
                      i1 = 0;
                      if (i2 <= 1) {
                      }
                   }else {
                      i1 = 0;
                      goto label_00cb ;
                   }
                   i++;
                }
                caption = str;
             }
             SpannableStringBuilder spannableStr1 = new SpannableStringBuilder();
             spannableStr1.append(i.j(caption));
             this.h = this.c.b(spannableStr1);
             if (this.f.getTagHashType() > 0) {
                this.b.k(b.G());
                this.g = this.b.j(spannableStr1);
             }
             spannableStr.append(spannableStr1);
             this.d.c(spannableStr);
             this.e.f(spannableStr);
          }
       }
       this.a = spannableStr;
       return;
    }
    public a$c a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.a();
    }
}
