package m99.k;
import y8c.g;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import y8c.a;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.ArrayList;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m99.k$a;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import n99.g;
import android.view.View;
import i2b.a;
import ml8.c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class k extends g	// class@002e34
{
    public final PhotoDetailParam w;
    public final a x;
    public final List y;

    public void k(PhotoDetailParam p0,a p1){
       super();
       this.w = p0;
       this.x = p1;
       p0 = p0.mPhoto;
       this.y = (p0 != null)? p0.getAtlasList(): new ArrayList();
       return;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k$a(p0, this.w, this.x);
    }
    public int f0(int p0){
       return 1;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (q.f(this.y)) {
          return 0;
       }
       return this.y.size();
    }
    public f h1(ViewGroup p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d165b), new g());
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
    }
}
