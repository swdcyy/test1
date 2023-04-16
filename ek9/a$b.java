package ek9.a$b;
import java.lang.Object;
import nsd.u;
import msd.l;
import ek9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ek9.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import o56.a;
import ek9.m1;
import q87.c;

public final class a$b	// class@00216a
{

    public void a$b(){
       super();
    }
    public void a$b(u p0){
       super();
    }
    public final a a(l p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "params");
       obj = new a$a();
       p0.invoke(obj);
       return obj.a();
    }
    public final a b(QPhoto p0,l p1){
       String str = "3";
       a$a obj = PatchProxy.applyTwoRefs(p0, p1, this, a$b.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       if (p1 != null) {
          p1.invoke(obj);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, obj, a$a.class, str) && p0 != null) {
          a$a a = obj.a;
          a.o = p0;
          if (a.e() == null) {
             obj.l(p0.newComment(obj.a.o(), obj.a.l(), obj.a.k(), b.a(QCurrentUser.me())));
          }else {
             obj.l(obj.a.e());
             if (a.d()) {
                Object[] objArray = new Object[0];
                m1.C().t("AddCommentParams", "buildWithPhoto method has create comment, so do not setcomment", objArray);
             }
          }
       }
       return obj.a();
    }
}
