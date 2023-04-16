package com.kuaishou.live.core.voiceparty.userlevel.decoration.ListContentViewDataBinding;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.ListContentViewDataBinding$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import sx2.b;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.ListContentViewDataBinding$PrivilegeAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class ListContentViewDataBinding	// class@001a86
{
    public final ListContentViewDataBinding$PrivilegeAdapter a;
    public final RecyclerView b;
    public static final ListContentViewDataBinding$a c;

    static {
       ListContentViewDataBinding.c = new ListContentViewDataBinding$a(null);
    }
    public void ListContentViewDataBinding(LifecycleOwner p0,Activity p1,RecyclerView p2,b p3,UserMicSeatLevelLogger p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "listView");
       a.p(p3, "navigator");
       a.p(p4, "logger");
       super();
       this.b = p2;
       p2.setLayoutManager(new GridLayoutManager(p2.getContext(), 4, 1, false));
       ListContentViewDataBinding$PrivilegeAdapter privilegeAda = new ListContentViewDataBinding$PrivilegeAdapter(p0, p1, p3, p4);
       this.a = privilegeAda;
       p2.setAdapter(privilegeAda);
    }
}
