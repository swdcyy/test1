package com.kuaishou.live.common.core.component.gift.gift.l$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class l$b	// class@0012ab
{
    public long a;
    public long b;
    public long c;
    public String d;

    public void l$b(String p0,long p1,long p2,long p3){
       super();
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{mGiftId="+this.a+", mMagicFaceId="+this.b+", mCreateTime="+this.c+", mSendUserId=\'"+this.d+'}';
    }
}
