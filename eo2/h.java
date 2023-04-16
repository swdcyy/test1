package eo2.h;
import yh3.a;
import m91.b;
import com.kuaishou.live.core.voiceparty.b;
import co2.f2;
import qs2.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import vq5.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import co2.y1;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import eo2.h$d;
import eo2.h$e;
import aq5.b;
import co2.r;
import crd.a;
import rh3.b;
import mrd.c;
import eo2.h$a;
import erd.g;
import crd.b;
import brd.t;
import krd.a;
import eo2.h$b;
import vq5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModel;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kwai.framework.model.user.QCurrentUser;
import qs2.d;

public class h extends a	// class@0027a5
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final b e;
    public final r f;
    public final b g;
    public final b h;
    public final f2 i;
    public final a j;
    public final MicSeatsDataManager k;
    public final d l;

    public void h(b p0,b p1,f2 p2,a p3,MicSeatsDataManager p4,d p5){
       a.p(p0, "bizRelationService");
       a.p(p1, "micSeatDispatcher");
       a.p(p2, "voicePartyContext");
       a.p(p3, "micManageService");
       a.p(p4, "micSeatsDataManager");
       a.p(p5, "liveRouterManager");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.valueOf(p3.d().b()));
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData(Boolean.valueOf(p2.F()));
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       AudienceBizRelation sPECIAL_ROLE = AudienceBizRelation.SPECIAL_ROLE;
       MutableLiveData mutableLiveD1 = new MutableLiveData(Boolean.valueOf(p0.r2(sPECIAL_ROLE)));
       this.o0(mutableLiveD1);
       this.c = mutableLiveD1;
       AudienceBizRelation gIFT_COMBO = AudienceBizRelation.GIFT_COMBO;
       mutableLiveD1 = new MutableLiveData(Boolean.valueOf(p0.r2(gIFT_COMBO)));
       this.o0(mutableLiveD1);
       this.d = mutableLiveD1;
       h$d uod = new h$d(this);
       this.e = uod;
       h$e uoe = new h$e(this);
       this.f = uoe;
       a[] uoaArray = new a[]{gIFT_COMBO,sPECIAL_ROLE};
       p0.u5(uod, uoaArray);
       p1.a(uoe);
       this.D0();
       p1 = p3.z().subscribe(new h$a(this));
       a.o(p1, "micManageService.observe¡­be { updateApplyState\(\) }");
       a.b(b.b(this), p1);
       p5.t5("voicePartyApply", new h$b(this));
    }
    public final boolean A0(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.getValue();
       a.m(obj);
       if (!obj.booleanValue()) {
          obj = this.b.getValue();
          a.m(obj);
          if (!obj.booleanValue()) {
             b = true;
          label_0039 :
             return b;
          }
       }
       b = false;
       goto label_0039 ;
    }
    public final LiveData C0(){
       return this.c;
    }
    public final void D0(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.r0(this.b).setValue(Boolean.valueOf(this.i.F()));
       this.r0(this.a).setValue(Boolean.valueOf(this.j.d().b()));
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       super.onCleared();
       a[] uoaArray = new a[]{AudienceBizRelation.GIFT_COMBO,AudienceBizRelation.SPECIAL_ROLE};
       this.g.G5(this.e, uoaArray);
       this.h.b(this.f);
       b.b(this).dispose();
       this.l.Z4("voicePartyApply");
       return;
    }
    public final int u0(boolean p0){
       int i = (p0)? 6: 2;
       return i;
    }
    public final VoicePartyMicSeatData v0(){
       Object obj = PatchProxy.apply(null, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       return this.k.j(id);
    }
    public void w0(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "4")) {
          return;
       }
       if (this.A0()) {
          this.j.H(this.u0(p0));
          return;
       }else {
          Object value = this.a.getValue();
          a.m(value);
          if (value.booleanValue()) {
             this.j.J("LONG_WAIT", this.u0(p0));
             return;
          }else {
             VoicePartyMicSeatData voicePartyMi = this.v0();
             if (voicePartyMi != null) {
                this.j.B(voicePartyMi);
             }
             return;
          }
       }
    }
    public final LiveData x0(){
       return this.a;
    }
    public final LiveData y0(){
       return this.d;
    }
    public final LiveData z0(){
       return this.b;
    }
}
