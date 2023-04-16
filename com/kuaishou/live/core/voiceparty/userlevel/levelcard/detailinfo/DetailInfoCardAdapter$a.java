package com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardAdapter;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardItemViewController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;

public final class DetailInfoCardAdapter$a extends ViewControllerAdapter$a	// class@001aa4
{
    public final DetailInfoCardAdapter f;

    public void DetailInfoCardAdapter$a(DetailInfoCardAdapter p0,View p1,LifecycleOwner p2,Activity p3){
       a.p(p1, "itemView");
       a.p(p2, "parentLifecycleOwner");
       a.p(p3, "activity");
       this.f = p0;
       super(p1, p2, p3);
       this.E2(p1, new DetailInfoCardItemViewController(this.b()));
    }
}
