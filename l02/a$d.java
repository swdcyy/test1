package l02.a$d;
import l02.e;
import l02.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.collection.LruCache;
import l02.f;
import java.util.LinkedList;
import l02.e$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lp3.e;
import lp3.c;
import lp3.b;

public final class a$d implements e	// class@002e4a
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void Am(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "2")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       if (id != null) {
          Objects.requireNonNull(a.w);
          b.Z(a.v, "update user tag: "+p0);
          if (this.b.V8(p0)) {
             this.b.q.remove(id);
          }else {
             a.m(p0);
             this.b.q.put(id, p0);
          }
          this.b.S8();
       }
       return;
    }
    public void Ed(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       if (!this.b.r.contains(p0)) {
          this.b.r.add(p0);
       }
       return;
    }
    public void Ke(String p0,e$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$d.class, "6")) {
          return;
       }
       a.p(p0, "currentUserTag");
       this.b.W8(p0, p1);
       return;
    }
    public String R(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          p0 = null;
       }else {
          a.m(p0);
          p0 = this.b.q.get(p0);
       }
       return p0;
    }
    public void a1(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "5")) {
          return;
       }
       a$d tb = this.b;
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String str = this.R(qCurrentUser.getId());
       if (str == null) {
          str = "";
       }
       tb.W8(str, null);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void sd(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.b.r.remove(p0);
       return;
    }
}
