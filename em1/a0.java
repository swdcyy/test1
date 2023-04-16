package em1.a0;
import em1.q;
import dm1.d;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import dm1.c;
import java.lang.Runnable;
import t45.c;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import em1.z;
import msd.a;
import k51.b;
import rm1.h;
import em1.y;
import java.lang.Integer;
import com.yxcorp.gifshow.models.Gift;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.image.request.a;
import s0d.e;
import dm1.a;
import em1.a0$a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public class a0 extends q	// class@0021ac
{
    public final d g;

    public void a0(){
       super();
       this.g = new d();
    }
    public void g(List p0,String p1){
       a0 uoa0 = a0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa0, "1")) {
          return;
       }
       if (!PatchProxy.isSupport(uoa0) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.FALSE, p1, this, a0.class, "2")) {
          uoa0 = this.g;
          Objects.requireNonNull(uoa0);
          if (!PatchProxy.isSupport(d.class) || (!PatchProxy.applyVoidThreeRefs(p0, Boolean.FALSE, p1, uoa0, d.class, "1") && !q.f(p0))) {
             c.a(new c(uoa0, p0, false, p1));
          }
       }
       return;
    }
    public String getTag(){
       return "LiveGiftStoreProxyV2";
    }
    public Bitmap h(List p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b("LiveGiftStoreProxyV2::getGiftImage", new z(this, p0, p1));
    }
    public Bitmap j(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h(h.a(p0), p1);
    }
    public void m(List p0,boolean p1,String p2){
       if (PatchProxy.isSupport(a0.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, a0.class, "3")) {
          return;
       }
       c.a(new y(this, p0, p1, p2));
       return;
    }
    public void n(List p0,boolean p1,String p2){
       if (PatchProxy.isSupport(a0.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, a0.class, "2")) {
          return;
       }
       a0 tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.isSupport(d.class) || (!PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, tg, d.class, "1") && !q.f(p0))) {
          c.a(new c(tg, p0, p1, p2));
       }
       return;
    }
    public Bitmap u(int p0,String p1){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa0, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Gift gift = this.s(p0);
       if (gift == null) {
          return null;
       }else {
          return this.h(gift.mImageUrl, p1);
       }
    }
    public void x(int p0,List p1,int p2){
       if (PatchProxy.isSupport(a0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, a0.class, "7")) {
          return;
       }
       if (p0 >= p1.size()) {
          return;
       }
       e uoe = a.r(p1.get(p0)).q();
       a0 tg = this.g;
       CDNUrl uCDNUrl = p1.get(p0);
       Objects.requireNonNull(tg);
       String str = PatchProxy.applyOneRefs(uCDNUrl, tg, d.class, "8");
       if (str != PatchProxyResult.class) {
       }else {
          str = a.b(uCDNUrl);
       }
       Object obj = str;
       a0$a uoa = new a0$a(this, p2, obj, p0, p1, p2, obj);
       a.d(uoe, str);
       return;
    }
}
