package ba2.f$a;
import k51.c;
import ba2.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankFancyResultTopGuardsUserItemView;
import java.util.Objects;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import ba2.f$a$a;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;

public class f$a extends c	// class@00038e
{
    public LiveHourlyRankFancyResultTopGuardsUserItemView p;
    public UserInfo q;
    public int r;
    public final f s;
    public static String sLivePresenterClassName = "LiveHourlyRankFancyResultGuardsAdapterV2$LiveHourlyRankFancyResultGuardsItemPresenter";

    public void f$a(f p0){
       this.s = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "3")) {
          return;
       }
       this.p.setRank((this.r + 1));
       f$a tp = this.p;
       f$a tq = this.q;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoidOneRefs(tq, tp, LiveHourlyRankFancyResultTopGuardsUserItemView.class, "2")) {
          LiveHourlyRankFancyResultTopGuardsUserItemView d = tp.d;
          if (d == null || !TextUtils.n(d.mId, tq.mId)) {
             tp.d = tq;
             if (!PatchProxy.applyVoidOneRefs(tq, tp, LiveHourlyRankFancyResultTopGuardsUserItemView.class, "4") && tq != null) {
                tp.setVisibility(0);
                g.d(tp.b, tq, HeadImageSize.SMALL);
             }
          }
       }
       this.p.setOnClickListener(new f$a$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1c73);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       this.q = this.q8(UserInfo.class);
       this.r = this.r8("ADAPTER_POSITION").intValue();
       return;
    }
}
