package bpd.y;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.kwaitoken.model.SimpleDialogInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import android.graphics.drawable.Drawable;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import apd.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import bpd.w;
import android.view.View$OnClickListener;
import bpd.x;
import java.lang.Object;
import bpd.z;
import java.util.Map;
import java.util.HashMap;

public class y extends PresenterV2 implements g	// class@0002b3
{
    public TextView p;
    public KwaiImageView q;
    public TextView r;
    public SimpleDialogInfo s;
    public i t;

    public void y(){
       super();
    }
    public void E8(){
       this.p.setText(this.s.mTitle);
       boolean b = false;
       if (TextUtils.x(this.s.mFooterText)) {
          this.r.setVisibility(4);
       }else {
          this.r.setText(this.s.mFooterText);
          this.r.setVisibility(b);
       }
       if (TextUtils.x(this.s.mFooterTargetUrl)) {
          this.r.setClickable(b);
          this.r.setCompoundDrawables(null, null, null, null);
       }
       this.q.L(this.s.mBigPicUrl);
       return;
    }
    public void doBindView(View p0){
       this.p = j.b(p0, 0x7f0a3bf5);
       this.q = j.b(p0, 0x7f0a300b);
       this.r = j.b(p0, 0x7f0a3a8f);
       j.a(p0, new w(this), R.id.close);
       j.a(p0, new x(this), R.id.source);
    }
    public Object getObjectByTag(String p0){
       if (p0.equals("injector")) {
          return new z();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap hashMap = new HashMap();
       if (p0.equals("injector")) {
          hashMap.put(y.class, new z());
       }else {
          hashMap.put(y.class, null);
       }
       return hashMap;
    }
}
