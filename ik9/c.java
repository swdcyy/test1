package ik9.c;
import java.lang.Object;
import ik9.g;
import io.reactivex.subjects.CompletableSubject;
import ok.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ik9.b;
import ik9.a;
import ik9.f;
import xk9.h;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.e;
import ek9.t0;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import al9.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import al9.b;
import ik9.d;
import hk9.d;
import mrd.a;

public class c	// class@00285c
{

    public void c(){
       super();
    }
    public g a(){
       return null;
    }
    public CompletableSubject b(){
       return null;
    }
    public x c(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b;
    }
    public x d(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b;
    }
    public f e(){
       return null;
    }
    public h f(){
       return null;
    }
    public e g(CommentParams p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new e();
    }
    public t0 h(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new t0();
    }
    public a i(CommentParams p0,CommentPageListConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.mQPhoto, p0.mComment, p1);
    }
    public d j(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
    public a k(){
       return null;
    }
    public a l(){
       return null;
    }
}
