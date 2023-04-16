package d4c.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import lnc.a1;
import d4c.b$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.utils.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import jd.c;
import ub.b;
import wb5.g;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import kob.r;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.music.utils.g;
import kqb.d0;
import npb.c;
import com.kwai.library.widget.specific.misc.PlayBackView;
import tkd.b;
import tkd.d;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import d4c.a;
import android.view.View$OnClickListener;
import qm9.e0;

public class b extends PresenterV2	// class@0020c4
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public ImageView s;
    public PlayBackView t;
    public Music u;
    public c v;
    public r w;
    public e0 x;
    public final a y;
    public static final String A;
    public static final long z;

    static {
       b.z = TimeUnit.SECONDS.toMillis(10);
       b.A = a1.p(0x7f103f62);
    }
    public void b(){
       super();
       this.y = new b$a(this);
    }
    public void E8(){
       String str;
       long l;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          if (!this.u.equals(this.p.getTag(0x7f0a2c76))) {
             g.x(this.p, this.u, d.c, objArray, this.y);
          }
          if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
             str = this.u.getDisplayName();
             if (!TextUtils.n(str, this.q.getText())) {
                this.q.setText(str);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, uob, "8")) {
             b ts = this.s;
             int i1 = (this.w.e40())? 0x7f081acf: 0x7f081ad0;
             ts.setImageResource(i1);
          }
          if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
             str = "";
             Object obj = PatchProxy.apply(objArray, this, uob, "11");
             if (obj != PatchProxyResult.class) {
                l = obj.longValue();
             }else if(this.w.e40()){
                l = g.a(this.u);
             }else {
                l = 0;
             }
             str = str+d0.a(l)+b.A;
             if (!TextUtils.n(str, this.r.getText())) {
                this.r.setText(str);
             }
          }
       }
    label_00c2 :
       if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
          c uoc = new c(this.u);
          this.v = uoc;
          int i = this.w.ca(uoc);
          if (i == 2) {
             this.t.d();
          }else if(i == 11 || i == 22){
             this.t.b();
          }else if(i == 21){
             this.t.c();
          }else if(i == 23){
             this.t.d();
          }else {
             this.t.d();
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.w = d.a(-1687636538);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2d10);
       this.r = m1.f(p0, 0x7f0a2cd0);
       this.t = m1.f(p0, 0x7f0a30c5);
       this.s = m1.f(p0, 0x7f0a2cf4);
       this.p = m1.f(p0, 0x7f0a2c76);
       m1.a(p0, new a(this), R.id.music_cover);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.u = this.q8(Music.class);
       this.x = this.s8(e0.class);
       return;
    }
}
