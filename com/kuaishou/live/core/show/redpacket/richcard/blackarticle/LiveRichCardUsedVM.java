package com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import ah1.c;
import bi2.e;
import zh2.b;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$2;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$a$a;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$a$b;
import java.lang.Boolean;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$a$c;

public final class LiveRichCardUsedVM extends a	// class@000f66
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final b f;

    public void LiveRichCardUsedVM(LifecycleOwner p0,c p1,e p2,b p3,BottomBarInfo p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "countDownModel");
       a.p(p2, "richCardModel");
       a.p(p3, "liveRichCardListener");
       super();
       this.f = p3;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.e = mutableLiveD;
       p1.b(p0, new LiveRichCardUsedVM$1(this));
       p2.b(p0, new LiveRichCardUsedVM$2(this, p4));
    }
    public final LiveData u0(){
       return this.b;
    }
    public final LiveData v0(){
       return this.c;
    }
    public final LiveData w0(){
       return this.e;
    }
    public final LiveData x0(){
       return this.d;
    }
    public void y0(LiveRichCardUsedVM$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardUsedVM.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (a.g(p0, LiveRichCardUsedVM$a$a.a)) {
          this.f.b();
       }else if(a.g(p0, LiveRichCardUsedVM$a$b.a)){
          this.r0(this.a).setValue(Boolean.FALSE);
       }else if(a.g(p0, LiveRichCardUsedVM$a$c.a)){
          this.r0(this.a).setValue(Boolean.TRUE);
       }
       return;
    }
}
