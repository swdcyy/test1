package m9a.s;
import java.lang.Object;
import android.app.Activity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import ekd.j0;
import android.net.Uri;
import ekd.x0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;

public final class s	// class@002f91
{

    public void s(){
       super();
    }
    public static void a(Activity p0,PhotoDetailParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, s.class, "1")) {
          return;
       }
       if (p0 == null || (p1 != null && p1.mPhoto != null)) {
          Intent intent = p0.getIntent();
          String str = "featured_uri_comment_id_used";
          if (j0.a(intent, str, false)) {
             return;
          }else {
             Uri data = intent.getData();
             if (data == null) {
                return;
             }else if(!TextUtils.n(x0.a(data, "photoId"), p1.mPhoto.getPhotoId())){
                return;
             }else {
                String str1 = x0.a(data, "rootCommentId");
                String str2 = x0.a(data, "commentId");
                boolean b = Boolean.parseBoolean(x0.a(data, "photoCommentAtNotification"));
                if (!TextUtils.x(str2)) {
                   intent.putExtra(str, true);
                   QComment qComment = new QComment();
                   qComment.mId = str2;
                   qComment.mRootCommentId = str1;
                   p1.getDetailCommonParam().setComment(qComment);
                   p1.getDetailCommonParam().setFromCommentAt(b);
                   p1.getDetailCommonParam().setFromCommentPush(true);
                   p1.getDetailCommonParam().setCommentPushFirst(true);
                }
             }
          }
       }
       return;
    }
}
