package com.yxcorp.gifshow.util.KotterKnifeKt$required$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import vsd.n;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import vsd.c;

public final class KotterKnifeKt$required$1 extends Lambda implements p	// class@001eed
{
    public final p $finder;
    public final int $id;

    public void KotterKnifeKt$required$1(p p0,int p1){
       this.$finder = p0;
       this.$id = p1;
       super(2);
    }
    public final View invoke(Object p0,n p1){
       a.p(p1, "desc");
       p0 = this.$finder.invoke(p0, Integer.valueOf(this.$id));
       if (p0 != null) {
          return p0;
       }
       throw new IllegalStateException("View ID "+this.$id+" for \'"+p1.getName()+"\' not found.");
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
