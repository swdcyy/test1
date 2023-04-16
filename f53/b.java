package f53.b;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import wh5.c;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService;
import ac.a;
import f53.a;
import h47.b;
import j47.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b extends c	// class@0028a1
{
    public LiveAudienceGiftBottomBarEntryService p;
    public a0 q;
    public b r;
    public String s;
    public static String sLivePresenterClassName = "LiveGzoneAudienceGiftEntryIconPresenter";

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       a0 e = this.q.e;
       if (e != null && e.mIsFromLiveMate != null) {
          if (c.b()) {
             LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem uBottomBarGi = this.p.b();
             uBottomBarGi.o(R.drawable.arg_RES_7f0812cc);
             uBottomBarGi.x(objArray);
             return;
          }else if(PatchProxy.applyVoid(objArray, this, uob, "4")){
             a0 t1 = this.q.t1;
             if (t1 != null) {
                a uoa = new a(this);
                this.r = uoa;
                t1.Q1(uoa);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       a0 t1 = this.q.t1;
       if (t1 != null) {
          t1.H8(this.r);
       }
       this.s = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.p = this.q8(LiveAudienceGiftBottomBarEntryService.class);
       return;
    }
}
