package com.yxcorp.gifshow.homepage.kcube.actionbar.HomeActionBarAdapter$buildFakeViewPagerStyle$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.kcube.actionbar.HomeActionBarAdapter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rkd.b;
import on5.b;
import kotlin.jvm.internal.a;
import com.kwai.kcube.TabIdentifier;
import wq6.g;

public final class HomeActionBarAdapter$buildFakeViewPagerStyle$1 extends Lambda implements a	// class@0016ea
{
    public final HomeActionBarAdapter this$0;

    public void HomeActionBarAdapter$buildFakeViewPagerStyle$1(HomeActionBarAdapter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeActionBarAdapter$buildFakeViewPagerStyle$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b.g()) {
          TabIdentifier e = b.e;
          a.o(e, "HomeTabIdentifier.OPERATE");
          if (this.this$0.a.O(e)) {
             return false;
          }
       }
       return true;
    }
}
