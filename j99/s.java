package j99.s;
import n2a.c;
import o89.c;
import android.view.View;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import n89.a;
import n89.m;
import y8c.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;
import y89.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y89.a;
import s2a.a;
import j99.s$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewParent;
import android.view.ViewGroup;

public class s extends c implements c	// class@0027d3
{
    public f l;

    public void s(View p0,PhotoDetailParam p1,NormalDetailBizParam p2,a p3){
       super(p3, p1, p2);
       this.l = new f(p0, new PresenterV2());
    }
    public g J0(){
       Object obj = PatchProxy.apply(null, this, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public a K0(){
       Object obj = PatchProxy.apply(null, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new s$a(this, 257, false);
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       RecyclerView$ViewHolder itemView = this.l.itemView;
       if (itemView.getParent() instanceof ViewGroup) {
          itemView.getParent().removeView(itemView);
       }
       return;
    }
}
