package com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$Companion;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$c;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import q79.d;
import java.lang.Boolean;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$1;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$2;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$3;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import com.yxcorp.gifshow.models.QMedia;
import java.util.List;
import java.util.Iterator;
import r79.c;
import com.yxcorp.gifshow.models.EmptyQMedia;
import java.lang.Integer;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import r79.a;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import ha9.c;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import w69.k;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.IAlbumMainFragment$e;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import th0.e;
import android.view.animation.Interpolator;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$MultiScrollListener;
import msd.a;
import androidx.recyclerview.widget.RecyclerView$r;
import kotlin.TypeCastException;
import w69.d;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$Companion;
import o79.q;

public class MultiSelectAlbumAssetItemViewBinder extends AbsAlbumAssetItemViewBinder	// class@001af0
{
    public Integer j;
    public final long k;
    public View l;
    public final int[] m;
    public final int[] n;
    public int o;
    public final int p;
    public boolean q;
    public static boolean r;
    public static final MultiSelectAlbumAssetItemViewBinder$Companion s;

    static {
       MultiSelectAlbumAssetItemViewBinder.s = new MultiSelectAlbumAssetItemViewBinder$Companion(null);
    }
    public void MultiSelectAlbumAssetItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
       this.k = 300;
       int[] ointArray = new int[2];
       this.m = ointArray;
       int[] ointArray1 = new int[2];
       this.n = ointArray1;
       this.p = AlbumSelectedContainer.V0.a();
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectAlbumAssetItemViewBinder.class, "8")) {
          return;
       }
       a.q(p0, "rootView");
       this.u(p0.findViewById(R.id.media_preview));
       this.r(p0.findViewById(R.id.media_duration));
       this.m(p0.findViewById(R.id.unable_select_mask));
       this.l = p0.findViewById(0x7f0a2c58);
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MultiSelectAlbumAssetItemViewBinder.class, "9");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d0702, p1, false);
       a.h(view, "CommonUtil.inflate\(infla¡­tainer,\n      false\n    \)");
       return view;
    }
    public boolean g(d p0){
       CompatImageView obj = PatchProxy.applyOneRefs(p0, this, MultiSelectAlbumAssetItemViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p();
       if (obj != null) {
          obj.setOnClickListener(new MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$1(this, p0));
       }
       View view = this.k();
       if (view != null) {
          view.setOnClickListener(new MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$2(this, p0));
       }
       MultiSelectAlbumAssetItemViewBinder tl = this.l;
       if (tl != null) {
          tl.setOnClickListener(new MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$3(this, p0));
       }
       return true;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MultiSelectAlbumAssetItemViewBinder.class, "10")) {
          return;
       }
       this.m(null);
       this.u(null);
       this.r(null);
       this.s(null);
       this.v(null);
       this.s(null);
       return;
    }
    public final void w(boolean p0){
       this.q = p0;
    }
    public void x(d p0,View p1){
       int i;
       Fragment obj4;
       boolean b;
       IAlbumMainFragment$e uoe;
       int i1;
       String str2;
       int i5;
       Object obj = this;
       Object obj1 = p0;
       List obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, MultiSelectAlbumAssetItemViewBinder.class, "2")) {
          return;
       }
       a.q(obj1, "viewModel");
       if (!MultiSelectAlbumAssetItemViewBinder.r) {
          obj2 = (obj2 != null)? obj2.getTag(R.id.ksa_media_item): null;
          if (!obj2 instanceof QMedia) {
             obj2 = null;
          }
          Object obj3 = obj2;
          if (obj3 != null) {
             obj2 = p0.m();
             if (obj2 != null) {
                Iterator iterator = obj2.iterator();
                Integer integer = null;
                while (true) {
                   if (iterator.hasNext()) {
                      if (iterator.next() instanceof EmptyQMedia) {
                         i = integer;
                      label_0053 :
                         if (PatchProxy.isSupport(MultiSelectAlbumAssetItemViewBinder.class)) {
                            obj4 = PatchProxy.applyThreeRefs(p0, obj3, Integer.valueOf(i), this, MultiSelectAlbumAssetItemViewBinder.class, "3");
                            if (obj4 != PatchProxyResult.class) {
                               b = obj4.booleanValue();
                            }else {
                            label_0075 :
                               a.q(obj3, "item");
                               obj4 = this.j();
                               String str = "null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumAssetFragment";
                               if (obj4 != null) {
                                  int i3 = obj4.nh();
                                  RecyclerView$ViewHolder viewHolder1 = this.l();
                                  int i4 = (viewHolder1 != null)? viewHolder1.getAdapterPosition(): 0;
                                  obj4 = this.j();
                                  if (obj4 != null) {
                                     String str1 = obj4.mh();
                                     if (PatchProxy.isSupport(d.class)) {
                                        str2 = str1;
                                        i5 = i4;
                                        QMedia obj5 = PatchProxy.applyThreeRefs(Integer.valueOf(i3), Integer.valueOf(i4), str1, p0, d.class, "24");
                                        if (obj5 != PatchProxyResult.class) {
                                           b = obj5.booleanValue();
                                        }else {
                                        label_00cd :
                                           obj5 = obj1.G0(i3, i5, str2);
                                           if (obj5 != null) {
                                              MediaFilterList mediaFilterL = obj1.c.e().u();
                                              if (mediaFilterL.isSelectable(obj5, p0.B().t()) || mediaFilterL.isClickable(obj5)) {
                                                 String nonselectabl = mediaFilterL.getNonselectableAlert();
                                                 if (nonselectabl != null) {
                                                    s.h(nonselectabl);
                                                 }
                                                 b = false;
                                              }
                                           }
                                           b = true;
                                        }
                                     }else {
                                        str2 = str1;
                                        i5 = i4;
                                        goto label_00cd ;
                                     }
                                     if (!b || i < 0) {
                                        b = false;
                                     }else {
                                        b = obj.z(obj1, obj3, i);
                                     }
                                  }else {
                                     throw new TypeCastException(str);
                                  }
                               }else {
                                  throw new TypeCastException(str);
                               }
                            }
                         }else {
                            goto label_0075 ;
                         }
                         if (b) {
                            if (p0.s0().m().k() && obj.q == null) {
                               obj4 = this.j().getParentFragment();
                               obj4 = (obj4 != null)? obj4.getParentFragment(): null;
                               if (!obj4 instanceof AlbumFragment) {
                                  obj4 = null;
                               }
                               if (obj4 != null) {
                                  RecyclerView$ViewHolder viewHolder = this.l();
                                  if (viewHolder != null) {
                                     int adapterPosit = viewHolder.getAdapterPosition();
                                     uoe = obj4.xh();
                                     if (uoe != null) {
                                        uoe.a(adapterPosit, obj3, i, true);
                                        break ;
                                     }
                                  }
                               }
                            }
                         label_014c :
                            obj4 = this.j().getParentFragment();
                            obj4 = (obj4 != null)? obj4.getParentFragment(): 0;
                            if (!obj4 instanceof AlbumFragment) {
                               uoe = 0;
                            }
                            Fragment uFragment = uoe;
                            if (uFragment != null && i >= 0) {
                               MultiSelectAlbumAssetItemViewBinder.r = true;
                               MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1 oonItemSelec = new MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1(uFragment, i, obj3, this, p0);
                               if (!PatchProxy.isSupport(MultiSelectAlbumAssetItemViewBinder.class) || !PatchProxy.applyVoidThreeRefs(uFragment, Integer.valueOf(i), v12, this, MultiSelectAlbumAssetItemViewBinder.class, "5")) {
                                  AlbumSelectedContainer uAlbumSelect = uFragment.wh();
                                  if (uAlbumSelect != null) {
                                     AlbumSelectRecyclerView uAlbumSelect1 = PatchProxy.apply(null, uAlbumSelect, AlbumSelectedContainer.class, "78");
                                     if (uAlbumSelect1 != PatchProxyResult.class) {
                                     }else {
                                        uAlbumSelect1 = uAlbumSelect.D();
                                     }
                                     if (uAlbumSelect1 != null) {
                                        AlbumSelectedContainer$c v0 = AlbumSelectedContainer.V0;
                                        i1 = v0.b() + v0.c();
                                        i = ((((i + true) + true) * i1) + v0.a()) - v0.c();
                                        b = uAlbumSelect1.computeHorizontalScrollOffset();
                                        int i2 = b - i;
                                        b = b + uAlbumSelect1.computeHorizontalScrollExtent();
                                        i2 = (b > i)? i2 + (i1 * 2): ((- i2) - uAlbumSelect1.computeHorizontalScrollExtent()) + obj.p;
                                        if (i2 > 0) {
                                           if (b > i) {
                                              i2 = - i2;
                                           }
                                           uAlbumSelect1.smoothScrollBy(i2, 0, new e());
                                           uAlbumSelect1.addOnScrollListener(new MultiSelectAlbumAssetItemViewBinder$MultiScrollListener(v12));
                                           break ;
                                        }else {
                                           v12.invoke();
                                           break ;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }else {
                         i1 = integer + 1;
                      }
                   }
                }
             }
             i = -1;
             goto label_0053 ;
          }
       }
    label_0206 :
       return;
    }
    public final void y(AlbumFragment p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MultiSelectAlbumAssetItemViewBinder.class, "7")) {
          return;
       }
       p1.setX((float)this.n[0]);
       p1.setY((float)this.n[1]);
       View view = p0.getView();
       if (!view instanceof ViewGroup) {
          view = null;
       }
       if (view != null) {
          view.removeView(p1);
       }
       return;
    }
    public boolean z(d p0,QMedia p1,int p2){
       long l;
       if (PatchProxy.isSupport(MultiSelectAlbumAssetItemViewBinder.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, MultiSelectAlbumAssetItemViewBinder.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.q(p0, "viewModel");
       a.q(p1, "item");
       if (p1.isVideo()) {
          Bundle uBundle = p0.s0().c().b();
          if (uBundle != null) {
             long[] longArray = uBundle.getLongArray(MultiSelectSelectedItemViewBinder.l.a());
             if (longArray != null) {
                l = longArray[p2];
             label_0054 :
                if (p1.getDuration() - l < 0) {
                   s.h(i.q(R.string.arg_RES_7f1018d0, q.i(l)));
                   return false;
                }
             }
          }
          l = Long.MAX_VALUE;
          goto label_0054 ;
       }
       return true;
    }
}
