package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.d;
import k51.c;
import java.util.ArrayList;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import mk1.b;
import java.util.Map;
import ekd.q;
import fg6.a;
import com.google.gson.Gson;
import lnc.l1;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import lnc.a1;
import androidx.core.graphics.drawable.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import b61.b;
import android.widget.TextView;
import z12.x;
import hf1.f;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.b;
import android.view.View$OnClickListener;
import mk1.h;
import hl1.a;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class d extends c	// class@000b3b
{
    public a0 p;
    public h q;
    public b r;
    public List s;
    public c t;
    public View u;
    public KwaiImageView v;
    public EmojiTextView w;
    public String x;
    public static String sLivePresenterClassName = "LiveAudienceDrawingGiftBoxReceiverContainerPresenter";

    public void d(){
       super();
       this.s = new ArrayList();
       this.t = c.b;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       HashMap hashMap = new HashMap();
       String str = (this.r.j() == null)? "": this.r.j().voicePartyId;
       hashMap.put("voicePartyId", str);
       if (!q.h(this.r.c())) {
          hashMap.putAll(this.r.c());
       }
       this.x = a.a.q(hashMap);
       if (this.r.a() && !l1.a()) {
          this.u.setVisibility(0);
          if (this.r.k()) {
             this.R8(this.r.f());
          }else {
             LiveGiftReceiver liveGiftRece = new LiveGiftReceiver();
             liveGiftRece.mUserInfo = this.r.e();
             this.R8(liveGiftRece);
          }
       }else {
          this.u.setVisibility(8);
          d tr = this.r;
          tr.f = tr.b();
       }
       return;
    }
    public final boolean P8(UserInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !TextUtils.equals(p0.mId, this.r.b().mId))? true: false;
       return b;
    }
    public final void R8(LiveGiftReceiver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       if (p0.mIsSendToAll != null) {
          Drawable uDrawable = a1.f(p0.mAllReceiverRes);
          a.n(uDrawable, a1.a(R.color.arg_RES_7f060801));
          this.v.setImageDrawable(uDrawable);
          this.w.setText(b.c(p0.mUserInfo));
       }else {
          x.d(this.v, p0.mUserInfo);
          this.w.setText(f.e(b.c(p0.mUserInfo), 12));
       }
       this.u.setOnClickListener(new b(this));
       this.q.x.b(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a109d);
       this.v = m1.f(p0, 0x7f0a10a0);
       this.w = m1.f(p0, 0x7f0a10a1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.q8(h.class);
       this.r = this.q8(b.class);
       return;
    }
}
