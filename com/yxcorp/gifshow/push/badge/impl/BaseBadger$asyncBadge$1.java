package com.yxcorp.gifshow.push.badge.impl.BaseBadger$asyncBadge$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import msd.a;
import android.content.Context;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import l6c.a;
import com.yxcorp.gifshow.push.badge.ShortcutBadgeException;
import java.lang.Exception;
import com.yxcorp.gifshow.push.badge.a;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public final class BaseBadger$asyncBadge$1 extends SuspendLambda implements p	// class@001628
{
    public final a $block;
    public final Context $context;
    public int label;
    public final BaseBadger this$0;

    public void BaseBadger$asyncBadge$1(BaseBadger p0,a p1,Context p2,c p3){
       this.this$0 = p0;
       this.$block = p1;
       this.$context = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       return new BaseBadger$asyncBadge$1(this.this$0, this.$block, this.$context, p1);
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       try{
          j0.n(p0);
          this.$block.invoke();
       }catch(java.lang.Exception e6){
          a.d.b(this.$context, this.this$0, new ShortcutBadgeException("Unable to execute Badge By Content Provider", e6));
          e6.printStackTrace();
       }
       return l1.a;
    }
}
