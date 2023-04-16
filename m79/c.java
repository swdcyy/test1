package m79.c;
import m79.f;
import m79.e;
import r79.a;
import com.yxcorp.gifshow.album.selected.interact.AlbumSelectListenerDelegate;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ha9.c;
import ha9.b;
import java.util.List;
import com.yxcorp.gifshow.album.selected.interact.AlbumSelectControllerImpl$selectItemStatus$2;
import msd.a;
import qrd.p;
import qrd.s;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import w69.f;
import o79.q;
import kotlin.Pair;
import androidx.lifecycle.MutableLiveData;
import java.lang.Number;
import java.util.Iterator;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import ha9.a;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import m79.d;
import java.util.Collection;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.EmptyQMedia;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import com.yxcorp.gifshow.album.IBadMediaChecker;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import androidx.fragment.app.Fragment;
import m79.g;
import j79.d;
import j79.c;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig$LaunchType;
import m79.a;
import java.lang.Enum;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import ic7.c;
import androidx.fragment.app.FragmentActivity;
import ga9.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import zsd.u;
import e17.i;
import e17.s;
import java.io.File;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Float;
import j79.a;
import w69.d;
import w69.k;
import w69.c0;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import w69.n0;
import m79.b;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$b;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import o79.i;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import kotlin.TypeCastException;
import java.util.HashSet;
import java.util.LinkedList;
import o79.d;

public final class c implements f, e	// class@002e22
{
    public final c b;
    public final p c;
    public a d;
    public final AlbumSelectListenerDelegate e;

    public void c(a p0,AlbumSelectListenerDelegate p1,int p2,u p3){
       List list;
       p1 = (p2 & 0x02)? new AlbumSelectListenerDelegate(): null;
       a.q(p0, "albumOptionHolder");
       a.q(p1, "selectListenerDelegate");
       super();
       this.d = p0;
       this.e = p1;
       this.b = new c(new b(null, 1, null));
       this.c = s.c(AlbumSelectControllerImpl$selectItemStatus$2.INSTANCE);
       return;
    }
    public boolean A(c p0,int p1,boolean p2){
       IAlbumMainFragment$b obj;
       Iterator iterator;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.q(p0, "item");
       if (this.d.d().f()) {
          q.a.l(p0);
       }
       int i = 0;
       Pair pair = (!p2)? new Pair(Integer.valueOf(i), null): this.a(p0);
       this.Q().setValue(pair);
       if (!pair.getFirst().intValue()) {
          this.B().y(p1, p0);
          this.e.c(p0);
          if (p2) {
             iterator = this.d.l().iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj != null) {
                   obj.b(p0);
                }
             }
          }else {
             iterator = this.d.l().iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj != null) {
                   obj.c(p0);
                }
             }
          }
          i = true;
       }
       Pair pair1 = this.N(p1);
       if (pair1 != null) {
          this.B().y(pair1.getFirst().intValue(), pair1.getSecond());
       }
       Log.g("AlbumSelectControllerImpl", "addSelectItem: add item "+p0+" error="+pair);
       return i;
    }
    public c B(){
       return this.b;
    }
    public void C(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "12")) {
          return;
       }
       String str = "AlbumSelectControllerImpl";
       Log.b(str, "swapSelectItem\(\) called with: from = ["+p0+"], to = ["+p1+']');
       if (p0 < 0 || p1 >= this.B().u()) {
          Log.d(str, "swapSelectItem: wrong args");
          return;
       }else {
          uoc = this.B();
          Objects.requireNonNull(uoc);
          c uoc1 = c.class;
          if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uoc, uoc1, "9")) {
             b value = uoc.getValue();
             if (value != null) {
                b uob = b.class;
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), value, uob, "6")) {
                   Collections.swap(value.g, p0, p1);
                   value.d(p0);
                   value.f = p1;
                   value.e(UpdateType.SWAP);
                }
             }
             uoc.v();
          }
          this.e.a(p0, p1);
          return;
       }
    }
    public void G(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "29")) {
          return;
       }
       a.q(p0, "listener");
       this.e.G(p0);
       return;
    }
    public boolean J(){
       List obj = PatchProxy.apply(null, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B().t();
       boolean b = false;
       if (obj != null && !obj.isEmpty()) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().isVideoType()) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public Pair N(int p0){
       List obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.m();
       if (obj != null) {
          p0++;
          int i = obj.size();
          while (p0 < i) {
             if (obj.get(p0) instanceof EmptyQMedia) {
                return new Pair(Integer.valueOf(p0), obj.get(p0));
             }
             p0++;
          }
       }
       return null;
    }
    public MutableLiveData Q(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public String U(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B().t();
       if (obj != null) {
          c uoc = CollectionsKt___CollectionsKt.e3(obj);
          if (uoc != null) {
             objArray = uoc.getPath();
          }
       }
       return objArray;
    }
    public boolean Y(){
       ArrayList uArrayList;
       Iterator iterator;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.d.d().b()) {
          return b;
       }
       obj = this.B().t();
       if (obj != null) {
          uArrayList = new ArrayList();
          iterator = obj.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if (this.d.e().b().isBadMediaInfo(obj1)) {
                uArrayList.add(obj1);
             }
          }
       }else {
          uArrayList = objArray;
       }
       if (uArrayList != null) {
          if (uArrayList.isEmpty() ^ 1) {
             objArray = uArrayList;
          }
          if (objArray != null) {
             iterator = objArray.iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                this.B().w(uoc);
                this.e.b(uoc, this.d0(uoc));
                Log.g("AlbumSelectControllerImpl", "filterUnExistSelectedFiles: remove "+uoc);
                b = true;
             }
          }
       }
       return b;
    }
    public boolean Z(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "item");
       Log.g("AlbumSelectControllerImpl", "toggleSelect\(\) called with: item = ["+p0+']');
       if (this.l(p0)) {
          return false;
       }
       Log.g("AlbumSelectControllerImpl", "toggleSelect: add it");
       return this.h0(p0);
    }
    public final Pair a(c p0){
       MediaFilterList obj = PatchProxy.applyOneRefs(p0, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "media");
       obj = this.d.e().u();
       List list = this.B().t();
       if (list != null) {
          list = CollectionsKt___CollectionsKt.J5(list);
          if (list != null) {
          label_0034 :
             int i = obj.isSelectable(p0, list);
             if (i) {
                Log.g("AlbumSelectControllerImpl", "canNotSelect selected media by user defined rules");
                return new Pair(Integer.valueOf(i), obj.getNonselectableAlert());
             }else {
                int i1 = obj.isClickable(p0);
                if (i1) {
                   Log.g("AlbumSelectControllerImpl", "canNotSelect enable media by user defined rules");
                   return new Pair(Integer.valueOf(i1), obj.getNonselectableAlert());
                }else {
                   return new Pair(Integer.valueOf(0), null);
                }
             }
          }
       }
       ArrayList uArrayList = new ArrayList();
       goto label_0034 ;
    }
    public void a0(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "30")) {
          return;
       }
       a.q(p0, "listener");
       this.e.a0(p0);
       return;
    }
    public int d0(c p0){
       List obj = PatchProxy.applyOneRefs(p0, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.B().t();
       int i = (obj != null)? CollectionsKt___CollectionsKt.M2(obj, p0): -1;
       return i;
    }
    public void f0(Fragment p0,int p1,List p2,int p3,g p4,d p5,c p6){
       String str6;
       StringBuilder str7;
       int i9;
       Fragment uFragment;
       ArrayList uArrayList;
       ArrayList uArrayList1;
       Iterator iterator;
       c uoc1;
       MediaPreviewInfo[] mediaPreview;
       Object[] objArray1;
       IAlbumMainFragment$IPreviewIntentConfig iPreviewInte;
       FragmentActivity activity;
       String str8;
       List list;
       AlbumLimitOption uAlbumLimitO;
       c uoc2;
       String str10;
       Fragment obj1;
       int b;
       ArrayList uArrayList2;
       ArrayList uArrayList3;
       Iterator iterator1;
       Fragment obj2;
       int i10;
       Iterator iterator2;
       c obj3;
       List list1;
       MediaPreviewInfo[] mediaPreview1;
       Object[] objArray3;
       String str11;
       ArrayList uArrayList4;
       List list2;
       Iterator iterator3;
       int i11;
       Object obj4;
       Bundle uBundle;
       String str12;
       Float uFloat;
       float f;
       g f1;
       c0 uoc0;
       PreviewViewPager$b uob;
       MediaPreviewFragment mediaPreview2;
       a k;
       FragmentActivity activity1;
       FragmentActivity activity2;
       e uoe;
       FragmentActivity activity3;
       b uob1;
       Uri uri;
       Object obj = this;
       object oobject = p0;
       int i = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       object oobject3 = p5;
       object oobject4 = p6;
       c uoc = c.class;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 7;
       int i5 = 2;
       int i6 = 1;
       int i7 = 0;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[i4];
          objArray[i7] = oobject;
          objArray[i6] = Integer.valueOf(p1);
          objArray[i5] = oobject1;
          objArray[i3] = Integer.valueOf(p3);
          objArray[i2] = oobject2;
          objArray[i1] = oobject3;
          objArray[6] = oobject4;
          if (PatchProxy.applyVoid(objArray, obj, uoc, "23")) {
             return;
          }
       }
       a.q(oobject, "fromFragment");
       int i8 = a.a[obj.d.h().getType().ordinal()];
       String str = "";
       String str1 = "null cannot be cast to non-null type kotlin.Array<T>";
       String str2 = " previewInfoList: ";
       String str3 = "PreviewBug";
       String str4 = " mediaList: ";
       String str5 = "index: ";
       if (i8 != i6) {
          if (i8 == 2) {
             if (PatchProxy.isSupport(uoc)) {
                str6 = str1;
                i6 = 0;
                if (!PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(p3), this, c.class, "25")) {
                }
             }else {
                str6 = str1;
                i6 = 0;
             }
          }
       }else {
          String str9 = str1;
          i7 = 0;
          if (PatchProxy.isSupport(uoc)) {
             Object[] objArray2 = new Object[]{p0,Integer.valueOf(p1),oobject1,Integer.valueOf(p3),oobject2,oobject3,oobject4};
             if (!PatchProxy.applyVoid(objArray2, obj, uoc, "24")) {
             }
          }else {
          }
       }
    label_0537 :
       return;
    }
    public void g0(List p0){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       if (this.d.d().b()) {
          if (p0 != null) {
             p0 = CollectionsKt___CollectionsKt.J5(p0);
             if (p0 == null) {
             }
          }else {
          }
       }else {
          q a = q.a;
          IBadMediaChecker iBadMediaChe = this.d.e().b();
          Objects.requireNonNull(a);
          HashSet obj = PatchProxy.applyTwoRefs(p0, iBadMediaChe, a, q.class, "8");
          if (obj != PatchProxyResult.class) {
             uArrayList = obj;
          }else {
             a.q(iBadMediaChe, "checkDelegate");
             int i = (p0 != null)? p0.size(): 0;
             obj = new HashSet(i);
             LinkedList linkedList = new LinkedList();
             if (p0 != null) {
                p0 = CollectionsKt___CollectionsKt.d2(p0);
                if (p0 != null) {
                   Iterator iterator = p0.iterator();
                   while (iterator.hasNext()) {
                      c uoc = iterator.next();
                      if (iBadMediaChe.isBadMediaInfo(uoc)) {
                         continue ;
                      }else if(!obj.contains(uoc.getPath())){
                         linkedList.add(uoc);
                      }else {
                         Log.g("Util", "removeDuplicate: duplicate "+uoc.getPath());
                      }
                      obj.add(uoc.getPath());
                   }
                }
             }
             uArrayList = linkedList;
          }
       }
       this.B().r(p0);
       this.e.d(p0);
       Log.g("AlbumSelectControllerImpl", "setSelectedList: add all list size="+p0.size());
       return;
    }
    public boolean h0(c p0){
       Pair obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "item");
       if (this.d.d().f()) {
          q.a.l(p0);
       }
       obj = this.a(p0);
       this.Q().setValue(obj);
       boolean b = true;
       int i = 0;
       if (!obj.getFirst().intValue()) {
          c uoc = this.B();
          b value = uoc.getValue();
          if (value != null) {
             i = value.f();
          }
          uoc.q(p0, i);
          this.e.c(p0);
          Iterator iterator = this.d.l().iterator();
          while (iterator.hasNext()) {
             IAlbumMainFragment$b uob = iterator.next();
             if (uob != null) {
                uob.b(p0);
             }
          }
       }else if(obj.getFirst().intValue() == -9 || obj.getFirst().intValue() == -8){
          d.r(i, p0.getDuration());
       }else if(obj.getFirst().intValue() == -7){
          d.r(b, (this.u() + p0.getDuration()));
       }
       b = false;
       Log.g("AlbumSelectControllerImpl", "addSelectItem: add item "+p0+" error="+obj);
       return b;
    }
    public void j0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "28")) {
          return;
       }
       c te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(objArray, te, AlbumSelectListenerDelegate.class, "4")) {
          te.e().clear();
       }
       return;
    }
    public boolean l(c p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "item");
       int i = this.d0(p0);
       if (this.B().w(p0)) {
          Log.g("AlbumSelectControllerImpl", "removeSelectItem: has exist remove it");
          this.e.b(p0, i);
          obj = this.d.l().iterator();
          while (obj.hasNext()) {
             IAlbumMainFragment$b uob = obj.next();
             if (uob != null) {
                uob.c(p0);
             }
          }
          return true;
       }else {
          Log.d("AlbumSelectControllerImpl", "removeSelectItem: cant find item "+p0);
          return false;
       }
    }
    public List m(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B().t();
       if (obj != null) {
          objArray = CollectionsKt___CollectionsKt.G5(obj);
       }
       return objArray;
    }
    public boolean r(){
       int b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, uoc, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, this, uoc, "15");
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          obj = this.B().t();
          if (obj != null) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                Object obj2 = iterator.next();
                int i = obj2 instanceof EmptyQMedia ^ b;
                if (i) {
                   uArrayList.add(obj2);
                }
             }
             b1 = uArrayList.size();
          }else {
             b1 = 0;
          }
          if (b1 >= this.d.e().d()) {
             b1 = true;
          }else {
             b1 = false;
          }
       }
       if (!b1) {
          Object obj1 = PatchProxy.apply(objArray, this, uoc, "16");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else {
             long l = this.u();
             if (this.d.d().f()) {
                if ((float)(this.d.e().j() - l) - 0x447a0000 < 0) {
                label_00a7 :
                   b2 = true;
                }
             }else if(l - this.d.e().j() > 0){
                goto label_00a7 ;
             }
             b2 = false;
          }
          if (!b2) {
          label_00ac :
             return b;
          }
       }
       b = false;
       goto label_00ac ;
    }
    public long u(){
       Object[] objArray = null;
       q obj = PatchProxy.apply(objArray, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = q.a;
       boolean b = this.d.d().f();
       List list = this.B().t();
       if (list != null) {
          objArray = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             int i = obj1 instanceof EmptyQMedia ^ 0x01;
             if (i) {
                objArray.add(obj1);
             }
          }
       }
       return obj.a(b, objArray);
    }
    public boolean y(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoc = this.B().s(p0);
       String str = null;
       if (uoc != null) {
          if (this.B().x(p0)) {
             Log.g("AlbumSelectControllerImpl", "removeSelectItem: has exist remove it");
             this.e.b(uoc, p0);
             Iterator iterator = this.d.l().iterator();
             while (iterator.hasNext()) {
                IAlbumMainFragment$b uob = iterator.next();
                if (uob != null) {
                   uob.c(uoc);
                }
             }
             return true;
          }else {
             Log.d("AlbumSelectControllerImpl", "removeSelectItem: cant find item "+uoc);
          }
       }
       return str;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       Log.g("AlbumSelectControllerImpl", "clearSelectMedias: ");
       ArrayList uArrayList = new ArrayList();
       this.B().r(uArrayList);
       this.e.d(uArrayList);
       return;
    }
}
