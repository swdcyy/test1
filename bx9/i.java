package bx9.i;
import java.lang.Object;
import com.yxcorp.gifshow.comment.e;
import ek9.t0;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.CommentConfig;
import bx9.i$c;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import ik9.i;
import bx9.i$a;
import ik9.d;
import bx9.i$b;
import ik9.f;
import ok9.c;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Bundle;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import androidx.fragment.app.Fragment;
import ik9.c;

public class i	// class@000506
{

    public void i(){
       super();
    }
    public static CommentsFragment a(e p0,t0 p1,CommentParams p2,CommentConfig p3,i$c p4){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, oi, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       oi = new i();
       oi.o(p0);
       oi.n(p1);
       oi.s(new i$a(p2));
       oi.r(new i$b(p2, p4));
       CommonCommentsFragment uCommonComme = PatchProxy.applyThreeRefs(p2, p3, oi, null, c.class, "1");
       if (uCommonComme != PatchProxyResult.class) {
       }else {
          CommonCommentsFragment uCommonComme1 = new CommonCommentsFragment();
          uCommonComme1.setArguments(CommentsFragment.Ih(p2.mQPhoto, p2, p3));
          uCommonComme1.Sh(oi);
          uCommonComme = uCommonComme1;
       }
       return uCommonComme;
    }
}
