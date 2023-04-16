package com.kuaishou.live.core.voiceparty.userlevel.decoration.ListContentViewDataBinding$PrivilegeAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import sx2.b;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.ListContentViewDataBinding$PrivilegeAdapter$a;

public final class ListContentViewDataBinding$PrivilegeAdapter extends ViewControllerAdapter	// class@001a84
{
    public final b j;
    public final UserMicSeatLevelLogger k;

    public void ListContentViewDataBinding$PrivilegeAdapter(LifecycleOwner p0,Activity p1,b p2,UserMicSeatLevelLogger p3){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "decorationNavigator");
       a.p(p3, "logger");
       super(p0, p1);
       this.j = p2;
       this.k = p3;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       ListContentViewDataBinding$PrivilegeAdapter$a privilegeAda1;
       ListContentViewDataBinding$PrivilegeAdapter privilegeAda = ListContentViewDataBinding$PrivilegeAdapter.class;
       if (PatchProxy.isSupport(privilegeAda)) {
          privilegeAda1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, privilegeAda, "1");
          if (privilegeAda1 != PatchProxyResult.class) {
          label_0037 :
             return privilegeAda1;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
       privilegeAda1 = new ListContentViewDataBinding$PrivilegeAdapter$a(this, uFrameLayout);
       goto label_0037 ;
    }
}
