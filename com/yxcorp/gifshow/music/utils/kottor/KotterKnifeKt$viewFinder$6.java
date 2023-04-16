package com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt$viewFinder$6;
import msd.p;
import kotlin.jvm.internal.Lambda;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class KotterKnifeKt$viewFinder$6 extends Lambda implements p	// class@00209f
{
    public static final KotterKnifeKt$viewFinder$6 INSTANCE;

    static {
       KotterKnifeKt$viewFinder$6.INSTANCE = new KotterKnifeKt$viewFinder$6();
    }
    public void KotterKnifeKt$viewFinder$6(){
       super(2);
    }
    public final View invoke(RecyclerView$ViewHolder p0,int p1){
       if (PatchProxy.isSupport(KotterKnifeKt$viewFinder$6.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, KotterKnifeKt$viewFinder$6.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$receiver");
       return p0.itemView.findViewById(p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
}
