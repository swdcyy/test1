package ond.d;
import mnd.a;
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
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import ond.d$a;
import ond.d$g;
import ond.d$f;
import ond.d$e;
import ond.d$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import ond.d$c;
import java.lang.Runnable;
import ekd.k1;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import java.util.Map;
import qsc.e;
import t36.f;
import ond.d$d;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Objects;
import qwc.i;
import qwc.i$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import kotlin.Pair;
import java.util.List;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.a;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;
import android.graphics.Rect;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import ond.d$h;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import kotlin.Triple;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.StringBuilder;
import java.lang.Float;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.CharSequence;
import xld.c;
import huc.t;
import com.yxcrop.gifshow.v3.editor.text_v2.action.pic.PicAddTextAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import xvc.b;

public final class d extends a implements a, m	// class@00202e
{
    public final l c;
    public final h d;
    public final EditDecorationContainerViewV2 e;
    public final ViewPagerRecyclerView f;
    public final View g;
    public float h;
    public final d$a i;
    public final d$g j;
    public final d$f k;
    public final d$e l;
    public final d$b m;
    public final Fragment n;
    public final EditorDelegate o;

    public void d(View p0,Fragment p1,EditorDelegate p2){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       super(p0);
       this.n = p1;
       this.o = p2;
       this.c = b.d(p1);
       this.d = f.l(p1);
       View view = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.e = view;
       this.f = p0.findViewById(0x7f0a3096);
       this.g = p0.findViewById(0x7f0a299f);
       this.i = new d$a(this);
       this.j = new d$g(this);
       this.k = new d$f(this);
       this.l = new d$e();
       this.m = new d$b(this);
    }
    public void B(){
       int i;
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Log.b("LongPictureSubViewBinder", "onAttach");
       k1.r(new d$c(this), 0);
       if (this.n.getActivity() != null) {
          FragmentActivity activity = this.n.getActivity();
          a.m(activity);
          i = n.j(activity);
       }else {
          i = a1.g();
       }
       this.h = (float)i / (float)a1.h();
       f.o0(this.m, this.o.u(), e.class);
       d tg = this.g;
       if (tg != null) {
          tg.setVisibility(0);
       }
       tg = this.g;
       if (tg != null) {
          tg.setOnTouchListener(new d$d(this));
       }
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       Log.b("LongPictureSubViewBinder", "onDetach");
       this.e.setDelegate(null);
       this.e.M(this.i);
       this.f.removeOnScrollListener(this.k);
       this.e.R();
       d tf = this.f;
       a.o(tf, "mPictureRV");
       RecyclerView$Adapter adapter = tf.getAdapter();
       Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.player.adapter.PicturesAdapter");
       adapter.Z0(null);
       f.t0(this.m, this.o.u(), e.class);
       this.g.setOnTouchListener(null);
       return;
    }
    public final int D(){
       d obj = PatchProxy.apply(null, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.f;
       a.o(obj, "mPictureRV");
       RecyclerView$LayoutManager layoutManage = obj.getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       int i = layoutManage.i0();
       View view = layoutManage.findViewByPosition(i);
       int i1 = 0;
       if (view == null) {
          return i1;
       }
       a.o(view, "layoutManager.findViewBy\x20\x02iblePosition\) ?: return 0\x00");
       float f = - view.getY();
       for (; i1 < i; i1 = i1 + 1) {
          f = f + (float)this.I(this.d.u0(i1)).c;
       }
       return (int)f;
    }
    public final Pair E(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List identifyList = p0.getIdentifyList();
       a.o(identifyList, "identifyList");
       return this.F(identifyList);
    }
    public final Pair F(List p0){
       int i;
       List obj = PatchProxy.applyOneRefs(p0, this, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.o0().j();
       Iterator iterator = p0.iterator();
       while (true) {
          Integer integer = -1;
          if (!iterator.hasNext()) {
             return new Pair(Integer.valueOf(integer), "");
          }
          i = obj.indexOf(iterator.next());
          if (i != integer) {
             break ;
          }
       }
       return new Pair(Integer.valueOf(i), obj.get(i));
    }
    public final String G(String p0,l p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.o0().d().get(p0);
       if (obj == null) {
          obj = p1.o0().e().get(p0);
       }
       return obj;
    }
    public final Rect H(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Size size = this.I(this.d.u0(p0));
       return new Rect(0, 0, size.b, size.c);
    }
    public final Size I(Size p0){
       Size obj = PatchProxy.applyOneRefs(p0, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.b;
       p0 = p0.c;
       float f = (float)p0 / (float)obj;
       if (this.h - f < 0 && obj < a1.h()) {
          return new Size(a1.h(), (int)((float)a1.h() * f));
       }
       return new Size(obj, p0);
    }
    public final boolean J(){
       Object obj = PatchProxy.apply(null, this, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.g(this.e.getShowingDelegate(), this.j) ^ 0x01);
    }
    public final void K(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d tf = this.f;
       a.o(tf, "mPictureRV");
       tf.getViewTreeObserver().addOnGlobalLayoutListener(new d$h(this));
       return;
    }
    public final void L(EditDecorationBaseDrawer p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "13")) {
          return;
       }
       int i1 = 0;
       for (int i = 0; i < p1; i = i + 1) {
          i1 = i1 + this.I(this.d.u0(i)).c;
       }
       p0.setAdditionOffsetY((i1 - this.D()));
       p0.mEditRect = this.H(p1);
       return;
    }
    public void c(){
       int i;
       float f;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       Triple triple = PatchProxy.apply(objArray, this, uod, "14");
       if (triple != PatchProxyResult.class) {
       }else {
          uod = this.f;
          a.o(uod, "mPictureRV");
          f = 0x3f000000;
          int i2 = (int)((float)uod.getHeight() * f);
          d tf = this.f;
          a.o(tf, "mPictureRV");
          RecyclerView$LayoutManager layoutManage = tf.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
          int i3 = layoutManage.i0();
          i = layoutManage.c();
          if (i3 <= i) {
             while (true) {
                RecyclerView$ViewHolder viewHolder = this.f.findViewHolderForAdapterPosition(i3);
                if (viewHolder != null) {
                   viewHolder = viewHolder.itemView;
                   a.o(viewHolder, "it.itemView");
                   Log.b("LongPictureSubViewBinder", i2+" in "+viewHolder.getTop()+".."+viewHolder.getBottom());
                   int bottom = viewHolder.getBottom();
                   if (viewHolder.getTop() <= i2 && bottom >= i2) {
                      triple = new Triple(Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(((float)(i2 - viewHolder.getTop()) / (float)viewHolder.getHeight())));
                      break ;
                   }else if(i3 != i){
                      i3 = i3 + 1;
                   }
                }else {
                   goto label_00a9 ;
                }
             }
          }
          triple = new Triple(Integer.valueOf(-1), Float.valueOf(f), Float.valueOf(f));
       }
       i = triple.component1().intValue();
       f = triple.component2().floatValue();
       float f1 = triple.component3().floatValue();
       if (i < 0) {
          a.f.a().c(PostCommonBiz.EDIT, "LongPictureSubViewBinder", "error Index");
          Log.d("LongPictureSubViewBinder", "error Index");
          return;
       }else {
          this.e.R();
          a uoa = this.c.o0();
          String str = CollectionsKt___CollectionsKt.F2(uoa.j(), i);
          if (str != null) {
             int i1 = 1;
             String[] stringArray = new String[i1];
             stringArray[0] = str;
             List list = CollectionsKt__CollectionsKt.P(stringArray);
             str = this.G(str, this.c);
             if (str != null) {
                if (str.length() <= 0) {
                   i1 = 0;
                }
                if (i1) {
                   list.add(str);
                }
             }
             str = (uoa.F())? t.b(): "";
             String str1 = str;
             a.o(str1, "defaultText");
             PicAddTextAction picAddTextAc = new PicAddTextAction(list, uoa.A(), f, f1, this.c.o0().w(), str1);
             this.c.t0(v12);
             Log.b("LongPictureSubViewBinder", "addText: "+f+", "+f1+", "+list);
          }
          return;
       }
    }
    public EditDecorationContainerView$b j(){
       return this.j;
    }
}
