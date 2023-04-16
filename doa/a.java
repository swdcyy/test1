package doa.a;
import op5.a;
import java.lang.Object;
import pw6.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment;

public class a implements a	// class@0024d1
{

    public void a(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public d yf(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GrowthInvitePageFragment();
    }
}
