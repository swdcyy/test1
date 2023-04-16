package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import mnd.a;
import yld.l;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$a;
import yld.m;
import ei0.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import und.l;
import tnd.b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$mPictureViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$i;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$h;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$g;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$f;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$e;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$d;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import uwc.b;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.edit.draft.Workspace$Type;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import qwc.i;
import qwc.i$a;
import android.view.ViewGroup;
import android.view.View$OnTouchListener;
import java.util.Map;
import qsc.g;
import t36.f;
import qsc.e;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.AbsoluteLayout;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import java.lang.Integer;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$updateContainerView$1;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import ond.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import xvc.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.CharSequence;
import xld.c;
import huc.t;
import com.yxcrop.gifshow.v3.editor.text_v2.action.pic.PicAddTextAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import nsd.u;
import mod.a;

public class AtlasOrSinglePictureSubViewBinder extends a implements a, l, PicturePreviewViewBinder$a, m	// class@000b42
{
    public final String c;
    public boolean d;
    public final l e;
    public final p f;
    public final h g;
    public final EditDecorationContainerViewV2 h;
    public final EditDecorationContainerView i;
    public final ViewPagerRecyclerView j;
    public final View k;
    public final View l;
    public final AtlasOrSinglePictureSubViewBinder$i m;
    public final AtlasOrSinglePictureSubViewBinder$a n;
    public final AtlasOrSinglePictureSubViewBinder$h o;
    public final Observer p;
    public final AtlasOrSinglePictureSubViewBinder$f q;
    public final View$OnTouchListener r;
    public final AtlasOrSinglePictureSubViewBinder$e s;
    public final AtlasOrSinglePictureSubViewBinder$d t;
    public final AtlasOrSinglePictureSubViewBinder$c u;
    public final Fragment v;
    public final EditorDelegate w;

    public void AtlasOrSinglePictureSubViewBinder(View p0,Fragment p1,EditorDelegate p2){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       super(p0);
       this.v = p1;
       this.w = p2;
       this.c = "AtlasOrSinglePictureSubViewBinder";
       this.d = true;
       this.e = b.d(p1);
       this.f = s.c(new AtlasOrSinglePictureSubViewBinder$mPictureViewModel$2(this));
       this.g = f.l(p1);
       View view = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.h = view;
       view = p0.findViewById(R.id.decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.id.decoration_editor_view\)");
       this.i = view;
       this.j = p0.findViewById(0x7f0a3096);
       this.k = p0.findViewById(0x7f0a2f6d);
       this.l = p0.findViewById(0x7f0a2f6e);
       this.m = new AtlasOrSinglePictureSubViewBinder$i(this);
       this.n = new AtlasOrSinglePictureSubViewBinder$a(this);
       this.o = new AtlasOrSinglePictureSubViewBinder$h(this);
       this.p = new AtlasOrSinglePictureSubViewBinder$g(this);
       this.q = new AtlasOrSinglePictureSubViewBinder$f(this);
       this.r = new AtlasOrSinglePictureSubViewBinder$b(this);
       this.s = new AtlasOrSinglePictureSubViewBinder$e(this);
       this.t = new AtlasOrSinglePictureSubViewBinder$d(this);
       this.u = new AtlasOrSinglePictureSubViewBinder$c(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, AtlasOrSinglePictureSubViewBinder.class, "2")) {
          return;
       }
       Log.b(this.H(), "onAttach");
       boolean b = false;
       this.d = b;
       this.h.setDelegate(this.o);
       this.h.d(this.n);
       this.E().s0().observe(this.v, this.p);
       if (this.w.getType() == Workspace$Type.SINGLE_PICTURE) {
          this.i.d(this.m);
       }
       AtlasOrSinglePictureSubViewBinder tj = this.j;
       a.o(tj, "mPictureRV");
       RecyclerView$Adapter adapter = tj.getAdapter();
       Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.player.adapter.PicturesAdapter");
       adapter.Z0(this.q);
       ViewGroup viewGroup = this.D();
       if (viewGroup != null) {
          viewGroup.setVisibility(b);
          viewGroup.setOnTouchListener(this.r);
       }
       f.o0(this.s, this.w.u(), g.class);
       f.o0(this.t, this.w.u(), e.class);
       return;
    }
    public void C(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AtlasOrSinglePictureSubViewBinder.class, "3")) {
          return;
       }
       Log.b(this.H(), "onDetach");
       this.h.setDelegate(objArray);
       this.h.M(this.n);
       this.E().s0().removeObserver(this.p);
       this.h.R();
       if (this.w.getType() == Workspace$Type.SINGLE_PICTURE) {
          this.i.M(this.m);
       }
       AtlasOrSinglePictureSubViewBinder tj = this.j;
       a.o(tj, "mPictureRV");
       RecyclerView$Adapter adapter = tj.getAdapter();
       Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.player.adapter.PicturesAdapter");
       adapter.Z0(objArray);
       f.t0(this.s, this.w.u(), g.class);
       f.t0(this.t, this.w.u(), e.class);
       this.K();
       this.d = true;
       return;
    }
    public final ViewGroup D(){
       Object[] objArray = null;
       AtlasOrSinglePictureSubViewBinder obj = PatchProxy.apply(objArray, this, AtlasOrSinglePictureSubViewBinder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       a.o(obj, "mPictureRV");
       if (obj.getChildCount() > 0) {
          View childAt = this.j.getChildAt(0);
          Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
          objArray = childAt.findViewById(0x7f0a3e16);
       }
       return objArray;
    }
    public final b E(){
       Object obj = PatchProxy.apply(null, this, AtlasOrSinglePictureSubViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final l F(){
       return this.e;
    }
    public List G(){
       Object obj = PatchProxy.apply(null, this, AtlasOrSinglePictureSubViewBinder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.o0().c();
    }
    public String H(){
       return this.c;
    }
    public final boolean I(){
       Object obj = PatchProxy.apply(null, this, AtlasOrSinglePictureSubViewBinder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.w.getType() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
    public final boolean J(){
       EditorItemFunc obj = PatchProxy.apply(null, this, AtlasOrSinglePictureSubViewBinder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w.H();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(this.H(), "otherPanelShowed: current = "+obj+' ', objArray);
       if (obj != null && obj != EditorItemFunc.TEXT_V2) {
          i = true;
       }
       return i;
    }
    public final void K(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AtlasOrSinglePictureSubViewBinder.class, "4")) {
          return;
       }
       Object tag = this.h.getTag(R.id.new_container_view_pull_animator);
       if (tag instanceof AnimatorSet) {
          objArray = tag;
       }
       if (objArray != null) {
          objArray.removeListener(this.u);
       }
       return;
    }
    public final void L(boolean p0){
       AtlasOrSinglePictureSubViewBinder uAtlasOrSing = AtlasOrSinglePictureSubViewBinder.class;
       if (PatchProxy.isSupport(uAtlasOrSing) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAtlasOrSing, "15")) {
          return;
       }
       float f = (p0)? 0x3f800000: 0;
       uAtlasOrSing = this.k;
       a.o(uAtlasOrSing, "pictureIndicator");
       uAtlasOrSing.setAlpha(f);
       uAtlasOrSing = this.l;
       a.o(uAtlasOrSing, "pictureTextHint");
       uAtlasOrSing.setAlpha(f);
       return;
    }
    public final void M(){
       if (PatchProxy.applyVoid(null, this, AtlasOrSinglePictureSubViewBinder.class, "19")) {
          return;
       }
       if (this.w.getType() == Workspace$Type.SINGLE_PICTURE) {
          this.i.R();
       }
       return;
    }
    public final void N(int p0){
       AtlasOrSinglePictureSubViewBinder uAtlasOrSing = AtlasOrSinglePictureSubViewBinder.class;
       if (PatchProxy.isSupport(uAtlasOrSing) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAtlasOrSing, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.H(), "updateContainerView: ", objArray);
       AtlasOrSinglePictureSubViewBinder$updateContainerView$1 oupdateConta = new AtlasOrSinglePictureSubViewBinder$updateContainerView$1(this);
       if (!PatchProxy.isSupport(uAtlasOrSing) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), oupdateConta, this, uAtlasOrSing, "9") && p0 >= 0)) {
          Size b = this.g.u0(p0).b;
          Size c = this.g.u0(p0).c;
          if (b > null && c > null) {
             ViewGroup$LayoutParams layoutParams = this.h.getLayoutParams();
             if (layoutParams.height != c || layoutParams.width != b) {
                layoutParams.width = b;
                layoutParams.height = c;
                this.h.setLayoutParams(layoutParams);
             }
             Log.b(this.H(), "width: "+b+", height: "+c);
             this.h.getViewTreeObserver().addOnGlobalLayoutListener(new b(this, oupdateConta));
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, AtlasOrSinglePictureSubViewBinder.class, "5")) {
          return;
       }
       boolean b = false;
       this.e.t0(new EditDraftAction(b));
       int i = this.E().q0();
       String str = CollectionsKt___CollectionsKt.F2(this.G(), i);
       if (str != null && i >= 0) {
          this.h.R();
          a uoa = this.e.o0();
          String[] stringArray = new String[]{str};
          List list = CollectionsKt__CollectionsKt.P(stringArray);
          str = uoa.d().get(str);
          if (str != null) {
             if (str.length() > 0) {
                b = true;
             }
             if (b) {
                list.add(str);
             }
          }
          str = (uoa.F())? t.b(): "";
          String str1 = str;
          a.o(str1, "defaultText");
          PicAddTextAction picAddTextAc = new PicAddTextAction(list, uoa.A(), 0, 0, this.e.o0().w(), str1, 12, null);
          this.e.t0(b);
       }
       return;
    }
    public void d(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder.class, "17")) {
          return;
       }
       if (this.w.getType() == Workspace$Type.SINGLE_PICTURE) {
          this.i.R();
       }
       if (p0 == EditorItemFunc.COVER_PHOTO) {
          ViewGroup viewGroup = this.D();
          if (viewGroup != null) {
             viewGroup.setVisibility(4);
          }
       }
       this.L(false);
       return;
    }
    public EditDecorationContainerView$b j(){
       return this.o;
    }
    public void x(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AtlasOrSinglePictureSubViewBinder.class, "14")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          if (p0.y().f() && !p1.y().f()) {
             this.L(false);
          }else if(!p0.y().f() && p1.y().f()){
             this.L(true);
          }
       }
       return;
    }
    public void y(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder.class, "18")) {
          return;
       }
       if (this.w.getType() == Workspace$Type.SINGLE_PICTURE && p0 != EditorItemFunc.DECORATION) {
          this.i.R();
       }
       ViewGroup viewGroup = this.D();
       if (viewGroup != null && viewGroup.getVisibility() == 4) {
          viewGroup = this.D();
          if (viewGroup != null) {
             viewGroup.setVisibility(0);
          }
       }
       this.L(true);
       return;
    }
}
