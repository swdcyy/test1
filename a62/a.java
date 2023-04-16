package a62.a;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.b;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import lnc.a1;

public class a extends b	// class@00004b
{
    public static String sLivePresenterClassName = "LiveConditionRedPacketArrowCurrentInfoBottomLayoutPresenter";

    public void a(){
       super();
    }
    public boolean R8(LiveConditionRedPacketInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.e;
       boolean b = (p0 != null && TextUtils.n(p0.mId, QCurrentUser.me().getId()))? true: false;
       return b;
    }
    public void X8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.B.setText(p0.k);
       return;
    }
    public void Y8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (p0.s.getValue() == null) {
          return;
       }
       this.B.setVisibility(0);
       this.B.setText(a1.q(R.string.arg_RES_7f1025f3, p0.s.getValue().intValue()));
       return;
    }
}
