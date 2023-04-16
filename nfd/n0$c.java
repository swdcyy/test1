package nfd.n0$c;
import nfd.n0$e;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import nfd.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import zf6.k;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Boolean;
import nfd.n0;
import ekd.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import android.content.res.ColorStateList;
import e2.d;

public class n0$c implements n0$e	// class@001dd6
{
    public View a;
    public ImageView b;
    public TextView c;
    public int d;
    public CDNUrl[] e;
    public m0 f;

    public void n0$c(View p0,ImageView p1,TextView p2,m0 p3){
       super();
       this.d = -1;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.f = p3;
    }
    public int a(){
       n0$c obj = PatchProxy.apply(null, this, n0$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.f;
       if (obj != null && obj.e != null) {
          return 0x7f081e5c;
       }
       int i = (k.d())? 0x7f081e5e: 0x7f081e5d;
       return i;
    }
    public void b(int p0){
       this.d = p0;
    }
    public void c(){
    }
    public void d(CDNUrl[] p0){
       this.e = p0;
    }
    public int e(){
       n0$c tf = this.f;
       if (tf != null && tf.e != null) {
          return 0x7f081e5b;
       }
       return 0x7f081e5f;
    }
    public int f(int p0){
       n0$c tf = this.f;
       if (tf != null && tf.e != null) {
          p0 = 0x7f061be0;
       }
       return p0;
    }
    public void g(boolean p0,boolean p1){
       n0$c uoc = n0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       n0$c tb = this.b;
       if (tb == null) {
          return;
       }
       uoc = this.d;
       if (uoc > null) {
          n0.c(tb, uoc);
          this.b.setVisibility(8);
       }else if(!j.h(this.e)){
          tb = this.b;
          if (tb instanceof KwaiImageView) {
             tb.U(this.e);
             this.b.setVisibility(8);
          }
       }
       this.b.setVisibility(8);
       if (p1) {
          d.c(this.b, ColorStateList.valueOf(a1.a(this.f(R.color.arg_RES_7f0620d1))));
       }
       return;
    }
}
