package com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment$e;
import j79.d;
import j79.e;
import hka.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper$a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.camera.record.base.b;
import jg9.v;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import m79.g;
import msd.l;
import qrd.l1;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper$c;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import jg9.t0;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper$b;
import java.lang.Iterable;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import com.yxcorp.gifshow.models.QMedia;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import jg9.y0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import android.content.Context;
import ekd.p1;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper$previewContainer$2;
import java.lang.StringBuilder;
import w46.b;
import o79.i;
import o79.e;
import com.yxcorp.utility.n;
import java.lang.Float;
import java.lang.Boolean;

public final class MultiPicturePreviewHelper implements MediaPreviewFragment$e, d, e, a	// class@000ec8
{
    public l b;
    public int c;
    public a d;
    public final RecyclerView e;
    public final b f;
    public final v g;
    public final BaseFragment h;
    public static final MultiPicturePreviewHelper$a i;

    static {
       MultiPicturePreviewHelper.i = new MultiPicturePreviewHelper$a(null);
    }
    public void MultiPicturePreviewHelper(RecyclerView p0,b p1,v p2,BaseFragment p3){
       a.p(p0, "recyclerView");
       a.p(p1, "callerContext");
       a.p(p3, "host");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
    }
    public void Tb(int p0,c p1){
       MultiPicturePreviewHelper multiPicture = MultiPicturePreviewHelper.class;
       if (PatchProxy.isSupport(multiPicture) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, multiPicture, "4")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = this.e.getLayoutManager();
       if (!layoutManage instanceof LinearLayoutManager) {
          layoutManage = null;
       }
       if (layoutManage != null) {
          int i = layoutManage.E();
          if (p0 < layoutManage.h() || p0 > i) {
             layoutManage.scrollToPosition(p0);
             f.F(this.e, new MultiPicturePreviewHelper$c(layoutManage, this, p0, p1));
          }else {
             MultiPicturePreviewHelper tb = this.b;
             if (tb != null) {
                tb.invoke(this.d(layoutManage.findViewByPosition(p0), p1));
             }
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MultiPicturePreviewHelper.class, "3")) {
          return;
       }
       View view = this.c();
       if (view != null) {
          view.setVisibility(8);
       }
       GifshowActivity gifshowActiv = this.f.a();
       if (gifshowActiv != null) {
          view = gifshowActiv.findViewById(R.id.camera_scroll_snapshot_tab_container);
          if (view != null) {
             view.setVisibility(0);
          }
       }
       this.d = null;
       MultiPicturePreviewHelper tg = this.g;
       if (tg != null) {
          tg.W0(0);
       }
       return;
    }
    public void b(ArrayList p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiPicturePreviewHelper.class, "8")) {
          return;
       }
       RecyclerView$Adapter adapter = this.e.getAdapter();
       Object[] objArray = null;
       if (!adapter instanceof t0) {
          adapter = objArray;
       }
       if (p0 != null) {
          List list = CollectionsKt___CollectionsKt.f5(p0, new MultiPicturePreviewHelper$b());
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                MediaPreviewInfo mediaPreview = iterator.next();
                if (adapter != null) {
                   c media = mediaPreview.getMedia();
                   if (!media instanceof QMedia) {
                      media = objArray;
                   }
                   if (media != null && (long)adapter.K0().size() - media.id > 0) {
                      if (mediaPreview.isSelected()) {
                         adapter.J0((int)media.id, false);
                         adapter.K0().get((int)media.id).h(mediaPreview.getSelectIndex());
                      }else if(adapter.K0().get((int)media.id).f()){
                         adapter.J0((int)media.id, false);
                      }
                   }
                }
             }
          }
       }
       if (adapter != null && !PatchProxy.applyVoid(objArray, adapter, t0.class, "6")) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator1 = adapter.e.iterator();
          while (iterator1.hasNext()) {
             obj = iterator1.next();
             Object obj1 = (obj.b() > -1)? 1: null;
             if (obj1) {
                uArrayList.add(obj);
             }
          }
          iterator1 = CollectionsKt___CollectionsKt.f5(uArrayList, new y0()).iterator();
          int i = 0;
          while (iterator1.hasNext()) {
             obj = iterator1.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             obj.h(i);
             i = i1;
          }
       }
       if (p0 != null && ((p0.isEmpty() ^ 1) && adapter != null)) {
          adapter.p0(false, adapter.K0().size());
       }
    label_0102 :
       MultiPicturePreviewHelper tg = this.g;
       if (tg != null) {
          tg.G0();
       }
       return;
    }
    public final View c(){
       int i1;
       Object[] objArray = null;
       BaseFragment obj = PatchProxy.apply(objArray, this, MultiPicturePreviewHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.f();
       a.o(obj, "callerContext.fragment");
       if (obj.isAdded()) {
          View view = obj.getView();
          int i = 0;
          if (view != null) {
             if (this.c == null && view instanceof ViewGroup) {
                int[] ointArray = new int[2];
                view.getLocationOnScreen(ointArray);
                i1 = ointArray[1];
                if (!i1) {
                   i1 = i1 + p1.f(view.getContext());
                }
                this.c = i1;
             }
             i1 = 0x7f0a2c53;
             View view1 = view.findViewById(i1);
             if (view1 == null) {
                a.o(view, "root");
                view1 = new FrameLayout(view.getContext());
                view1.setId(i1);
                view1.setBackgroundColor(0xff000000);
                view1.setVisibility(8);
                if (view instanceof ViewGroup) {
                   view1.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
                   view.addView(view1, view1.getLayoutParams());
                   Object[] objArray1 = new Object[i];
                   a.D().w("MultiPicturePreviewHelper", "add multi_take_preview_container to root", objArray1);
                }
             }
             return view1;
          }else {
             MultiPicturePreviewHelper$previewContainer$2 opreviewCont = new MultiPicturePreviewHelper$previewContainer$2(obj);
             Object[] objArray2 = new Object[i];
             a.D().t("MultiPicturePreviewHelper", "fragment"+obj+" is not added", objArray2);
          }
       }
       return objArray;
    }
    public final g d(View p0,c p1){
       Object obj = this;
       View obj1 = p0;
       Float obj2 = p1;
       int[] obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, MultiPicturePreviewHelper.class, "6");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       if (obj1 != null) {
          obj1 = obj1.findViewById(R.id.picture_iv);
          if (obj1 != null) {
             obj3 = new int[2];
             obj1.getLocationOnScreen(obj3);
             int i = obj3[0] - i.f(obj1);
             int i1 = 1;
             int i2 = obj3[i1] - i.g(obj1);
             if (e.a() && !i.g(obj1)) {
                i2 = obj3[i1] - n.A(i.b());
             }
             if (obj2 != null) {
                float f = (p1.getHeight() && p1.getWidth())? (float)p1.getHeight() / (float)p1.getWidth(): 0x3f800000;
                obj2 = Float.valueOf(f);
             }else {
                g og1 = null;
             }
             g og = new g(i, (i2 + obj.c), obj1.getWidth(), obj1.getHeight(), obj2, false, 32, null);
          label_009f :
             return obj2;
          }
       }
       g og2 = new g(0, 0, 0, 0, null, false, 63, null);
       goto label_009f ;
    }
    public boolean onBackPressed(){
       MultiPicturePreviewHelper obj = PatchProxy.apply(null, this, MultiPicturePreviewHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj != null)? obj.onBackPressed(): false;
       return b;
    }
}
