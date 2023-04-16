package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$MemberCountdownState;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import dr1.e;
import msd.a;
import er1.b;
import ekd.t;
import qrd.l1;

public final class LiveMultiLineArenaLineMemberModel$d implements Observer	// class@00153c
{
    public final LiveMultiLineArenaLineMemberModel b;

    public void LiveMultiLineArenaLineMemberModel$d(LiveMultiLineArenaLineMemberModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineArenaLineMemberModel$d.class, "1")) {
       }else if(p0 != null){
          int i = p0.intValue();
          LiveMultiLineArenaLineMemberModel$d tb = this.b;
          Objects.requireNonNull(tb);
          LiveMultiLineArenaLineMemberModel liveMultiLin = LiveMultiLineArenaLineMemberModel.class;
          if (!PatchProxy.isSupport(liveMultiLin) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, liveMultiLin, "2")) {
             List l = LiveMultiLineArenaLineMemberModel.l;
             b.P(l, "onMemberStateChange, state: "+i);
             if (i != 1) {
                if (i != 2) {
                   tb.d.setValue(LiveMultiLineArenaLineMemberModel$MemberCountdownState.INVALID);
                   tb.h();
                }else if(PatchProxy.applyVoid(null, tb, liveMultiLin, "3")){
                   tb.h();
                   i = tb.a.getValue();
                   e h = (i != null)? i.h: 0;
                   b.P(l, '['+tb.i+"]startCounter, target: "+h);
                   tb.d.setValue(LiveMultiLineArenaLineMemberModel$MemberCountdownState.RUNNING);
                   b uob = new b(tb, (int)((h - tb.j.invoke().longValue()) / (long)1000), (int)((h - tb.j.invoke().longValue()) / (long)1000), 1000);
                   uob.f();
                   tb.f = uob;
                }
             }else {
                tb.e("performed");
             }
          }
       }
       return;
    }
}
