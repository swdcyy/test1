package hf9.f$d;
import kf9.b;
import hf9.f;
import java.lang.Object;
import kf9.f;
import hf9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import j8c.a;
import q87.c;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import hf9.g;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$e;
import hf9.h;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$g;
import hf9.i;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$f;
import hf9.j;
import lf9.q;
import hf9.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.ImageView;
import java.util.List;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.LinkedHashSet;
import com.google.gson.JsonArray;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import g9c.a;
import if9.a;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.view.ViewTreeObserver;
import hf9.d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.System;
import java.lang.Long;
import kf9.a;
import kf9.e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ui9.f;
import ui9.j;
import ui9.f$d;
import lnc.a1;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.f;
import android.content.Context;

public final class f$d implements b	// class@002644
{
    public final f a;

    public void f$d(f p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       f$d obj2;
       f$d a;
       f uof1;
       String str8;
       String str9;
       String str10;
       int i;
       f$d a1;
       d d;
       BaseFragment uBaseFragmen;
       Long c;
       a uoa1;
       f u1;
       int i2;
       boolean i3;
       JsonObject jsonObject1;
       c obj = this;
       c obj1 = p0;
       f uof = f.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, f$d.class, "1")) {
          obj2 = obj;
       }else {
          a.p(obj1, "newState");
          a = obj.a;
          Objects.requireNonNull(a);
          String str = "ai_record_index";
          String str1 = "ai_record_name";
          String str2 = "ai_record_id";
          String str3 = "ai_record_type";
          String str4 = "4";
          String str5 = "SliMode";
          String str6 = "page";
          String str7 = null;
          if (PatchProxy.applyVoidOneRefs(obj1, a, uof, "13")) {
             uof1 = uof;
             str8 = str4;
             str9 = str5;
             str10 = str6;
          }else {
             Object[] objArray2 = new Object[str7];
             str8 = str4;
             a.D().w("SlipModeMagicController", "updateListView", objArray2);
             int i1 = obj1.b();
             str4 = 4;
             if (PatchProxy.isSupport(uof) && (PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), a, uof, "15") || (a.w != null && (a.u != null && a.K != null)))) {
                uof1 = uof;
                str9 = str5;
             }else {
                n.Y(a.E, str4, false);
                n.Y(a.H, str4, false);
                n.Y(a.F, str4, false);
                n.Y(a.H, str4, false);
                Object[] objArray3 = new Object[false];
                a.D().w(str5, "initSlipModePanel", objArray3);
                f i5 = a.I;
                str4 = "panelViewStubInflater";
                if (i5 == null) {
                   a.S(str4);
                }
                ViewGroup viewGroup = i5.b(R.id.assistant_panel_container);
                a.C = viewGroup;
                RecyclerView recyclerView = (viewGroup != null)? viewGroup.findViewById(R.id.horizon_auto_picker_recycler): null;
                a.w = recyclerView;
                HGalleryLayoutManager hGalleryLayo = new HGalleryLayoutManager();
                hGalleryLayo.N(a.w, i1);
                hGalleryLayo.W(new g(a));
                hGalleryLayo.X(new h(a));
                hGalleryLayo.Y(i.a);
                u1 = a.v;
                str7 = "slipViewModel";
                if (u1 == null) {
                   a.S(str7);
                }
                str9 = str5;
                u1.k = new j(a);
                f w = a.w;
                a.m(w);
                uof1 = uof;
                uof = a.v;
                if (uof == null) {
                   a.S(str7);
                }
                a.u = new e(w, hGalleryLayo, uof);
                u1 = a.w;
                a.m(u1);
                u1.setAdapter(a.u);
                u1 = a.I;
                if (u1 == null) {
                   a.S(str4);
                }
                ImageView imageView = u1.b(R.id.assistant_download_retry);
                a.K = imageView;
                i2 = 4;
                i3 = false;
                n.Y(imageView, i2, i3);
                u1 = a.I;
                if (u1 == null) {
                   a.S(str4);
                }
                n.Y(u1.b(R.id.assistant_empty_btn), i2, i3);
                u1 = a.I;
                if (u1 == null) {
                   a.S(str4);
                }
                a.y = u1.b(0x7f0a0262);
             }
             a.t = obj1.f();
             u1 = a.u;
             a.m(u1);
             if (a.g(u1.w, obj1.f()) ^ 1) {
                obj = c.e;
                uof = a.u;
                d = a.d;
                a.o(d, "mCallerContext");
                uBaseFragmen = d.f();
                a.o(uBaseFragmen, "mCallerContext.fragment");
                Objects.requireNonNull(obj);
                if (PatchProxy.applyVoidTwoRefs(uof, uBaseFragmen, obj, uoc, "7")) {
                   str10 = str6;
                }else {
                   a.p(uBaseFragmen, str6);
                   if (uof != null) {
                      LinkedHashSet a3 = c.a;
                      if (!a3.isEmpty()) {
                         JsonArray jsonArray = new JsonArray();
                         Iterator iterator = a3.iterator();
                         while (iterator.hasNext()) {
                            int i4 = iterator.next().intValue();
                            a uoa2 = uof.N0(i4);
                            if (uoa2 != null) {
                               a.o(uoa2, "assistantAdapter.getItem\(it\) ?: return@forEach");
                               jsonObject1 = new JsonObject();
                               jsonObject1.c0(str3, c.e.a(Integer.valueOf(uoa2.c())));
                               jsonObject1.c0(str2, uoa2.a());
                               jsonObject1.c0(str1, uoa2.b());
                               jsonObject1.a0(str, Integer.valueOf(i4));
                               jsonArray.G(jsonObject1);
                               iterator = iterator;
                               uof = uof;
                               str6 = str6;
                            }
                         }
                         str10 = str6;
                         c.a.clear();
                         jsonObject1 = new JsonObject();
                         jsonObject1.c0("template_list", jsonArray.toString());
                         String str11 = jsonObject1.toString();
                         a.o(str11, "JsonObject\(\).let {\n     бн      it.toString\(\)\n    }");
                         ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                         uElementPack1.action2 = "AI_RECORD_TEMPLATE";
                         uElementPack1.params = str11;
                         u1.D0("", uBaseFragmen, 3, uElementPack1, null, null);
                      }
                   }
                   str10 = str6;
                   c.a.clear();
                }
                d d3 = a.d;
                a.o(d3, "mCallerContext");
                BaseFragment uBaseFragmen1 = d3.f();
                a.o(uBaseFragmen1, "mCallerContext.fragment");
                c.e.b(uBaseFragmen1);
                u1 = a.u;
                a.m(u1);
                u1.W0(obj1.f());
                u1 = a.u;
                a.m(u1);
                u1.k0();
                u1 = a.u;
                a.m(u1);
                i2 = obj1.b();
                Objects.requireNonNull(u1);
                e uoe = e.class;
                if (PatchProxy.isSupport(uoe)) {
                   str5 = str8;
                   if (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), u1, uoe, str5)) {
                   }
                }else {
                   str5 = str8;
                }
             }else {
                str10 = str6;
                str5 = str8;
             }
          label_029c :
             if (obj1.e()) {
                str8 = str5;
                i2 = 0;
                n.W(a.K, i2, a.M);
                a1 = 4;
             }else {
                str8 = str5;
                i2 = false;
                i3 = 4;
                n.Y(a.K, i3, i2);
             }
             if (obj1.d()) {
                n.W(a.y, i2, a.M);
             }else {
                n.Y(a.y, a1, i2);
             }
          }
          obj2 = this;
          if (obj1.b() != obj2.a.J) {
             obj = c.e;
             i = obj1.b();
             a1 = obj2.a;
             f u = a1.u;
             d = a1.d;
             a.o(d, "mCallerContext");
             uBaseFragmen = d.f();
             a.o(uBaseFragmen, "mCallerContext.fragment");
             Objects.requireNonNull(obj);
             if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), u, uBaseFragmen, obj, c.class, "2")) {
                str5 = str10;
             }else {
                str5 = str10;
                a.p(uBaseFragmen, str5);
                Integer b1 = c.b;
                if (b1 == null || b1.intValue() != i) {
                   obj.b(uBaseFragmen);
                   if (u != null) {
                      uoa1 = u.N0(i);
                      if (uoa1 != null) {
                         a.o(uoa1, "adapter.getItem\(index\) ?: return");
                         c.d = uoa1;
                         c.c = Long.valueOf(System.currentTimeMillis());
                         Integer integer1 = Integer.valueOf(i);
                         c.b = integer1;
                         a.m(integer1);
                         a d2 = c.d;
                         a.m(d2);
                         obj.c(integer1.intValue(), d2, uBaseFragmen, 1, null);
                      }
                   }
                }
             }
             i = obj1.b();
             a1 = obj2.a;
             u = a1.u;
             d = a1.d;
             a.o(d, "mCallerContext");
             uBaseFragmen = d.f();
             a.o(uBaseFragmen, "mCallerContext.fragment");
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), u, uBaseFragmen, obj, c.class, "6")) {
                a.p(uBaseFragmen, str5);
                if (u != null) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "AI_RECORD_TEMPLATE_ITEM";
                   uoa1 = u.N0(i);
                   if (uoa1 != null) {
                      a.o(uoa1, "adapter.getItem\(position\) ?: return");
                      JsonObject jsonObject = new JsonObject();
                      str10 = str5;
                      jsonObject.c0(str3, obj.a(Integer.valueOf(uoa1.c())));
                      jsonObject.c0(str2, uoa1.a());
                      jsonObject.c0(str1, uoa1.b());
                      jsonObject.a0(str, Integer.valueOf(i));
                      uElementPack.params = jsonObject.toString();
                      u1.M("", uBaseFragmen, 1, uElementPack, null, null);
                   label_03e7 :
                      obj2.a.J = obj1.b();
                   }
                }
             }
             str10 = str5;
             goto label_03e7 ;
          }
          a uoa = obj1.c();
          if (!a.g(obj2.a.q, uoa)) {
             if (uoa instanceof e) {
                a = obj2.a;
                Objects.requireNonNull(a);
                f uof2 = uof1;
                if (!PatchProxy.applyVoidTwoRefs(uoa, obj1, a, uof2, "10")) {
                   a.p(uoa, "newMagicItemState");
                   a.p(obj1, "slipListState");
                   Object[] objArray = new Object[0];
                   str2 = str9;
                   a.D().w(str2, "onMagicItemSelected", objArray);
                   a.q = uoa;
                   if (uoa.b() == 2) {
                      obj1 = PatchProxy.apply(null, a, uof2, "11");
                      if (obj1 != PatchProxyResult.class) {
                         a1 = obj1;
                      }else {
                         d g = a.g;
                         if (g != null) {
                            f uof3 = g.O0();
                            if (uof3 != null) {
                               uof3 = uof3.a;
                               if (uof3 != null) {
                                  a1 = uof3.a;
                               }
                            }
                         }
                         a1 = null;
                      }
                      if (a.g(a1, uoa.c()) ^ 1) {
                         Object[] objArray1 = new Object[0];
                         a.D().w(str2, "applyMagicFace", objArray1);
                         obj1 = c.e;
                         d = a.d;
                         a.o(d, "mCallerContext");
                         uBaseFragmen = d.f();
                         a.o(uBaseFragmen, "mCallerContext.fragment");
                         Objects.requireNonNull(obj1);
                         if (!PatchProxy.applyVoidOneRefs(uBaseFragmen, obj1, uoc, str8)) {
                            a.p(uBaseFragmen, str10);
                            Integer b = c.b;
                            if (b == null || (c.c != null && c.d != null)) {
                               a.m(b);
                               a d1 = c.d;
                               a.m(d1);
                               c = c.c;
                               a.m(c);
                               obj1.c(b.intValue(), d1, uBaseFragmen, 7, Long.valueOf((a1.k() - c.longValue())));
                               Integer integer = null;
                               c.b = integer;
                               c.c = integer;
                               c.d = integer;
                            }
                         }
                         MagicEmoji$MagicFace magicFace = uoa.c();
                         if (!PatchProxy.applyVoidOneRefs(magicFace, a, uof2, "12")) {
                            RxBus.f.b(new f(magicFace, a.e));
                         }
                      }
                   }
                }
             }else {
                f$d a2 = obj2.a;
                if (a2.q != null) {
                   a2.i2(true);
                }
             }
          }
       }
    label_04ee :
       return;
    }
}
