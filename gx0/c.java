package gx0.c;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.blessingbag.e;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig$CampaignConfig;
import com.kuaishou.live.core.show.blessingbag.a;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget;

public final class c implements Runnable	// class@002598
{
    public final e b;
    public final String c;

    public void c(e p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e f;
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!tc.equals("0")) {
          if (tc.equals("1") && !PatchProxy.applyVoid(objArray, tb, uoe, "22")) {
             f = tb.F;
             if (f != null) {
                LiveAudienceBlessBagConfig mCampaignCon = f.mCampaignConfig;
                if (mCampaignCon != null) {
                   mCampaignCon.mEnablePrimaryBag = false;
                }
             }
             tb.V8();
          }
       }else if(PatchProxy.applyVoid(objArray, tb, uoe, "21")){
          f = tb.F;
          if (f != null) {
             LiveAudienceBlessBagConfig mCampaignCon1 = f.mCampaignConfig;
             if (mCampaignCon1 != null) {
                e g = tb.G;
                if (g != null) {
                   mCampaignCon1.mPrimaryJobFinish = true;
                   tb.X8(f, g);
                }
             }
          }
       }
       return;
    }
}
