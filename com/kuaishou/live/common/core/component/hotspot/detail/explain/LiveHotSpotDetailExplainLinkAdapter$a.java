package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkAdapter;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkItemViewController;
import androidx.lifecycle.LiveData;
import un1.k;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveHotSpotDetailExplainLinkAdapter$a extends ViewControllerAdapter$a	// class@00139e
{
    public final LiveHotSpotDetailExplainLinkAdapter f;

    public void LiveHotSpotDetailExplainLinkAdapter$a(LiveHotSpotDetailExplainLinkAdapter p0,View p1,LifecycleOwner p2,Activity p3){
       a.p(p1, "itemView");
       a.p(p2, "parentLifecycleOwner");
       a.p(p3, "activity");
       this.f = p0;
       super(p1, p2, p3);
       this.E2(p1, new LiveHotSpotDetailExplainLinkItemViewController(this.b(), p0.j));
    }
}
