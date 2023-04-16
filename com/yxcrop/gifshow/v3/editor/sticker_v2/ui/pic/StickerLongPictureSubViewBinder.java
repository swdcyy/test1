package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder;
import yld.m;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$a;
import ei0.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import lwc.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import smd.d;
import rmd.g;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$mPictureViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$b;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import kotlin.Pair;
import com.kwai.robust.PatchProxyResult;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import xld.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import java.util.Map;
import kotlin.Triple;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.utility.Log;
import java.lang.Float;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import lnc.a1;
import uwc.b;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import w46.b;
import java.lang.Number;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.CharSequence;
import mmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerInitAction;
import java.util.HashMap;
import android.util.Pair;
import java.util.ArrayList;
import msd.l;
import android.graphics.Rect;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import nsd.u;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.AddStickerAction;
import cmd.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import java.util.Collection;
import ekd.q;

public final class StickerLongPictureSubViewBinder extends a implements m, StickerPicturePreviewViewBinder$a	// class@000abc
{
    public final d c;
    public final h d;
    public final EditDecorationContainerViewV2 e;
    public final p f;
    public final ViewPagerRecyclerView g;
    public float h;
    public final StickerLongPictureSubViewBinder$a i;
    public final StickerLongPictureSubViewBinder$d j;
    public final Fragment k;
    public final EditorDelegate l;
    public final h m;

    public void StickerLongPictureSubViewBinder(View p0,Fragment p1,EditorDelegate p2,h p3){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       a.p(p3, "previewViewModel");
       super(p0);
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.c = g.a(p1);
       this.d = f.l(p1);
       View view = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.e = view;
       this.f = s.c(new StickerLongPictureSubViewBinder$mPictureViewModel$2(this));
       this.g = p0.findViewById(0x7f0a3096);
       this.i = new StickerLongPictureSubViewBinder$a(this);
       this.j = new StickerLongPictureSubViewBinder$d(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, StickerLongPictureSubViewBinder.class, "2")) {
          return;
       }
       k1.r(new StickerLongPictureSubViewBinder$b(this), 0);
       List decorationDr = this.e.getDecorationDrawerList();
       a.o(decorationDr, "mContainerView.decorationDrawerList");
       Iterator iterator = decorationDr.iterator();
       while (iterator.hasNext()) {
          iterator.next().changeDrawerVisible(false);
       }
       this.e.getViewTreeObserver().addOnGlobalLayoutListener(new StickerLongPictureSubViewBinder$c(this));
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, StickerLongPictureSubViewBinder.class, "3")) {
          return;
       }
       this.e.M(this.i);
       return;
    }
    public final Pair D(List p0){
       int i;
       List obj = PatchProxy.applyOneRefs(p0, this, StickerLongPictureSubViewBinder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.o0().j();
       Iterator iterator = p0.iterator();
       while (true) {
          StringBuilder str = -1;
          if (!iterator.hasNext()) {
             return new Pair(Integer.valueOf(str), "");
          }
          i = obj.indexOf(iterator.next());
          if (i != str) {
             break ;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("LongPictureSubViewBinder", "findIndexAndIdentify: "+i+", "+obj.get(i), objArray);
       return new Pair(Integer.valueOf(i), obj.get(i));
    }
    public final String E(String p0,d p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, StickerLongPictureSubViewBinder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.o0().d().get(p0);
       if (obj == null) {
          obj = p1.o0().e().get(p0);
       }
       return obj;
    }
    public final Triple F(){
       StickerLongPictureSubViewBinder obj = PatchProxy.apply(null, this, StickerLongPictureSubViewBinder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       a.o(obj, "mPictureRV");
       float f = 0x3f000000;
       int i = (int)((float)obj.getHeight() * f);
       StickerLongPictureSubViewBinder tg = this.g;
       a.o(tg, "mPictureRV");
       RecyclerView$LayoutManager layoutManage = tg.getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       int i1 = layoutManage.i0();
       int i2 = layoutManage.c();
       if (i1 <= i2) {
          while (true) {
             RecyclerView$ViewHolder viewHolder = this.g.findViewHolderForAdapterPosition(i1);
             if (viewHolder != null) {
                viewHolder = viewHolder.itemView;
                a.o(viewHolder, "it.itemView");
                Log.b("LongPictureSubViewBinder", i+" in "+viewHolder.getTop()+".."+viewHolder.getBottom());
                int bottom = viewHolder.getBottom();
                if (viewHolder.getTop() <= i && bottom >= i) {
                   return new Triple(Integer.valueOf(i1), Float.valueOf(f), Float.valueOf(((float)(i - viewHolder.getTop()) / (float)viewHolder.getHeight())));
                }else if(i1 != i2){
                   i1 = i1 + 1;
                }
             }else {
                goto label_009e ;
             }
          }
       }
       return new Triple(Integer.valueOf(-1), Float.valueOf(f), Float.valueOf(f));
    }
    public final Size G(Size p0){
       Size obj = PatchProxy.applyOneRefs(p0, this, StickerLongPictureSubViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.b;
       p0 = p0.c;
       float f = (float)p0 / (float)obj;
       int i = 0;
       if (this.h - f < 0 && obj < a1.h()) {
          Object[] objArray = new Object[i];
          a.D().w("LongPictureSubViewBinder", "getFinalSizeWhenPreviewSize: "+a1.h()+", "+(int)((float)a1.h() * f), objArray);
          return new Size(a1.h(), (int)((float)a1.h() * f));
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("LongPictureSubViewBinder", "getFinalSizeWhenPreviewSize: "+obj+", "+p0, objArray1);
          return new Size(obj, p0);
       }
    }
    public final b H(){
       Object obj = PatchProxy.apply(null, this, StickerLongPictureSubViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public void b(StickerDetailInfo p0){
       b uob;
       AddStickerAction uAddStickerA;
       a obj3;
       int i4;
       Object obj = this;
       StickerLongPictureSubViewBinder obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StickerLongPictureSubViewBinder stickerLongP = StickerLongPictureSubViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, stickerLongP, "4")) {
          return;
       }
       String str = "LongPictureSubViewBinder";
       int i = 0;
       if (obj1 == null) {
          Object[] objArray = new Object[i];
          a.D().t(str, "onAddSticker: stickerDetailInfo is null", objArray);
          return;
       }else {
          Triple triple = this.F();
          int i1 = triple.component1().intValue();
          float f = triple.component2().floatValue();
          float f1 = triple.component3().floatValue();
          if (i1 < 0) {
             a.f.a().c(PostCommonBiz.EDIT, str, "error Index");
             Log.d(str, "error Index");
             return;
          }else {
             String str1 = CollectionsKt___CollectionsKt.F2(obj.c.o0().j(), i1);
             if (str1 != null) {
                int i2 = 1;
                String[] stringArray = new String[i2];
                stringArray[i] = str1;
                List list = CollectionsKt__CollectionsKt.P(stringArray);
                str1 = obj.E(str1, obj.c);
                if (str1 != null) {
                   if (str1.length() <= 0) {
                      i2 = 0;
                   }
                   if (i2) {
                      list.add(str1);
                   }
                }
                Object[] objArray1 = new Object[i];
                a.D().w(str, "onAddSticker: "+f+", "+f1+", "+list+", "+obj1, objArray1);
                if (obj.c.o0().A() == null) {
                   Object[] objArray2 = new Object[i];
                   a.D().w(str, "onAddSticker: stickerAttachInfo is null", objArray2);
                   StickerLongPictureSubViewBinder c = obj.c;
                   a uoa = PatchProxy.apply(null, obj, stickerLongP, "19");
                   if (uoa != patchProxyRe) {
                   }else {
                      HashMap hashMap = new HashMap();
                      HashMap hashMap1 = new HashMap();
                      Iterator iterator = this.H().H0().iterator();
                      while (iterator.hasNext()) {
                         obj3 = iterator.next();
                         int i3 = i + 1;
                         if (i < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         Iterator iterator1 = iterator;
                         if (i >= 0 && i < obj.m.w0().size()) {
                            ArrayList uArrayList = new ArrayList();
                            Pair first = obj3.first;
                            i4 = i3;
                            if (first != null) {
                               a.o(first, "identifierList.first");
                               uArrayList.add(first);
                            }
                            first = obj3.second;
                            if (first != null) {
                               a.o(first, "identifierList.second");
                               uArrayList.add(first);
                            }
                            hashMap.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList, "", null, null, 0, null, null, 62, null)).hashCode()), obj.m.w0().get(i));
                            hashMap1.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList, "", 0, 0, null, 0, 0, 62, 0)).hashCode()), Float.valueOf(obj.f(uArrayList)));
                         }else {
                            i4 = i3;
                         }
                         iterator = iterator1;
                         i = i4;
                      }
                      obj3 = new a(true, obj.e.getEditorRect().width(), hashMap, hashMap1, null, 16, null);
                      uoa = i;
                   }
                   c.t0(new StickerInitAction(uoa));
                }
                obj1 = obj.c;
                if (PatchProxy.isSupport(stickerLongP)) {
                   Object obj2 = PatchProxy.applyFourRefs(Integer.valueOf(i1), list, Float.valueOf(f), Float.valueOf(f1), this, StickerLongPictureSubViewBinder.class, "18");
                   if (obj2 != patchProxyRe) {
                      uob = obj2;
                      uAddStickerA = v15;
                   label_022b :
                      AddStickerAction uAddStickerA1 = new AddStickerAction(0, 0x3ff0000000000000, p0, uob, obj.c.o0().w());
                      obj1.t0(uAddStickerA);
                   }
                }
                uAddStickerA = v15;
                uob = new b(1, false, obj.m.w0().get(i1), (float)obj.e.getEditorRect().width(), 0, obj.m.p0(i1), list, 0, f, f1, 146, null);
                goto label_022b ;
             }
             return;
          }
       }
    }
    public float f(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerLongPictureSubViewBinder.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       int i = this.m(p0);
       if (i < 0) {
          return 0x3f800000;
       }
       return ((this.d.p0(i) * (float)this.d.v0(i).b) / (float)this.G(this.d.v0(i)).b);
    }
    public void h(boolean p0){
       if (PatchProxy.isSupport(StickerLongPictureSubViewBinder.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StickerLongPictureSubViewBinder.class, "20");
       }
       return;
    }
    public EditDecorationContainerView$b j(){
       return this.j;
    }
    public int m(List p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, StickerLongPictureSubViewBinder.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (q.f(p0)) {
          obj = new Object[i];
          a.D().w("LongPictureSubViewBinder", "getCurrentPictureIndex: attachIdentifierList is empty", obj);
          return this.F().getFirst().intValue();
       }else {
          int i1 = -1;
          Iterator iterator = this.H().H0().iterator();
          int i2 = 0;
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             int i3 = i2 + 1;
             if (i2 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             int i4 = 1;
             if (p0 != null && (p0.size() == i4 && (a.g(obj1.first, p0.get(i)) || (p0 != null && (p0.size() == 2 && (a.g(obj1.first, p0.get(i)) && a.g(obj1.second, p0.get(i4)))))))) {
                i1 = i2;
             }
          label_009b :
             i2 = i3;
          }
          Object[] objArray = new Object[i];
          a.D().w("LongPictureSubViewBinder", "getCurrentPictureIndex: finalIndex: "+i1, objArray);
          return i1;
       }
    }
}
