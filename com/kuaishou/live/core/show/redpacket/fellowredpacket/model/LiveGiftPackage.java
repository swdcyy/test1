package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage$GiftInfo;
import ok.j$b;
import ok.j;

public class LiveGiftPackage implements Serializable	// class@000e9c
{
    public List mGiftInfos;
    public int mGiftPackageId;
    public int mTotalGiftCount;
    public int mTotalKsCoin;
    public static final long serialVersionUID = 0x3acf8f0428f5f582;

    public void LiveGiftPackage(){
       super();
    }
    public int getTotalGiftCount(){
       LiveGiftPackage obj = PatchProxy.apply(null, this, LiveGiftPackage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (q.f(this.mGiftInfos)) {
          return i;
       }
       obj = this.mTotalGiftCount;
       if (obj != null) {
          return obj;
       }
       Iterator iterator = this.mGiftInfos.iterator();
       while (iterator.hasNext()) {
          i = i + iterator.next().mGiftCount;
       }
       this.mTotalGiftCount = i;
       return i;
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, LiveGiftPackage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.a("mGiftPackageId", this.mGiftPackageId);
       obj.a("mTotalKsCoin", this.mTotalKsCoin);
       return obj.toString();
    }
}
