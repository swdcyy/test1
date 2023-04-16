package g82.k;
import java.lang.Runnable;
import g82.v;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.fansgroup.FansGroupParams;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import t02.a0;
import com.kwai.framework.model.user.User;
import p91.m;
import com.kwai.component.fansgroup.FansGroupSourceType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import i82.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LiveFansGroupTagInfo;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LiveSuperFansGroupInfo;
import com.kwai.component.fansgroup.FansGroupHelper;
import java.lang.Integer;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import g82.a;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import l95.b;
import l95.a;
import l95.c;

public final class k implements Runnable	// class@002aa7
{
    public final v b;
    public final int c;
    public final String d;
    public final String e;

    public void k(v p0,int p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       int i1;
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       k te = this.e;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       FansGroupParams uFansGroupPa = new FansGroupParams().setActivity(tb.getActivity()).setAuthorUser(tb.p.Z2.I()).setSource(FansGroupSourceType.LIVE);
       int i = 1;
       int b = (tc == i || tc == 2)? true: false;
       uFansGroupPa = uFansGroupPa.setHasJoinedFansGroup(b).setFansGroupsV2(tb.s).setIsFansGroupPageV2(tb.V0);
       v obj = PatchProxy.apply(null, tb, ov, "44");
       if (obj != patchProxyRe) {
          b = obj.intValue();
       }else {
          obj = tb.w;
          b = (obj == null)? 0: obj.a();
       }
       uFansGroupPa = uFansGroupPa.setWatchTimeSecond(b).setLiveStreamId(tb.p.Z2.getLiveStreamId()).setSFLiveTaskParams(td).setExpTag(tb.p.Z2.i()).setInterStid(tb.W8());
       obj = PatchProxy.applyOneRefs(te, tb, ov, "40");
       if (obj != patchProxyRe) {
          i1 = obj.intValue();
       }else if(tb.V0 == null){
          if (TextUtils.n(te, "FANS_GROUP_PANEL") && !tb.I.getVisibility()) {
             obj = tb.Q;
             if (obj != null) {
                LiveFansGroupTagInfo mActionType = obj.mActionType;
                Object obj1 = PatchProxy.applyOneRefs(mActionType, tb, ov, "42");
                if (obj1 != patchProxyRe) {
                   i1 = obj1.intValue();
                }else if(TextUtils.n(mActionType, "superFansCard")){
                label_00d8 :
                   i1 = 1;
                }
             }
          }
          v w01 = tb.W0;
          if (w01 != null && w01.mStatus != null) {
             goto label_00d8 ;
          }
       }
    label_00da :
       i1 = 0;
       FansGroupHelper.e(uFansGroupPa.setTabStatus(i1).setFromSpringTask((TextUtils.x(td) ^ i)));
       if (PatchProxy.isSupport(ov) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(tc), te, tb, ov, "51") && FansGroupKswitchUtil.b())) {
          v w0 = tb.W0;
          LiveSuperFansGroupInfo mStatus = (w0 != null)? w0.mStatus: false;
          LiveFansGroupIntimacyInfo liveFansGrou = -1;
          ov = tb.A;
          if (ov != null) {
             a d = ov.d;
             if (d != null) {
                liveFansGrou = d.mLevel;
             }
          }
          b uob = new b(false, "Entrance", "CLICK_ENTRY");
          uob.g(te);
          a uoa = new a();
          uoa.d(tc);
          uoa.b(liveFansGrou);
          uoa.a(tb.V0);
          uoa.e(mStatus);
          uob.e(uoa);
          c.a(uob);
       }
       return;
    }
}
