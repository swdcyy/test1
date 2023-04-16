package m89.a;
import vo5.a;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.atlas_detail.vertical.VerticalPhotosFragment;
import com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import n89.m;
import n89.a;
import m99.f;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Number;
import l17.a;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.gifshow.detail.nonslide.PhotoDetailBaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.atlas_detail.vertical.VerticalAtlasDetailFragment;
import com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalAtlasDetailFragment;

public class a implements a	// class@002e27
{

    public void a(){
       super();
    }
    public boolean FW(BaseFragment p0){
       return p0 instanceof VerticalPhotosFragment;
    }
    public boolean Hw(BaseFragment p0){
       return p0 instanceof HorizontalPhotosFragment;
    }
    public boolean R30(BaseFragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int[] obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof VerticalPhotosFragment) {
          Objects.requireNonNull(p0);
          obj = PatchProxy.apply(null, p0, VerticalPhotosFragment.class, "25");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             VerticalPhotosFragment r = p0.r;
             if (r.d != null) {
                int itemCount = r.a2.getItemCount();
                RecyclerView$LayoutManager layoutManage = p0.r.d.getLayoutManager();
                if (layoutManage instanceof LinearLayoutManager) {
                   if (layoutManage.c() < itemCount) {
                   label_0065 :
                      return b;
                   }
                }else if(layoutManage instanceof StaggeredGridLayoutManager){
                   obj = new int[2];
                   if (layoutManage.findLastVisibleItemPositions(obj)[1] < itemCount) {
                   }
                }else {
                   goto label_0065 ;
                }
                b = true;
                goto label_0065 ;
             }
          }
       }else {
          goto label_0065 ;
       }
    }
    public float XJ(BaseFragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       float f = 0;
       if (p0 instanceof VerticalPhotosFragment) {
          Objects.requireNonNull(p0);
          obj = PatchProxy.apply(null, p0, VerticalPhotosFragment.class, "23");
          if (obj != patchProxyRe) {
             f = obj.floatValue();
          }else {
             m d = p0.r.d;
             if (d != null) {
                obj = a.a(d);
                int i = obj.e();
                int i1 = obj.c();
                int i2 = p0.lh();
                if (i2 >= i1) {
                   if (i > i2) {
                      View childAt = d.getChildAt(((p0.lh() + 1) - i1));
                      if (childAt != null) {
                         int[] ointArray = new int[2];
                         childAt.getLocationOnScreen(ointArray);
                         int[] ointArray1 = new int[2];
                         p0.m.getLocationOnScreen(ointArray1);
                         f = (float)(ointArray[1] - ointArray1[1]);
                      }
                   }else {
                      FragmentActivity activity = p0.getActivity();
                      if (activity != null) {
                         int i3 = n.j(activity);
                         float f1 = (i3)? (float)i3: (float)n.t(activity);
                         f = f1;
                      }
                   }
                }
             }
          }
       }
       return f;
    }
    public BaseFragment aP(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VerticalAtlasDetailFragment();
    }
    public boolean isAvailable(){
       return true;
    }
    public BaseFragment u10(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HorizontalAtlasDetailFragment();
    }
}
