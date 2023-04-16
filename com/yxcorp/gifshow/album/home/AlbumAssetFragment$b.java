package com.yxcorp.gifshow.album.home.AlbumAssetFragment$b;
import k79.f$a;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import a79.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import r79.c;
import com.yxcorp.gifshow.models.QMedia;
import q79.d;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import jlb.b;
import java.util.Collection;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.lang.Integer;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder;
import java.util.Objects;
import kotlin.TypeCastException;
import ec7.a;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.utility.Log;

public final class AlbumAssetFragment$b implements f$a	// class@0019d4
{
    public final AlbumAssetFragment a;

    public void AlbumAssetFragment$b(AlbumAssetFragment p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,List p1){
       a uoa;
       ArrayList uArrayList;
       Iterator iterator1;
       Object obj;
       Fragment obj1;
       ArrayList uArrayList1;
       AbsAlbumHomeFragmentViewBinder obj2;
       AlbumAssetFragment a;
       AlbumAssetFragment$b uob = AlbumAssetFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       String str = "list";
       a.q(p1, str);
       uob = this.a;
       if (uob.w != null) {
          Iterator iterator = null;
          if (p0) {
             uoa = AlbumAssetFragment.ch(uob);
             uArrayList = new ArrayList();
             iterator1 = p1.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                obj1 = obj;
                if (obj1 != null) {
                   AlbumAssetFragment$b ta = this.a;
                   if (ta.ih(obj1, ta.rh().v0().getValue())) {
                      obj1 = 1;
                   label_005b :
                      if (obj1) {
                         uArrayList.add(obj);
                      }
                   }
                }
                obj1 = null;
                goto label_005b ;
             }
             uArrayList1 = new ArrayList();
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                obj2 = iterator.next();
                if (obj2 instanceof QMedia) {
                   uArrayList1.add(obj2);
                }
             }
             uoa.l1(uArrayList1);
             if (this.a.getParentFragment() != null && this.a.getParentFragment() instanceof AlbumHomeFragment) {
                Fragment parentFragme = this.a.getParentFragment();
                if (parentFragme != null) {
                   obj1 = parentFragme;
                   a = this.a.A;
                   if (!PatchProxy.isSupport(AlbumHomeFragment.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(a), Boolean.valueOf(p0), p1, obj1, AlbumHomeFragment.class, "33")) {
                      a.q(p1, str);
                      obj2 = obj1.uh();
                      Objects.requireNonNull(obj2);
                      if (!PatchProxy.isSupport(AbsAlbumHomeFragmentViewBinder.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(a), Boolean.valueOf(p0), p1, obj2, AbsAlbumHomeFragmentViewBinder.class, "1")) {
                         a.q(p1, str);
                      }
                   }
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumHomeFragment");
                }
             }
          }else {
             uoa = AlbumAssetFragment.ch(uob);
             uArrayList = new ArrayList();
             iterator1 = p1.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                Object obj3 = obj;
                if (obj3 != null) {
                   AlbumAssetFragment$b ta1 = this.a;
                   if (ta1.ih(obj3, ta1.rh().v0().getValue())) {
                      obj3 = 1;
                   label_0129 :
                      if (obj3) {
                         uArrayList.add(obj);
                      }
                   }
                }
                obj3 = null;
                goto label_0129 ;
             }
             uArrayList1 = new ArrayList();
             Iterator iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                Object obj4 = iterator2.next();
                if (obj4 instanceof QMedia) {
                   uArrayList1.add(obj4);
                }
             }
             Objects.requireNonNull(uoa);
             if (!PatchProxy.applyVoidOneRefs(uArrayList1, uoa, a.class, "2")) {
                a.q(uArrayList1, "mediaList");
                uoa.j.addAll(uArrayList1);
                int i = uoa.e.size();
                uoa.a1(uArrayList1);
                uoa.g1(iterator, i);
                uoa.d1(iterator, i);
                uoa.m1();
                uoa.k1("add adapter size = "+uoa.e.size());
                uoa.r0(i, (uoa.e.size() - i));
             }
          }
          this.a.Hh();
          Log.g("AlbumAssetFragment", "type "+this.a.nh()+" refresh asset list size="+p1.size());
       }
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment$b.class, "2")) {
          return;
       }
       a.q(p0, "list");
       AlbumAssetFragment.ch(this.a).Y0();
       this.a.Hh();
       this.a.Kh();
       return;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment$b.class, "3")) {
          return;
       }
       String str = "type ";
       Log.g("AlbumAssetFragment", str+this.a.nh()+" start update media "+p0);
       AlbumAssetFragment$b ta = this.a;
       if (ta.w != null) {
          int i = AlbumAssetFragment.ch(ta).O0().indexOf(p0);
          if (i >= 0 && p0 != null) {
             c uoc = AlbumAssetFragment.ch(this.a).O0().get(i);
             if (uoc instanceof QMedia && (!uoc.getWidth() || !uoc.getHeight())) {
                uoc.mWidth = p0.getWidth();
                uoc.mHeight = p0.getHeight();
                uoc.mRatio = p0.getRatio();
                Log.g("AlbumAssetFragment", str+this.a.nh()+" update media "+p0+", w="+uoc.mWidth+", h="+uoc.mHeight+','+" r="+uoc.mRatio);
             }
          }
          AlbumAssetFragment.ch(this.a).l0(i);
          Log.g("AlbumAssetFragment", str+this.a.nh()+" update media "+p0);
       }
       return;
    }
}
