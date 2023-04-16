package com.kuaishou.live.core.voiceparty.userlevel.decoration.ListContentViewDataBinding$PrivilegeAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.ListContentViewDataBinding$PrivilegeAdapter;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import android.app.Activity;
import android.view.View;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeViewController;
import androidx.lifecycle.LiveData;
import sx2.b;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import com.kuaishou.live.viewcontroller.ViewController;

public final class ListContentViewDataBinding$PrivilegeAdapter$a extends ViewControllerAdapter$a	// class@001a83
{
    public final ListContentViewDataBinding$PrivilegeAdapter f;

    public void ListContentViewDataBinding$PrivilegeAdapter$a(ListContentViewDataBinding$PrivilegeAdapter p0,ViewGroup p1){
       a.p(p1, "container");
       this.f = p0;
       super(p1, p0.N0(), p0.K0());
       this.E2(p1, new PrivilegeViewController(this.b(), p0.j, p0.k));
    }
}
