package com.yxcorp.gifshow.album.repo.BaseLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$loadAllMediaListInterval$1;
import kotlin.jvm.internal.Ref$IntRef;
import brd.v;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.models.QMedia;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import q79.k;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.ArrayList;
import java.util.Collection;
import brd.g;

public final class BaseLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1 extends Lambda implements p	// class@001a72
{
    public final Ref$IntRef $dynamicInterval;
    public final v $emitter;
    public final BaseLoaderImpl$loadAllMediaListInterval$1 this$0;

    public void BaseLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1(BaseLoaderImpl$loadAllMediaListInterval$1 p0,Ref$IntRef p1,v p2){
       this.this$0 = p0;
       this.$dynamicInterval = p1;
       this.$emitter = p2;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(List p0,QMedia p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1.class, "1")) {
          return;
       }
       a.q(p0, "mediaList");
       a.q(p1, "media");
       if (!k.a.a(p1, this.this$0.d)) {
          Log.g("BaseLoaderImpl", "dir not matched: path: "+p1.path+" albumPath: "+this.this$0.d);
          p0.remove((p0.size() - 1));
       }else if(!(p0.size() % this.$dynamicInterval.element)){
          this.$emitter.onNext(new ArrayList(p0));
          p0.clear();
          BaseLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1 t$dynamicInt = this.$dynamicInterval;
          t$dynamicInt.element = t$dynamicInt.element * this.this$0.e;
       }
       return;
    }
}
