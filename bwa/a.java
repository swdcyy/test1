package bwa.a;
import y8c.g;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import im8.c;
import ekd.j;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hwa.a;
import ml8.c;

public class a extends g	// class@000483
{
    public final CommonInsertCardFeed w;

    public void a(CommonInsertCardFeed p0){
       super();
       this.w = p0;
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{new c("HOTSPOT_CARD_DATA", this.w)};
       return j.a(obj);
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new a());
       return new f(a.i(p0, 0x7f0d0608), obj);
    }
}
