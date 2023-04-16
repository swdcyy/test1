package com.yxcorp.retrofit.signature.KwaiMultipartBodySignature$getMultipartBodySet$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import rjd.e;
import java.lang.Object;
import okhttp3.RequestBody;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import rjd.j;

public final class KwaiMultipartBodySignature$getMultipartBodySet$1 extends Lambda implements l	// class@00097e
{
    public final e this$0;

    public void KwaiMultipartBodySignature$getMultipartBodySet$1(e p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(RequestBody p0){
       a.q(p0, "body");
       return this.this$0.e.a(p0);
    }
}
