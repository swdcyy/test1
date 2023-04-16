package ak2.f;
import android.view.View$OnClickListener;
import ak2.l;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ak2.m;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import lp3.e;
import oa1.a;
import oa1.b;
import o63.a;
import lp3.c;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import p63.a;
import p63.a$a;
import p63.a$b;
import o63.d;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import kq3.a;
import android.view.Window;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import ak2.c;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;

public final class f implements View$OnClickListener	// class@0000e9
{
    public final l b;

    public void f(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, ol, "16")) {
       }else if(tb.E == null && (tb.getActivity() == null || tb.getActivity().isFinishing())){
          l f = tb.F;
          ClientContent$LiveStreamPackage liveStreamPa = tb.G.a();
          if (!PatchProxy.applyVoidTwoRefs(f, liveStreamPa, objArray, m.class, "2")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, m.a(f), uContentPack);
          }
          boolean b = false;
          if (a.t().u("SOURCE_LIVE").d("enableKrnGRLiveIntro", b)) {
             if (!PatchProxy.applyVoid(objArray, tb, ol, "17")) {
                e uoe = tb.G.t5();
                if (!uoe.b()) {
                   a uoa = new a();
                   uoa.b(0x3f000000);
                   uoa.c(1);
                   uoa.d(20);
                   uoa.e("#19191E");
                   b.a.b(uoe.a(a.class), LiveKrnPageKey.LiveIntro, a.b.a().b(), uoa);
                }
             }
          }else if(PatchProxy.applyVoid(objArray, tb, ol, "18")){
             objArray = new Object[]{tb.F.getLiveStreamId(),tb.F.getUserId()};
             a uoa1 = a.d(tb.getActivity(), tb.G.b().getChildFragmentManager(), tb.G.t5());
             uoa1.g("page_uri_live_grpr_programme_list");
             uoa1.f("page_uri_live_grpr_programme_list");
             uoa1.b.setPortraitHeightPixel((int)((float)tb.getActivity().getWindow().getDecorView().getHeight() * 0x3f000000)).setLayoutType("3").setDimAmount(0);
             a uoa2 = a.c();
             uoa2.f(new c(tb));
             tb.E = uoa2.h(String.format(WebEntryUrls.E0, objArray), uoa1);
          }
       }
    label_011e :
       return;
    }
}
