package i6a.o$c;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView$b;
import i6a.o;
import java.lang.Object;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta$InterestV3Entity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.ArrayList;
import qrd.l1;
import wkd.b;
import psb.c;
import com.google.gson.Gson;
import brd.t;
import cjd.e;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class o$c implements InterestItemView$b	// class@0027a2
{
    public final o a;

    public void o$c(o p0){
       this.a = p0;
       super();
    }
    public void a(int p0,InterestManagementV3Meta$InterestV3Entity p1){
       int i;
       if (PatchProxy.isSupport2(o$c.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, o$c.class, "1")) {
          return;
       }
       a.p(p1, "entity");
       o$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport2(o.class, "7") || !PatchProxy.applyVoidTwoRefsWithListener(p1, Integer.valueOf(p0), ta, o.class, "7")) {
          InterestManagementV3Meta$InterestV3Entity mUpdatedWeig = p1.mUpdatedWeight;
          if (mUpdatedWeig != null) {
             a.o(mUpdatedWeig, "entity.mUpdatedWeight");
             i = mUpdatedWeig.intValue();
          }else {
             i = p1.mWeight;
          }
          if (p0 != i) {
             p1.mUpdatedWeight = Integer.valueOf(p0);
             p1 = p1.mId;
             a.o(p1, "entity.mId");
             if (!PatchProxy.isSupport2(o.class, "8") || !PatchProxy.applyVoidTwoRefsWithListener(p1, Integer.valueOf(p0), ta, o.class, "8")) {
                ArrayList uArrayList = new ArrayList();
                InterestManagementV3Meta$InterestV3Entity interestV3En = new InterestManagementV3Meta$InterestV3Entity();
                interestV3En.mId = p1;
                interestV3En.mWeight = p0;
                uArrayList.add(interestV3En);
                ta.X7(b.a(0x1e7ef171).m(new Gson().q(uArrayList)).retry(1).map(new e()).subscribe(Functions.d(), Functions.d()));
                PatchProxy.onMethodExit(o.class, "8");
             }
          }
          PatchProxy.onMethodExit(o.class, "7");
       }
       PatchProxy.onMethodExit(o$c.class, "1");
       return;
    }
}
