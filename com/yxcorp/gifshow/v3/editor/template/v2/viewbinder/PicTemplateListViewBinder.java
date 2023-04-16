package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder;
import ci0.a;
import androidx.lifecycle.LifecycleOwner;
import buc.i;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.util.ARecyclerAdapter;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$d;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$$special$$inlined$apply$lambda$1;
import com.yxcorp.gifshow.util.ARecyclerAdapter$c;
import msd.l;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$b;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$$special$$inlined$apply$lambda$2;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$c;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$e;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$$special$$inlined$apply$lambda$3;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$a;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$$special$$inlined$apply$lambda$4;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.v3.widget.CenterScrollLinearLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import tvc.e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import java.util.List;
import com.yxcorp.gifshow.util.ARecyclerAdapter$a;
import guc.h;
import java.lang.Enum;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;

public final class PicTemplateListViewBinder extends a	// class@001397
{
    public final ARecyclerAdapter g;
    public final RecyclerView h;

    public void PicTemplateListViewBinder(LifecycleOwner p0,i p1,View p2){
       a.p(p0, "owner");
       a.p(p1, "svm");
       a.p(p2, "view");
       super(p0, p1, p2);
       ARecyclerAdapter uARecyclerAd = new ARecyclerAdapter();
       ARecyclerAdapter uARecyclerAd1 = uARecyclerAd;
       ARecyclerAdapter.N0(uARecyclerAd1, m0.d(PicTemplateListViewBinder$d.class), null, new PicTemplateListViewBinder$$special$$inlined$apply$lambda$1(this), 2, null);
       ARecyclerAdapter.N0(uARecyclerAd1, m0.d(PicTemplateListViewBinder$b.class), null, new PicTemplateListViewBinder$$special$$inlined$apply$lambda$2(this), 2, null);
       uARecyclerAd.M0(m0.d(PicTemplateListViewBinder$c.class), new PicTemplateListViewBinder$e(), new PicTemplateListViewBinder$$special$$inlined$apply$lambda$3(this));
       ARecyclerAdapter.N0(uARecyclerAd1, m0.d(PicTemplateListViewBinder$a.class), null, new PicTemplateListViewBinder$$special$$inlined$apply$lambda$4(this), 2, null);
       this.g = uARecyclerAd;
       RecyclerView recyclerView = this.E(R.id.pic_template_list);
       recyclerView.addItemDecoration(new b(0, a1.d(R.dimen.arg_RES_7f070295), a1.d(R.dimen.arg_RES_7f070334)));
       Context context = recyclerView.getContext();
       a.o(context, "context");
       CenterScrollLinearLayoutManager uCenterScrol = new CenterScrollLinearLayoutManager(context, 0, false, 6, null);
       recyclerView.setLayoutManager(new b(0, a1.d(R.dimen.arg_RES_7f070295), a1.d(R.dimen.arg_RES_7f070334)));
       recyclerView.setAdapter(uARecyclerAd);
       this.h = recyclerView;
    }
    public void F(e p0,e p1){
       PicTemplateListViewBinder picTemplateL = PicTemplateListViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, picTemplateL, "1")) {
       }else {
          a.p(p1, "newState");
          if (p0 != null && (p0.q() != p1.q() || p0.r() != p1.r())) {
             PicTemplateState$ResourceState resourceStat = p1.q();
             List list = p1.r();
             if (!PatchProxy.applyVoidTwoRefs(resourceStat, list, this, picTemplateL, "2")) {
                ARecyclerAdapter$a uoa = this.g.K0();
                uoa.b();
                int i = h.a[resourceStat.ordinal()];
                if (i != 1) {
                   if (i != 2 && i != 3) {
                      if (i == 4) {
                         Iterator iterator = list.iterator();
                         while (iterator.hasNext()) {
                            PicTemplateState$e uoe = iterator.next();
                            if (uoe.g != null) {
                               uoa.a(m0.d(PicTemplateListViewBinder$a.class), uoe);
                            }else {
                               uoa.a(m0.d(PicTemplateListViewBinder$c.class), uoe);
                            }
                         }
                      }
                   }else {
                      uoa.a(m0.d(PicTemplateListViewBinder$d.class), null);
                   }
                }else {
                   uoa.a(m0.d(PicTemplateListViewBinder$b.class), null);
                }
                ARecyclerAdapter$a.c(uoa, false, 1, null);
             }
          }
          if (p1.o() != -1) {
             if (p0 == null || p0.i() != p1.i()) {
                this.h.scrollToPosition(p1.o());
             }else if(p0.g() != p1.g() || p0.o() != p1.o()){
                this.h.smoothScrollToPosition(p1.o());
             }
          }
       }
       return;
    }
}
