package com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt$required$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import vsd.n;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt;
import java.lang.Void;
import kotlin.KotlinNothingValueException;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import vsd.c;

public final class KotterKnifeKt$required$1 extends Lambda implements p	// class@00209c
{
    public final p $finder;
    public final int $id;

    public void KotterKnifeKt$required$1(p p0,int p1){
       this.$finder = p0;
       this.$id = p1;
       super(2);
    }
    public final View invoke(Object p0,n p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KotterKnifeKt obj = PatchProxy.applyTwoRefs(p0, p1, this, KotterKnifeKt$required$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p1, "desc");
       p0 = this.$finder.invoke(p0, Integer.valueOf(this.$id));
       if (p0 != null) {
          return p0;
       }
       p0 = this.$id;
       obj = KotterKnifeKt.class;
       if (PatchProxy.isSupport(obj) && PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, obj, "25") != patchProxyRe) {
          throw new KotlinNothingValueException();
       }
       throw new IllegalStateException("View ID "+p0+" for \'"+p1.getName()+"\' not found.");
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
