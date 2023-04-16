package com.yxcorp.gifshow.album.preview.d;
import j79.m0;
import u79.a;
import androidx.fragment.app.Fragment;
import j79.l0;
import q79.d;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ga9.c;
import ga9.b;
import u79.o;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Objects;
import java.lang.Boolean;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import r79.c;
import w69.o0;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import r79.d;
import com.yxcorp.gifshow.album.preview.a;
import androidx.lifecycle.ViewModel;
import r79.e;
import com.yxcorp.gifshow.album.preview.c;
import com.yxcorp.gifshow.album.widget.preview.f;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import j79.r0;
import h3.a;
import j79.h;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$b;
import com.yxcorp.gifshow.album.preview.d$a;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import ic7.b;
import io.reactivex.subjects.PublishSubject;

public class d extends a implements m0	// class@001a4f
{
    public MediaPreviewGenerateCoverManager f;
    public l0 g;
    public d h;
    public Fragment i;

    public void d(Fragment p0,l0 p1,d p2){
       super();
       this.f = new MediaPreviewGenerateCoverManager();
       this.i = p0;
       this.g = p1;
       this.h = p2;
    }
    public AbsPreviewItemViewBinder A(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.g.F0().a(AbsPreviewItemViewBinder.class, this.i, p0);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       o oo = this.C();
       if (oo == null) {
          return;
       }
       oo.q(true);
       return;
    }
    public void I(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "6")) {
          return;
       }
       super.I(p0);
       Log.g("MediaPreviewAdapter", "select item "+p0);
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "7")) {
          int i = p0 - 1;
          int i1 = p0 + 1;
          d tf = this.f;
          Objects.requireNonNull(tf);
          Object obj = PatchProxy.apply(null, tf, MediaPreviewGenerateCoverManager.class, "2");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): tf.b.isEmpty() ^ 0x01;
          if (b) {
             this.K(i);
             this.K(i1);
             this.K(p0);
          }else {
             this.K(p0);
             this.K(i1);
             this.K(i);
          }
       }
       return;
    }
    public void J(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.d.clear();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c media = iterator.next().getMedia();
          if (PatchProxy.applyVoidOneRefs(media, this, d.class, "2")) {
             continue ;
          }else {
             o oo = this.g.g.a(this.d.size(), media);
             if (oo == null) {
                if (media.getDataType() == DataType.IMAGE && media instanceof d) {
                   oo = new a(this.d.size(), media, this, this.g);
                }else if(media.getDataType() == DataType.VIDEO && media instanceof e){
                   d tg = this.g;
                   oo = new c(this.d.size(), media, this, tg);
                   l0 a = tg.A;
                   f uof = f.class;
                   if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(a), oo, uof, "31")) {
                      oo.g = a;
                      uof = oo.c;
                      if (uof != null) {
                         uof.setLoop(a);
                      }
                   }
                }else {
                   oo = new r0();
                }
             }
             oo.b(this.h);
             this.d.add(oo);
          }
       }
       this.q();
       return;
    }
    public final void K(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "8")) {
          return;
       }
       if (p0 >= 0 && p0 < this.d.size()) {
          o oo = this.D(p0);
          if (oo.s()) {
             return;
          }else {
             d tf = this.f;
             h oh = (tf.c != null)? 1: null;
             if (!oh) {
                tf.b(new h(this));
             }
             Log.g("MediaPreviewAdapter", "generate item cover "+p0);
             if (oo instanceof d$a) {
                MediaPreviewGenerateCoverManager$a uoa = oo.j();
                uod = this.f;
                Objects.requireNonNull(uod);
                if (!PatchProxy.applyVoidOneRefs(uoa, uod, MediaPreviewGenerateCoverManager.class, "4")) {
                   if (uoa == null) {
                      b.a(new IllegalArgumentException("MediaPreviewGenerateCoverManager add task null"));
                   }else {
                      Log.g("MediaPreviewGenerateCoverManager", " add task, task index = "+uoa.a);
                      if (uod.b.containsKey(uoa)) {
                         uod.b.get(uoa);
                      }else {
                         uod.b.put(uoa, Boolean.FALSE);
                      }
                      uod.a();
                   }
                }
             }
          }
       }
       return;
    }
    public void L(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "3")) {
          return;
       }
       this.d.remove(p0);
       for (int i = p0; i < this.d.size(); i = i + 1) {
          this.d.get(i).a(p0);
       }
       this.q();
       return;
    }
    public void M(boolean p0){
       o oo1;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "11")) {
          return;
       }
       int currentIndex = this.getCurrentIndex();
       int i = currentIndex - 1;
       currentIndex = currentIndex + 1;
       if (i >= 0 && i < this.j()) {
          o oo = this.D(i);
          if (oo != null) {
             oo.g(p0);
          }
       }
       if (currentIndex >= 0 && currentIndex < this.j()) {
          oo1 = this.D(currentIndex);
          if (oo1 != null) {
             oo1.g(p0);
          }
       }
       oo1 = this.C();
       if (oo1 != null) {
          oo1.g(p0);
       }
       return;
    }
    public void f(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "12")) {
          return;
       }
       this.g.z0().onNext(p0);
       return;
    }
    public int k(Object p0){
       return -2;
    }
    public void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "9")) {
          return;
       }
       super.z();
       this.f.b(objArray);
       d tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, MediaPreviewGenerateCoverManager.class, "1")) {
          tf.b.clear();
       }
       return;
    }
}
