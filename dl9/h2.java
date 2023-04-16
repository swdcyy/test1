package dl9.h2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ek9.l1;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import al9.a;
import java.util.Objects;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public final class h2 extends PresenterV2	// class@001f68
{
    public QComment p;
    public CommentsFragment q;
    public final List r;
    public final int s;

    public void h2(){
       super();
       this.r = CollectionsKt__CollectionsKt.E();
       this.s = 5;
    }
    public void E8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h2.class, "2")) {
          return;
       }
       if (l1.a()) {
          return;
       }
       h2 tp = this.p;
       if (tp == null) {
          a.S("mComment");
       }
       String comment = tp.getComment();
       h2 obj = PatchProxy.applyOneRefs(comment, objArray, e.class, "18");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(TextUtils.x(comment)){
          b = false;
       }else {
          b = c0.a.matcher(comment).find();
       }
       if (b && this.r.size() <= this.s) {
          tp = this.r;
          obj = this.p;
          if (obj == null) {
             a.S("mComment");
          }
          if (!tp.contains(obj.getComment())) {
             tp = this.q;
             a.m(tp);
             if (tp.q() instanceof a) {
                tp = this.q;
                a.m(tp);
                i oi = tp.q();
                Objects.requireNonNull(oi, "null cannot be cast to non-null type com.yxcorp.gifshow.comment.pagelist.CommentPageList");
                oi.A0((oi.D0() + 1));
             }
          }
       }
    label_008a :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h2.class, "1")) {
          return;
       }
       this.q = this.t8("FRAGMENT");
       Object obj = this.q8(QComment.class);
       a.o(obj, "inject\(QComment::class.java\)");
       this.p = obj;
       return;
    }
}
