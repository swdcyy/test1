package mk1.b;
import mk1.b$b;
import java.lang.Object;
import qk1.c;
import qk1.d;
import qk1.e;
import qk1.b;
import gl1.b;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b$a;
import java.lang.Enum;
import qk1.a;
import com.kwai.framework.model.user.UserInfo;
import java.util.Map;
import com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import java.util.List;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class b	// class@003199
{
    public final c a;
    public final d b;
    public final e c;
    public final b d;
    public final b e;
    public UserInfo f;
    public LiveGiftReceiver g;
    public UserInfo h;
    public boolean i;
    public ClientContentWrapper$LiveVoicePartyPackage j;
    public UiMode k;
    public GiftTab l;
    public int m;
    public int n;
    public Map o;
    public String p;
    public boolean q;
    public boolean r;
    public String s;
    public long t;

    public void b(b$b p0){
       super();
       c uoc = new c();
       this.a = uoc;
       d uod = new d();
       this.b = uod;
       e uoe = new e();
       this.c = uoe;
       b uob = new b();
       this.d = uob;
       b uob1 = new b();
       this.e = uob1;
       this.l = GiftTab.NormalGift;
       this.s = "other";
       b$b b = p0.b;
       this.h = b;
       b$b a = p0.a;
       this.f = a;
       this.i = p0.c;
       this.j = p0.d;
       if (a == null) {
          this.f = b;
       }
       this.k = p0.g;
       this.m = p0.h;
       this.n = p0.i;
       this.o = p0.k;
       this.p = p0.l;
       b = p0.j;
       this.l = b;
       this.s = p0.p;
       int i = b$a.a[b.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      uob1.n(p0.e, p0.f);
                   }
                }else {
                   uob.n(p0.e, p0.f);
                }
             }else {
                uoe.n(p0.e, p0.f);
             }
          }else {
             uod.n(p0.e, p0.f);
          }
       }else {
          uoc.n(p0.e, p0.f);
       }
       uoc.f = p0.m;
       this.q = p0.n;
       this.r = p0.o;
       return;
    }
    public boolean a(){
       return this.i;
    }
    public UserInfo b(){
       return this.h;
    }
    public Map c(){
       return this.o;
    }
    public GiftTab d(){
       return this.l;
    }
    public UserInfo e(){
       return this.f;
    }
    public LiveGiftReceiver f(){
       return this.g;
    }
    public List g(){
       b tg = this.g;
       if (tg != null) {
          return tg.mMultipleReceiverList;
       }
       return null;
    }
    public String h(){
       return this.p;
    }
    public int i(){
       return this.m;
    }
    public ClientContentWrapper$LiveVoicePartyPackage j(){
       return this.j;
    }
    public boolean k(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       b = true;
       if (obj != null && obj.mIsSendToAll != null) {
          LiveGiftReceiver mMultipleRec = obj.mMultipleReceiverList;
          if (mMultipleRec != null && mMultipleRec.size() > b) {
          label_0029 :
             return b;
          }
       }
       b = false;
       goto label_0029 ;
    }
    public boolean l(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.b().mId, this.e().mId);
    }
    public void m(GiftTab p0){
       this.l = p0;
    }
    public void n(LiveGiftReceiver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.g = p0;
       if (p0.mIsSendToAll != null) {
          this.f = (p0.mMultipleReceiverList.size() == 1)? p0.mMultipleReceiverList.get(0): p0.mUserInfo;
       }else {
          this.f = p0.mUserInfo;
       }
       return;
    }
}
