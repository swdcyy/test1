package com.yxcorp.gifshow.util.KotterKnifeKt$viewFinder$7;
import msd.p;
import kotlin.jvm.internal.Lambda;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class KotterKnifeKt$viewFinder$7 extends Lambda implements p	// class@001eef
{
    public static final KotterKnifeKt$viewFinder$7 INSTANCE;

    static {
       KotterKnifeKt$viewFinder$7.INSTANCE = new KotterKnifeKt$viewFinder$7();
    }
    public void KotterKnifeKt$viewFinder$7(){
       super(2);
    }
    public final View invoke(Fragment p0,int p1){
       a.p(p0, "$receiver");
       View view = p0.getView();
       a.m(view);
       return view.findViewById(p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
}
