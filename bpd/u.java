package bpd.u;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.kwaitoken.model.OnePictureDialogInfo;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import apd.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import bpd.s;
import android.view.View$OnClickListener;
import bpd.t;
import java.lang.Object;
import bpd.v;
import java.util.Map;
import java.util.HashMap;

public class u extends PresenterV2 implements g	// class@0002af
{
    public KwaiImageView p;
    public OnePictureDialogInfo q;
    public i r;

    public void u(){
       super();
    }
    public void E8(){
       u tq = this.q;
       if (tq != null) {
          this.p.L(tq.mBigPicUrl);
       }
       return;
    }
    public void doBindView(View p0){
       KwaiImageView kwaiImageVie = j.b(p0, R.id.photo);
       this.p = kwaiImageVie;
       kwaiImageVie.setPlaceHolderImage(R.drawable.arg_RES_7f081a45);
       j.a(p0, new s(this), R.id.close);
       j.a(p0, new t(this), R.id.photo);
    }
    public Object getObjectByTag(String p0){
       if (p0.equals("injector")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap hashMap = new HashMap();
       if (p0.equals("injector")) {
          hashMap.put(u.class, new v());
       }else {
          hashMap.put(u.class, null);
       }
       return hashMap;
    }
}
