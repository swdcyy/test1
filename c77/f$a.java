package c77.f$a;
import k67.l;
import c77.f;
import java.lang.Object;
import f37.c0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Map;
import java.util.Set;
import androidx.collection.ArraySet;
import java.util.Iterator;
import f67.d;
import f67.f;
import com.kwai.live.gzone.pendant.service.LiveGzoneFeatureEntrances;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.util.HashSet;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Integer;
import f37.c0$b;

public class f$a implements l	// class@0004fb
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(c0 p0){
       int len;
       Iterator iterator;
       Iterator iterator1;
       f$a uoa = f$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
          return;
       }
       String str = p0.a();
       if (!PatchProxy.applyVoidTwoRefs(str, p0, this, uoa, "1")) {
          Object[] objArray = new Object[0];
          a.C().s("LiveGzoneRedDotManagerP", "itemId"+str+",show"+p0.e(), objArray);
          if (p0.c() != null) {
             String[] stringArray = p0.c();
             len = stringArray.length;
             int i = 0;
             while (i < len) {
                object oobject = stringArray[i];
                Set set = this.a.s.get(oobject);
                if (set == null) {
                   set = new ArraySet();
                   this.a.s.put(oobject, set);
                }
                if (p0.e()) {
                   set.add(str);
                }else {
                   set.remove(str);
                }
                i = i + 1;
             }
          }
          if (p0.e()) {
             this.a.p.put(str, p0);
          }else {
             this.a.p.remove(str);
          }
          if (!PatchProxy.applyVoidTwoRefs(str, p0, this, uoa, "2")) {
             Set set1 = this.a.q.get(str);
             if (set1 != null && !set1.isEmpty()) {
                iterator = set1.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(p0);
                }
             }
             iterator = this.a.r.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(p0);
             }
             if (p0.c() != null) {
                String[] stringArray1 = p0.c();
                int len1 = stringArray1.length;
                int i1 = 0;
                while (i1 < len1) {
                   object oobject1 = stringArray1[i1];
                   Set set2 = this.a.s.get(oobject1);
                   len = (set2 != null)? set2.size(): 0;
                   Set set3 = this.a.u.get(oobject1);
                   if (set3 != null) {
                      iterator1 = set3.iterator();
                      while (iterator1.hasNext()) {
                         iterator1.next().a(oobject1, len);
                      }
                   }
                   iterator1 = this.a.t.iterator();
                   while (iterator1.hasNext()) {
                      iterator1.next().a(oobject1, len);
                   }
                   i1 = i1 + 1;
                }
             }
          }
       }
       return;
    }
    public void b(LiveGzoneFeatureEntrances p0,boolean p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "16")) {
          return;
       }
       SharedPreferences$Editor uEditor = f.w.edit();
       uEditor.putBoolean(this.a.P8(p0.mId, p0.mRedDotId), p1);
       g.a(uEditor);
       return;
    }
    public void c(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "14")) {
          return;
       }
       this.a.t.add(p0);
       Iterator iterator = this.a.s.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Set set = this.a.s.get(str);
          int i = (set != null)? set.size(): 0;
          p0.a(str, i);
       }
       return;
    }
    public void d(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "12")) {
          return;
       }
       Set set = this.a.u.get(p0);
       if (set == null) {
          set = new HashSet();
          this.a.u.put(p0, set);
       }
       set.add(p1);
       int i = 0;
       if (!this.a.s.isEmpty()) {
          set = this.a.s.get(p0);
          if (set != null) {
             i = set.size();
          }
          p1.a(p0, i);
       }else {
          p1.a(p0, i);
       }
       return;
    }
    public void e(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "10")) {
          return;
       }
       Set set = this.a.q.get(p0);
       if (set == null) {
          set = new HashSet();
          this.a.q.put(p0, set);
       }
       set.add(p1);
       if (!this.a.p.isEmpty()) {
          c0 uoc0 = this.a.p.get(p0);
          if (uoc0 != null) {
             p1.a(uoc0);
          }
       }
       return;
    }
    public void f(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "13")) {
          return;
       }
       Set set = this.a.u.get(p0);
       if (set != null) {
          set.remove(p1);
       }
       return;
    }
    public void g(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "15")) {
          return;
       }
       this.a.t.remove(p0);
       return;
    }
    public void h(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "11")) {
          return;
       }
       Set set = this.a.q.get(p0);
       if (set != null) {
          set.remove(p1);
       }
       return;
    }
    public c0 i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p.get(p0);
    }
    public void j(String p0,c0 p1){
       int len;
       Iterator iterator;
       Iterator iterator1;
       f$a uoa = f$a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveGzoneRedDotManagerP", "itemId"+p0+",show"+p1.e(), objArray);
       if (p1.c() != null) {
          String[] stringArray = p1.c();
          len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             Set set = this.a.s.get(oobject);
             if (set == null) {
                set = new ArraySet();
                this.a.s.put(oobject, set);
             }
             if (p1.e()) {
                set.add(p0);
             }else {
                set.remove(p0);
             }
             i = i + 1;
          }
       }
       if (p1.e()) {
          this.a.p.put(p0, p1);
       }else {
          this.a.p.remove(p0);
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "2")) {
          Set set1 = this.a.q.get(p0);
          if (set1 != null && !set1.isEmpty()) {
             iterator = set1.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(p1);
             }
          }
          iterator = this.a.r.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p1);
          }
          if (p1.c() != null) {
             String[] stringArray1 = p1.c();
             int len1 = stringArray1.length;
             int i1 = 0;
             while (i1 < len1) {
                object oobject1 = stringArray1[i1];
                Set set2 = this.a.s.get(oobject1);
                len = (set2 != null)? set2.size(): 0;
                Set set3 = this.a.u.get(oobject1);
                if (set3 != null) {
                   iterator1 = set3.iterator();
                   while (iterator1.hasNext()) {
                      iterator1.next().a(oobject1, len);
                   }
                }
                iterator1 = this.a.t.iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().a(oobject1, len);
                }
                i1 = i1 + 1;
             }
          }
       }
       return;
    }
    public void k(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "8")) {
          return;
       }
       this.a.r.add(p0);
       Iterator iterator = this.a.p.keySet().iterator();
       while (iterator.hasNext()) {
          p0.a(this.a.p.get(iterator.next()));
       }
       return;
    }
    public boolean l(String p0,long p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uoa, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return f.w.getBoolean(this.a.P8(p0, p1), true);
    }
    public void m(String p0,int p1,CDNUrl[] p2,String[] p3){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, f$a.class, "3")) {
          return;
       }
       c0$b uob = new c0$b();
       uob.b(p0);
       uob.c(p1);
       uob.e(p3);
       uob.d(p2);
       c0 uoc0 = uob.a();
       Object[] objArray = new Object[0];
       a.C().s("LiveGzoneRedDotManagerP", "setRedDot: "+p0+":"+p1, objArray);
       this.a(uoc0);
       return;
    }
    public boolean n(LiveGzoneFeatureEntrances p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.l(p0.mId, p0.mRedDotId);
    }
    public boolean o(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.a.s.isEmpty()) {
          Set set = this.a.s.get(p0);
          if (set != null && set.size() > 0) {
             b = true;
          }
       }
       return b;
    }
    public void p(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "9")) {
          return;
       }
       this.a.r.remove(p0);
       return;
    }
    public void q(String p0,int p1,String[] p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, f$a.class, "4")) {
          return;
       }
       c0$b uob = new c0$b();
       uob.b(p0);
       uob.c(p1);
       uob.e(p2);
       c0 uoc0 = uob.a();
       Object[] objArray = new Object[0];
       a.C().s("LiveGzoneRedDotManagerP", "setRedDot: "+p0+":"+p1, objArray);
       this.a(uoc0);
       return;
    }
}
