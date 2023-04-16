package com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt$optional$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import vsd.n;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class KotterKnifeKt$optional$1 extends Lambda implements p	// class@00209b
{
    public final p $finder;
    public final int $id;

    public void KotterKnifeKt$optional$1(p p0,int p1){
       this.$finder = p0;
       this.$id = p1;
       super(2);
    }
    public final View invoke(Object p0,n p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KotterKnifeKt$optional$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "desc");
       return this.$finder.invoke(p0, Integer.valueOf(this.$id));
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
