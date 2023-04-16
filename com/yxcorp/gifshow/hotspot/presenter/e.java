package com.yxcorp.gifshow.hotspot.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import android.view.View;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.Rect;
import android.app.Activity;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e6a.b;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import ekd.k1;
import gwa.c;

public class e extends PresenterV2	// class@0018e9
{
    public BaseFragment p;
    public Runnable q;

    public void e(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       u1.a(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       u1.b(this);
       return;
    }
    public View P8(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.h0().getLayoutManager().findViewByPosition(p0);
    }
    public int R8(QPhoto p0){
       return -1;
    }
    public void S8(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "6")) {
          return;
       }
       RecyclerView recyclerView = this.h0();
       if (recyclerView != null) {
          View view = recyclerView.getLayoutManager().findViewByPosition(p0);
          Rect rect = new Rect();
          if (view != null) {
             view.getGlobalVisibleRect(rect);
             if (rect.bottom >= n.j(this.getActivity())) {
                recyclerView.smoothScrollBy(0, (rect.bottom - n.j(this.getActivity())));
             }
          }else {
             recyclerView.smoothScrollToPosition(p0);
          }
          if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
             recyclerView.getLayoutManager().scrollToPositionWithOffset(p0, 0);
          }else if(recyclerView.getLayoutManager() instanceof LinearLayoutManager){
             recyclerView.getLayoutManager().scrollToPositionWithOffset(p0, 0);
          }
       }
       return;
    }
    public RecyclerView h0(){
       return null;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
    public void onEventMainThread(b p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "4")) {
          return;
       }
       if (this.getActivity() != null && this.h0() != null) {
          if (p0.a != this.p.hashCode()) {
             return;
          }else {
             b b = p0.b;
             p0 = p0.c;
             if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(b, Integer.valueOf(p0), this, uoe, "5")) {
                int i = this.R8(b);
                if (i > -1) {
                   this.S8(i);
                   if (!PatchProxy.applyVoid(null, this, uoe, "7")) {
                      uoe = this.q;
                      if (uoe != null) {
                         k1.m(uoe);
                         this.q = null;
                      }
                   }
                   c uoc = new c(this, p0, i);
                   this.q = uoc;
                   k1.r(uoc, 100);
                }
             }
          }
       }
       return;
    }
}
