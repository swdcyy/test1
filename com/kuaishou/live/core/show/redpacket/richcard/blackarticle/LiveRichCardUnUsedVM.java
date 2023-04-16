package com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUnUsedVM;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import bi2.e;
import zh2.b;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUnUsedVM$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public final class LiveRichCardUnUsedVM extends a	// class@000f5f
{
    public final LiveData a;
    public final LiveData b;
    public final e c;
    public final b d;

    public void LiveRichCardUnUsedVM(LifecycleOwner p0,e p1,b p2,BottomBarInfo p3){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "richCardModel");
       a.p(p2, "liveRichCardListener");
       super();
       this.c = p1;
       this.d = p2;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       p1.b(p0, new LiveRichCardUnUsedVM$1(this, p3));
    }
    public final LiveData u0(){
       return this.b;
    }
    public final LiveData v0(){
       return this.a;
    }
}
