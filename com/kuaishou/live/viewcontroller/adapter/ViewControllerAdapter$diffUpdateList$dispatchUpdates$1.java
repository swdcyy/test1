package com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$diffUpdateList$dispatchUpdates$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import java.util.List;
import androidx.recyclerview.widget.h$e;
import u2.f;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class ViewControllerAdapter$diffUpdateList$dispatchUpdates$1 extends Lambda implements a	// class@000feb
{
    public final h$e $diffResult;
    public final List $list;
    public final f $updateCallback;
    public final ViewControllerAdapter this$0;

    public void ViewControllerAdapter$diffUpdateList$dispatchUpdates$1(ViewControllerAdapter p0,List p1,h$e p2,f p3){
       this.this$0 = p0;
       this.$list = p1;
       this.$diffResult = p2;
       this.$updateCallback = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, ViewControllerAdapter$diffUpdateList$dispatchUpdates$1.class, "1")) {
          return;
       }
       this.this$0.g = CollectionsKt___CollectionsKt.G5(this.$list);
       this.$diffResult.e(this.$updateCallback);
       return;
    }
}
