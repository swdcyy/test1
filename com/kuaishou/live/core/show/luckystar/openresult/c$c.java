package com.kuaishou.live.core.show.luckystar.openresult.c$c;
import k51.c;
import com.kuaishou.live.core.show.luckystar.openresult.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import ec2.f;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class c$c extends c	// class@000ce6
{
    public KwaiImageView p;
    public TextView q;
    public UserInfo r;
    public final c s;
    public static String sLivePresenterClassName = "LiveLuckyStarOpenResultAdapter$LiveLuckyStarOpenResultItemPresenter";

    public void c$c(c p0){
       this.s = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "3")) {
          return;
       }
       this.q.setText(b.c(this.r));
       g.d(this.p, this.r, HeadImageSize.SMALL);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2147);
       this.p = m1.f(p0, 0x7f0a2146);
       m1.a(p0, new f(this), R.id.live_lucky_star_result_item_root_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "1")) {
          return;
       }
       this.r = this.q8(UserInfo.class);
       return;
    }
}
