package com.yxcorp.gifshow.component.postlistcomponent.middleware.PostListComponentMiddleware$dispose$transform$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import ln9.l;
import java.lang.Object;
import nn9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import mn9.a;
import mn9.f;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import java.lang.Throwable;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;

public final class PostListComponentMiddleware$dispose$transform$1 extends Lambda implements l	// class@0011c4
{
    public final l this$0;

    public void PostListComponentMiddleware$dispose$transform$1(l p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(b p0){
       ItemLoadingStatus obj = PatchProxy.applyOneRefs(p0, this, PostListComponentMiddleware$dispose$transform$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = (f.b(this.this$0.f, p0.g(), null, 2, null))? ItemLoadingStatus.ITEM_LOADING_FINISH: ItemLoadingStatus.IDLE;
       ItemLoadingStatus itemLoadingS = obj;
       p0 = (!p0.d())? b.a(p0, null, itemLoadingS, 0, false, -1, null, false, false, null, 493, null): b.a(p0, null, itemLoadingS, 0, false, 0, null, false, false, null, 509, null);
       return p0;
    }
}
