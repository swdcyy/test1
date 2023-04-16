package b99.d;
import b99.f;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import f4a.g0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Number;
import m99.f;
import java.lang.Math;

public class d extends f	// class@00039b
{
    public f B;
    public f C;
    public static final int D;

    static {
       d.D = a1.d(0x7f070271);
    }
    public void d(){
       super();
    }
    public void V8(){
       boolean b;
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "3")) {
          return;
       }
       RecyclerView recyclerView = this.B.get();
       View view = this.m8();
       if (recyclerView == null) {
          return;
       }
       if (g0.a(this.r)) {
          this.P8();
       }
       RecyclerView$ViewHolder obj = PatchProxy.applyOneRefs(recyclerView, this, uod, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          b = false;
          RecyclerView$LayoutManager layoutManage = recyclerView.getLayoutManager();
          if (layoutManage instanceof LinearLayoutManager) {
             if (layoutManage.c() <= this.X8()) {
             label_0065 :
                if (b) {
                   obj = recyclerView.findViewHolderForAdapterPosition((this.X8() + 1));
                   if (obj != null) {
                      this.S8((float)(((int)obj.itemView.getY() - view.getHeight()) - d.D));
                   }else {
                      Activity activity = this.getActivity();
                      if (activity != null && !activity.isFinishing()) {
                         this.S8((float)(- (n.j(activity) + view.getHeight())));
                      }
                   }
                }else {
                   this.S8((float)(- d.D));
                }
                return;
             }
          }else if(layoutManage instanceof StaggeredGridLayoutManager){
             int[] ointArray = new int[2];
             if (layoutManage.findLastVisibleItemPositions(ointArray)[1] <= this.X8()) {
             }
          }else {
             goto label_0065 ;
          }
          b = true;
          goto label_0065 ;
       }
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       super.W8();
       if (g0.a(this.r)) {
          this.S8(0);
       }
       return;
    }
    public final int X8(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max((this.C.s1() - 1), 0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       super.j8();
       this.B = this.r8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.C = this.q8(f.class);
       return;
    }
}
