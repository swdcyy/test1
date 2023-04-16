package co2.f2;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.core.voiceparty.g0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import hp2.e;
import hp2.k;
import ok.x;
import hp2.l;
import java.lang.Boolean;
import jp2.a;
import com.kuaishou.live.basic.model.StreamType;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import ms2.a;
import so2.d;
import hp2.d;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import kx2.b;
import java.lang.Integer;
import lnc.a1;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyChannelInfo;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import op2.f;
import op2.e;
import np2.a;
import com.kuaishou.live.core.voiceparty.model.VoicePartyAbParams;

public class f2	// class@000586
{
    public x a;
    public l b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public StreamType h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public String n;
    public PublishSubject o;
    public a p;
    public x q;
    public x r;
    public l$c s;
    public final g0 t;
    public a u;

    public void f2(){
       super();
       this.m = false;
       this.o = PublishSubject.g();
       this.t = new g0();
    }
    public long A(){
       Object obj = PatchProxy.apply(null, this, f2.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.e() != null) {
          return this.e().a().h();
       }
       return 0;
    }
    public long B(){
       Object obj = PatchProxy.apply(null, this, f2.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.e() != null) {
          return this.e().a().e();
       }
       return 0;
    }
    public void C(x p0){
       this.a = p0;
    }
    public void D(l p0){
       this.b = p0;
    }
    public boolean E(){
       boolean b = true;
       if (this.c == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean F(){
       boolean b = (this.c == 3)? true: false;
       return b;
    }
    public boolean G(){
       Object obj = PatchProxy.apply(null, this, f2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h() == 3)? true: false;
       return b;
    }
    public boolean H(){
       Object obj = PatchProxy.apply(null, this, f2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h() == 6)? true: false;
       return b;
    }
    public boolean I(){
       Object obj = PatchProxy.apply(null, this, f2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h() == 7)? true: false;
       return b;
    }
    public boolean J(){
       Object obj = PatchProxy.apply(null, this, f2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.h() != b) {
          b = false;
       }
       return b;
    }
    public boolean K(){
       Object obj = PatchProxy.apply(null, this, f2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h() == 5)? true: false;
       return b;
    }
    public boolean L(){
       Object obj = PatchProxy.apply(null, this, f2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h() == 4)? true: false;
       return b;
    }
    public boolean M(){
       Object obj = PatchProxy.apply(null, this, f2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h() == 2)? true: false;
       return b;
    }
    public boolean N(){
       Object obj = PatchProxy.apply(null, this, f2.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.n() != null) {
          return this.n().b();
       }
       return false;
    }
    public boolean O(){
       Object obj = PatchProxy.apply(null, this, f2.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.n() != null) {
          return this.n().h();
       }
       return false;
    }
    public void P(){
       this.a = null;
    }
    public void Q(){
       this.d = false;
       this.e = false;
       this.f = 0;
       this.g = false;
       this.h = StreamType.AUDIO;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.m = false;
    }
    public boolean R(){
       f2 tq;
       int i = this.h();
       boolean b = false;
       if (i != 1) {
          if (i != 2) {
             if (i != 7) {
                return b;
             }else if(this.E()){
                tq = this.q;
                if (tq != null && tq.get() != null) {
                   VoicePartyMicSeatData voicePartyMi = this.q.get().j(QCurrentUser.me().getId());
                   if (voicePartyMi != null && voicePartyMi.mIsVideoOpened != null) {
                      return true;
                   }
                }
             }
             return b;
          }else {
             return true;
          }
       }else if(this.N()){
          tq = this.u;
          if (tq != null && tq.c() == KtvSingMode.VIDEO) {
             b = true;
          }
       }
       return b;
    }
    public d a(){
       Object obj = PatchProxy.apply(null, this, f2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e() instanceof d) {
          return this.e();
       }
       return null;
    }
    public String b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveStreamMessages$VoicePartyCommonInfo obj = PatchProxy.apply(objArray, this, f2.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = "";
       if (this.e() != null) {
          obj = this.e().f().a().caption;
          if (!TextUtils.isEmpty(obj)) {
             return obj;
          }else {
             int i = this.h();
             if (PatchProxy.isSupport(b.class)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), objArray, b.class, "6");
                if (obj1 != patchProxyRe) {
                   str = obj1;
                }
             }
             if (i != 1) {
                if (i != 2 && i != 3) {
                   if (i == 4) {
                      str = a1.p(R.string.arg_RES_7f101d62);
                   }
                }else {
                   str = a1.p(R.string.arg_RES_7f101d61);
                }
             }else {
                str = a1.p(R.string.arg_RES_7f101d60);
             }
          }
       }
       return str;
    }
    public LiveStreamMessages$VoicePartyChannelInfo c(){
       Object obj = PatchProxy.apply(null, this, f2.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e() != null) {
          return this.e().f().a().channelInfo;
       }
       return null;
    }
    public LiveStreamMessages$VoicePartyCommonInfo d(){
       Object obj = PatchProxy.apply(null, this, f2.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e() != null) {
          return this.e().f().a();
       }
       return null;
    }
    public e e(){
       f2 obj = PatchProxy.apply(null, this, f2.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.get();
       }
       return null;
    }
    public String f(){
       e obj = PatchProxy.apply(null, this, f2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       if (obj != null) {
          return obj.i();
       }
       return "";
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, f2.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e() != null) {
          return this.e().f().a().aboardType;
       }
       return 0;
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, f2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e() != null) {
          return this.e().b();
       }
       return 0;
    }
    public KtvMusicOrderInfo i(){
       Object obj = PatchProxy.apply(null, this, f2.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.n() != null) {
          return this.n().A();
       }
       return null;
    }
    public long j(){
       Object obj = PatchProxy.apply(null, this, f2.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.e() != null) {
          return this.e().a().getEnterTimestamp();
       }
       return 0;
    }
    public f k(){
       Object obj = PatchProxy.apply(null, this, f2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s() != null) {
          return this.s().a();
       }
       return null;
    }
    public String l(){
       e obj = PatchProxy.apply(null, this, f2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       if (obj != null) {
          return obj.g();
       }
       return "";
    }
    public String m(){
       e obj = PatchProxy.apply(null, this, f2.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       if (obj != null) {
          return obj.g();
       }
       return null;
    }
    public a n(){
       Object[] objArray = null;
       f2 obj = PatchProxy.apply(objArray, this, f2.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          objArray = obj.a;
       }
       return objArray;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, f2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e() != null) {
          return this.e().d();
       }
       return "";
    }
    public long p(){
       Object obj = PatchProxy.apply(null, this, f2.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.e() != null) {
          return this.e().a().d();
       }
       return 0;
    }
    public a q(){
       Object[] objArray = null;
       f2 obj = PatchProxy.apply(objArray, this, f2.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          objArray = obj.b;
       }
       return objArray;
    }
    public String r(){
       e obj = PatchProxy.apply(null, this, f2.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       if (obj != null) {
          return obj.c();
       }
       return "";
    }
    public e s(){
       Object[] objArray = null;
       f2 obj = PatchProxy.apply(objArray, this, f2.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          objArray = obj.c;
       }
       return objArray;
    }
    public String t(){
       e obj = PatchProxy.apply(null, this, f2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       if (obj != null) {
          return obj.k0();
       }
       return "";
    }
    public VoicePartyAbParams u(){
       Object obj = PatchProxy.apply(null, this, f2.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e() != null) {
          return this.e().f().b();
       }
       return new VoicePartyAbParams();
    }
    public long v(){
       Object obj = PatchProxy.apply(null, this, f2.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.e() != null) {
          return this.e().a().c();
       }
       return 0;
    }
    public long w(){
       Object obj = PatchProxy.apply(null, this, f2.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.e() != null) {
          return this.e().a().b();
       }
       return 0;
    }
    public long x(){
       Object obj = PatchProxy.apply(null, this, f2.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.e() != null) {
          return this.e().a().g();
       }
       return 0;
    }
    public String y(){
       Object obj = PatchProxy.apply(null, this, f2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e() != null) {
          return this.e().g0();
       }
       return "";
    }
    public long z(){
       Object obj = PatchProxy.apply(null, this, f2.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.e() != null) {
          return this.e().a().f();
       }
       return 0;
    }
}
