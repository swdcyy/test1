package com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerDecorator$createActionBarViewHolder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerDecorator;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ndc.a;
import qrd.p;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import kotlin.jvm.internal.a;

public final class FriendTabContainerDecorator$createActionBarViewHolder$2 extends Lambda implements a	// class@001aa8
{
    public final FriendTabContainerDecorator this$0;

    public void FriendTabContainerDecorator$createActionBarViewHolder$2(FriendTabContainerDecorator p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, FriendTabContainerDecorator$createActionBarViewHolder$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new Object[2];
       FriendTabContainerDecorator$createActionBarViewHolder$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj1 = PatchProxy.apply(objArray, tthis$0, FriendTabContainerDecorator.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = tthis$0.h.getValue();
       }
       obj[0] = obj1;
       obj[1] = this.this$0;
       ArrayList uArrayList = Lists.e(obj);
       a.o(uArrayList, "Lists.newArrayList\(callerContext, this\)");
       return uArrayList;
    }
}
