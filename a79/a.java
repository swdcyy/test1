package a79.a;
import ia9.c;
import androidx.fragment.app.Fragment;
import q79.d;
import z69.y;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import o79.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ec7.a;
import java.util.List;
import r79.a;
import java.lang.Math;
import b79.l;
import ga9.b;
import java.lang.Integer;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import ga9.c;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumDividerItemViewBinder;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHeaderItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFooterItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumTakePhotoItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import ia9.d;
import b79.i;
import b79.c;
import com.yxcorp.gifshow.models.QMedia;
import androidx.lifecycle.ViewModel;
import java.util.Objects;
import com.yxcorp.gifshow.models.EmptyQMedia;
import com.yxcorp.gifshow.album.viewbinder.TestAlbumAssetItemViewBinder;
import o79.q;
import java.lang.CharSequence;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import kotlin.TypeCastException;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.Long;
import ic7.a;
import b79.a;
import c79.e;
import c79.c;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import java.io.File;
import o79.o;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import r79.c;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import p79.c;
import android.animation.AnimatorSet;
import p79.f;
import b79.b;
import android.widget.ImageView;
import w69.k;
import b79.m;
import b79.e;
import b79.h;
import b79.k;
import w69.u0;
import java.lang.System;
import o79.d;
import g79.a;
import w69.x;
import w69.f;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.Pair;
import b79.j;
import kotlin.collections.CollectionsKt__CollectionsKt;
import b79.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import b79.f;
import w69.d;
import w69.d0;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Date;
import java.util.Collection;
import java.util.Map;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Number;
import android.view.ViewGroup;
import jlb.a;
import java.util.Set;
import java.util.Map$Entry;
import crd.b;
import nsd.u;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import trd.u;
import w69.i0;
import java.util.ListIterator;
import brd.t;
import t45.d;
import brd.z;
import a79.a$a;
import a79.a$b;
import erd.g;

public final class a extends c	// class@000052
{
    public y A;
    public boolean B;
    public final int C;
    public int D;
    public final ArrayList j;
    public final ArrayList k;
    public final HashMap l;
    public final HashMap m;
    public final ArrayList n;
    public final f o;
    public boolean p;
    public HashMap q;
    public Pair r;
    public boolean s;
    public int t;
    public final Fragment u;
    public final d v;
    public boolean w;
    public final int x;
    public final int y;
    public final int z;

    public void a(Fragment p0,d p1,boolean p2,int p3,int p4,int p5,y p6,boolean p7,int p8,int p9){
       a.q(p0, "fragment");
       a.q(p1, "mViewModel");
       super();
       this.u = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
       this.y = p4;
       this.z = p5;
       this.A = p6;
       this.B = p7;
       this.C = p8;
       this.D = p9;
       this.j = new ArrayList();
       this.k = new ArrayList();
       this.l = new HashMap();
       this.m = new HashMap();
       this.n = new ArrayList();
       this.o = new f();
       this.p = true;
       this.q = new HashMap();
    }
    public boolean P0(){
       a obj = PatchProxy.apply(null, this, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.j.size() == this.e.size()) {
          return this.e.isEmpty();
       }
       if (this.v.s0().a()) {
          int i = Math.min(this.e.size(), 4);
          if (i >= 0) {
             int i1 = 0;
             while (true) {
                if (this.e.get(i1) instanceof l) {
                   obj = 1;
                   break ;
                }else if(i1 != i){
                   i1 = i1 + 1;
                }
             }
             if (obj && this.j.isEmpty()) {
                return false;
             }
          }
          obj = null;
          goto label_0056 ;
       }
    label_0061 :
       return this.j.isEmpty();
    }
    public b T0(int p0){
       AbsAlbumItemViewBinder uAbsAlbumIte;
       AbsAlbumItemViewBinder uAbsAlbumIte1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uAbsAlbumIte = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "30");
          if (uAbsAlbumIte != PatchProxyResult.class) {
          label_00a9 :
             return uAbsAlbumIte;
          }
       }
       if (p0 != 1) {
          if (p0 != 3) {
             if (p0 != 4) {
                if (p0 != 5) {
                   if (p0 == 6) {
                      uAbsAlbumIte1 = this.v.s0().n().a(AbsAlbumDividerItemViewBinder.class, this.u, p0);
                   }else {
                      throw new UnsupportedOperationException("unsupported viewType="+p0);
                   }
                }else {
                   uAbsAlbumIte1 = this.v.s0().n().a(AbsAlbumHeaderItemViewBinder.class, this.u, p0);
                }
             }else {
                uAbsAlbumIte1 = this.v.s0().n().a(AbsAlbumFooterItemViewBinder.class, this.u, p0);
             }
          }else {
             uAbsAlbumIte1 = this.v.s0().n().a(AbsAlbumTakePhotoItemViewBinder.class, this.u, p0);
          }
       }else {
          uAbsAlbumIte1 = this.v.s0().n().a(AbsAlbumAssetItemViewBinder.class, this.u, p0);
       }
       uAbsAlbumIte = uAbsAlbumIte1;
       goto label_00a9 ;
    }
    public void U0(d p0,int p1,List p2){
       int i1;
       a uoa1;
       View obj1;
       int b1;
       QMedia type;
       AbsAlbumAssetItemViewBinder uAbsAlbumAss2;
       ViewModel viewModel1;
       a uoa2;
       AbsAlbumAssetItemViewBinder uAbsAlbumAss3;
       SizeAdjustableTextView sizeAdjustab;
       CompatImageView uCompatImage;
       AbsAlbumAssetItemViewBinder uAbsAlbumAss4;
       QMedia duration;
       ViewModel viewModel2;
       QMedia path;
       a uoa = this;
       int i = p1;
       u0 obj = p2;
       boolean b = p0;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(b, Integer.valueOf(p1), p2, this, a.class, "31")) {
          i1 = uoa;
       }else {
          a.q(b, "holder");
          String str = "payloads";
          a.q(obj, str);
          String str1 = "2";
          if (b instanceof c) {
             int i2 = uoa.L0(i);
             if (i2 != null) {
                ViewModel viewModel = this.X0();
                a p = uoa.p;
                a w = uoa.w;
                Objects.requireNonNull(b);
                AbsAlbumAssetItemViewBinder uAbsAlbumAss = AbsAlbumAssetItemViewBinder.class;
                boolean i3 = 1;
                int i4 = 0;
                if (PatchProxy.isSupport(c.class)) {
                   Object[] objArray = new Object[]{i2,obj,viewModel,Boolean.valueOf(p),Boolean.valueOf(w)};
                   if (!PatchProxy.applyVoid(objArray, b, c.class, "4")) {
                   label_0080 :
                      a.q(obj, str);
                      a.q(viewModel, "vm");
                      if (!i2 instanceof EmptyQMedia) {
                         AbsAlbumAssetItemViewBinder uAbsAlbumAss1 = b.e();
                         if (!uAbsAlbumAss1 instanceof TestAlbumAssetItemViewBinder) {
                            uAbsAlbumAss1 = null;
                         }
                         if (uAbsAlbumAss1 != null) {
                            TestAlbumAssetItemViewBinder j = uAbsAlbumAss1.j;
                            if (j != null) {
                               uoa1 = p;
                               j.setText(q.a.g(i2.mModified));
                            label_00ab :
                               i2.position = b.getAdapterPosition();
                               if (viewModel instanceof d) {
                                  if (!p2.isEmpty()) {
                                     obj1 = obj.get(i4);
                                     if (obj1 != null) {
                                        b1 = obj1.booleanValue();
                                     }else {
                                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                                     }
                                  }else {
                                     uAbsAlbumAss4 = 1;
                                  }
                                  b.d = uoa1;
                                  type = i2.type;
                                  String int str2 = "item.path";
                                  String str3 = "";
                                  if (type != null) {
                                     if (type != true) {
                                        uAbsAlbumAss2 = uAbsAlbumAss;
                                        viewModel1 = viewModel;
                                        uoa2 = w;
                                     label_00eb :
                                        i1 = 1;
                                     }else {
                                        uAbsAlbumAss1 = b.e();
                                        duration = i2.duration;
                                        Objects.requireNonNull(uAbsAlbumAss1);
                                        if (PatchProxy.isSupport(uAbsAlbumAss)) {
                                           viewModel2 = viewModel;
                                           if (!PatchProxy.applyVoidOneRefs(Long.valueOf(duration), uAbsAlbumAss1, uAbsAlbumAss, "1")) {
                                           label_010e :
                                              uAbsAlbumAss1 = uAbsAlbumAss1.f;
                                              if (uAbsAlbumAss1 != null) {
                                                 if (duration >= 0) {
                                                    str3 = a.b(duration);
                                                 }
                                                 uAbsAlbumAss1.setText(str3);
                                              }
                                           }
                                        }else {
                                           viewModel2 = viewModel;
                                           goto label_010e ;
                                        }
                                        Objects.requireNonNull(b.e());
                                        if (uoa1 == null) {
                                           if (b1 != null) {
                                              c g = b.g;
                                              if (g == null) {
                                                 i1 = 1;
                                                 uAbsAlbumAss2 = uAbsAlbumAss;
                                                 uoa2 = w;
                                                 viewModel1 = viewModel2;
                                                 a uoa3 = new a(b, uoa1, i2, i2.id, i2.mModified);
                                                 b.g = g;
                                              }else {
                                                 uAbsAlbumAss2 = uAbsAlbumAss;
                                                 uoa2 = w;
                                                 viewModel1 = viewModel2;
                                                 i1 = 1;
                                                 g.a = i2.id;
                                                 g.b = i2.mModified;
                                              }
                                              b.h.p();
                                              b.h.s(i2.id);
                                              CompatImageView uCompatImage1 = b.e().p();
                                              if (uCompatImage1 == null) {
                                                 a.L();
                                              }
                                              path = i2.path;
                                              a.h(path, str2);
                                              c j1 = b.j;
                                              o.b(uCompatImage1, path, b.i, j1, j1, i2.mRatio, i2.mThumbnailFile, b.g, b.h);
                                           }else {
                                              uAbsAlbumAss2 = uAbsAlbumAss;
                                              uoa2 = w;
                                              viewModel1 = viewModel2;
                                              goto label_00eb ;
                                           }
                                        }else {
                                           uAbsAlbumAss2 = uAbsAlbumAss;
                                           uoa2 = w;
                                           viewModel1 = viewModel2;
                                           i1 = 1;
                                           uCompatImage = b.e().p();
                                           if (uCompatImage != null) {
                                              uCompatImage.i0();
                                           }
                                        }
                                     }
                                     uAbsAlbumAss3 = uAbsAlbumAss2;
                                  }else {
                                     uAbsAlbumAss3 = uAbsAlbumAss;
                                     viewModel1 = viewModel;
                                     uoa2 = w;
                                     i1 = 1;
                                     AbsAlbumAssetItemViewBinder f = b.e().f;
                                     if (f != null) {
                                        f.setText(str3);
                                     }
                                     if (uoa1 == null) {
                                        if (b1 != null) {
                                           b.h.p();
                                           b.h.t(i2.mWidth);
                                           b.h.r(i2.mHeight);
                                           b.h.s(i2.id);
                                           CompatImageView uCompatImage2 = b.e().p();
                                           if (uCompatImage2 == null) {
                                              a.L();
                                           }
                                           duration = i2.path;
                                           a.h(duration, str2);
                                           c j2 = b.j;
                                           o.a(uCompatImage2, duration, b.i, j2, j2, i2.mRatio, i2.mThumbnailFile, b.h);
                                        }
                                     }else {
                                        uCompatImage = b.e().p();
                                        if (uCompatImage != null) {
                                           uCompatImage.i0();
                                        }
                                     }
                                  }
                                  obj1 = b.e().o();
                                  if (obj1 != null) {
                                     str2 = (uoa2 != null)? 8: 0;
                                     obj1.setVisibility(str2);
                                  }
                                  viewModel = viewModel1;
                                  b1 = viewModel.d0(i2) + i1;
                                  if (b1 > 0 || viewModel.r()) {
                                     SizeAdjustableTextView AnimatorSet str21 = PatchProxy.applyOneRefs(i2, viewModel, d.class, "43");
                                     if (str21 != PatchProxyResult.class) {
                                        i3 = str21.booleanValue();
                                     }else {
                                        a.q(i2, "media");
                                        if (viewModel.c.e().q != null) {
                                           if (!i2.isVideo()) {
                                              if (viewModel.c.e().u().isClickable(i2)) {
                                              }
                                           }else if(i2.duration - (long)viewModel.c.e().l() >= 0 && (i2.duration - viewModel.c.e().f() <= 0 && !viewModel.c.e().u().isClickable(i2))){
                                           }
                                        }
                                     label_02a4 :
                                        i3 = true;
                                     }
                                     if (i3) {
                                        i3 = true;
                                     label_02ac :
                                        str21 = b.e().n();
                                        if (!PatchProxy.applyVoidOneRefs(str21, null, c.class, "8") && str21 != null) {
                                           str21 = str21.getTag(R.id.ksa_item_select_count);
                                           if (str21 != null) {
                                              str21.cancel();
                                           }
                                        }
                                        if (b1 > 0) {
                                           str21 = b.e().n();
                                           if (str21 != null) {
                                              str21.setText(String.valueOf(b1));
                                           }
                                           sizeAdjustab = b.e().n();
                                           if (sizeAdjustab == null || sizeAdjustab.getVisibility()) {
                                              c.b(b.e().n(), i1, null);
                                           }
                                           obj1 = b.e().q();
                                           if (obj1 == null || obj1.getVisibility()) {
                                              c.e(b.e().q(), i1);
                                           }
                                        }else {
                                           obj1 = b.e().q();
                                           if (obj1 != null && !obj1.getVisibility()) {
                                              c.e(b.e().q(), false);
                                           }
                                           sizeAdjustab = b.e().n();
                                           if (sizeAdjustab != null && !sizeAdjustab.getVisibility()) {
                                              c.b(b.e().n(), false, new b(b));
                                           }
                                        }
                                     label_0359 :
                                        obj1 = b.e().o();
                                        i1 = 0x7f0a1622;
                                        if (obj1 != null) {
                                           obj1.setTag(i1, i2);
                                        }
                                        uCompatImage = b.e().p();
                                        if (uCompatImage != null) {
                                           uCompatImage.setTag(i1, i2);
                                        }
                                        uAbsAlbumAss4 = b.e();
                                        Objects.requireNonNull(uAbsAlbumAss4);
                                        if (!PatchProxy.applyVoidOneRefs(i2, uAbsAlbumAss4, uAbsAlbumAss3, str1)) {
                                           a.q(i2, "item");
                                        }
                                        b.d(i3);
                                        if (viewModel.s0().m().q() != -1) {
                                           sizeAdjustab = b.e().n();
                                           if (sizeAdjustab != null) {
                                              sizeAdjustab.setBackgroundResource(viewModel.s0().m().q());
                                           }
                                        }
                                     }
                                  }
                                  i3 = false;
                                  goto label_02ac ;
                               }
                            }
                         }
                         uoa1 = p;
                         goto label_00ab ;
                      }
                   }
                }else {
                   goto label_0080 ;
                }
                i1 = this;
             }else {
                throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.models.QMedia");
             }
          }else if(b instanceof m){
             b.a(this.L0(i), new ArrayList(), this.X0());
          }else {
             a uoa4 = this;
             if (b instanceof e) {
                b.a(uoa4.L0(i), new ArrayList(), this.X0());
             }else if(b instanceof h){
                b.a(uoa4.L0(i), new ArrayList(), this.X0());
             }else if(b instanceof k){
                b.a(uoa4.L0(i), new ArrayList(), this.X0());
             }
          }
          obj = u0.c;
          Objects.requireNonNull(obj);
          u0 ou0 = u0.class;
          if (PatchProxy.isSupport(ou0) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), obj, ou0, str1) && i == 36)) {
             long l = System.currentTimeMillis();
             u0.b = l;
             l = l - u0.a;
             d uod = d.class;
             if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), null, uod, "13")) {
                a.c.f().logCustomEvent("album_create_cost", "costTime = "+l);
             }
             u0.a = 0;
          }
       }
    label_0471 :
       return;
    }
    public d W0(View p0,int p1,b p2){
       k ok;
       k ok1;
       if (PatchProxy.isSupport(a.class)) {
          ok = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "29");
          if (ok != PatchProxyResult.class) {
          label_00c2 :
             return ok;
          }
       }
       a.q(p0, "itemRootView");
       a.q(p2, "viewBinder");
       if (p1 != 1) {
          if (p1 != 3) {
             if (p1 != 4) {
                if (p1 != 5) {
                   if (p1 == 6) {
                      ok1 = new k(p0, p2);
                   }else {
                      throw new UnsupportedOperationException("unsupported viewType="+p1);
                   }
                }else {
                   ok1 = new h(p0, p2);
                   ok1.f = this.v.s0().d().l();
                   a tu = this.u;
                   Integer integer = null;
                   if (!tu instanceof AlbumAssetFragment) {
                      tu = integer;
                   }
                   String str = (tu != null)? tu.mh(): integer;
                   ok1.g = str;
                   tu = this.u;
                   if (!tu instanceof AlbumAssetFragment) {
                      tu = integer;
                   }
                   if (tu != null) {
                      integer = Integer.valueOf(tu.nh());
                   }
                   ok1.h = integer;
                }
             }else {
                ok1 = new e(p0, p2);
             }
          }else {
             ok1 = new m(p0, this.y, this.A, p2);
          }
       }else {
          c uoc = new c(p0, this.x, this.y, this.A, this.o, p2);
       }
       ok = ok1;
       goto label_00c2 ;
    }
    public ViewModel X0(){
       return this.v;
    }
    public final void Y0(){
       if (PatchProxy.applyVoid(null, this, a.class, "20")) {
          return;
       }
       int b = true;
       this.s = b;
       Pair pair = CollectionsKt___CollectionsKt.e3(this.k);
       if (pair != null) {
          j second = pair.getSecond();
          if (second != null) {
             second.c(b);
          }
       }
       this.m1();
       a te = this.e;
       a.h(te, "mList");
       b = CollectionsKt__CollectionsKt.G(te);
       if (b == -1) {
          return;
       }else if(this.e.get(b) instanceof d){
          return;
       }else {
          k v = this.v.s0().m().V;
          if (v != null) {
             d uod = new d();
             if (!PatchProxy.applyVoidOneRefs(v, uod, d.class, "1")) {
                a.q(v, "<set-?>");
                uod.b = v;
             }
             this.e.add(uod);
             this.n0(this.getItemCount());
          }
          return;
       }
    }
    public final void Z0(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       if (this.v.s0().r() && this.e.isEmpty()) {
          f uof = new f();
          uof.d(this.j1());
          String str = this.v.s0().m().b();
          if (str == null) {
             str = "";
          }
          if (!PatchProxy.applyVoidOneRefs(str, uof, f.class, "1")) {
             a.q(str, "<set-?>");
             uof.b = str;
          }
          uof.c = this.v.s0().c().c();
          this.e.add(0, uof);
       }
       return;
    }
    public final void a1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       if (this.B != null) {
          Iterator iterator = p0.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             long l = obj.mModified * 1000;
             Date uDate = new Date(l);
             int i2 = uDate.getYear() + 1900;
             i = uDate.getMonth();
             Pair pair = CollectionsKt___CollectionsKt.e3(this.k);
             j second = (pair != null)? pair.getSecond(): null;
             if (second != null && (second.b() != i2 || second.a() != i)) {
                boolean b = true;
                if (second != null) {
                   second.c(b);
                }
                j oj = new j(i2, i);
                if (second == null && this.v.s0().a()) {
                   a te = this.e;
                   a.h(te, "mList");
                   Iterator iterator1 = te.iterator();
                   i2 = 0;
                   while (true) {
                      if (iterator1.hasNext()) {
                         if (iterator1.next() instanceof l) {
                         label_0097 :
                            if (i2 >= 0) {
                               this.e.add(i2, oj);
                            label_00b8 :
                               this.k.add(new Pair(Integer.valueOf(i2), oj));
                               second = oj;
                            }else {
                               this.e.add(oj);
                               i = this.e.size();
                            }
                         }else {
                            i2 = i2 + 1;
                         }
                      }else {
                         i2 = -1;
                         goto label_0097 ;
                      }
                   }
                }else {
                   this.e.add(oj);
                   i = this.e.size();
                }
                i2 = i - 1;
                goto label_00b8 ;
             }
             if (!PatchProxy.applyVoidOneRefs(obj, second, j.class, "2")) {
                a.q(obj, "item");
                second.b.add(obj);
             }
             this.e.add(obj);
             i = i1;
          }
       }else {
          this.e.addAll(p0);
       }
       return;
    }
    public final void b1(){
       if (PatchProxy.applyVoid(null, this, a.class, "19")) {
          return;
       }
       if (this.v.s0().a()) {
          if (this.e.isEmpty()) {
             this.e.add(0, new l());
             return;
          }else if(this.v.s0().r()){
             if (this.e.size() > 2 && this.e.get(1) instanceof l) {
                return;
             }else {
                this.e.add(1, new l());
             }
          }
       }
       return;
    }
    public final void d1(boolean p0,int p1){
       int i;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       if (p0) {
          this.l.clear();
          this.m.clear();
          i = 0;
       }else {
          i = this.l.size();
       }
       int i1 = this.e.size();
       while (p1 < i1) {
          if (this.e.get(p1) instanceof QMedia) {
             this.l.put(Integer.valueOf(p1), Integer.valueOf(i));
             this.m.put(Integer.valueOf(i), Integer.valueOf(p1));
             i++;
          }
          p1++;
       }
       return;
    }
    public final int e1(RecyclerView p0){
       Object obj1;
       View childAt;
       int childAdapter;
       int i2;
       int i3;
       int i6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "22");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       a.q(p0, "recyclerView");
       int i = -1;
       int i1 = 0;
       if (this.B != null) {
          obj1 = PatchProxy.applyOneRefs(p0, this, uoa, "23");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else if(!p0.getChildCount()){
             childAt = p0.getChildAt(i1);
             if (childAt != null) {
                childAdapter = p0.getChildAdapterPosition(childAt);
                if (childAdapter >= 0 && !this.n.isEmpty()) {
                   i2 = - (int)childAt.getY();
                   i3 = this.n.size();
                   int i4 = 0;
                   i = 0;
                   while (true) {
                      if (i4 < i3) {
                         Object obj2 = this.n.get(i4);
                         a.h(obj2, "mLineInfoList[i]");
                         if (obj2.b < childAdapter) {
                            int i5 = obj2.c();
                            if (i5 != 1 && i5 != 3) {
                               if (i5 != 5) {
                                  i6 = (i5 != 6)? 0: this.C;
                               }else {
                                  i6 = this.h1();
                               }
                            }else if(obj2.b()){
                               i6 = this.y + this.z;
                            }else {
                               i6 = this.y;
                            }
                            i = i + i6;
                            i4 = i4 + 1;
                         }else {
                         label_00a3 :
                            i = i + i2;
                            Log.g("AlbumAssetAdapter", "getScrollOffset, firstChildPos=="+childAdapter+", "+"firstChildScrollY="+i2+" verticalScrollY="+i);
                            break ;
                         }
                      }else {
                         goto label_00a3 ;
                      }
                   }
                }
             }
          }
       }else {
          obj1 = PatchProxy.applyOneRefs(p0, this, uoa, "24");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else if(!p0.getChildCount()){
             childAt = p0.getChildAt(i1);
             if (childAt != null) {
                childAdapter = p0.getChildAdapterPosition(childAt);
                if (childAdapter >= 0) {
                   i2 = - (int)childAt.getY();
                   String str = "mediaHeight=";
                   if (this.v.s0().r()) {
                      if (!childAdapter) {
                         Log.g("AlbumAssetAdapter", "getScrollOffset, firstChildPos==0, verticalScrollY="+i2);
                         i = i2;
                      }else {
                         i3 = this.h1();
                         i6 = ((childAdapter - 1) / this.D) * (this.y + this.z);
                         i1 = ((i3 + 0) + i6) + i2;
                         Log.g("AlbumAssetAdapter", "getScrollOffset, firstChildPos=="+childAdapter+", header="+i3+", "+str+i6+", firstChildScrollY="+i2+" verticalScrollY="+i1);
                      }
                   }else {
                      i3 = (childAdapter / this.D) * (this.y + this.z);
                      i1 = (i3 + 0) + i2;
                      Log.g("AlbumAssetAdapter", "getScrollOffset, firstChildPos=="+childAdapter+", "+str+i3+", firstChildScrollY="+i2+" verticalScrollY="+i1);
                   }
                   i = i1;
                }
             }
          }
       }
       return i;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "33");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       c uoc = this.L0(p0);
       if (uoc instanceof QMedia) {
          uoc = 1;
       }else if(uoc instanceof l){
          uoc = 3;
       }else if(uoc instanceof d){
          uoc = 4;
       }else if(uoc instanceof f){
          uoc = 5;
       }else if(uoc instanceof j){
          uoc = 6;
       }else {
          uoc = 0;
       }
       return uoc;
    }
    public final void f1(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       Iterator iterator = this.q.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().dispose();
       }
       this.q.clear();
       return;
    }
    public final void g1(boolean p0,int p1){
       a uoa1;
       String str;
       QMedia obj;
       QMedia mModified;
       int i7;
       a uoa3;
       int i = this;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), i, uoa, "4")) {
          return;
       }
       int i1 = 0;
       if (p0) {
          i.n.clear();
          i.t = i1;
       }
       int i2 = i.e.size();
       int i3 = p1;
       while (true) {
          if (i3 >= i2) {
             return;
          }
          int i4 = i.f0(i3);
          if (i4 != 5 && (i4 == 4 || i4 == 6)) {
             uoa1 = new a(i4, i3, 0, false, null, null, 48, null);
             i.n.add(v15);
             i.t = 0;
          }else {
             int b = 3;
             a uoa2 = 1;
             if (i4 == uoa2 || i4 == b) {
                int i5 = i.t % i.D;
                if (!i5) {
                   str = "null cannot be cast to non-null type com.yxcorp.gifshow.models.QMedia";
                   if (i4 == b) {
                      int i6 = i3 + 1;
                      if (i6 < i2 && i.f0(i6) == uoa2) {
                         obj = i.L0(i6);
                         if (obj != null) {
                            mModified = obj.mModified;
                         }else {
                            break ;
                         }
                      }else if(i4 == uoa2){
                         Object obj2 = i.L0(i3);
                         if (obj2 != null) {
                            mModified = obj2.mModified;
                         }else {
                            throw new TypeCastException(str);
                         }
                      }else {
                         mModified = false;
                      }
                   }else {
                      goto label_006a ;
                   }
                   obj = mModified;
                   if (PatchProxy.isSupport(uoa)) {
                      a obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i3), i, uoa, "14");
                      if (obj1 != PatchProxyResult.class) {
                         b = obj1.booleanValue();
                      }else {
                      label_009b :
                         i5 = i.f0(i3);
                         if (i5 == uoa2 || i5 == b) {
                            b = this.getItemCount();
                            obj1 = i.D;
                            if (uoa2 <= obj1) {
                               i7 = 1;
                               while (true) {
                                  int i8 = i3 + i7;
                                  int i9 = b - 1;
                                  if (i.L0(Math.min(i8, i9)) instanceof j) {
                                     b = 1;
                                     break ;
                                  }else if(i7 != obj1){
                                     i7 = i7 + 1;
                                  }
                               }
                            }
                         }
                         b = 0;
                      }
                   }else {
                      goto label_009b ;
                   }
                   i7 = b ^ 0x01;
                   uoa1 = v12;
                   uoa3 = v12;
                   uoa1 = new a(i4, i3, obj, i7, null, null, 48, 0);
                   i.n.add(uoa3);
                }
                i1 = i.t + 1;
                i.t = i1;
                uoa3 = null;
             }
          }
          i3 = i3 + 1;
       }
       throw new TypeCastException(str);
    }
    public final int h1(){
       d0 obj = PatchProxy.apply(null, this, a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.v.s0().r()) {
          if (this.j1()) {
             obj = this.v.s0().c().c();
             if (obj != null) {
                i = obj.h();
             }
             return i;
          }else {
             i = 1;
          }
       }
       return i;
    }
    public final boolean i1(){
       return this.s;
    }
    public final boolean j1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.v.s0().o();
       Boolean value = this.v.P0().getValue();
       if (value == null) {
          value = Boolean.FALSE;
       }
       a.h(value, "mViewModel.isHeaderListC\x20\x02tainerShow.value ?: false\x00");
       boolean b1 = value.booleanValue();
       a tu = this.u;
       if (!tu instanceof AlbumAssetFragment) {
          tu = objArray;
       }
       Integer integer = (tu != null)? Integer.valueOf(tu.nh()): objArray;
       a tu1 = this.u;
       if (!tu1 instanceof AlbumAssetFragment) {
          tu1 = objArray;
       }
       if (tu1 != null) {
          objArray = tu1.mh();
       }
       boolean b2 = q.a.m(integer, objArray);
       Log.g("AlbumAssetAdapter", "isHeaderListContainerShow, isClassifyEnable="+b+", bannerShow="+b1+", type="+integer+", sceneType="+objArray+", currentShow="+b2);
       b = (b && (b1 && b2))? true: false;
       return b;
    }
    public final void k1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       a tu = this.u;
       String str = null;
       if (!tu instanceof AlbumAssetFragment) {
          tu = str;
       }
       Integer integer = (tu != null)? Integer.valueOf(tu.nh()): str;
       a tu1 = this.u;
       if (!tu1 instanceof AlbumAssetFragment) {
          tu1 = str;
       }
       if (tu1 != null) {
          str = tu1.mh();
       }
       Log.g("AlbumAssetAdapter", p0+"..type="+integer+", mSceneType="+str);
       return;
    }
    public final void l1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.q(p0, "mediaList");
       boolean b = false;
       this.s = b;
       this.f1();
       this.e.clear();
       this.Z0();
       this.b1();
       this.j.clear();
       a tj = this.j;
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          QMedia qMedia = iterator.next();
          if (qMedia == null) {
             qMedia = new EmptyQMedia(0, 1, null);
          }
          uArrayList.add(qMedia);
       }
       tj.addAll(uArrayList);
       this.k.clear();
       this.a1(this.j);
       this.g1(1, b);
       this.d1(1, b);
       this.m1();
       this.k0();
       this.k1("refresh adapter size = "+this.e.size());
       return;
    }
    public final void m1(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "6")) {
          return;
       }
       a tk = this.k;
       d e = this.v.E;
       String str = "AlbumAssetAdapter";
       if (e == null) {
          Log.g(str, "requestLocationInfoIfNeed returned, extension == null");
          return;
       }else if(tk.isEmpty() ^ 0x01){
          int i = 0;
          Iterator iterator = tk.iterator();
          char c = '-';
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             String str1 = obj.getSecond().b()+c+obj.getSecond().a();
             if (!this.q.containsKey(str1)) {
                Log.g(str, "requestLocationInfoIfNeed, "+obj.getSecond().b()+c+obj.getSecond().a()+" ready");
                this.q.put(str1, this.n1(e, obj.getFirst().intValue(), obj.getSecond()));
             }
             i = i1;
          }
          ListIterator listIterator = tk.listIterator(tk.size());
          while (true) {
             if (listIterator.hasPrevious()) {
                objArray1 = listIterator.previous();
                i = objArray1.getSecond().c ^ 0x01;
                if (!i) {
                   continue ;
                }
             }else {
                objArray1 = objArray;
             }
             tk = this.r;
             Object[] objArray2 = (objArray1 == null)? objArray: objArray1.getSecond().b()+c+objArray1.getSecond().a();
             if (tk != null) {
                objArray = tk.getSecond().b()+c+tk.getSecond().a();
             }
             if ((a.g(objArray2, objArray) ^ 0x01) && objArray != null) {
                b uob = this.q.get(objArray);
                if (uob != null) {
                   uob.dispose();
                }
                a tq = this.q;
                if (tk == null) {
                   a.L();
                }
                tq.put(objArray, this.n1(e, tk.getFirst().intValue(), tk.getSecond()));
             }
             this.r = objArray1;
             break ;
          }
       }
       return;
    }
    public final b n1(i0 p0,int p1,j p2){
       j obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p2.b;
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getPath());
       }
       b uob = p0.a(uArrayList).subscribeOn(d.c).observeOn(d.a).subscribe(new a$a(this, p2, p1), a$b.b);
       a.h(uob, "disposable");
       return uob;
    }
    public final void o1(){
       if (PatchProxy.applyVoid(null, this, a.class, "28")) {
          return;
       }
       if (this.p != null) {
          Log.b("AlbumAssetAdapter", "resumeLoadThumbnail");
       }
       this.p = false;
       return;
    }
    public final void p1(){
       if (PatchProxy.applyVoid(null, this, a.class, "27")) {
          return;
       }
       if (this.p == null) {
          Log.b("AlbumAssetAdapter", "suspendLoadThumbnail");
       }
       this.p = true;
       return;
    }
}
