package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$f;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import faa.a;
import q87.c;
import java.lang.Boolean;
import uwc.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import tkd.b;
import tkd.d;
import om6.j;
import android.app.Activity;
import om6.k;
import lnc.a1;
import o79.a;
import java.util.ArrayList;
import java.util.List;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Iterator;
import java.lang.Iterable;
import zsc.b;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import di0.b;
import kotlin.jvm.internal.a;
import ctc.b;
import n3d.a;
import java.lang.CharSequence;
import e17.i;
import btc.b;
import k2b.s;

public final class ReorderPanelViewBinder$f extends m	// class@0011b3
{
    public final ReorderPanelViewBinder c;

    public void ReorderPanelViewBinder$f(ReorderPanelViewBinder p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b1;
       b a;
       Iterator iterator;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, ReorderPanelViewBinder$f.class, "1")) {
          return;
       }
       ReorderPanelViewBinder$f c = obj.c;
       if (c.m == null) {
          return;
       }
       Objects.requireNonNull(c);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ReorderViewModel reorderViewM = ReorderViewModel.class;
       ReorderPanelViewBinder reorderPanel = ReorderPanelViewBinder.class;
       if (!PatchProxy.applyVoid(null, c, reorderPanel, "2")) {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "ReorderPanelViewBinder";
          a.D().w(str, "> doAdd\(\)", objArray);
          ReorderPanelViewBinder q = c.q;
          Objects.requireNonNull(q);
          ArrayList obj1 = PatchProxy.apply(null, q, reorderViewM, "7");
          int i1 = 31;
          boolean b = true;
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(q.r0() < i1 && q.i.C0()){
             b1 = true;
          }else {
             b1 = false;
          }
          int i2 = 0x7f100b77;
          if (b1) {
             Object[] objArray1 = new Object[i];
             a.D().w(str, "doAdd: ", objArray1);
             if (c.o.getActivity() != null) {
                FragmentActivity activity = c.o.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                Intent intent = PatchProxy.apply(null, c, reorderPanel, "4");
                if (intent != patchProxyRe) {
                }else {
                   intent = d.a(0x2538349d).nt(c.o.getActivity());
                   intent.putExtra("album_next_des_str", a1.p(R.string.arg_RES_7f1045fa));
                   intent.putExtra("max_count", i1);
                   intent.putExtra("album_select_as_result", i);
                   intent.putExtra("album_tab_list", a.c);
                   intent.putExtra("album_selected_data_scroll_to_center", b);
                   intent.putExtra("album_des_str", a1.p(R.string.arg_RES_7f10462b));
                   intent.putExtra("album_show_selected_count", b);
                   intent.putExtra("default_select_tab", b);
                   intent.putExtra("album_reach_max_count_str", a1.q(i2, i1));
                   intent.putExtra("album_next_text_with_number", i);
                   intent.putExtra("tag", a1.p(R.string.arg_RES_7f100b70));
                   intent.putExtra("album_select_result_code", b);
                   obj1 = new ArrayList();
                   ReorderPanelViewBinder q1 = c.q;
                   Objects.requireNonNull(q1);
                   ArrayList uArrayList = PatchProxy.apply(null, q1, reorderViewM, "10");
                   if (uArrayList != patchProxyRe) {
                   }else {
                      uArrayList = new ArrayList();
                      ListHolder value = q1.f.getValue();
                      if (value != null) {
                         List list = value.c();
                         if (list != null) {
                            iterator = list.iterator();
                            while (iterator.hasNext()) {
                               uArrayList.add(iterator.next());
                            }
                         }
                      }
                   }
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      b uob = iterator.next();
                      QMedia qMedia = v14;
                      QMedia qMedia1 = v14;
                      qMedia = new QMedia(0, uob.a(), 0, 0, 0);
                      qMedia1.mWidth = uob.d().b;
                      qMedia1.mHeight = uob.d().c;
                      obj1.add(qMedia1);
                      String str1 = null;
                   }
                   SerializableHook.putExtra(intent, "album_selected_data", obj1);
                   ReorderPanelViewBinder q2 = c.q;
                   Objects.requireNonNull(q2);
                   String str2 = PatchProxy.apply(null, q2, reorderViewM, "11");
                   if (str2 != patchProxyRe) {
                   }else {
                      b uob1 = q2.f.u(q2.o0());
                      if (uob1 != null) {
                         str2 = uob1.a();
                         if (str2 == null) {
                         }
                      }else {
                      }
                   }
                   intent.putExtra("album_scroll_to_path", str2);
                   intent.putExtra("ALBUM_SLIDER_TYPE_KEY", 0);
                   a.o(intent, "intent");
                }
                activity.t1(intent, 0x2711, new b(c));
                FragmentActivity activity1 = c.o.getActivity();
                Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                activity1.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f010115);
             }
          }else {
             a.o(i.d(R.style.arg_RES_7f11066a, a1.q(i2, i1)), "KSToast.applyStyle\(R.sty¡­ax_count, MAX_PIC_COUNT\)\)");
          }
          a = b.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(null, a, b.class, "1")) {
             s.h("ADD_PICTURE");
          }
       }
       return;
    }
}
