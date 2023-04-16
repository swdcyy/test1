package com.yxcorp.gifshow.detail.logger.slideprocess.e$c;
import fr6.d;
import com.yxcorp.gifshow.detail.logger.slideprocess.e;
import java.lang.Object;
import wq6.e;
import wq6.h;
import fr6.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import u1a.b;
import sy6.a;
import java.lang.Integer;
import java.lang.StringBuilder;
import s1a.a;
import java.util.LinkedList;
import u1a.a;

public class e$c implements d	// class@00157d
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public void a(e p0,h p1){
       c.c(this, p0, p1);
    }
    public void b(e p0,e p1,h p2,h p3,float p4){
       c.b(this, p0, p1, p2, p3, p4);
    }
    public void c(e p0,h p1){
       Object obj = this;
       Fragment obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, e$c.class, "1")) {
          return;
       }
       e$c a = obj.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidOneRefs(obj1, a, e.class, "10") || (!a.W8() && a.C != null)) {
          obj1 = p0.p();
          if (obj1 != null) {
             if (a.u == a.P) {
                if (a.v == a.N || obj1.hashCode() == a.N) {
                   if (a.v != a.N && obj1.hashCode() == a.N) {
                      a.C = true;
                      a.K.c(a.v);
                      a.d9("backFromOtherTab");
                   }else if(a.v == a.N && obj1.hashCode() != a.N){
                      a.C = false;
                      e k = a.K;
                      String str = a.V8();
                      e s = a.s;
                      int i = a.L.a0();
                      Objects.requireNonNull(k);
                      if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(obj1, str, Integer.valueOf(s), Integer.valueOf(i), k, b.class, "2")) {
                         a.E("enterPage fragment start photoId:"+str+" slideCount:"+s+"  index:"+i);
                         if (k.a.isEmpty() || k.a.getLast().c()) {
                            a uoa = v9;
                            a uoa1 = v9;
                            uoa = new a(str, s, i, k.b(obj1), obj1.hashCode());
                            uoa1.a();
                            a uoa2 = uoa1;
                            k.a.add(uoa2);
                            a.E("enterPage fragment end photoId:"+str+" slideCount:"+s+"  index:"+i+"  hash:"+uoa2.b()+"  pageName:"+uoa2.mToPage);
                            a.E("enterPage--navigate action size:"+k.a.size());
                         }
                      }
                      a.d9("navigateOtherTab");
                      if (a.U != null) {
                         a.b9(false);
                      }
                   }
                }
             }
             a.v = obj1.hashCode();
          }
       }
    label_0167 :
       return;
    }
}
