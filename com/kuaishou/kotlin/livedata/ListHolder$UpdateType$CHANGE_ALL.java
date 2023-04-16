package com.kuaishou.kotlin.livedata.ListHolder$UpdateType$CHANGE_ALL;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import java.lang.String;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class ListHolder$UpdateType$CHANGE_ALL extends ListHolder$UpdateType	// class@0007a0
{

    public void ListHolder$UpdateType$CHANGE_ALL(String p0,int p1){
       super(p0, p1, null);
    }
    public void notifyChange(RecyclerView$Adapter p0,int p1){
       if (PatchProxy.isSupport(ListHolder$UpdateType$CHANGE_ALL.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ListHolder$UpdateType$CHANGE_ALL.class, "1")) {
          return;
       }
       a.p(p0, "adapter");
       p0.k0();
       return;
    }
}
