package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.ArrayList;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$g;
import android.os.Handler$Callback;
import y8c.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$f;
import g9c.d;
import qvb.i;
import com.kwai.library.widget.refresh.RefreshLayout;
import lnc.a1;
import com.yxcorp.gifshow.fragment.f;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$e;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.activity.share.copywriting.CopyWritingList;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Boolean;
import android.graphics.Rect;
import com.yxcorp.gifshow.activity.share.copywriting.CopyWritingItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import android.os.Bundle;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.Map;
import y8c.g;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$c;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$d;

public final class ShareCopyWritingListFragment extends RecyclerFragment	// class@001387
{
    public String F;
    public int G;
    public String H;
    public String I;
    public CopyWritingList J;
    public List K;
    public d L;
    public String M;
    public final boolean N;
    public int O;
    public int P;
    public boolean Q;
    public final Handler R;

    public void ShareCopyWritingListFragment(){
       super();
       this.F = "";
       this.H = "";
       this.I = "";
       this.K = new ArrayList();
       this.M = "";
       this.N = a.t().d("preloadPublishPageCopywriting", true);
       Looper looper = Looper.myLooper();
       a.m(looper);
       this.R = new Handler(looper, new ShareCopyWritingListFragment$g(this));
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ShareCopyWritingListFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ShareCopyWritingListFragment$f uof = new ShareCopyWritingListFragment$f(this, this.s, this.ia(), this.q(), false);
       obj.u((float)a1.e(0xc1f00000));
       View view = this.getView();
       if (view != null) {
          view.addOnLayoutChangeListener(super(this));
       }
       return obj;
    }
    public final String Gh(){
       return this.F;
    }
    public final String Hh(){
       return this.H;
    }
    public final CopyWritingList Ih(){
       return this.J;
    }
    public final String Jh(){
       return this.I;
    }
    public final String Kh(){
       return this.M;
    }
    public final void Lh(){
       i3 obj;
       boolean b;
       if (PatchProxy.applyVoid(null, this, ShareCopyWritingListFragment.class, "9")) {
          return;
       }
       if (!this.K0()) {
          return;
       }
       ShareCopyWritingListFragment tJ = this.J;
       if (tJ != null) {
          List items = (tJ != null)? tJ.getItems(): null;
          RecyclerFragment recyclerFrag = (items == null || items.isEmpty())? 1: null;
          if (!recyclerFrag) {
             recyclerFrag = this.t;
             a.o(recyclerFrag, "mRecyclerView");
             RecyclerView$LayoutManager layoutManage = recyclerFrag.getLayoutManager();
             RecyclerFragment tt = this.t;
             a.o(tt, "mRecyclerView");
             if (!tt.getVisibility() && layoutManage instanceof LinearLayoutManager) {
                ShareCopyWritingListFragment tJ1 = this.J;
                a.m(tJ1);
                List items1 = tJ1.getItems();
                RecyclerView$LayoutManager layoutManage1 = layoutManage;
                int i = layoutManage1.i0();
                int i1 = layoutManage1.c();
                if (i >= 0 && i1 >= 0) {
                   int i2 = i1 + 1;
                   while (i < i2) {
                      if (i < items1.size() && !this.K.contains(items1.get(i))) {
                         if (i == i1) {
                            View childAt = layoutManage.getChildAt(i);
                            obj = PatchProxy.applyOneRefs(childAt, this, ShareCopyWritingListFragment.class, "10");
                            if (obj != PatchProxyResult.class) {
                               b = obj.booleanValue();
                            }else if(childAt != null && (childAt.getVisibility() || !childAt.isShown())){
                               Rect rect = new Rect();
                               if (childAt.getGlobalVisibleRect(rect)) {
                                  float f = (float)childAt.getMeasuredHeight() / (float)2;
                                  if ((float)rect.height() - f > 0) {
                                     b = true;
                                  }
                               }
                            }
                            b = false;
                            if (!b) {
                               return;
                            }
                         }
                         String captionRecoT = items1.get(i).getCaptionRecoText();
                         if (!PatchProxy.applyVoidOneRefs(captionRecoT, this, ShareCopyWritingListFragment.class, "11") && (!TextUtils.x(captionRecoT) && this.K0())) {
                            obj = i3.f();
                            obj.c("tab_index", Integer.valueOf(this.O));
                            obj.d("tab_name", this.M);
                            obj.d("copywriting_content", captionRecoT);
                            captionRecoT = obj.toString();
                            if (!PatchProxy.applyVoidTwoRefs(this, captionRecoT, null, a.class, "106")) {
                               ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                               uElementPack.action2 = "COPYWRITING";
                               uElementPack.params = captionRecoT;
                               u1.C0("", this, 3, uElementPack, new ClientContent$ContentPackage());
                            }
                         }
                         this.K.add(items1.get(i));
                      }
                      i = i + 1;
                   }
                }
             }
          }
       }
    label_0135 :
       return;
    }
    public final void Mh(CopyWritingList p0){
       this.J = p0;
    }
    public boolean S1(){
       return false;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareCopyWritingListFragment.class, "6")) {
          return;
       }
       a.p(p0, "view");
       super.fh(p0, p1);
       this.t.addOnScrollListener(new ShareCopyWritingListFragment$b(this));
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareCopyWritingListFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ShareCopyWritingListFragment.class, null);
       return objectsByTag;
    }
    public void setUserVisibleHint(boolean p0){
       if (PatchProxy.isSupport(ShareCopyWritingListFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ShareCopyWritingListFragment.class, "12")) {
          return;
       }
       super.setUserVisibleHint(p0);
       if (p0) {
          this.Lh();
       }else {
          this.K.clear();
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ShareCopyWritingListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ShareCopyWritingListFragment$c(this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, ShareCopyWritingListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ShareCopyWritingListFragment$d(this);
    }
}
