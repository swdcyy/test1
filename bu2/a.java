package bu2.a;
import do1.d;
import android.view.Window;
import p91.m;
import bu2.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import uj2.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import au2.c;
import java.util.List;
import va1.d;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent$LiveShareStatus;
import java.lang.Integer;

public class a extends d	// class@000454
{
    public static String sLivePresenterClassName = "LiveAnchorVoicePartyInviteBarPresenter";

    public void a(Window p0,m p1){
       super(p0, p1);
       this.A = new a$a(this);
    }
    public Object P8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new c(p0);
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       c.a(this.z.b(), this.z.a(), this.z.y(), "INVITE");
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       c.a(this.z.b(), this.z.a(), this.z.y(), "SHARE");
       return;
    }
    public List W8(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a();
    }
    public void X8(LiveShareStatusEvent p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       LiveShareStatusEvent b = p0.b;
       if (b != null && b instanceof c) {
          this.Y8();
          b = p0.a;
          if (b == LiveShareStatusEvent$LiveShareStatus.SUCCESS) {
             i = 7;
          }else if(b == LiveShareStatusEvent$LiveShareStatus.FAIL){
             i = 8;
          }else if(b == LiveShareStatusEvent$LiveShareStatus.CANCEL){
             i = 9;
          }
          String str = (p0.b.a != null)? "INVITE": "SHARE";
          this.a9(str, i);
       }
    label_003c :
       return;
    }
    public void a9(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       c.c(this.z.a(), p0, p1);
       return;
    }
}
