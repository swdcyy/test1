package ga2.a;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import ga2.f$a;
import java.lang.Object;
import androidx.lifecycle.LifecycleRegistry;
import ga2.g;
import androidx.lifecycle.Lifecycle$State;
import ga2.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ga2.b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ga2.c;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import xh3.b;
import ga2.d;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank;
import java.lang.Integer;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$BattleDistrictRankUnfold;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import yb7.a;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import androidx.lifecycle.Lifecycle;

public class a implements LifecycleOwner	// class@002aeb
{
    public final View b;
    public final g c;
    public final f d;
    public final LifecycleRegistry e;

    public void a(View p0,f$a p1){
       super();
       LifecycleRegistry lifecycleReg = new LifecycleRegistry(this);
       this.e = lifecycleReg;
       this.b = p0;
       g og = new g();
       this.c = og;
       lifecycleReg.setCurrentState(Lifecycle$State.CREATED);
       lifecycleReg.setCurrentState(Lifecycle$State.RESUMED);
       f uof = new f(p0, p1);
       this.d = uof;
       if (PatchProxy.applyVoidTwoRefs(og, this, uof, f.class, "1")) {
       }else {
          og.a.observe(this, new b(uof));
          og.b.observe(this, new c(uof));
          b.a(uof.d, this, og.c);
          og.d.observe(this, new d(uof));
       }
       return;
    }
    public void a(int p0,LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       uoa = this.c;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, uoa, g.class, "1")) {
          uoa.d.setValue(Integer.valueOf(p0));
          LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank battleDistri = p1.battleDistrictRankUnfold;
          if (battleDistri != null) {
             LiveDistrictRankFinalBattle$BattleDistrictRankUnfold waitEndText = battleDistri.waitEndText;
             if (!PatchProxy.applyVoidOneRefs(waitEndText, uoa, g.class, "3") && uoa.o0(uoa.a.getValue(), waitEndText)) {
                if (waitEndText != null) {
                   uoa.a.setValue(waitEndText);
                }else {
                   uoa.a.setValue(new LiveDistrictRankFinalBattle$ContentWithStyle());
                }
             }
             waitEndText = p1.battleDistrictRankUnfold.waitRemindText;
             if (!PatchProxy.applyVoidOneRefs(waitEndText, uoa, g.class, "4") && uoa.o0(uoa.b.getValue(), waitEndText)) {
                if (waitEndText != null) {
                   uoa.b.setValue(waitEndText);
                }else {
                   uoa.b.setValue(new LiveDistrictRankFinalBattle$ContentWithStyle());
                }
             }
             waitEndText = p1.battleDistrictRankUnfold.iconUrl;
             if (!PatchProxy.applyVoidOneRefs(waitEndText, uoa, g.class, "2") && a.c(waitEndText)) {
                uoa.c.setValue(e0.i(waitEndText));
             }
          }
       }
       return;
    }
    public Lifecycle getLifecycle(){
       return this.e;
    }
}
