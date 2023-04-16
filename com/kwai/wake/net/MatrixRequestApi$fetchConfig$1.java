package com.kwai.wake.net.MatrixRequestApi$fetchConfig$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kwai.wake.net.MatrixRequestApi;
import asd.c;
import java.lang.Object;
import java.util.Map;

public final class MatrixRequestApi$fetchConfig$1 extends ContinuationImpl	// class@001110
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;
    public final MatrixRequestApi this$0;

    public void MatrixRequestApi$fetchConfig$1(MatrixRequestApi p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.a(null, this);
    }
}
