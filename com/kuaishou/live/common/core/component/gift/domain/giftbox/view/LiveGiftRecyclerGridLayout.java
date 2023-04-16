package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftRecyclerGridLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftRecyclerGridLayout$InnerAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelItemListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public final class LiveGiftRecyclerGridLayout extends FrameLayout	// class@001229
{
    public RecyclerView b;
    public LiveGiftRecyclerGridLayout$InnerAdapter c;
    public LiveGiftPanelItemListAdapter d;
    public HashMap e;

    public void LiveGiftRecyclerGridLayout(Context p0){
       super(p0, null);
    }
    public void LiveGiftRecyclerGridLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public final LiveGiftRecyclerGridLayout$InnerAdapter getInnerAdapter(){
       LiveGiftRecyclerGridLayout obj = PatchProxy.apply(null, this, LiveGiftRecyclerGridLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("innerAdapter");
       }
       return obj;
    }
    public final LiveGiftPanelItemListAdapter getOuterAdapter(){
       LiveGiftRecyclerGridLayout obj = PatchProxy.apply(null, this, LiveGiftRecyclerGridLayout.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("outerAdapter");
       }
       return obj;
    }
    public final RecyclerView getRecyclerView(){
       LiveGiftRecyclerGridLayout obj = PatchProxy.apply(null, this, LiveGiftRecyclerGridLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("recyclerView");
       }
       return obj;
    }
    public final void setInnerAdapter(LiveGiftRecyclerGridLayout$InnerAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void setOuterAdapter(LiveGiftPanelItemListAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public final void setRecyclerView(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
}
