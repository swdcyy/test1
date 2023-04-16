package g69.d;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.aggregate.user.UserAggregateFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.aggregate.AggregateActivity;
import android.content.res.Resources;

public class d extends RecyclerView$r	// class@002423
{
    public final UserAggregateFragment a;

    public void d(UserAggregateFragment p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d.class, "1")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (layoutManage instanceof LinearLayoutManager) {
          if (layoutManage.i0() > 0) {
             this.a.getActivity().u3(this.a.getResources().getString(R.string.arg_RES_7f1041bf));
          }else {
             this.a.getActivity().u3("");
          }
       }
       return;
    }
}
