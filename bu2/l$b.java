package bu2.l$b;
import bu2.l$c;
import bu2.l;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import yx2.l;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.micmanager.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import d61.g;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.voiceparty.d0;
import bu2.l$d;
import co2.f2;
import java.lang.Boolean;
import com.kwai.library.widget.popup.common.c$b;
import t02.r1;
import t02.a0;
import android.view.Window;
import bu2.k;
import au2.d;
import erd.g;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import pp.d;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import e17.i;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import brd.t;
import brd.x;
import a51.c;
import crd.b;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import z1.a;

public class l$b implements l$c	// class@000460
{
    public final l a;

    public void l$b(l p0){
       this.a = p0;
       super();
    }
    public void a(VoicePartyMicSeatData p0,int p1){
       RxFragmentActivity activity;
       String str2;
       Object[] objArray;
       b uob1;
       VoicePartyMicSeatData obj2;
       Object obj = this;
       VoicePartyMicSeatData obj1 = p0;
       int i = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l ol = l.class;
       l$b uob = l$b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, uob, str)) {
          return;
       }
       int i1 = 1;
       int i2 = 0;
       String str1 = "2";
       if (l.a()) {
          uob = obj.a;
          Objects.requireNonNull(uob);
          if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), uob, ol, "7")) {
             activity = uob.getActivity();
             if (!g.h(activity)) {
                d0.e(uob.A);
                l$d uod = new l$d(uob, obj1, i);
                boolean b = uob.y.J();
                l v = uob.v;
                int i3 = 8;
                if (v != null) {
                   l y = uob.y;
                   str2 = y.y();
                   obj1 = obj1.mId;
                   if (PatchProxy.isSupport(b.class)) {
                      objArray = new Object[i3];
                      objArray[i2] = activity;
                      objArray[i1] = v;
                      objArray[2] = y;
                      objArray[3] = str2;
                      objArray[4] = Boolean.valueOf(b);
                      objArray[5] = Integer.valueOf(obj1);
                      objArray[6] = Integer.valueOf(p1);
                      objArray[7] = uod;
                      uob1 = PatchProxy.apply(objArray, null, b.class, str);
                      if (uob1 != patchProxyRe) {
                      label_00c3 :
                         uob1.Z();
                      }
                   }
                   uob1 = new b(new c$b(activity));
                   uob1.v = y;
                   uob1.r = str2;
                   uob1.s = obj1;
                   uob1.t = b;
                   uob1.q = uod;
                   uob1.w = i;
                   uob1.x = v;
                   uob1.z = v.v;
                   goto label_00c3 ;
                }else {
                   l w = uob.w;
                   v = uob.y;
                   str2 = v.y();
                   obj1 = obj1.mId;
                   if (PatchProxy.isSupport(b.class)) {
                      objArray = new Object[i3];
                      objArray[i2] = activity;
                      objArray[i1] = w;
                      objArray[2] = v;
                      objArray[3] = str2;
                      objArray[4] = Boolean.valueOf(b);
                      objArray[5] = Integer.valueOf(obj1);
                      objArray[6] = Integer.valueOf(p1);
                      objArray[7] = uod;
                      obj2 = PatchProxy.apply(objArray, null, b.class, str1);
                      if (obj2 != patchProxyRe) {
                         uob1 = obj2;
                      label_0124 :
                         uob1.Z();
                      }
                   }
                   b uob2 = new b(new c$b(activity));
                   uob2.v = v;
                   uob2.r = str2;
                   uob2.t = b;
                   uob2.s = obj1;
                   uob2.q = uod;
                   uob2.w = i;
                   uob2.y = w;
                   uob2.z = w.Z2;
                   uob1 = uob2;
                   goto label_0124 ;
                }
                uob.A = uob1;
                uob1.u().getWindow().setSoftInputMode(32);
             }
          }
       }else {
          uob = obj.a;
          Objects.requireNonNull(uob);
          if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), uob, ol, str1)) {
             activity = uob.getActivity();
             if (!g.h(activity)) {
                d0.e(uob.z);
                l v1 = uob.v;
                l w1 = uob.w;
                String str3 = uob.y.y();
                obj2 = obj1.mId;
                k ok = new k(uob, obj1, i);
                d uod1 = d.class;
                if (PatchProxy.isSupport(uod1)) {
                   Object[] objArray1 = new Object[]{activity,v1,w1,str3,Integer.valueOf(obj2),Integer.valueOf(p1),ok};
                   uod1 = PatchProxy.apply(objArray1, null, uod1, str);
                   if (uod1 != patchProxyRe) {
                   label_01c4 :
                      uod1.Z();
                      uob.z = uod1;
                      uod1.u().getWindow().setSoftInputMode(32);
                   }
                }
                d uod2 = new d(new c$b(activity));
                uod2.u = w1;
                uod2.v = v1;
                r1 v2 = (w1 == null)? v1.v: w1.Z2;
                uod2.w = v2;
                uod2.r = str3;
                uod2.s = obj2;
                uod2.q = ok;
                uod2.x = i;
                uod1 = uod2;
                goto label_01c4 ;
             }
          }
       }
       return;
    }
    public void b(String p0,VoicePartyMicSeatData p1,int p2,g p3,g p4){
       l$b uob = l$b.class;
       int i = 4;
       int i1 = 1;
       int i2 = 5;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[i2];
          objArray[0] = p0;
          objArray[i1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[i] = p4;
          if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
             return;
          }
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray1 = new Object[i2];
          objArray1[0] = p1;
          objArray1[i1] = p0;
          objArray1[2] = Integer.valueOf(p2);
          objArray1[3] = p3;
          objArray1[i] = p4;
          if (!PatchProxy.applyVoid(objArray1, uob, ol, "10")) {
          label_004d :
             MicSeatsDataManager micSeatsData = uob.b9();
             if (micSeatsData != null && micSeatsData.t(p0)) {
                uob.W8().i(LiveVoicePartyLogTag.ANCHOR, "requestInviteUser block ,because user is singing", "inviteUserId ", p0);
                i.a(R.style.arg_RES_7f11066a, 0x7f102e60);
                if (p4 != null) {
                   p0 = null;
                   try{
                      p4.accept(p0);
                   }catch(java.lang.Exception e10){
                      b.I(LiveVoicePartyLogTag.OTHER, "requestInviteUser", e10);
                   }
                }
             }else {
                uob.X7(uob.Y8(p0, p1, p2).compose(uob.P8()).subscribe(p3, p4));
             }
          }
       }else {
          goto label_004d ;
       }
    }
    public void c(VoicePartyOnlineUser p0,g p1,int p2){
       if (PatchProxy.isSupport(l$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, l$b.class, "4")) {
          return;
       }
       this.a.S8(p0, p1, p2);
       return;
    }
    public void d(String p0,VoicePartyMicSeatData p1,int p2,a p3){
       if (PatchProxy.isSupport(l$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, l$b.class, "2")) {
          return;
       }
       this.a.d9(p1, p0, p2, p3);
       return;
    }
}
