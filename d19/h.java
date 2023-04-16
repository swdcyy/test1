package d19.h;
import ub.a;
import com.yxcorp.gifshow.ad.detail.presenter.player.f;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import gb5.a;
import com.yxcorp.gifshow.ad.detail.presenter.player.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.drawable.Animatable;
import bd.f;

public class h extends a	// class@00202e
{
    public final f b;

    public void h(f p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "2")) {
          return;
       }
       h tb = this.b;
       b.a(0x8708467).l(tb.B, false, tb.q, p1);
       b.a(0x8708467).log("Single Photo first frame error");
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "1")) {
       }else {
          h tb = this.b;
          b.a(0x8708467).n(tb.B, false, tb.q);
          b.a(0x8708467).log("Single Photo first frame ready");
       }
       return;
    }
}
