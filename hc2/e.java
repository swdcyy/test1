package hc2.e;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.b;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarInfo;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yb2.i;
import c22.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kq3.a;
import androidx.fragment.app.c;
import lp3.e;
import p91.m;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import androidx.fragment.app.e;
import com.kuaishou.live.webview.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;

public final class e implements View$OnClickListener	// class@002d5a
{
    public final b b;
    public final LiveLuckyStarInfoResponse$LiveLuckyStarInfo c;

    public void e(b p0,LiveLuckyStarInfoResponse$LiveLuckyStarInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       if (!TextUtils.x(tc.mRuleUrl) && (a1.i(tb.getActivity()) && tb.R.isAdded())) {
          b.P(b.W, "show rule fragment");
          GifshowActivity activity = tb.getActivity();
          i a = tb.Q.a;
          a uoa = PatchProxy.applyThreeRefs(activity, null, a, null, a.class, "4");
          if (uoa != PatchProxyResult.class) {
          }else {
             c uoc = null;
             uoa = (a == null)? a.c(activity, uoc, uoc): a.c(activity, uoc, a.t5());
          }
          uoa.g(activity.getUrl());
          uoa.b.setLayoutType("0").setActionBarBgColor(a1.p(R.color.arg_RES_7f06060a)).setTitleColor(a1.p(R.color.arg_RES_7f061d64));
          tb = tb.R.getChildFragmentManager().beginTransaction();
          tb.z(R.anim.arg_RES_7f010109, 0x7f01004c, R.anim.arg_RES_7f01004a, 0x7f010112);
          tb.v(R.id.rule_fragment_container, a.c().b(tc.mRuleUrl, uoa));
          tb.j("LiveHourlyRankRuleFragment");
          tb.m();
       }
    label_00aa :
       return;
    }
}
