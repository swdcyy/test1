package com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter$callback$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter;
import java.lang.Object;
import lx3.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lx3.e;

public final class HomeChannelPresenter$callback$2 extends Lambda implements a	// class@001739
{
    public final HomeChannelPresenter this$0;

    public void HomeChannelPresenter$callback$2(HomeChannelPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final n invoke(){
       Object[] objArray = null;
       HomeChannelPresenter$callback$2 obj = PatchProxy.apply(objArray, this, HomeChannelPresenter$callback$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       e uoe = PatchProxy.apply(objArray, obj, HomeChannelPresenter.class, "7");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(obj);
       }
       return uoe;
    }
}
