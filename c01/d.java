package c01.d;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$f;
import c01.e;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import java.lang.String;
import ik1.a0;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class d implements LiveGiftReceiverListDialog$f	// class@00043e
{
    public final e a;

    public void d(e p0){
       this.a = p0;
    }
    public final void a(LiveGiftReceiver p0){
       d ta = this.a;
       a0.f(ta.t.Z2.b(), p0.mIsSendToAll, p0.mUserInfo.mId, ta.t.Z2.a(), ta.t.Z2.y());
       ta.R8(p0);
       ta.S8(p0);
       e x = ta.x;
       if (x != null) {
          x.dismissAllowingStateLoss();
       }
       return;
    }
}
