package com.kuaishou.kotlin.livedata.ListHolder$UpdateType$REMOVE;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import java.lang.String;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class ListHolder$UpdateType$REMOVE extends ListHolder$UpdateType	// class@0007a2
{

    public void ListHolder$UpdateType$REMOVE(String p0,int p1){
       super(p0, p1, null);
    }
    public void notifyChange(RecyclerView$Adapter p0,int p1){
       ListHolder$UpdateType$REMOVE updateType$R = ListHolder$UpdateType$REMOVE.class;
       if (PatchProxy.isSupport(updateType$R) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, updateType$R, "1")) {
          return;
       }
       a.p(p0, "adapter");
       p0.t0(p1);
       return;
    }
}
