package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$k;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import ha9.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import ha9.a;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import l79.a;
import java.lang.Enum;
import l79.m;
import ec7.a;
import q79.d;
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import r79.c;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Boolean;
import l79.l;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.models.EmptyQMedia;
import o79.d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import p79.g;
import java.util.Set;
import nsd.s0;
import l79.h;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class AlbumSelectedContainer$k implements Observer	// class@001aa2
{
    public final AlbumSelectedContainer b;

    public void AlbumSelectedContainer$k(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       AlbumSelectedContainer obj2;
       int i2;
       AlbumSelectedContainer$k b;
       int i3;
       AlbumSelectedContainer v;
       AlbumSelectedContainer l;
       AlbumSelectedContainer l1;
       int i4;
       AlbumSelectedContainer v1;
       Object obj = this;
       List obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, AlbumSelectedContainer$k.class, "1")) {
       }else {
          String str = "MediaSelectManager";
          Log.g(str, "select:"+obj1.f());
          UpdateType updateType = obj1.c();
          if (updateType != null) {
             int i = a.a[updateType.ordinal()];
             String str1 = "mViewModel";
             String str2 = "mSelectedAdapter";
             if (i != 1) {
                obj2 = null;
                int i1 = -1;
                if (i != 2 && i != 3) {
                   if (i != 4) {
                      if (i == 5) {
                         AlbumSelectedContainer.f(obj.b).K0();
                         obj1 = AlbumSelectedContainer.g(obj.b).m();
                         if (obj1 != null) {
                            m om = AlbumSelectedContainer.f(obj.b);
                            Objects.requireNonNull(om);
                            if (PatchProxy.applyOneRefs(obj1, om, a.class, "13") != patchProxyRe) {
                            }else if(om.e.size() > 0){
                               i2 = om.e.size() + i1;
                            }else {
                               i2 = 0;
                            }
                            om.e.addAll(obj1);
                            if (om.f != null && i2 >= 0) {
                               om.r0(i2, obj1.size());
                            }
                         }
                         AlbumSelectedContainer.f0(obj.b, 0, 1, obj2);
                      }
                   }else {
                      b = obj.b;
                      c uoc = obj1.g().get(obj1.a());
                      i3 = obj1.a();
                      Objects.requireNonNull(b);
                      if (!PatchProxy.isSupport(uAlbumSelect) || !PatchProxy.applyVoidTwoRefs(uoc, Integer.valueOf(i3), b, uAlbumSelect, "28")) {
                         Log.g(str, "onSelectItemChanged: "+uoc.getPath());
                         v = b.v;
                         if (v == null) {
                            a.S(str2);
                         }
                         v.R0(i3, uoc);
                         v = b.B;
                         AlbumSelectedContainer u = b.u;
                         if (u == null) {
                            a.S(str1);
                         }
                         if (v == u.r()) {
                            b.U.Sh(uoc);
                         }else {
                            v = b.u;
                            if (v == null) {
                               a.S(str1);
                            }
                            b.B = v.r();
                            b.U.Rh();
                         }
                         b.d0();
                         b.e0(uoc.getPosition());
                         if (PatchProxy.isSupport(uAlbumSelect)) {
                            Object obj3 = PatchProxy.applyOneRefs(Integer.valueOf(i3), b, uAlbumSelect, "79");
                            if (obj3 != patchProxyRe) {
                               i3 = obj3.booleanValue();
                            }else {
                            label_0147 :
                               l = b.v;
                               if (l == null) {
                                  a.S(str2);
                               }
                               if (l instanceof l && !i3) {
                                  l1 = b.v;
                                  if (l1 == null) {
                                     a.S(str2);
                                  }
                                  if (l1.Z0() == 1 && b.K.getBoolean("canShowKuaishanDragBubble", 1)) {
                                     i3 = true;
                                  }
                               }
                            label_016b :
                               i3 = false;
                            }
                         }else {
                            goto label_0147 ;
                         }
                         if (i3 && (!PatchProxy.applyVoid(obj2, b, uAlbumSelect, "81") && b.L != null)) {
                            RecyclerView$ViewHolder viewHolder = b.D().findViewHolderForAdapterPosition(0);
                            if (viewHolder != null) {
                               viewHolder = viewHolder.itemView;
                               if (viewHolder != null) {
                                  ImageView imageView = viewHolder.findViewById(R.id.media_preview);
                                  if (imageView != null) {
                                     int[] ointArray = a$c.f0(imageView, BubbleInterface$Position.TOP);
                                     l = b.L;
                                     if (l == null) {
                                        a.L();
                                     }
                                     l.n0(ointArray[0], ointArray[1]);
                                     l1 = b.L;
                                     if (l1 == null) {
                                        a.L();
                                     }
                                     p.n(l1);
                                     g.a(b.K.edit().putBoolean("canShowKuaishanDragBubble", 0));
                                  }
                               }
                            }
                         }
                         d.g(uoc.getTypeLoggerStr(), uoc.getPosition(), (uoc instanceof EmptyQMedia ^ 1));
                      }
                   }
                }else {
                   c uoc1 = obj1.b();
                   if (uoc1 != null) {
                      b = obj.b;
                      obj1 = obj1.g();
                      Objects.requireNonNull(b);
                      if (!PatchProxy.applyVoidTwoRefs(uoc1, obj1, b, uAlbumSelect, "30")) {
                         Log.b(str, "onSelectItemRemove: media="+uoc1);
                         RecyclerView$LayoutManager layoutManage = b.D().getLayoutManager();
                         if (!layoutManage instanceof LinearLayoutManager) {
                            layoutManage = obj2;
                         }
                         i4 = (layoutManage != null)? layoutManage.c(): -1;
                         int i5 = (layoutManage != null)? layoutManage.i0(): -1;
                         v1 = b.v;
                         if (v1 == null) {
                            a.S(str2);
                         }
                         int i6 = v1.N0(uoc1);
                         if (i6 >= 0) {
                            if (!i6) {
                               i1 = 0;
                            }else {
                               AlbumSelectedContainer v2 = b.v;
                               if (v2 == null) {
                                  a.S(str2);
                               }
                               if (i6 == (v2.Z0() - 1)) {
                                  i1 = i6 - 1;
                               }
                            }
                            RecyclerView$ViewHolder viewHolder1 = b.D().findViewHolderForLayoutPosition(i4);
                            if (viewHolder1 != null) {
                               viewHolder1 = viewHolder1.itemView;
                               a.h(viewHolder1, "lastHolder.itemView");
                               float f = (float)(viewHolder1.getHeight() >> 1);
                               float f1 = (float)(viewHolder1.getWidth() >> 1);
                               i5 = i4 - i5;
                               obj2 = b.v;
                               if (obj2 == null) {
                                  a.S(str2);
                               }
                               if (i5 == (obj2.Z0() - 1)) {
                                  if (i6 < i4) {
                                     uAlbumSelect = b.x;
                                     if (uAlbumSelect != null) {
                                        uAlbumSelect.Z(0, f);
                                     }
                                  }else {
                                     uAlbumSelect = b.x;
                                     if (uAlbumSelect != null) {
                                        uAlbumSelect.Z(f1, f);
                                     }
                                  }
                               }else {
                                  uAlbumSelect = b.x;
                                  if (uAlbumSelect != null) {
                                     uAlbumSelect.Z((float)viewHolder1.getWidth(), f);
                                  }
                               }
                            }
                         label_028d :
                            uAlbumSelect = b.v;
                            if (uAlbumSelect == null) {
                               a.S(str2);
                            }
                            uAlbumSelect.Q0(i6);
                            if (i1 >= 0) {
                               uAlbumSelect = b.v;
                               if (uAlbumSelect == null) {
                                  a.S(str2);
                               }
                               uAlbumSelect.m0(i1, Boolean.FALSE);
                            }
                            b.U.Sh(uoc1);
                            uAlbumSelect = b.B;
                            v = b.u;
                            if (v == null) {
                               a.S(str1);
                            }
                            if (uAlbumSelect != v.r()) {
                               uAlbumSelect = b.u;
                               if (uAlbumSelect == null) {
                                  a.S(str1);
                               }
                               b.B = uAlbumSelect.r();
                               b.U.Rh();
                            }else {
                               uAlbumSelect = b.v;
                               if (uAlbumSelect == null) {
                                  a.S(str2);
                               }
                               i5 = uAlbumSelect.O0().size();
                               for (i4 = i6; i4 < i5; i4 = i4 + 1) {
                                  AlbumSelectedContainer u1 = b.U;
                                  obj2 = b.v;
                                  if (obj2 == null) {
                                     a.S(str2);
                                  }
                                  u1.Sh(obj2.L0(i4));
                               }
                            }
                            AlbumSelectedContainer.f0(b, 0, 1, null);
                            d.g(uoc1.getTypeLoggerStr(), uoc1.getPosition(), 0);
                            if (b.H != null) {
                               d.l(b.R);
                            }
                            b.p(uoc1, obj1, i6, 0);
                         }
                      }
                   }
                }
             }else {
                AlbumSelectedContainer$k b1 = obj.b;
                List list = obj1.g();
                i3 = obj1.a();
                Objects.requireNonNull(b1);
                if (!PatchProxy.isSupport(uAlbumSelect) || !PatchProxy.applyVoidTwoRefs(list, Integer.valueOf(i3), b1, uAlbumSelect, "34")) {
                   a.q(list, "list");
                   c uoc2 = list.get(i3);
                   Log.g(str, "onSelectItemAdd: "+uoc2.getPath());
                   v = b1.v;
                   if (v == null) {
                      a.S(str2);
                   }
                   i4 = v.Z0() - 1;
                   if ((b1.D().computeHorizontalScrollExtent() + b1.D().computeHorizontalScrollOffset()) < (b1.D().computeHorizontalScrollRange() - AlbumSelectedContainer.U0)) {
                      b1.w = true;
                      b1.C.add(uoc2);
                   }
                   if (i4 >= 0) {
                      v1 = b1.C;
                      obj2 = b1.v;
                      if (obj2 == null) {
                         a.S(str2);
                      }
                      Objects.requireNonNull(v1, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                      s0.a(v1).remove(obj2.L0(i4));
                      v1 = b1.v;
                      if (v1 == null) {
                         a.S(str2);
                      }
                      v1.m0(i4, Boolean.FALSE);
                   }
                   v = b1.v;
                   if (v == null) {
                      a.S(str2);
                   }
                   v.J0(uoc2);
                   b1.D().post(new h(b1));
                   v = b1.B;
                   AlbumSelectedContainer u2 = b1.u;
                   if (u2 == null) {
                      a.S(str1);
                   }
                   if (v == u2.r()) {
                      b1.U.Sh(uoc2);
                   }else {
                      v = b1.u;
                      if (v == null) {
                         a.S(str1);
                      }
                      b1.B = v.r();
                      b1.U.Rh();
                   }
                   b1.e0(uoc2.getPosition());
                   d.g(uoc2.getTypeLoggerStr(), uoc2.getPosition(), 1);
                   b1.p(uoc2, list, i3, 1);
                }
             }
          }
       label_03fe :
          obj.b.d0();
       }
       return;
    }
}
