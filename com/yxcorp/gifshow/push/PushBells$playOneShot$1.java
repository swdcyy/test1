package com.yxcorp.gifshow.push.PushBells$playOneShot$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.gifshow.push.PushBells;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import msd.a;

public final class PushBells$playOneShot$1 extends ContinuationImpl	// class@001614
{
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public Object result;
    public final PushBells this$0;

    public void PushBells$playOneShot$1(PushBells p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PushBells$playOneShot$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.a(null, 0, 0, null, this);
    }
}
