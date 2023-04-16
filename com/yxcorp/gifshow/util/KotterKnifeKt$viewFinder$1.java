package com.yxcorp.gifshow.util.KotterKnifeKt$viewFinder$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class KotterKnifeKt$viewFinder$1 extends Lambda implements p	// class@001eee
{
    public static final KotterKnifeKt$viewFinder$1 INSTANCE;

    static {
       KotterKnifeKt$viewFinder$1.INSTANCE = new KotterKnifeKt$viewFinder$1();
    }
    public void KotterKnifeKt$viewFinder$1(){
       super(2);
    }
    public final View invoke(View p0,int p1){
       a.p(p0, "$receiver");
       return p0.findViewById(p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
}
