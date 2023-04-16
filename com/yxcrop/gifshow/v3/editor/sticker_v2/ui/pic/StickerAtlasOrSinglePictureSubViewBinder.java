package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder;
import yld.l;
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
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder$mPictureViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder$c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Map;
import qsc.g;
import t36.f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import uwc.b;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.util.Objects;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import xld.a;
import faa.a;
import q87.c;
import wnd.d;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import w46.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import mmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerInitAction;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import android.util.Pair;
import msd.l;
import java.lang.Integer;
import java.lang.Float;
import android.graphics.Rect;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import nsd.u;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.AddStickerAction;
import cmd.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Number;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import java.util.Collection;
import ekd.q;
import mod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;

public class StickerAtlasOrSinglePictureSubViewBinder extends a implements l, m, StickerPicturePreviewViewBinder$a	// class@000ab5
{
    public final String c;
    public final d d;
    public final p e;
    public final EditDecorationContainerViewV2 f;
    public final ViewPagerRecyclerView g;
    public final View h;
    public final View i;
    public final StickerAtlasOrSinglePictureSubViewBinder$a j;
    public final StickerAtlasOrSinglePictureSubViewBinder$c k;
    public final StickerAtlasOrSinglePictureSubViewBinder$b l;
    public final Fragment m;
    public final EditorDelegate n;
    public final h o;

    public void StickerAtlasOrSinglePictureSubViewBinder(View p0,Fragment p1,EditorDelegate p2,h p3){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       a.p(p3, "previewViewModel");
       super(p0);
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.c = "AtlasOrSinglePictureSubViewBinder";
       this.d = g.a(p1);
       this.e = s.c(new StickerAtlasOrSinglePictureSubViewBinder$mPictureViewModel$2(this));
       View view = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.f = view;
       this.g = p0.findViewById(0x7f0a3096);
       this.h = p0.findViewById(0x7f0a2f6d);
       this.i = p0.findViewById(0x7f0a2f6e);
       this.j = new StickerAtlasOrSinglePictureSubViewBinder$a(this);
       this.k = new StickerAtlasOrSinglePictureSubViewBinder$c(this);
       this.l = new StickerAtlasOrSinglePictureSubViewBinder$b(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, StickerAtlasOrSinglePictureSubViewBinder.class, "3")) {
          return;
       }
       this.f.d(this.j);
       f.o0(this.l, this.n.u(), g.class);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, StickerAtlasOrSinglePictureSubViewBinder.class, "4")) {
          return;
       }
       this.f.M(this.j);
       f.t0(this.l, this.n.u(), g.class);
       return;
    }
    public final boolean D(EditDecorationBaseDrawer p0){
       List identifyList;
       String obj = PatchProxy.applyOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.n.H() == EditorItemFunc.CROP) {
          return false;
       }
       obj = CollectionsKt___CollectionsKt.F2(this.H(), this.F().q0());
       if (p0 != null) {
          identifyList = p0.getIdentifyList();
          if (identifyList != null) {
          label_003d :
             return identifyList.contains(obj);
          }
       }
       identifyList = new ArrayList();
       goto label_003d ;
    }
    public final ViewGroup E(){
       Object[] objArray = null;
       StickerAtlasOrSinglePictureSubViewBinder obj = PatchProxy.apply(objArray, this, StickerAtlasOrSinglePictureSubViewBinder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       a.o(obj, "mPictureRV");
       if (obj.getChildCount() > 0) {
          View childAt = this.g.getChildAt(0);
          Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
          objArray = childAt.findViewById(0x7f0a3e16);
       }
       return objArray;
    }
    public final b F(){
       Object obj = PatchProxy.apply(null, this, StickerAtlasOrSinglePictureSubViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final d G(){
       return this.d;
    }
    public List H(){
       Object obj = PatchProxy.apply(null, this, StickerAtlasOrSinglePictureSubViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.o0().c();
    }
    public String I(){
       return this.c;
    }
    public final void J(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.I(), "hideElementShowFakeView: ", objArray);
       if (p0 != null && this.d.o0().o() < 0) {
          d.b(p0, this.E(), false, this.K(), this.L(), 4, null);
       }
       return;
    }
    public final boolean K(){
       Object obj = PatchProxy.apply(null, this, StickerAtlasOrSinglePictureSubViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.n.getType() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
    public final boolean L(){
       EditorItemFunc obj = PatchProxy.apply(null, this, StickerAtlasOrSinglePictureSubViewBinder.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.n.H();
       boolean b = (obj != null && obj != EditorItemFunc.STICKER_V2)? true: false;
       return b;
    }
    public final void M(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.I(), "showElementHideFakeView: ", objArray);
       if (p0 != null && this.d.o0().o() < 0) {
          d.d(p0, this.E(), this.K(), this.L());
       }
       return;
    }
    public void b(StickerDetailInfo p0){
       b uob;
       a obj3;
       Object obj = this;
       Pair obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StickerAtlasOrSinglePictureSubViewBinder stickerAtlas = StickerAtlasOrSinglePictureSubViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, stickerAtlas, "2")) {
          return;
       }
       int i = 0;
       if (obj1 == null) {
          Object[] objArray = new Object[i];
          a.D().t(this.I(), "onAddSticker: stickerDetailInfo is null", objArray);
          return;
       }else {
          int i1 = this.F().q0();
          String str = CollectionsKt___CollectionsKt.F2(this.H(), i1);
          if (str != null && i1 >= 0) {
             obj.f.R();
             int i2 = 1;
             String[] stringArray = new String[i2];
             stringArray[i] = str;
             List list = CollectionsKt__CollectionsKt.P(stringArray);
             str = obj.d.o0().d().get(str);
             if (str != null) {
                if (str.length() <= 0) {
                   i2 = 0;
                }
                if (i2) {
                   list.add(i, str);
                }
             }
             Object[] objArray1 = new Object[i];
             a.D().w(this.I(), "onAddSticker: stickerDetailInfo = "+obj1, objArray1);
             if (obj.d.o0().A() == null) {
                Object[] objArray2 = new Object[i];
                a.D().w(this.I(), "onAddSticker: stickerAttachInfo is null", objArray2);
                StickerAtlasOrSinglePictureSubViewBinder d = obj.d;
                a uoa = PatchProxy.apply(null, obj, stickerAtlas, "18");
                if (uoa != patchProxyRe) {
                }else {
                   HashMap hashMap = new HashMap();
                   HashMap hashMap1 = new HashMap();
                   Iterator iterator = this.F().H0().iterator();
                   while (iterator.hasNext()) {
                      obj3 = iterator.next();
                      int i3 = i + 1;
                      if (i < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      if (i >= 0 && i < obj.o.w0().size()) {
                         ArrayList uArrayList = new ArrayList();
                         Pair first = obj3.first;
                         if (first != null) {
                            a.o(first, "identifierList.first");
                            uArrayList.add(first);
                         }
                         obj1 = obj3.second;
                         if (obj1 != null) {
                            a.o(obj1, "identifierList.second");
                            uArrayList.add(obj1);
                         }
                         hashMap.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList, "", null, null, 0, null, null, 62, null)).hashCode()), obj.o.w0().get(i));
                         hashMap1.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList, "", 0, null, 0, 0, 0, 62, 0)).hashCode()), Float.valueOf(obj.f(uArrayList)));
                      }
                      i = i3;
                   }
                   obj3 = new a(true, obj.f.getEditorRect().width(), hashMap, hashMap1, null, 16, null);
                }
                d.t0(new StickerInitAction(uoa));
             }
             StickerAtlasOrSinglePictureSubViewBinder d1 = obj.d;
             if (PatchProxy.isSupport(stickerAtlas)) {
                Object obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i1), list, obj, stickerAtlas, "17");
                if (obj2 != patchProxyRe) {
                   uob = obj2;
                label_01db :
                   AddStickerAction uAddStickerA = new AddStickerAction(0, 0x3ff0000000000000, p0, uob, obj.d.o0().w());
                   d1.t0(v7);
                }
             }
             b uob1 = new b(true, false, obj.o.w0().get(i1), (float)obj.f.getEditorRect().width(), 0x3f800000, obj.o.p0(i1), list, 0, 0, 0, 898, null);
             uob = patchProxyRe;
             goto label_01db ;
          }
          return;
       }
    }
    public float f(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       int i = this.m(p0);
       if (i < 0) {
          return 0x3f800000;
       }
       return (this.o.q0(i) / this.o.r0(i));
    }
    public void h(boolean p0){
       StickerAtlasOrSinglePictureSubViewBinder stickerAtlas = StickerAtlasOrSinglePictureSubViewBinder.class;
       if (PatchProxy.isSupport(stickerAtlas) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stickerAtlas, "19")) {
          return;
       }
       stickerAtlas = this.h;
       a.o(stickerAtlas, "pictureIndicator");
       float f = 0x3f800000;
       float f1 = (p0)? 0x3f800000: 0;
       stickerAtlas.setAlpha(f1);
       stickerAtlas = this.i;
       a.o(stickerAtlas, "pictureTextHint");
       if (!p0) {
          f = 0;
       }
       stickerAtlas.setAlpha(f);
       return;
    }
    public EditDecorationContainerView$b j(){
       return this.k;
    }
    public int m(List p0){
       Object[] objArray;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (q.f(p0)) {
          objArray = new Object[i];
          a.D().w(this.I(), "getCurrentPictureIndex: attachIdentifierList = "+p0, objArray);
          return this.F().q0();
       }else {
          int i1 = -1;
          obj = this.F().H0().iterator();
          int i2 = 0;
          while (obj.hasNext()) {
             Object obj1 = obj.next();
             int i3 = i2 + 1;
             if (i2 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             int i4 = 1;
             if (p0 != null && (p0.size() == i4 && (a.g(obj1.first, p0.get(i)) || (p0 != null && (p0.size() == 2 && (a.g(obj1.first, p0.get(i)) && a.g(obj1.second, p0.get(i4)))))))) {
                i1 = i2;
             }
          label_00a6 :
             i2 = i3;
          }
          objArray = new Object[i];
          a.D().w(this.I(), "getCurrentPictureIndex: index = "+i1, objArray);
          return i1;
       }
    }
    public void x(a p0,a p1){
       StickerAtlasOrSinglePictureSubViewBinder th;
       float f;
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerAtlasOrSinglePictureSubViewBinder.class, "10")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          String str = "pictureTextHint";
          String str1 = "pictureIndicator";
          if (p0.y().f() && !p1.y().f()) {
             th = this.h;
             a.o(th, str1);
             f = 0;
             th.setAlpha(f);
             th = this.i;
             a.o(th, str);
             th.setAlpha(f);
             iterator = this.f.getDecorationDrawerList().iterator();
             while (iterator.hasNext()) {
                EditDecorationBaseDrawer uEditDecorat = iterator.next();
                if (uEditDecorat instanceof NewEditTextBaseElement || (uEditDecorat instanceof NewEditStickerBaseDrawer && this.D(uEditDecorat))) {
                   d.d(uEditDecorat, this.E(), this.K(), this.L());
                }
             }
          }else if(!p0.y().f() && p1.y().f()){
             th = this.h;
             a.o(th, str1);
             f = 0x3f800000;
             th.setAlpha(f);
             th = this.i;
             a.o(th, str);
             th.setAlpha(f);
             iterator = this.f.getDecorationDrawerList().iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (obj instanceof NewEditTextBaseElement || (obj instanceof NewEditStickerBaseDrawer && this.D(obj))) {
                   d.b(obj, this.E(), false, this.K(), this.L(), 4, null);
                }
             }
          }
       }
       return;
    }
}
