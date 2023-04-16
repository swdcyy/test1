package ej2.p;
import lf3.g;
import ej2.o;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.Fragment;
import com.kuaishou.livestream.message.nano.LiveActivityPopup;
import ekd.j;
import ekd.k1;
import ej2.n;
import java.lang.Runnable;
import lf3.f;

public class p implements g	// class@002737
{
    public final o b;

    public void p(o p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          SCActionSignal activityPopu = p0.activityPopup;
          if (activityPopu != null && (activityPopu.length > 0 && !y.d(this.b.getActivity()))) {
             LiveLogTag sCORE_RANK = LiveLogTag.SCORE_RANK;
             b.Z(sCORE_RANK, "receive activityPopup SCActionSignal");
             int i = 0;
             object oobject = p0.activityPopup[i];
             p tb = this.b;
             Objects.requireNonNull(tb);
             o oo = o.class;
             if (!PatchProxy.applyVoidOneRefs(oobject, tb, oo, "8")) {
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                Object obj = PatchProxy.apply(null, tb, oo, "9");
                if (obj != patchProxyRe) {
                   i = obj.booleanValue();
                }else {
                   Object obj1 = PatchProxy.apply(null, tb, oo, "10");
                   b = (obj1 != patchProxyRe)? obj1.booleanValue(): tb.r.N().r2(AudienceBizRelation.VOICE_PARTY);
                   if (b) {
                      b.Z(sCORE_RANK, "not show reason:voiceparty");
                   }else if(tb.r.N().r2(AudienceBizRelation.GIFT_COMBO)){
                      b.Z(sCORE_RANK, "not show reason: gift send combo");
                   }else if(tb.r.N().r2(AudienceBizRelation.GIFT_BOX)){
                      b.Z(sCORE_RANK, "not show reason: gift box open");
                   }else if(tb.q.b() == null || !tb.q.b().isResumed()){
                      b.Z(sCORE_RANK, "not show reason: fragment is null or not resume");
                   }else {
                      i = true;
                   }
                }
                if (i && !j.h(oobject.displayPict)) {
                   k1.n(tb.p);
                   tb.P8();
                   k1.s(new n(tb, oobject), tb.p, 300);
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
