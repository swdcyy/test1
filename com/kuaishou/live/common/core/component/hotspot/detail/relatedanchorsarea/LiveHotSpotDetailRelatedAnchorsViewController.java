package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController$onCreate$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import on1.c;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.text.TextPaint;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorItemAdapter;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController$a;
import androidx.recyclerview.widget.RecyclerView$n;
import qrd.p;
import on1.a;
import androidx.lifecycle.Observer;
import on1.b;

public final class LiveHotSpotDetailRelatedAnchorsViewController extends ViewController	// class@0013f6
{
    public TextView j;
    public ViewControllerAdapter k;
    public final LiveData l;
    public final k m;

    public void LiveHotSpotDetailRelatedAnchorsViewController(LiveData p0,k p1){
       a.p(p0, "dataProvider");
       a.p(p1, "detailMainVCDelegate");
       super();
       this.l = p0;
       this.m = p1;
    }
    public void F2(){
       LiveHotSpotDetailRelatedAnchorsViewController liveHotSpotD = LiveHotSpotDetailRelatedAnchorsViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveHotSpotD, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c24);
       ViewModelLazy viewModelLaz = new ViewModelLazy(m0.d(c.class), new LiveHotSpotDetailRelatedAnchorsViewController$onCreate$$inlined$viewModels$2(new LiveHotSpotDetailRelatedAnchorsViewController$onCreate$$inlined$viewModels$1(this)), new LiveHotSpotDetailRelatedAnchorsViewController$onCreate$viewModel$2(this));
       if (!PatchProxy.applyVoid(objArray, this, liveHotSpotD, "2")) {
          View view = this.P2();
          RecyclerView recyclerView = view.findViewById(R.id.anchors_list);
          view = view.findViewById(R.id.title);
          a.o(view, "rootView.findViewById\(R.id.title\)");
          this.j = view;
          if (view == null) {
             a.S("titleTextView");
          }
          TextPaint paint = view.getPaint();
          a.o(paint, "titleTextView.paint");
          paint.setFakeBoldText(true);
          this.k = new LiveHotSpotDetailRelatedAnchorItemAdapter(this, this.B2(), this.m);
          a.o(recyclerView, "recyclerView");
          LiveHotSpotDetailRelatedAnchorsViewController tk = this.k;
          if (tk == null) {
             a.S("adapter");
          }
          recyclerView.setAdapter(tk);
          recyclerView.setLayoutManager(new LinearLayoutManager(this.D2(), 0, 0));
          recyclerView.addItemDecoration(new LiveHotSpotDetailRelatedAnchorsViewController$a(this));
       }
       c value = viewModelLaz.getValue();
       if (!PatchProxy.applyVoidOneRefs(value, this, liveHotSpotD, "3")) {
          value.b.observe(this, new a(this));
          value.c.observe(this, new b(this));
       }
       return;
    }
}
