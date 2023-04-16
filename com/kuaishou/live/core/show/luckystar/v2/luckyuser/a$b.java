package com.kuaishou.live.core.show.luckystar.v2.luckyuser.a$b;
import a51.c;
import com.kuaishou.live.core.show.luckystar.v2.luckyuser.a;
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
import ic2.a;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a$b extends c	// class@000d01
{
    public KwaiImageView v;
    public TextView w;
    public UserInfo x;
    public final a y;
    public static String sLivePresenterClassName = "LiveLuckyStarLuckyUserAdapter$LuckyUserItemPresenter";

    public void a$b(a p0){
       this.y = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "3")) {
          return;
       }
       super.E8();
       this.w.setText(b.c(this.x));
       g.d(this.v, this.x, HeadImageSize.SMALL);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a2147);
       this.v = m1.f(p0, 0x7f0a2146);
       m1.a(p0, new a(this), R.id.live_lucky_star_result_item_root_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       this.x = this.q8(UserInfo.class);
       return;
    }
}
