package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$c;
import nsd.u;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import dr1.f;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$a;
import z0.a;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$b;
import androidx.lifecycle.MutableLiveData;
import ls1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$MemberCountdownState;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$d;
import androidx.lifecycle.Observer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import ekd.t;

public final class LiveMultiLineArenaLineMemberModel	// class@00153d
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final MutableLiveData d;
    public final LiveData e;
    public t f;
    public final Observer g;
    public final boolean h;
    public final String i;
    public final a j;
    public final boolean k;
    public static final List l;
    public static final LiveMultiLineArenaLineMemberModel$c m;

    static {
       LiveMultiLineArenaLineMemberModel.m = new LiveMultiLineArenaLineMemberModel$c(null);
       LiveMultiLineArenaLineMemberModel.l = LiveCommonLogTag.MULTI_LINE.appendTag("ArenaMemberModel");
    }
    public void LiveMultiLineArenaLineMemberModel(boolean p0,String p1,f p2,a p3,boolean p4){
       a.p(p1, "userId");
       a.p(p2, "arenaLineModel");
       a.p(p3, "serverTimestampGetter");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p3;
       this.k = p4;
       LiveData liveData = Transformations.map(p2.d(), new LiveMultiLineArenaLineMemberModel$a(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.a = liveData;
       liveData = Transformations.map(liveData, new LiveMultiLineArenaLineMemberModel$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.b = liveData;
       MutableLiveData mutableLiveD = new MutableLiveData();
       b.a(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData(LiveMultiLineArenaLineMemberModel$MemberCountdownState.INVALID);
       this.d = mutableLiveD;
       LiveData liveData1 = Transformations.distinctUntilChanged(mutableLiveD);
       a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
       this.e = liveData1;
       LiveMultiLineArenaLineMemberModel$d uod = new LiveMultiLineArenaLineMemberModel$d(this);
       this.g = uod;
       if (p4) {
          liveData.observeForever(uod);
       }
       return;
    }
    public final LiveData a(){
       return this.e;
    }
    public final LiveData b(){
       return this.c;
    }
    public final LiveData c(){
       return this.a;
    }
    public final String d(){
       return this.i;
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineArenaLineMemberModel.class, "4")) {
          return;
       }
       b.P(LiveMultiLineArenaLineMemberModel.l, "handleTimeout, reason: "+p0);
       this.d.setValue(LiveMultiLineArenaLineMemberModel$MemberCountdownState.TIMEOUT);
       this.h();
       return;
    }
    public final boolean f(){
       return this.h;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLineArenaLineMemberModel.class, "1")) {
          return;
       }
       if (this.k != null) {
          this.b.removeObserver(this.g);
       }
       this.h();
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLineArenaLineMemberModel.class, "5")) {
          return;
       }
       LiveMultiLineArenaLineMemberModel tf = this.f;
       if (tf != null) {
          tf.a();
       }
       this.f = null;
       return;
    }
}
