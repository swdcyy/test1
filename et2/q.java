package et2.q;
import et2.a;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import com.kuaishou.live.core.voiceparty.hat.VoicePartyHatInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import et2.b;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.VoicePartyHatConfig;
import et2.n;
import et2.m;
import et2.l;
import et2.k;
import et2.j;
import et2.i;
import et2.h;
import et2.g;
import et2.f;
import et2.e;
import et2.d;
import et2.c;
import et2.p;
import et2.o;
import t45.d;
import et2.q$b;
import java.lang.Runnable;
import crd.b;
import brd.z;

public class q implements a	// class@0027e6
{
    public final Uri a;
    public final Uri b;
    public boolean c;

    public void q(){
       super();
       this.a = Uri.parse("res://com.yxcorp.gifshow.live/2131236085");
       this.b = Uri.parse("res://com.yxcorp.gifshow.live/2131236103");
    }
    public Uri a(boolean p0){
       if (p0) {
          return this.a;
       }
       return this.b;
    }
    public CDNUrl[] b(VoicePartyHatInfo p0,boolean p1){
       LiveVoicePartyCommonConfig obj;
       Object obj1;
       if (PatchProxy.isSupport(q.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, q.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.M(LiveVoicePartyCommonConfig.class);
       CDNUrl[] uCDNUrlArray = null;
       if (obj != null) {
          obj = obj.mVoicePartyHatConfig;
          if (obj != null) {
             if (p0.mIsBehindHat != null) {
                return k0.a(obj, b.a).orNull();
             }else if(p1){
                p0 = p0.mHatLevel;
                if (PatchProxy.isSupport(q.class)) {
                   obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p0), this, q.class, "2");
                   if (obj1 != PatchProxyResult.class) {
                      uCDNUrlArray = obj1;
                   }else {
                      switch (p0){
                          case 1:
                            uCDNUrlArray = k0.a(obj.mMale, h.a).orNull();
                            break;
                          case 2:
                            uCDNUrlArray = k0.a(obj.mMale, i.a).orNull();
                            break;
                          case 3:
                            uCDNUrlArray = k0.a(obj.mMale, j.a).orNull();
                            break;
                          case 4:
                            uCDNUrlArray = k0.a(obj.mMale, k.a).orNull();
                            break;
                          case 5:
                            uCDNUrlArray = k0.a(obj.mMale, l.a).orNull();
                            break;
                          case 6:
                            uCDNUrlArray = k0.a(obj.mMale, m.a).orNull();
                            break;
                          case 7:
                            uCDNUrlArray = k0.a(obj.mMale, n.a).orNull();
                            break;
                          default:
                      }
                   }
                }else {
                   goto label_0054 ;
                }
                return uCDNUrlArray;
             }else {
                p0 = p0.mHatLevel;
                if (PatchProxy.isSupport(q.class)) {
                   obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p0), this, q.class, "3");
                   if (obj1 != PatchProxyResult.class) {
                      uCDNUrlArray = obj1;
                   }
                }
                switch (p0){
                    case 1:
                      uCDNUrlArray = k0.a(obj.mFemale, o.a).orNull();
                      break;
                    case 2:
                      uCDNUrlArray = k0.a(obj.mFemale, p.a).orNull();
                      break;
                    case 3:
                      uCDNUrlArray = k0.a(obj.mFemale, c.a).orNull();
                      break;
                    case 4:
                      uCDNUrlArray = k0.a(obj.mFemale, d.a).orNull();
                      break;
                    case 5:
                      uCDNUrlArray = k0.a(obj.mFemale, e.a).orNull();
                      break;
                    case 6:
                      uCDNUrlArray = k0.a(obj.mFemale, f.a).orNull();
                      break;
                    case 7:
                      uCDNUrlArray = k0.a(obj.mFemale, g.a).orNull();
                      break;
                    default:
                }
             }
          }
       }
       return uCDNUrlArray;
    }
    public synchronized void c(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       this.c = true;
       d.c.d(new q$b());
       return;
    }
}
