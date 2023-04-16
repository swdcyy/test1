package eya.b;
import eya.d;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import mu7.e;
import com.yxcorp.gifshow.label.tag.span.ColorClickableSpan;
import java.lang.CharSequence;
import lnc.c0$a;
import lnc.c0;
import eya.e;
import java.lang.StringBuilder;
import hya.f;
import wh5.c;
import org.json.JSONObject;
import fg6.a;
import com.google.gson.Gson;
import org.json.JSONException;
import java.net.URLEncoder;
import eya.c;
import eya.b$a;
import android.view.View$OnClickListener;
import eya.a;
import android.view.View$OnLongClickListener;
import android.text.style.StyleSpan;
import android.text.Spannable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lnc.n3;
import java.lang.Exception;
import q87.c;
import java.util.Collection;

public class b implements d	// class@00284d
{
    public boolean a;
    public int b;
    public QPhoto c;
    public QComment d;
    public b$b e;
    public b$c f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public final List m;
    public int n;

    public void b(){
       super();
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.m = new ArrayList();
       this.g = 0x7f010109;
       this.h = 0x7f0100e5;
       this.i = 0x7f0100e5;
       this.j = 0x7f010112;
    }
    public List a(String p0,User p1,int p2,int p3){
       ArrayList obj;
       String str;
       JSONObject jSONObject;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.m.add(p1);
       obj = new ArrayList();
       int i = -1878684066;
       if (this.a != null) {
          str = b.a(i).b(p1.mId, p1.mName);
          b tk = this.k;
          if (tk == null) {
             tk = ColorClickableSpan.i;
          }
          obj.add(new e(c0.a(p0, str, tk, this.l), 17, p2, p3));
       }else {
          obj.add(new e(new f(), 33, (p3 - ("\(O"+p1.mId+"\)").length()), p3));
       }
       if (c.f()) {
          str = 0;
          try{
             jSONObject = new JSONObject(a.a.q(p1));
          }catch(org.json.JSONException e5){
             e5.printStackTrace();
          }
          str = (jSONObject != null)? jSONObject.toString(): "";
          str = URLEncoder.encode(str, "UTF-8");
          String str1 = (this.a != null)? b.a(i).b(p1.mId, p1.mName): p1.getName();
          ColorClickableSpan tk1 = new ColorClickableSpan(c.b()+p1.getId()+"?followRefer="+this.n+"&user="+str, str1);
          tk1.e(new b$a(this, p0, p1, tk1));
          tk1.f(new a(this, p1));
          tk1.d(this.k);
          tk1.g(this.l);
          obj.add(new e(tk1, 17, p2, p3));
          if (this.b != null) {
             obj.add(new e(new StyleSpan(this.b), 33, p2, p3));
          }
       }
       return obj;
    }
    public List b(Spannable p0){
       c obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.m.clear();
       obj = new c();
       obj.a = this;
       if (!PatchProxy.applyVoidOneRefs(p0, obj, c.class, "1")) {
          Matcher matcher = c.c.matcher(p0);
          try{
             while (matcher.find()) {
                if (p0.getSpans(matcher.start(), matcher.end(), c0$a.class).length > 0) {
                   continue ;
                }
                obj.a(p0, matcher);
             }
          }catch(java.lang.Exception e6){
             Object[] objArray = new Object[0];
             n3.C().t("TextAtUserHandler @", "UEE: "+e6.getMessage(), objArray);
          }
       }
    }
    public String c(String p0,User p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       Object[] objArray = new Object[]{p1.mId};
       return String.format("at_%s", objArray);
    }
    public final b d(boolean p0){
       this.a = p0;
       return this;
    }
    public final b e(int p0){
       this.k = p0;
       return this;
    }
    public final b f(int p0){
       this.l = p0;
       return this;
    }
    public final b g(int p0){
       this.b = p0;
       return this;
    }
}
