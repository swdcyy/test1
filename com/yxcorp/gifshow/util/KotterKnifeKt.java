package com.yxcorp.gifshow.util.KotterKnifeKt;
import android.view.View;
import rsd.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.KotterKnifeKt$viewFinder$1;
import msd.p;
import lnc.y3;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.util.KotterKnifeKt$viewFinder$7;
import com.yxcorp.gifshow.util.KotterKnifeKt$required$1;

public final class KotterKnifeKt	// class@001ef0
{

    public static final e a(View p0,int p1){
       a.p(p0, "$this$bindView");
       return KotterKnifeKt.c(p1, KotterKnifeKt$viewFinder$1.INSTANCE);
    }
    public static final e b(Fragment p0,int p1){
       a.p(p0, "$this$bindView");
       return KotterKnifeKt.c(p1, KotterKnifeKt$viewFinder$7.INSTANCE);
    }
    public static final y3 c(int p0,p p1){
       a.p(p1, "finder");
       return new y3(new KotterKnifeKt$required$1(p1, p0));
    }
}
