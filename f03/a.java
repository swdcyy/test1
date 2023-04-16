package f03.a;
import sz2.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.livestream.message.nano.LiveEffectExtraResInfo;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f03.b;
import java.util.Iterator;
import f03.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Set;
import java.lang.Integer;
import java.util.Map;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import com.kuaishou.android.live.log.b;
import java.lang.Number;
import sz2.g;

public class a implements a	// class@00282c
{
    public final Map a;
    public final List b;
    public final Set c;
    public final Map d;
    public final Set e;
    public final List f;
    public static final List g;

    static {
       a.g = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectDependencyResourceInfo");
    }
    public void a(LiveEffectExtraResInfo[] p0){
       super();
       this.a = new HashMap();
       this.b = new ArrayList();
       this.c = new HashSet();
       this.d = new HashMap();
       this.e = new HashSet();
       this.f = new ArrayList();
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          int len = p0.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             this.b.add(new b(p0[i1]));
          }
       }
       if (!PatchProxy.applyVoid(null, this, a.class, "2")) {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             b c = uob.c;
             if (c != null && c.size() > 0) {
                uob = uob.c;
                if (PatchProxy.applyVoidOneRefs(uob, this, a.class, "3")) {
                }else {
                   Iterator iterator1 = uob.iterator();
                   while (iterator1.hasNext()) {
                      c uoc = iterator1.next();
                      c f = uoc.f;
                      if (TextUtils.x(f)) {
                         continue ;
                      }else {
                         c c1 = uoc.c;
                         Integer integer = 1;
                         int i = (c1 == integer)? 1: 0;
                         if (i) {
                            this.f.add(f);
                            this.c.add(f);
                         }else if(c1 == 2){
                            i = 1;
                         }else {
                            i = 0;
                         }
                         if (i) {
                            this.f.add(f);
                            f = uoc.b;
                            List list = this.d.get(Integer.valueOf(f));
                            if (list == null) {
                               list = new ArrayList();
                               this.d.put(Integer.valueOf(f), list);
                            }
                            list.add(new Pair(uoc.f, uoc.d));
                            continue ;
                         }else if(c1 == 3){
                            integer = null;
                         }
                         if (integer != null) {
                            this.f.add(f);
                            this.e.add(f);
                            continue ;
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public List a(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.c);
    }
    public void b(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       this.a.putAll(p0);
       b.T(a.g, "[updateLocalPath]", "localPathMap", p0, "mExtraResMap", this.a);
       return;
    }
    public List c(){
       return this.f;
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.b.size() <= 0) {
          return 0;
       }
       return this.b.get(0).b;
    }
    public List e(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.e);
    }
    public String f(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.b(p0);
    }
    public List g(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.get(Integer.valueOf(p0));
    }
}
