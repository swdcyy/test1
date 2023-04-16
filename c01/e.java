package c01.e;
import im8.g;
import k51.c;
import c01.b;
import c01.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import mk1.b;
import t02.a0;
import p91.m;
import java.util.Map;
import ekd.q;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.drawable.Drawable;
import lnc.a1;
import androidx.core.graphics.drawable.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import b61.b;
import android.widget.TextView;
import z12.x;
import hf1.f;
import c01.a;
import android.view.View$OnClickListener;
import android.view.View;
import qk1.a;
import mk1.h;
import pk1.a;
import sk1.a;
import xk1.a;
import rk1.b;
import bl1.a;
import lnc.l1;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import c01.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class e extends c implements g	// class@000440
{
    public c p;
    public View q;
    public KwaiImageView r;
    public EmojiTextView s;
    public a0 t;
    public h u;
    public b v;
    public String w;
    public LiveDialogContainerFragment x;
    public final a y;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxReceiverContainerPresenter";

    public void e(){
       super();
       this.p = b.b;
       this.y = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       HashMap hashMap = new HashMap();
       String str = (this.v.j() == null)? "": this.v.j().voicePartyId;
       hashMap.put("voicePartyId", str);
       if (("CHAT_GUEST").equals(this.v.h())) {
          hashMap.put("chatLiveStreamId", this.t.Z2.getLiveStreamId());
       }
       if (!q.h(this.v.c())) {
          hashMap.putAll(this.v.c());
       }
       this.w = a.a.q(hashMap);
       this.V8();
       LiveGiftReceiver liveGiftRece = new LiveGiftReceiver();
       liveGiftRece.mUserInfo = this.v.e();
       this.R8(liveGiftRece);
       return;
    }
    public final boolean P8(UserInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !TextUtils.n(p0.mId, this.v.b().mId))? true: false;
       return b;
    }
    public final void R8(LiveGiftReceiver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       if (!this.v.a()) {
          return;
       }
       if (p0.mIsSendToAll != null) {
          Drawable uDrawable = a1.f(p0.mAllReceiverRes);
          a.n(uDrawable, a1.a(R.color.arg_RES_7f060801));
          this.r.setImageDrawable(uDrawable);
          this.s.setText(b.c(p0.mUserInfo));
       }else {
          x.d(this.r, p0.mUserInfo);
          this.s.setText(f.e(b.c(p0.mUserInfo), 5));
       }
       this.q.setOnClickListener(new a(this));
       return;
    }
    public void S8(LiveGiftReceiver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "8")) {
          return;
       }
       LiveGiftReceiver mUserInfo = p0.mUserInfo;
       boolean b = this.P8(this.v.e());
       boolean b1 = this.P8(mUserInfo);
       this.v.n(p0);
       if (p0.mIsSendToAll == null) {
          this.v.b.h(mUserInfo);
       }
       if (b1 == b) {
          return;
       }else {
          int i = 1;
          if (b1) {
             this.u.r.d(new a(i));
             this.u.p.a(false);
          }else {
             this.u.q.b(new a(i));
             this.u.p.a(i);
          }
          this.u.p.m();
          this.u.o.C2();
          return;
       }
    }
    public void V8(){
       boolean b;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "7")) {
          return;
       }
       if (this.v.a()) {
          Object obj = PatchProxy.apply(objArray, this, uoe, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             int i = 1;
             if (l1.a()) {
                Object obj1 = PatchProxy.apply(objArray, this, uoe, "5");
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else if(this.t.N().r2(AudienceBizRelation.VOICE_PARTY) || this.t.N().r2(AudienceBizRelation.VOICE_PARTY_THEATER)){
                   i = 0;
                }
                b = i;
             }else {
                b = true;
             }
          }
          if (b) {
             this.q.setVisibility(0);
          label_006c :
             return;
          }
       }
       this.q.setVisibility(8);
       goto label_006c ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a109d);
       this.r = m1.f(p0, 0x7f0a10a0);
       this.s = m1.f(p0, 0x7f0a10a1);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new k());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.t = this.q8(a0.class);
       this.u = this.q8(h.class);
       this.v = this.q8(b.class);
       return;
    }
}
