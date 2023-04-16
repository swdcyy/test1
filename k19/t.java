package k19.t;
import y8c.g;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import y8c.f$b;
import com.kwai.robust.PatchProxyResult;
import k19.t$a;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;
import y8c.f;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k19.a;
import k19.s;
import k19.r;
import ml8.c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class t extends g	// class@002a97
{
    public QPhoto w;
    public int x;
    public PublishSubject y;

    public void t(QPhoto p0){
       super();
       this.x = 0;
       this.y = PublishSubject.g();
       this.w = p0;
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "6")) {
          return;
       }
       super.W0(p0);
       this.x = p0.size();
       return;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new t$a(p0, this.y, this.Q0(), this.w);
    }
    public int f0(int p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ot, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.Q0().get((p0 % this.Q0().size())) instanceof PhotoAdvertisement$MerchandiseInfo$DiscountInfo) {
          return 1;
       }else {
          return 2;
       }
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(t.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, t.class, "2")) {
          return;
       }
       if (this.x == null) {
          return;
       }
       if (this.r1()) {
          p1 = p1 % this.x;
       }
       super.g1(p0, p1, p2);
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, t.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e == null) {
          return 0;
       }
       if (this.r1()) {
          return Integer.MAX_VALUE;
       }
       return super.getItemCount();
    }
    public f h1(ViewGroup p0,int p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ot, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = (p1 == 1)? 0x7f0d0049: 0x7f0d004c;
       View view = a.i(p0, i);
       PresenterV2 presenterV2 = new PresenterV2();
       if (p1 == 1) {
          presenterV2.U7(new a());
       }else {
          presenterV2.U7(new s());
       }
       presenterV2.U7(new r());
       return new f(view, presenterV2);
    }
    public final boolean r1(){
       boolean b = true;
       if (this.x > b) {
       }else {
          b = false;
       }
       return b;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
