package com.kuaishou.kotlin.livedata.ListHolder$UpdateType$INSERT;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import java.lang.String;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class ListHolder$UpdateType$INSERT extends ListHolder$UpdateType	// class@0007a1
{

    public void ListHolder$UpdateType$INSERT(String p0,int p1){
       super(p0, p1, null);
    }
    public void notifyChange(RecyclerView$Adapter p0,int p1){
       ListHolder$UpdateType$INSERT updateType$I = ListHolder$UpdateType$INSERT.class;
       if (PatchProxy.isSupport(updateType$I) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, updateType$I, "1")) {
          return;
       }
       a.p(p0, "adapter");
       p0.n0(p1);
       return;
    }
}
