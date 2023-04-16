package f43.c$f;
import io.reactivex.g;
import f43.c;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import java.util.Set;
import java.lang.String;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.g;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.live.gameinteractive.auth.model.a;
import java.util.Collection;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.Iterator;
import f43.c$f$a;
import f43.b$b;

public class c$f implements g	// class@002871
{
    public final GameLiveAuthInfo b;
    public final Set c;
    public final boolean d;
    public final String e;
    public final Activity f;
    public final ClientContent$LiveStreamPackage g;
    public final c h;

    public void c$f(c p0,GameLiveAuthInfo p1,Set p2,boolean p3,String p4,Activity p5,ClientContent$LiveStreamPackage p6){
       this.h = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void subscribe(v p0){
       ArrayList obj;
       String str;
       GameLiveAuthInfo b;
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$f.class, "1")) {
          return;
       }
       int i = 1;
       if (this.b.d(this.c, this.d)) {
          p0.onNext(Integer.valueOf(i));
          p0.onComplete();
       }else if(this.b.e(this.c, this.d)){
          c$f th = this.h;
          c$f te = this.e;
          c$f tf = this.f;
          c$f tb = this.b;
          c$f tc = this.c;
          c$f td = this.d;
          Objects.requireNonNull(tb);
          GameLiveAuthInfo gameLiveAuth = GameLiveAuthInfo.class;
          if (PatchProxy.isSupport(gameLiveAuth)) {
             obj = PatchProxy.applyTwoRefs(tc, Boolean.valueOf(td), tb, gameLiveAuth, "8");
             if (obj != PatchProxyResult.class) {
                str = obj;
             label_00dc :
                th.h(te, tf, tb, str, this.g, new c$f$a(this, p0));
             }
          }
          obj = new ArrayList();
          if (td != null) {
             b = tb.b;
             if (b != null) {
                obj.addAll(b.a(tc));
             }
          }else if(tb.c != null){
             b = tb.b;
             if (b != null) {
                obj.addAll(b.a(tb.c(tc)));
             }
             obj.addAll(tb.c.a(tc));
          }
          str = "";
          String str1 = "{}";
          if (!obj.isEmpty() && (!TextUtils.isEmpty(tb.f) && (tb.f).contains(str1))) {
             str2 = "";
             Iterator iterator = obj.iterator();
             String str3 = null;
             while (iterator.hasNext()) {
                str2 = str2+iterator.next()+"¡¢";
                str3 = 1;
             }
             GameLiveAuthInfo f = tb.f;
             if (str3 != null) {
                str = str2.substring(0, str2.lastIndexOf("¡¢"));
             }
             str2 = f.replace(str1, str);
          }else {
             str2 = (tb.f).replace(str1, str);
          }
          str = str2;
          goto label_00dc ;
       }else {
          p0.onNext(Integer.valueOf(-1));
          p0.onComplete();
       }
       return;
    }
}
