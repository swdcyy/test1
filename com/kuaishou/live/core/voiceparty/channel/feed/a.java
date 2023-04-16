package com.kuaishou.live.core.voiceparty.channel.feed.a;
import va2.q;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$LiveSquareEntrance;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import z12.x;
import lo2.c;
import android.content.DialogInterface$OnDismissListener;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.t0;
import java.lang.Integer;
import com.kuaishou.live.core.show.liveslidesquare.d;
import com.kuaishou.live.core.voiceparty.channel.feed.a$a;
import qvb.q;
import qvb.a;
import qvb.n0;
import lo2.d;
import rb2.g;

public class a extends q	// class@001377
{
    public ProgressFragment v;
    public d w;
    public d x;
    public g y;
    public static String sLivePresenterClassName = "VoicePartyChannelFeedSquareEntrancePresenter";

    public void a(){
       super();
    }
    public int P8(){
       return 0;
    }
    public void R8(LiveVoicePartyCommonConfig$LiveSquareEntrance p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       ProgressFragment progressFrag = x.G(this.getActivity());
       this.v = progressFrag;
       progressFrag.k0(new c(this));
       Uri uri = x0.f(p0.mLiveJumpScheme);
       String str = x0.a(uri, "path");
       String str1 = x0.a(uri, "serverExtraInfo");
       String str2 = x0.a(uri, "sourceType");
       int i = 0;
       if (!TextUtils.x(str2) && t0.a(str2)) {
          i = Integer.parseInt(str2);
       }
       d uod = new d();
       this.w = uod;
       uod.n2(str);
       this.w.l2(str1);
       this.w.h(new a$a(this, i));
       this.w.a();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.x = this.q8(d.class);
       this.y = this.r8("LIVE_SQUARE_REPLACE_FEED_LIST_SERVICE");
       return;
    }
}
