package com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$e;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import java.lang.Object;
import ha9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import ha9.a;
import j79.l;
import java.lang.Enum;
import r79.c;
import java.util.Objects;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.a;
import ec7.a;
import l79.m;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import p79.g;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import q79.d;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import nsd.s0;
import j79.l0;
import j79.m;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class MediaPreviewSelectViewStub$e implements Observer	// class@001a39
{
    public final MediaPreviewSelectViewStub b;

    public void MediaPreviewSelectViewStub$e(MediaPreviewSelectViewStub p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i4;
       int i5;
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewSelectViewStub$e.class, "1")) {
       }else {
          UpdateType updateType = p0.c();
          if (updateType != null) {
             int i = l.a[updateType.ordinal()];
             String str = "mSelectedAdapter";
             String str1 = "MediaPreviewSelectViewStub";
             int i1 = 1;
             if (i != i1) {
                if (i == 2 || i == 3) {
                   c uoc = p0.b();
                   if (uoc != null) {
                      MediaPreviewSelectViewStub$e tb = this.b;
                      Objects.requireNonNull(tb);
                      if (!PatchProxy.applyVoidOneRefs(uoc, tb, mediaPreview, "21")) {
                         Log.b(str1, "onSelectItemRemove: media="+uoc);
                         RecyclerView$LayoutManager layoutManage = tb.m().getLayoutManager();
                         if (!layoutManage instanceof LinearLayoutManager) {
                            layoutManage = null;
                         }
                         int i2 = -1;
                         int i3 = (layoutManage != null)? layoutManage.c(): -1;
                         i4 = (layoutManage != null)? layoutManage.i0(): -1;
                         MediaPreviewSelectViewStub f = tb.f;
                         if (f == null) {
                            a.S(str);
                         }
                         i = f.N0(uoc);
                         if (i >= 0) {
                            if (!i) {
                               i5 = 0;
                            }else {
                               f = tb.f;
                               if (f == null) {
                                  a.S(str);
                               }
                               if (i == (f.Z0() + i2)) {
                                  i5 = i - 1;
                               }else {
                                  i5 = -1;
                               }
                            }
                            RecyclerView$ViewHolder viewHolder = tb.m().findViewHolderForLayoutPosition(i3);
                            if (viewHolder != null) {
                               viewHolder = viewHolder.itemView;
                               a.h(viewHolder, "lastHolder.itemView");
                               float f1 = (float)(viewHolder.getHeight() >> i1);
                               float f2 = (float)(viewHolder.getWidth() >> 1);
                               i4 = i3 - i4;
                               MediaPreviewSelectViewStub f3 = tb.f;
                               if (f3 == null) {
                                  a.S(str);
                               }
                               if (i4 == (f3.Z0() + i2)) {
                                  if (i < i3) {
                                     mediaPreview = tb.m;
                                     if (mediaPreview != null) {
                                        mediaPreview.Z(0, f1);
                                     }
                                  }else {
                                     mediaPreview = tb.m;
                                     if (mediaPreview != null) {
                                        mediaPreview.Z(f2, f1);
                                     }
                                  }
                               }else {
                                  mediaPreview = tb.m;
                                  if (mediaPreview != null) {
                                     mediaPreview.Z((float)viewHolder.getWidth(), f1);
                                  }
                               }
                            }
                         label_00ed :
                            mediaPreview = tb.f;
                            if (mediaPreview == null) {
                               a.S(str);
                            }
                            mediaPreview.Q0(i);
                            if (i5 >= 0) {
                               mediaPreview = tb.f;
                               if (mediaPreview == null) {
                                  a.S(str);
                               }
                               mediaPreview.m0(i5, Boolean.FALSE);
                            }
                            mediaPreview = tb.q;
                            MediaPreviewSelectViewStub e = tb.e;
                            if (e == null) {
                               a.S("mViewModel");
                            }
                            if (mediaPreview != e.r()) {
                               mediaPreview = tb.e;
                               if (mediaPreview == null) {
                                  a.S("mViewModel");
                               }
                               tb.q = mediaPreview.r();
                            }
                         }
                      }
                   }
                }
             }else {
                MediaPreviewSelectViewStub$e tb1 = this.b;
                c uoc1 = p0.g().get(p0.a());
                Objects.requireNonNull(tb1);
                if (!PatchProxy.applyVoidOneRefs(uoc1, tb1, mediaPreview, "20")) {
                   a.q(uoc1, "media");
                   Log.g(str1, "onSelectItemAdd: "+uoc1.getPath());
                   mediaPreview = tb1.f;
                   if (mediaPreview == null) {
                      a.S(str);
                   }
                   i4 = mediaPreview.Z0() - i1;
                   if ((tb1.m().computeHorizontalScrollExtent() + tb1.m().computeHorizontalScrollOffset()) < (tb1.m().computeHorizontalScrollRange() - MediaPreviewSelectViewStub.E)) {
                      tb1.l = i1;
                      tb1.r.add(uoc1);
                   }
                   if (i4 >= 0) {
                      MediaPreviewSelectViewStub r = tb1.r;
                      MediaPreviewSelectViewStub f4 = tb1.f;
                      if (f4 == null) {
                         a.S(str);
                      }
                      Objects.requireNonNull(r, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                      s0.a(r).remove(f4.L0(i4));
                      r = tb1.f;
                      if (r == null) {
                         a.S(str);
                      }
                      r.m0(i4, Boolean.FALSE);
                   }
                   mediaPreview = tb1.f;
                   if (mediaPreview == null) {
                      a.S(str);
                   }
                   if (!mediaPreview.O0().contains(uoc1)) {
                      mediaPreview = tb1.f;
                      if (mediaPreview == null) {
                         a.S(str);
                      }
                      mediaPreview.J0(uoc1);
                   }
                   tb1.i(tb1.w.u0());
                   tb1.m().post(new m(tb1));
                }
             }
          }
       label_01e7 :
          if (p0.c() != UpdateType.CHANGE_ALL) {
             this.b.j(false);
          }
       }
       return;
    }
}
