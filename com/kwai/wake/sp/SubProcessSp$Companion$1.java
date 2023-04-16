package com.kwai.wake.sp.SubProcessSp$Companion$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.wake.sp.SubProcessSp;
import java.lang.Class;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class SubProcessSp$Companion$1 extends FunctionReferenceImpl implements l	// class@001121
{
    public static final SubProcessSp$Companion$1 INSTANCE;

    static {
       SubProcessSp$Companion$1.INSTANCE = new SubProcessSp$Companion$1();
    }
    public void SubProcessSp$Companion$1(){
       super(1, SubProcessSp.class, "<init>", "<init>\(Landroid/content/Context;\)V", 0);
    }
    public final SubProcessSp invoke(Context p0){
       a.p(p0, "p1");
       return new SubProcessSp(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
