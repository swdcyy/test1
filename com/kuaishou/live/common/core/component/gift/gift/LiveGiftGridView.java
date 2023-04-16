package com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.viewpager.widget.ViewPager;
import java.lang.Boolean;
import com.kwai.library.widget.viewpager.GridViewPager;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridListView;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import h3.a;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView$a;
import vg1.e;
import android.widget.BaseAdapter;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public class LiveGiftGridView extends FrameLayout	// class@001287
{
    public LiveGiftGridListView b;
    public GridViewPager c;

    public void LiveGiftGridView(Context p0){
       super(p0, null, 0, 0);
    }
    public void LiveGiftGridView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 0);
    }
    public void LiveGiftGridView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, 0);
    }
    public void LiveGiftGridView(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void a(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftGridView.class, "12")) {
          return;
       }
       LiveGiftGridView tc = this.c;
       if (tc != null) {
          tc.addOnPageChangeListener(p0);
       }
       return;
    }
    public void b(boolean p0){
       if (PatchProxy.isSupport(LiveGiftGridView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftGridView.class, "8")) {
          return;
       }
       LiveGiftGridView tc = this.c;
       if (tc != null) {
          tc.i(p0);
       }
       return;
    }
    public boolean c(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public void d(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftGridView.class, "13")) {
          return;
       }
       LiveGiftGridView tc = this.c;
       if (tc != null) {
          tc.removeOnPageChangeListener(p0);
       }
       return;
    }
    public void e(int p0,boolean p1){
       if (PatchProxy.isSupport(LiveGiftGridView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, LiveGiftGridView.class, "4")) {
          return;
       }
       if (this.c != null) {
          p0 = p0 / this.getPageSize();
          if (p0 != this.getCurrentPosition()) {
             this.c.setCurrentItem(p0, p1);
          }
       }else {
          LiveGiftGridView tb = this.b;
          if (tb != null) {
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(LiveGiftGridListView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), tb, LiveGiftGridListView.class, "2")) {
                if (p1) {
                   tb.smoothScrollToPosition(p0);
                }else {
                   tb.scrollToPosition(p0);
                }
             }
          }
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveGiftGridView.class, "14")) {
          return;
       }
       LiveGiftGridView tb = this.b;
       if (tb != null) {
          tb.x();
       }
       return;
    }
    public int getCurrentPosition(){
       LiveGiftGridView obj = PatchProxy.apply(null, this, LiveGiftGridView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       if (obj != null) {
          return obj.getCurrentItem();
       }
       obj = this.b;
       if (obj != null) {
          return obj.getCurrentPosition();
       }
       return -1;
    }
    public LiveGiftGridListView getListView(){
       return this.b;
    }
    public int getPageCount(){
       LiveGiftGridView obj = PatchProxy.apply(null, this, LiveGiftGridView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       if (obj != null) {
          return obj.getPageCount();
       }
       return 1;
    }
    public int getPageSize(){
       LiveGiftGridView obj = PatchProxy.apply(null, this, LiveGiftGridView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       if (obj != null) {
          return obj.getPageSize();
       }
       obj = this.b;
       int i = 8;
       if (obj != null && obj.getAdapter() != null) {
          i = this.b.getAdapter().getItemCount();
       }
       return i;
    }
    public a getPagerAdapter(){
       LiveGiftGridView obj = PatchProxy.apply(null, this, LiveGiftGridView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          return obj.getAdapter();
       }
       return null;
    }
    public GridViewPager getPagerView(){
       return this.c;
    }
    public void setColumnNumber(int p0){
       if (PatchProxy.isSupport(LiveGiftGridView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftGridView.class, "10")) {
          return;
       }
       LiveGiftGridView tc = this.c;
       if (tc != null) {
          tc.setColumnNumber(p0);
       }
       return;
    }
    public void setGiftGridRecyclerViewCallback(LiveGiftGridView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftGridView.class, "16")) {
          return;
       }
       LiveGiftGridView tb = this.b;
       if (tb != null) {
          tb.setGiftGridRecyclerViewCallback(p0);
       }
       return;
    }
    public void setGiftItemAdapter(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftGridView.class, "6")) {
          return;
       }
       LiveGiftGridView tc = this.c;
       if (tc != null) {
          tc.setAdapter(p0);
       }else {
          tc = this.b;
          if (tc != null) {
             tc.setGiftItemAdapter(p0);
          }
       }
       return;
    }
    public void setRowNumber(int p0){
       if (PatchProxy.isSupport(LiveGiftGridView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftGridView.class, "9")) {
          return;
       }
       LiveGiftGridView tc = this.c;
       if (tc != null) {
          tc.setRowNumber(p0);
       }
       return;
    }
    public void setScrollMode(LiveGiftBoxConfig$ScrollMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftGridView.class, "1")) {
          return;
       }
       this.removeAllViews();
       if (p0 == LiveGiftBoxConfig$ScrollMode.LIST_VERTICAL) {
          LiveGiftGridListView liveGiftGrid = a.i(this, R.layout.arg_RES_7f0d0b21);
          this.b = liveGiftGrid;
          this.c = null;
          this.addView(liveGiftGrid);
          ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
          if (layoutParams instanceof RelativeLayout$LayoutParams) {
             layoutParams.removeRule(2);
             this.requestLayout();
          }
       }else {
          GridViewPager gridViewPage = a.i(this, R.layout.arg_RES_7f0d0b22);
          this.c = gridViewPage;
          this.b = null;
          this.addView(gridViewPage);
       }
       return;
    }
    public void setSelection(int p0){
       if (PatchProxy.isSupport(LiveGiftGridView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftGridView.class, "15")) {
          return;
       }
       LiveGiftGridView tc = this.c;
       if (tc != null) {
          tc.setSelection(p0);
       }
       return;
    }
}
