package bo3.f;
import java.lang.Runnable;
import bo3.g;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$LiveConditionRedPacketCurrentInfo;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo;
import java.lang.String;
import java.lang.Class;
import com.google.gson.Gson;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.f;
import eo3.w;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import on3.k;
import androidx.lifecycle.MutableLiveData;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.util.Collections;
import java.lang.Iterable;
import qk.m;
import bo3.e;
import ok.h;
import java.util.ArrayList;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$b;
import java.lang.Integer;

public final class f implements Runnable	// class@000403
{
    public final g b;
    public final LiveConditionRedPacketCurrentInfoResponse$LiveConditionRedPacketCurrentInfo c;

    public void f(g p0,LiveConditionRedPacketCurrentInfoResponse$LiveConditionRedPacketCurrentInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       boolean b;
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (!TextUtils.isEmpty(tc.mExtraInfo)) {
          LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo uCurrentExtr = a.a.h(tc.mExtraInfo, LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo.class);
          Object[] obj = PatchProxy.applyOneRefs(tc, tb, og, "5");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(tb.d.c() != null && tb.d.c().m()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             tb.n.postValue(uCurrentExtr.mParticipatedRuleTip);
             tb.m.postValue("");
             if (q.f(tc.mEnterRoomUserFromShareRedPack)) {
                tb.p.postValue(Collections.emptyList());
                tb.q.postValue("ÑûÇëºÃÓÑ >");
             }else {
                g p = tb.p;
                ArrayList uArrayList = PatchProxy.applyOneRefs(tc, tb, og, "4");
                if (uArrayList != patchProxyRe) {
                }else {
                   ArrayList uArrayList1 = new ArrayList();
                   m.s(tc.mEnterRoomUserFromShareRedPack).F(e.b).n(uArrayList1);
                   int i = uArrayList1.size();
                   if ((i - 3) > 0) {
                      uArrayList1 = uArrayList1.subList(0, 3);
                      int i1 = 99;
                      if (i > i1) {
                         obj = new Object[]{Integer.valueOf(i1)};
                         uArrayList1.add(new RedPacketPopupPrepareSharePolicyAreaView$b(String.format("%s+", obj)));
                      }else {
                         uArrayList1.add(new RedPacketPopupPrepareSharePolicyAreaView$b(String.valueOf(i)));
                      }
                   }
                   uArrayList = uArrayList1;
                }
                p.postValue(uArrayList);
                tb.q.postValue("¼ÌÐøÑûÇë >");
             }
          }else {
             tb.n.postValue("");
             tb.m.postValue(uCurrentExtr.mNotParticipatedRuleTip);
             tb.q.postValue("");
             tb.p.postValue(Collections.emptyList());
          }
       }
       return;
    }
}
