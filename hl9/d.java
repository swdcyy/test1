package hl9.d;
import java.lang.Object;
import java.lang.Class;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class d	// class@0026c8
{

    public void d(){
       super();
    }
    public static Object a(Class p0,CommentsFragment p1){
       Fragment uFragment = null;
       Fragment obj = PatchProxy.applyTwoRefs(p0, p1, uFragment, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       for (obj = p1.getParentFragment(); obj != null; obj = obj.getParentFragment()) {
          if (p0.isAssignableFrom(obj.getClass())) {
             uFragment = obj;
             break ;
          }else {
          }
       }
       if (uFragment == null && p0.isAssignableFrom(p1.getActivity().getClass())) {
          uFragment = p1.getActivity();
       }
       return uFragment;
    }
}
