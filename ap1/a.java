package ap1.a;
import im8.g;
import k51.c;
import lnc.a1;
import ap1.a$a;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintItem;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import ap1.d;
import java.util.Map;
import java.util.HashMap;

public abstract class a extends c implements g	// class@00026d
{
    public KwaiImageView p;
    public p q;
    public static final int r = 0;
    public static final int s = 0;
    public static String sLivePresenterClassName = "LiveGiftBoxMagicBoxBasePresenter";

    static {
       a.r = a1.e(164.00f);
       a.s = a1.e(84.00f);
    }
    public void a(){
       super();
       this.q = new a$a(this);
    }
    public abstract void P8();
    public abstract void R8();
    public void S8(){
    }
    public abstract void V8(LiveGiftItemHintItem p0);
    public void doBindView(View p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "2")) {
          this.p = new KwaiImageView(this.getContext());
          this.p.setLayoutParams(new LinearLayout$LayoutParams(a.r, a.s));
          this.p.setClickable(true);
          this.p.setFocusable(true);
          this.p.requestLayout();
          this.p.setVisibility(8);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       PatchProxy.applyVoid(null, this, a.class, "1");
    }
}
