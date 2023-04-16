package com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment$configurationChangeListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment;
import hka.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment$configurationChangeListener$2$a;

public final class GrowthInvitePageFragment$configurationChangeListener$2 extends Lambda implements a	// class@0013c9
{
    public final GrowthInvitePageFragment this$0;

    public void GrowthInvitePageFragment$configurationChangeListener$2(GrowthInvitePageFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, GrowthInvitePageFragment$configurationChangeListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GrowthInvitePageFragment$configurationChangeListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
