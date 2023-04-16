package com.kuaishou.live.bottombar.component.panel.LiveBottomBarBasePanelFragment;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
import com.kuaishou.live.bottombar.component.panel.a;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k61.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bottombar.component.panel.LiveBottomBarBasePanelFragment$a;
import com.kuaishou.live.bottombar.service.model.panel.LiveBottomBarPanelData;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.bottombar.service.model.panel.LiveBottomBarPanelGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import z61.b;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k61.g;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import d61.w;
import i2b.a;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.bottombar.component.widget.view.LiveBottomBarPanelLandscapeBackgroundDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import k61.a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.kuaishou.live.basic.widget.MaxHeightRecyclerView;
import com.yxcorp.utility.n;

public abstract class LiveBottomBarBasePanelFragment extends Fragment	// class@000d38
{
    public LiveBottomBarPanelData b;
    public MaxHeightRecyclerView c;
    public a d;
    public List e;
    public f f;
    public final Set g;

    public void LiveBottomBarBasePanelFragment(){
       super();
       this.g = new HashSet();
    }
    public abstract a Ug();
    public abstract RecyclerView$LayoutManager Vg(Context p0);
    public f Wg(){
       Object obj = PatchProxy.apply(null, this, LiveBottomBarBasePanelFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveBottomBarBasePanelFragment$a(this);
    }
    public void Xg(){
       if (PatchProxy.applyVoid(null, this, LiveBottomBarBasePanelFragment.class, "5")) {
          return;
       }
       if (q.f(this.b.mGroups)) {
          return;
       }
       if (this.e == null) {
          this.e = new ArrayList();
       }
       Iterator iterator = this.b.mGroups.iterator();
       while (iterator.hasNext()) {
          LiveBottomBarPanelGroup liveBottomBa = iterator.next();
          if (q.f(liveBottomBa.mItems)) {
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator1 = liveBottomBa.mItems.iterator();
             while (iterator1.hasNext()) {
                MutableLiveData mutableLiveD = iterator1.next();
                if (mutableLiveD != null && (mutableLiveD.getValue() == null || !mutableLiveD.getValue().mIsVisible.booleanValue())) {
                   continue ;
                }
                uArrayList.add(mutableLiveD);
             }
             if (!q.f(uArrayList)) {
                if (!TextUtils.x(liveBottomBa.mGroupName)) {
                   MutableLiveData mutableLiveD1 = new MutableLiveData();
                   g og = new g();
                   og.mText = liveBottomBa.mGroupName;
                   mutableLiveD1.setValue(og);
                   this.e.add(mutableLiveD1);
                }
                this.e.addAll(uArrayList);
             }
          }
       }
       LiveBottomBarBasePanelFragment td = this.d;
       LiveBottomBarBasePanelFragment te = this.e;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(te, td, a.class, "1")) {
          td.f = te;
          td.k0();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBottomBarBasePanelFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       this.Xg();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveBottomBarBasePanelFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getContext() != null && w.b(this.getContext())) {
          view = a.g(p0, R.layout.arg_RES_7f0d0a80, p1, false);
          View view1 = view.findViewById(R.id.live_bottom_bar_landscape_more_container_layout);
          LiveBottomBarPanelData mLandscapeBa = this.b.mLandscapeBackgroundDrawable;
          if (mLandscapeBa != null) {
             view1.setBackground(mLandscapeBa);
          }else {
             view1.setBackground(new LiveBottomBarPanelLandscapeBackgroundDrawable());
          }
       }else {
          view = a.g(p0, R.layout.arg_RES_7f0d0a82, p1, false);
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveBottomBarBasePanelFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       LiveBottomBarBasePanelFragment tc = this.c;
       if (tc != null) {
          tc.setAdapter(null);
       }
       this.g.clear();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBottomBarBasePanelFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveBottomBarBasePanelFragment.class, "3")) {
          View view1 = p0.findViewById(R.id.live_bottom_bar_landscape_placeholder_view);
          if (view1 != null) {
             view1.setOnClickListener(new a(this));
          }
       }
       TextView textView = p0.findViewById(R.id.live_bottom_bar_title);
       View view = p0.findViewById(R.id.live_bottom_bar_divider);
       this.c = p0.findViewById(0x7f0a1ab4);
       if (TextUtils.x(this.b.mTitle)) {
          i = 8;
          textView.setVisibility(i);
          view.setVisibility(i);
       }else {
          i = 0;
          textView.setVisibility(i);
          view.setVisibility(i);
          textView.setText(this.b.mTitle);
       }
       if (!w.b(p0.getContext())) {
          LiveBottomBarPanelData mMaxHeightPe = this.b.mMaxHeightPercent;
          if (mMaxHeightPe <= 0) {
             mMaxHeightPe = 0x3f19999a;
          }
          this.c.setMaxHeight((int)(mMaxHeightPe * (float)n.v(p0.getContext())));
       }
       a uoa = this.Ug();
       this.d = uoa;
       this.c.setAdapter(uoa);
       this.c.setLayoutManager(this.Vg(p0.getContext()));
       return;
    }
}
