package n21.p;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Object;
import n21.p$a;
import n21.e;
import android.view.View$OnClickListener;
import n21.p$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import hc.a;
import ac.a;
import s0d.f;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import n21.r;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import n21.j;
import java.lang.reflect.Type;
import java.util.Map;
import ow0.a;
import n21.p$b;
import ks5.m;

public class p	// class@00329b
{
    public final View a;
    public final KwaiImageView b;
    public final TextView c;
    public final m d;
    public View e;
    public String f;
    public a g;

    public void p(View p0,KwaiImageView p1,TextView p2,View p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.d = new p$a(this, p0);
    }
    public void a(e p0,boolean p1,View$OnClickListener p2,p$c p3){
       Object[] objArray;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, p.class, "1")) {
          return;
       }
       e f = p0.f;
       if (q.f(p0.b()) || TextUtils.x(f)) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          objArray = p0.a().toArray(uCDNUrlArray);
          this.c.setVisibility(8);
       }else {
          CDNUrl[] uCDNUrlArray1 = new CDNUrl[0];
          objArray = p0.b().toArray(uCDNUrlArray1);
          this.c.setText(f);
          this.c.setVisibility(0);
       }
       this.f = p0.e();
       boolean b = true;
       if (p1 && !j.h(objArray)) {
          p tg = this.g;
          if (tg != null && tg.isRunning()) {
             this.g.stop();
          }
          tg = this.b;
          AbstractDraweeController uAbstractDra = PatchProxy.applyTwoRefs(objArray, p3, this, op, "3");
          if (uAbstractDra != PatchProxyResult.class) {
          }else {
             d uod = Fresco.newDraweeControllerBuilder();
             uod.w(f.x().r(objArray).v());
             uod.q(b);
             uod.s(new r(this, p3));
             uAbstractDra = uod.e();
          }
          tg.setController(uAbstractDra);
       }
       if (p0.i != null) {
          p tf = this.f;
          Map obj = PatchProxy.applyOneRefs(tf, null, j.class, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = a.n(j.a);
             if (obj != null) {
                String str = obj.get(tf);
                if (str != null && TextUtils.n(j.a(), str)) {
                   b = false;
                }
             }
          }
          if (b) {
             this.e.setVisibility(0);
          label_00f0 :
             this.a.setOnClickListener(new p$b(this, p2));
             return;
          }
       }
       this.e.setVisibility(8);
       goto label_00f0 ;
    }
    public m b(){
       return this.d;
    }
}
