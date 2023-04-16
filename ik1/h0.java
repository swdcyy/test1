package ik1.h0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class h0	// class@00292b
{
    public QLiveMessage a;
    public LiveStreamFeedWrapper b;
    public String c;
    public Gift d;
    public int e;
    public int f;
    public long g;
    public UserInfo h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public void h0(LiveStreamFeedWrapper p0){
       super();
       this.b = p0;
    }
    public void h0(LiveStreamFeedWrapper p0,Gift p1,int p2){
       super();
       this.b = p0;
       this.d = p1;
       this.f = p2;
    }
    public void h0(QLiveMessage p0,LiveStreamFeedWrapper p1,String p2,Gift p3,int p4,int p5,int p6,int p7,long p8,UserInfo p9){
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p8;
       this.i = p6;
       this.j = p7;
       this.h = p9;
       this.a = p0;
    }
    public void a(int p0,boolean p1,GiftTab p2,boolean p3,UserInfo p4,boolean p5){
       this.e = p0;
       this.m = p1;
       p1 = true;
       boolean b = (p2 == GiftTab.PacketGift)? true: false;
       this.k = b;
       if (p2 != GiftTab.PrivilegeGift) {
          p1 = false;
       }
       this.l = p1;
       this.n = p3;
       this.o = p5;
       this.h = p4;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, h0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "taskSessionId="+this.c+"giftId="+this.d.mId+"giftCount="+this.e+"giftComboCount:"+this.j+"giftIndex="+this.f+"timeCost="+this.g;
    }
}
