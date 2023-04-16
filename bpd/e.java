package bpd.e;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.kwaitoken.model.BigHeadDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.Button;
import android.view.View;
import apd.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import bpd.a;
import android.view.View$OnClickListener;
import bpd.b;
import bpd.c;
import bpd.d;
import java.lang.Object;
import bpd.f;
import java.util.Map;
import java.util.HashMap;

public class e extends PresenterV2 implements g	// class@00029f
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public Button s;
    public TextView t;
    public BigHeadDialogInfo u;
    public i v;

    public void e(){
       super();
    }
    public void E8(){
       boolean b = false;
       if (TextUtils.x(this.u.mFooterText)) {
          this.t.setVisibility(8);
       }else {
          this.t.setText(this.u.mFooterText);
          this.t.setVisibility(b);
       }
       if (TextUtils.x(this.u.mFooterTargetUrl)) {
          this.t.setClickable(b);
          this.t.setCompoundDrawables(null, null, null, null);
       }
       this.p.L(this.u.mIconUrl);
       this.p.setPlaceHolderImage(R.drawable.arg_RES_7f08104a);
       this.r.setText(this.u.mSubTitle);
       if (TextUtils.x(this.u.mSubTitle)) {
          this.r.setVisibility(4);
       }else {
          this.r.setVisibility(b);
       }
       this.q.setText(this.u.mTitle);
       this.s.setText(this.u.mActionButtonText);
       return;
    }
    public void doBindView(View p0){
       this.p = j.b(p0, 0x7f0a0333);
       this.q = j.b(p0, 0x7f0a3f2c);
       this.r = j.b(p0, 0x7f0a3bf5);
       this.s = j.b(p0, 0x7f0a007c);
       this.t = j.b(p0, 0x7f0a3a8f);
       j.a(p0, new a(this), R.id.close);
       j.a(p0, new b(this), R.id.action);
       j.a(p0, new c(this), R.id.avatar);
       j.a(p0, new d(this), R.id.source);
    }
    public Object getObjectByTag(String p0){
       if (p0.equals("injector")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap hashMap = new HashMap();
       if (p0.equals("injector")) {
          hashMap.put(e.class, new f());
       }else {
          hashMap.put(e.class, null);
       }
       return hashMap;
    }
}
