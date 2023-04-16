package com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationListDialog$DecorationAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationListDialog$DecorationAdapter;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import android.app.Activity;
import android.view.View;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController;
import androidx.lifecycle.LiveData;
import sx2.f;
import com.kuaishou.live.viewcontroller.ViewController;

public final class DecorationListDialog$DecorationAdapter$a extends ViewControllerAdapter$a	// class@001a7a
{
    public final DecorationListDialog$DecorationAdapter f;

    public void DecorationListDialog$DecorationAdapter$a(DecorationListDialog$DecorationAdapter p0,ViewGroup p1){
       a.p(p1, "container");
       this.f = p0;
       super(p1, p0.N0(), p0.K0());
       this.E2(p1, new DecorationViewController(p0.j, this.b(), p0.k));
    }
}
