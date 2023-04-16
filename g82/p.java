package g82.p;
import lf3.g;
import g82.v;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupStatusChanged;
import java.util.Objects;
import t02.a0;
import jk1.f;
import g82.a;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import kg1.f$b;
import l95.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import i95.e;
import lf3.f;

public final class p implements g	// class@002ab1
{
    public final v b;

    public void p(v p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       v a;
       a d;
       p tb = this.b;
       Objects.requireNonNull(tb);
       LiveFansGroupMessages$SCLiveFansGroupStatusChanged statusChange = p0.statusChangedType;
       LiveFansGroupMessages$SCLiveFansGroupStatusChanged sCLiveFansGr = 1;
       if (statusChange == sCLiveFansGr) {
          tb.p.x1.ka();
          tb.C9(p0.intimacyLevel);
          a = tb.A;
          d = a.d;
          if (d == null || (d.mStatus == p0.activeStatus && (d.mLevel != p0.intimacyLevel || p0.activeStatus != sCLiveFansGr))) {
             a.g.onNext(Integer.valueOf(p0.statusChangedType));
          }
          tb.D9(p0);
       }else if(statusChange == 2){
          tb.C9(p0.intimacyLevel);
          a = tb.A;
          d = a.d;
          if (d == null || (d.mStatus == p0.activeStatus && (d.mLevel != p0.intimacyLevel || p0.activeStatus != sCLiveFansGr))) {
             a.g.onNext(Integer.valueOf(p0.statusChangedType));
          }else {
             a.e.onNext(Boolean.TRUE);
          }
          if (p0.activeStatus != sCLiveFansGr) {
             tb.S8();
          }
          tb.D9(p0);
          tb.o9(p0.activeStatus);
          tb.F9();
       }else if(statusChange == 3){
          tb.S8();
          Iterator iterator = tb.X.iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
       }else if(statusChange == 4){
          tb.n9(p0.medalType);
          tb.F9();
          tb.C9(p0.intimacyLevel);
       }
       a uoa = new a();
       uoa.d(p0.activeStatus);
       uoa.b(p0.intimacyLevel);
       uoa.c(p0.medalType);
       tb.a9(p0.statusChangedType, uoa);
       RxBus.f.b(new e(p0));
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
