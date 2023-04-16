package hl9.s;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import k2b.u1;
import com.kuaishou.android.model.mix.QSubComment;
import com.yxcorp.gifshow.comment.utils.d;
import java.util.List;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import la6.a;

public final class s	// class@0026dd
{
    public static final s a;

    static {
       s.a = new s();
    }
    public void s(){
       super();
    }
    public static final boolean a(QComment p0,String p1){
       QComment qComment = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, qComment, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p1, "photoId");
       if (p0 != null) {
          qComment = p0.mSubComment;
       }
       boolean b = false;
       if (qComment == null) {
          if (p0 != null) {
             u1.Q("CommentSubCommentNull", "photoId:"+p1+"&commentId:"+p0.getId());
          }
          return b;
       }else {
          int i = d.f(p0.mSubComment);
          QSubComment mComments = p0.mSubComment.mComments;
          int i1 = (mComments != null)? mComments.size(): 0;
          if (i1 <= i && (p0.getEntity().mHasCollapseSub != null || a.a(p0.mSubComment.mCursor))) {
             b = true;
          }
          return b;
       }
    }
    public static final boolean b(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "comment");
       boolean b = (p0.mSubCommentVisible == null && (p0.hasSub() && p0.getEntity().mHasCollapseSub != null))? true: false;
       return b;
    }
}
