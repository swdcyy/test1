package an9.l;
import pa5.n;
import com.kwai.kcube.TabIdentifier;
import a9c.e;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import java.lang.Object;
import java.lang.String;
import y8c.g;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import y8c.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import an9.f;
import pa5.a;
import com.yxcorp.gifshow.log.e;
import com.kwai.component.photo.reduce.f;
import ha5.e;
import an9.m;
import an9.a;
import android.view.View;
import z99.a;
import com.kwai.component.feedstaggercard.a;
import com.yxcorp.gifshow.commontab.a;
import qa5.h;
import androidx.recyclerview.widget.RecyclerView;
import y8c.q;

public class l extends n	// class@00010d
{
    public final ArrayList F;

    public void l(TabIdentifier p0,e p1,PhotoItemViewParam p2,Object[] p3){
       super(p2, p1);
       this.n1("HOME_TAB", p0);
       this.F = Lists.e(p3);
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.l1(p0);
    }
    public ArrayList a1(int p0,f p1){
       return this.F;
    }
    public String b1(){
       return "common";
    }
    public f$b d1(f$b p0){
       QPhoto obj = PatchProxy.applyOneRefs(p0, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N0(p0.b);
       boolean b = (obj == null)? false: obj.mEntity;
       QPhoto qPhoto = b;
       if (qPhoto != null && r1.S2(qPhoto)) {
          f uof = new f(p0, this.x, this.B, this.C, this.u1(), qPhoto);
          return v7;
       }else if(qPhoto != null && r1.D3(qPhoto)){
          m om = new m(p0, this.x, this.B, this.C, this.u1(), new QPhoto(qPhoto));
          return v7;
       }else {
          a uoa = new a(p0, this.x, this.B, this.C, this.u1());
          return qPhoto;
       }
    }
    public final void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       a.a(p0.itemView, R.id.play_view_container);
       super.k1(p0);
       return;
    }
    public final void l1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       a.b(p0.itemView, R.id.play_view_container);
       super.l1(p0);
       return;
    }
    public a s1(PhotoItemViewParam p0,TabIdentifier p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new a(p0);
    }
    public h v1(){
       Object obj = PatchProxy.apply(null, this, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this.k.h0(), this);
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       a.c(p0, R.id.play_view_container);
       super.z0(p0);
       return;
    }
}
