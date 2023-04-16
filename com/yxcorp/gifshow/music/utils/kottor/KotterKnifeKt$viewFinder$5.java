package com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt$viewFinder$5;
import msd.p;
import kotlin.jvm.internal.Lambda;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class KotterKnifeKt$viewFinder$5 extends Lambda implements p	// class@00209e
{
    public static final KotterKnifeKt$viewFinder$5 INSTANCE;

    static {
       KotterKnifeKt$viewFinder$5.INSTANCE = new KotterKnifeKt$viewFinder$5();
    }
    public void KotterKnifeKt$viewFinder$5(){
       super(2);
    }
    public final View invoke(Fragment p0,int p1){
       if (PatchProxy.isSupport(KotterKnifeKt$viewFinder$5.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, KotterKnifeKt$viewFinder$5.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$receiver");
       View view = p0.getView();
       view = (view != null)? view.findViewById(p1): null;
       return view;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
}
