package eya.c;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rkd.b;
import android.text.Spannable;
import java.util.regex.Matcher;
import android.text.style.ImageSpan;
import androidx.emoji.text.EmojiSpan;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;
import eya.d;
import java.util.Collection;
import java.util.Iterator;
import eya.e;

public final class c	// class@00284e
{
    public d a;
    public List b;
    public static final Pattern c;

    static {
       c.c = Pattern.compile("\(@[^@]+?\)\\\(O\(\\d+\)\\\)");
    }
    public void c(){
       super();
       this.b = new LinkedList();
    }
    public static String b(){
       String obj = PatchProxy.apply(null, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (b.g())? "ks://profileTablet/": "ks://profile/";
       return obj;
    }
    public final void a(Spannable p0,Matcher p1){
       int len;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       ImageSpan[] spans = p0.getSpans(p1.start(), p1.end(), ImageSpan.class);
       int i = 0;
       if (spans != null && spans.length > 0) {
          len = spans.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             p0.removeSpan(spans[i1]);
          }
       }
       EmojiSpan[] spans1 = p0.getSpans(p1.start(), p1.end(), EmojiSpan.class);
       if (spans1 != null && spans1.length > 0) {
          len = spans1.length;
          for (; i < len; i = i + 1) {
             p0.removeSpan(spans1[i]);
          }
       }
       User user = new User(p1.group(2), p1.group(1), "U", null, null);
       List list = this.a.a(p1.group(), i, p1.start(), p1.end());
       this.b.addAll(list);
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          p0.setSpan(uoe.a, uoe.c, uoe.d, uoe.b);
       }
       return;
    }
}
