package com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailAdapter;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import un1.a;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailItemType;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaViewController;
import un1.k;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController;
import un1.d;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoViewController;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainViewController;
import android.view.ViewGroup;

public final class LiveHotSpotDetailAdapter$a extends ViewControllerAdapter$a	// class@00135b
{
    public final LiveHotSpotDetailAdapter f;

    public void LiveHotSpotDetailAdapter$a(LiveHotSpotDetailAdapter p0,View p1,LifecycleOwner p2,Activity p3,int p4){
       a a;
       LiveHotSpotDetailNormalMediaAreaViewController liveHotSpotD;
       LiveHotSpotDetailNormalMediaAreaViewController liveHotSpotD1;
       LiveHotSpotDetailCoreMediaViewController liveHotSpotD2;
       a.p(p1, "itemView");
       a.p(p2, "parentLifecycleOwner");
       a.p(p3, "activity");
       this.f = p0;
       super(p1, p2, p3);
       a = a.a;
       LiveData liveData = this.b();
       LiveHotSpotDetailAdapter j = p0.j;
       p0 = p0.k;
       Objects.requireNonNull(a);
       if (PatchProxy.isSupport(a.class)) {
          liveHotSpotD = PatchProxy.applyFourRefs(Integer.valueOf(p4), liveData, j, p0, a, a.class, "1");
          if (liveHotSpotD != PatchProxyResult.class) {
          }else {
          label_003f :
             a.p(liveData, "dataProvider");
             a.p(j, "contentVCDelegate");
             a.p(p0, "detailMainVCDelegate");
             if (p4 == LiveHotSpotDetailItemType.NORMAL_MEDIA_AREA.getType()) {
                liveHotSpotD1 = new LiveHotSpotDetailNormalMediaAreaViewController(liveData, p0);
             }else if(p4 == LiveHotSpotDetailItemType.CORE_MEDIA_AREA.getType()){
                liveHotSpotD2 = new LiveHotSpotDetailCoreMediaViewController(liveData, j, p0);
             }else if(p4 == LiveHotSpotDetailItemType.RELATED_AUTHOR.getType()){
                liveHotSpotD1 = new LiveHotSpotDetailRelatedAnchorsViewController(liveData, p0);
             }else if(p4 == LiveHotSpotDetailItemType.BASE_INFO.getType()){
                liveHotSpotD2 = new LiveHotSpotDetailBaseInfoViewController(liveData, j, p0);
             }else if(p4 == LiveHotSpotDetailItemType.HOT_SPOT_EXPLAIN.getType()){
                liveHotSpotD1 = new LiveHotSpotDetailExplainViewController(liveData, p0);
             }else {
                liveHotSpotD = null;
             }
             liveHotSpotD = liveHotSpotD2;
             liveHotSpotD = liveHotSpotD1;
          }
       }else {
          goto label_003f ;
       }
       if (liveHotSpotD != null) {
          this.E2(p1, liveHotSpotD);
       }
       return;
    }
}
