package x2b.a;
import erd.g;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import java.lang.Object;
import x2b.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import y8c.c;
import y8c.q;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import com.kuaishou.android.model.music.Music;

public abstract class a implements g	// class@00482d
{
    public final RecyclerView b;
    public final g c;
    public int d;
    public boolean e;
    public boolean f;

    public void a(RecyclerView p0,g p1){
       super();
       this.d = -1;
       this.e = true;
       this.b = p0;
       this.c = p1;
       p0.addOnScrollListener(new a$a(this));
    }
    public final int a(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       RecyclerView$LayoutManager layoutManage = this.b.getLayoutManager();
       if (layoutManage instanceof StaggeredGridLayoutManager) {
          int[] ointArray = this.b.getLayoutManager().findFirstVisibleItemPositions(objArray);
          int i1 = 0;
          if (ointArray != null && ointArray.length > 0) {
             i = ointArray[i1];
          }
          int len = ointArray.length;
          while (i1 < len) {
             int i2 = ointArray[i1];
             if (i2 < i) {
                i = i2;
             }
             i1 = i1 + 1;
          }
       }else if(layoutManage instanceof GridLayoutManager || layoutManage instanceof LinearLayoutManager){
          i = layoutManage.i0();
       }
       return i;
    }
    public void accept(Object p0){
       c a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
       }else {
          a = p0.a;
          boolean b = true;
          if (a != b) {
             if (a != 4) {
                if (a != 5) {
                   if (a == 6 && (p0.b != null && !p0.c.g7().R0())) {
                      this.e();
                      this.d = -1;
                   }
                }else {
                   this.d();
                }
             }else {
                this.f = b;
                this.e();
             }
          }else {
             this.f = false;
          }
       }
       return;
    }
    public int b(){
       Object[] objArray = null;
       RecyclerView$LayoutManager obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.getLayoutManager();
       int i = -1;
       if (obj instanceof StaggeredGridLayoutManager) {
          if (!this.f(obj)) {
             return i;
          }else {
             int[] ointArray = this.b.getLayoutManager().findLastVisibleItemPositions(objArray);
             int len = ointArray.length;
             int i1 = 0;
             while (i1 < len) {
                int i2 = ointArray[i1];
                if (i2 > i) {
                   i = i2;
                }
                i1 = i1 + 1;
             }
          }
       }else if(obj instanceof GridLayoutManager || obj instanceof LinearLayoutManager){
          i = obj.c();
       }
       return i;
    }
    public final boolean c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0.getMusic() != null && p0.getMusic().mIsFakeQPhoto != null) {
          b = true;
       }
       return b;
    }
    public void d(){
    }
    public abstract void e();
    public boolean f(StaggeredGridLayoutManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getSpanCount() == 2)? true: false;
       return b;
    }
}
