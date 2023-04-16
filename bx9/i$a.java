package bx9.i$a;
import hk9.d;
import com.yxcorp.gifshow.comment.CommentParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import kk9.a;

public class i$a extends d	// class@000503
{
    public final CommentParams a;

    public void i$a(CommentParams p0){
       this.a = p0;
       super();
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.a.mQPhoto.isLongPhotos()) {
          return 0x7f0d165d;
       }
       return 0x7f0d05ff;
    }
    public a b(CommentsFragment p0){
       return null;
    }
}
