package al9.b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import al9.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import al9.j;
import com.yxcorp.gifshow.comment.utils.d;
import java.util.List;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.HyperTag;
import java.util.Collections;

public class b	// class@0000e9
{

    public void b(){
       super();
    }
    public static a a(QPhoto p0,QComment p1,CommentPageListConfig p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       HyperTag hyperTag = PatchProxy.applyOneRefs(p0, null, d.class, "36");
       if (hyperTag != patchProxyRe) {
       }else if(p0 != null && (p0.getPhotoMeta() != null && (p0.getPhotoMeta().mHyperTag != null && p0.getPhotoMeta().mHyperTag.mCommentIds != null))){
          hyperTag = p0.getPhotoMeta().mHyperTag.mCommentIds;
       }else {
          hyperTag = Collections.emptyList();
       }
       return new j(p0, p1, hyperTag, p2);
    }
}
