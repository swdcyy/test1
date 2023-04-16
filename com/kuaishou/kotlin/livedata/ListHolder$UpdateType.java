package com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import java.lang.Enum;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType$CHANGE_ALL;
import java.lang.String;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType$INSERT;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType$REMOVE;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType$CHANGE;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public abstract class ListHolder$UpdateType extends Enum	// class@0007a3
{
    public static final ListHolder$UpdateType[] $VALUES;
    public static final ListHolder$UpdateType CHANGE;
    public static final ListHolder$UpdateType CHANGE_ALL;
    public static final ListHolder$UpdateType INSERT;
    public static final ListHolder$UpdateType REMOVE;

    static {
       ListHolder$UpdateType$CHANGE_ALL updateType$C;
       ListHolder$UpdateType$INSERT updateType$I;
       ListHolder$UpdateType$REMOVE updateType$R;
       ListHolder$UpdateType$CHANGE updateType$C1;
       ListHolder$UpdateType[] updateTypeAr = new ListHolder$UpdateType[]{updateType$C,updateType$I,updateType$R,updateType$C1};
       updateType$C = new ListHolder$UpdateType$CHANGE_ALL("CHANGE_ALL", 0);
       ListHolder$UpdateType.CHANGE_ALL = updateType$C;
       updateType$I = new ListHolder$UpdateType$INSERT("INSERT", 1);
       ListHolder$UpdateType.INSERT = updateType$I;
       updateType$R = new ListHolder$UpdateType$REMOVE("REMOVE", 2);
       ListHolder$UpdateType.REMOVE = updateType$R;
       updateType$C1 = new ListHolder$UpdateType$CHANGE("CHANGE", 3);
       ListHolder$UpdateType.CHANGE = updateType$C1;
       ListHolder$UpdateType.$VALUES = updateTypeAr;
    }
    public void ListHolder$UpdateType(String p0,int p1){
       super(p0, p1);
    }
    public void ListHolder$UpdateType(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static ListHolder$UpdateType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ListHolder$UpdateType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ListHolder$UpdateType.class, p0);
    }
    public static ListHolder$UpdateType[] values(){
       Object obj = PatchProxy.apply(null, null, ListHolder$UpdateType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ListHolder$UpdateType.$VALUES.clone();
    }
    public abstract void notifyChange(RecyclerView$Adapter p0,int p1);
}
