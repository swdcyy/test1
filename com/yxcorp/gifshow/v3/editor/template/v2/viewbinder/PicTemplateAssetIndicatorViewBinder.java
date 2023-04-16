package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder;
import ci0.a;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import buc.i;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.util.ARecyclerAdapter;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder$b;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder$c;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder$$special$$inlined$apply$lambda$1;
import com.yxcorp.gifshow.util.ARecyclerAdapter$c;
import msd.l;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.v3.widget.CenterScrollLinearLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import fuc.a;
import ei0.a;
import tvc.e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.util.ARecyclerAdapter$a;
import java.util.Collection;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.util.ARecyclerAdapter$e;

public final class PicTemplateAssetIndicatorViewBinder extends a	// class@00138b
{
    public final ARecyclerAdapter g;
    public final RecyclerView h;
    public final int i;
    public final View j;
    public static final PicTemplateAssetIndicatorViewBinder$a k;

    static {
       PicTemplateAssetIndicatorViewBinder.k = new PicTemplateAssetIndicatorViewBinder$a(null);
    }
    public void PicTemplateAssetIndicatorViewBinder(LifecycleOwner p0,i p1,View p2){
       a.p(p0, "owner");
       a.p(p1, "svm");
       a.p(p2, "root");
       super(p0, p1, p2);
       ARecyclerAdapter uARecyclerAd = new ARecyclerAdapter();
       uARecyclerAd.M0(m0.d(PicTemplateAssetIndicatorViewBinder$b.class), new PicTemplateAssetIndicatorViewBinder$c(), new PicTemplateAssetIndicatorViewBinder$$special$$inlined$apply$lambda$1(this));
       this.g = uARecyclerAd;
       RecyclerView recyclerView = this.E(R.id.pic_template_editor_v2_preview_list);
       Context context = recyclerView.getContext();
       a.o(context, "context");
       CenterScrollLinearLayoutManager uCenterScrol = new CenterScrollLinearLayoutManager(context, 0, false, 6, null);
       recyclerView.setLayoutManager(new PicTemplateAssetIndicatorViewBinder$c());
       recyclerView.addItemDecoration(new b(0, a1.d(R.dimen.arg_RES_7f070c6e), 0, a1.d(R.dimen.arg_RES_7f070c6d)));
       recyclerView.setAdapter(uARecyclerAd);
       this.h = recyclerView;
       this.i = a.a.a(this.A());
       this.j = this.E(0x7f0a3088);
    }
    public void F(e p0,e p1){
       ARecyclerAdapter$a a;
       PicTemplateAssetIndicatorViewBinder picTemplateA = PicTemplateAssetIndicatorViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, picTemplateA, "1")) {
       }else {
          a.p(p1, "newState");
          Object obj = null;
          List list = (p0 != null)? p0.d(): obj;
          int i = 0;
          if (list != p1.d()) {
             list = p1.d();
             if (!PatchProxy.applyVoidOneRefs(list, this, picTemplateA, "2")) {
                ARecyclerAdapter$a uoa = this.g.K0();
                uoa.b();
                d uod = m0.d(PicTemplateAssetIndicatorViewBinder$b.class);
                a.p(uod, "holder");
                a.p(list, "data");
                if (list.isEmpty() ^ 1) {
                   Integer integer = uoa.b.L0(uod);
                   if (integer != null) {
                      int i1 = integer.intValue();
                      a = uoa.a;
                      ArrayList uArrayList = new ArrayList(u.Y(list, 10));
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         uArrayList.add(new ARecyclerAdapter$e(i1, iterator.next()));
                      }
                      a.addAll(uArrayList);
                   }
                }
                ARecyclerAdapter$a.c(uoa, i, 1, obj);
             }
          }
          if (p1.m() != -1) {
             if (p0 == null || p0.h() != p1.h()) {
                this.h.scrollToPosition(p1.m());
             }else if(p0.f() != p1.f() || p0.m() != p1.m()){
                this.h.smoothScrollToPosition(p1.m());
             }
          }
          if (p0 != null) {
             List list1 = p0.d();
             if (list1 != null && list1.size() == p1.d().size()) {
             label_00f0 :
                return;
             }
          }
          this.h.invalidateItemDecorations();
          PicTemplateAssetIndicatorViewBinder tj = this.j;
          if (p1.d().size() == 1) {
             i = 8;
          }
          tj.setVisibility(i);
          goto label_00f0 ;
       }
    }
}
