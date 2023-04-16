package com.kuaishou.kotlin.livedata.ListHolder$UpdateType$CHANGE;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import java.lang.String;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class ListHolder$UpdateType$CHANGE extends ListHolder$UpdateType	// class@00079f
{

    public void ListHolder$UpdateType$CHANGE(String p0,int p1){
       super(p0, p1, null);
    }
    public void notifyChange(RecyclerView$Adapter p0,int p1){
       ListHolder$UpdateType$CHANGE updateType$C = ListHolder$UpdateType$CHANGE.class;
       if (PatchProxy.isSupport(updateType$C) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, updateType$C, "1")) {
          return;
       }
       a.p(p0, "adapter");
       p0.l0(p1);
       return;
    }
}
