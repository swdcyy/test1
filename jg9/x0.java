package jg9.x0;
import android.view.View$OnClickListener;
import jg9.t0;
import jg9.t0$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Collection;
import java.lang.Integer;
import kotlin.Pair;
import qrd.r0;
import java.lang.Number;
import jg9.x0$a;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.Objects;
import j79.a$a;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import j8c.a;
import q87.c;
import w46.b;
import j79.a;
import j79.a$b;
import ga9.c;
import java.util.HashMap;
import nsd.u;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder;
import w69.i;
import w69.i$a;
import w69.i$b;
import w69.j;
import androidx.fragment.app.Fragment;
import g79.a;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import android.os.Bundle;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment$e;
import jg9.p;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$b;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper$showPreview$2;
import m79.g;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import r79.c;
import java.lang.Float;
import jg9.q;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import jg9.r;
import erd.g;
import crd.b;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import jg9.v;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.base.b;
import android.app.Activity;
import java.lang.IllegalArgumentException;

public final class x0 implements View$OnClickListener	// class@002abf
{
    public final t0 b;
    public final t0$b c;

    public void x0(t0 p0,t0$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       ArrayList obj1;
       int i2;
       QMedia qMedia;
       float f;
       ArrayList obj2;
       PatchProxyResult obj3;
       PatchProxyResult patchProxyRe;
       MultiPicturePreviewHelper multiPicture2;
       MultiPicturePreviewHelper multiPicture3;
       g og;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, x0.class, "1")) {
          return;
       }
       CopyOnWriteArrayList uCopyOnWrite = obj.b.K0();
       int i = 10;
       ArrayList uArrayList = new ArrayList(u.Y(uCopyOnWrite, i));
       Iterator iterator = uCopyOnWrite.iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          i2 = i1 + 1;
          if (i1 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          qMedia = new QMedia((long)i1, obj1.c(), 0, 0, 0);
          v6.mHeight = obj1.a();
          v6.mWidth = obj1.g();
          f = (float)obj1.g() / (float)obj1.a();
          v6.mRatio = f;
          uArrayList.add(v6);
          i1 = i2;
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = uArrayList.iterator();
       int i3 = 0;
       String str = -1;
       while (iterator1.hasNext()) {
          obj2 = iterator1.next();
          int i4 = i3 + 1;
          if (i3 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          qMedia = (obj.b.K0().size() > i3 && obj.b.K0().get(i3).b() > str)? 1: 0;
          if (qMedia) {
             uArrayList1.add(obj2);
          }
          i3 = i4;
       }
       CopyOnWriteArrayList uCopyOnWrite1 = obj.b.K0();
       obj1 = new ArrayList(u.Y(uCopyOnWrite1, i));
       iterator1 = uCopyOnWrite1.iterator();
       i2 = 0;
       while (iterator1.hasNext()) {
          obj3 = iterator1.next();
          int i5 = i2 + 1;
          if (i2 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj1.add(r0.a(Integer.valueOf(i2), Integer.valueOf(obj3.b())));
          i2 = i5;
       }
       ArrayList uArrayList2 = new ArrayList();
       Iterator iterator2 = obj1.iterator();
       while (iterator2.hasNext()) {
          obj2 = iterator2.next();
          obj3 = (obj2.getSecond().intValue() > str)? 1: null;
          if (obj3) {
             uArrayList2.add(obj2);
          }
       }
       List list = CollectionsKt___CollectionsKt.f5(uArrayList2, new x0$a());
       ArrayList uArrayList3 = new ArrayList(u.Y(list, i));
       Iterator iterator3 = list.iterator();
       while (iterator3.hasNext()) {
          uArrayList3.add(Integer.valueOf(iterator3.next().getFirst().intValue()));
       }
       MultiPicturePreviewHelper multiPicture = obj.b.L0();
       int adapterPosit = obj.c.getAdapterPosition();
       Objects.requireNonNull(multiPicture);
       a$a uoa = a$a.class;
       MultiPicturePreviewHelper multiPicture1 = MultiPicturePreviewHelper.class;
       obj3 = PatchProxyResult.class;
       if (PatchProxy.isSupport(multiPicture1)) {
          patchProxyRe = obj3;
          multiPicture2 = multiPicture1;
          if (!PatchProxy.applyVoidFourRefs(uArrayList, Integer.valueOf(adapterPosit), uArrayList1, uArrayList3, multiPicture, MultiPicturePreviewHelper.class, "2")) {
          label_0183 :
             a.p(uArrayList, "medias");
             a.p(uArrayList1, "selectedMedias");
             a.p(uArrayList3, "selectedIndexList");
             Object[] objArray = new Object[0];
             String str1 = "MultiPicturePreviewHelper";
             a.D().w(str1, "showPreview", objArray);
             View view = multiPicture.c();
             if (view != null) {
                view.setVisibility(0);
             }
             view = multiPicture.c();
             if (view != null) {
                view.bringToFront();
             }
             view = multiPicture.c();
             f = 0;
             if (view != null) {
                view.setAlpha(f);
             }
             view = multiPicture.c();
             if (view == null) {
                Object[] objArray1 = new Object[0];
                a.D().t(str1, "previewContainer is null", objArray1);
             }else {
                a$a uoa1 = a.p.a().c(new ArrayList(uArrayList));
                obj2 = new ArrayList(uArrayList1);
                Objects.requireNonNull(uoa1);
                i obj4 = PatchProxy.applyOneRefs(obj2, uoa1, uoa, "2");
                str = "_s";
                if (obj4 != patchProxyRe) {
                   uoa1 = obj4;
                }else {
                   a.q(obj2, str);
                   uoa1.c = obj2;
                }
                uArrayList1 = new ArrayList(uArrayList3);
                Objects.requireNonNull(uoa1);
                Float obj5 = PatchProxy.applyOneRefs(uArrayList1, uoa1, uoa, "3");
                if (obj5 != patchProxyRe) {
                   uoa1 = obj5;
                }else {
                   a.q(uArrayList1, str);
                   uoa1.d = uArrayList1;
                }
                uoa1.b(adapterPosit);
                uoa1.j = true;
                uoa1.e(true);
                uoa1.o = false;
                uoa1.m = 1;
                c uoc = new c(null, null, false, 7, null);
                uArrayList3.e(AbsPreviewFragmentViewBinder.class, MultiPicPreviewFragmentViewBinder.class);
                obj4 = i.h.a().g(uoa1.a()).n(uArrayList3).b();
                obj5 = null;
                str = "5";
                Bundle obj6 = PatchProxy.applyOneRefs(obj4, obj5, j.class, str);
                if (obj6 != patchProxyRe) {
                }else {
                   str1 = "options";
                   a.q(obj4, str1);
                   a c = a.c;
                   Objects.requireNonNull(c);
                   Object obj7 = PatchProxy.applyTwoRefs(obj4, obj5, c, a.class, "19");
                   if (obj7 != patchProxyRe) {
                      obj6 = obj7;
                   }else {
                      a.q(obj4, str1);
                      obj6 = new MediaPreviewFragment();
                      obj6.setArguments(obj4.d());
                   }
                }
                if (obj6 instanceof MediaPreviewFragment) {
                   d uod = obj6;
                   uod.ph(multiPicture);
                   uod.s = multiPicture;
                   uod.t = multiPicture;
                   uod.oh(new p(multiPicture), 0);
                   multiPicture.b = new MultiPicturePreviewHelper$showPreview$2(obj6);
                   obj6 = uod.getArguments();
                   if (obj6 != null) {
                      MultiPicturePreviewHelper e = multiPicture.e;
                      if (PatchProxy.isSupport(multiPicture2)) {
                         multiPicture3 = multiPicture2;
                         og = PatchProxy.applyTwoRefs(e, Integer.valueOf(adapterPosit), multiPicture, multiPicture3, str);
                         if (og != patchProxyRe) {
                         }else {
                         label_02b7 :
                            RecyclerView$LayoutManager layoutManage = e.getLayoutManager();
                            if (!layoutManage instanceof LinearLayoutManager) {
                               layoutManage = obj5;
                            }
                            if (layoutManage != null) {
                               og = multiPicture.d(layoutManage.findViewByPosition(adapterPosit), obj5);
                            }else {
                               g og1 = new g(0, 0, 0, 0, null, false, 63, null);
                            }
                         }
                      }else {
                         multiPicture3 = multiPicture2;
                         goto label_02b7 ;
                      }
                      a.o(obj6, "it");
                      if (!PatchProxy.applyVoidTwoRefs(og, obj6, multiPicture, multiPicture3, "7")) {
                         obj6.putInt("key_origin_x", og.d());
                         obj6.putInt("key_origin_y", og.e());
                         obj6.putInt("key_origin_width", og.b());
                         obj6.putInt("key_origin_height", og.a());
                         obj5 = og.c();
                         if (obj5 != null) {
                            f = obj5.floatValue();
                         }
                         obj6.putFloat("key_enter_ratio", f);
                      }
                      obj6.putInt("KEY_PREVIEW_TITLE_BAR_MARGIN_TOP", multiPicture.c);
                   }
                   multiPicture.d = new q(multiPicture);
                   uod.m().compose(uod.Ug(FragmentEvent.DESTROY)).subscribe(r.b);
                   e uoe = multiPicture.h.getChildFragmentManager().beginTransaction();
                   uoe.g(view.getId(), uod, "MultiPict_PREVIEW_FRAGMENT");
                   uoe.o();
                   MultiPicturePreviewHelper g = multiPicture.g;
                   if (g != null) {
                      g.W0(true);
                   }
                   GifshowActivity gifshowActiv = multiPicture.f.a();
                   if (gifshowActiv != null) {
                      View view1 = gifshowActiv.findViewById(R.id.camera_scroll_snapshot_tab_container);
                      if (view1 != null) {
                         view1.setVisibility(4);
                      }
                   }
                }else {
                   throw new IllegalArgumentException("previewFragment should be MediaPreviewFragment");
                }
             }
          }
       }else {
          patchProxyRe = obj3;
          multiPicture2 = multiPicture1;
          goto label_0183 ;
       }
       return;
    }
}
