package dja.a;
import o26.c;
import androidx.lifecycle.ViewModel;
import dja.a$a;
import nsd.u;
import tkd.b;
import tkd.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lv5.d;
import o26.d;
import dja.a$c;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import dja.a$b;
import androidx.lifecycle.LiveData;
import z0.a;
import androidx.lifecycle.Transformations;
import dja.a$d;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.entity.QPhoto;
import o26.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.kcube.TabIdentifier;
import java.lang.Float;
import on5.b;
import r26.a;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Runnable;
import ekd.k1;

public final class a extends ViewModel implements c	// class@0024ba
{
    public final d b;
    public final Runnable c;
    public final MutableLiveData d;
    public int e;
    public final LiveData f;
    public final LiveData g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final PublishSubject j;
    public final MutableLiveData k;
    public static final a$a l;

    static {
       a.l = new a$a(null);
    }
    public void a(){
       super();
       b uob = d.a(-447917650);
       a.o(uob, "PluginManager.get\(MockFeedRepoPlugin::class.java\)");
       d uod = uob.XV();
       this.b = uod;
       this.c = new a$c(this);
       MutableLiveData mutableLiveD = new MutableLiveData(Integer.valueOf(-1));
       this.d = mutableLiveD;
       this.e = -1;
       LiveData liveData = Transformations.map(mutableLiveD, new a$b(this));
       a.o(liveData, "Transformations.map\(obse¡­= it.postWorkInfoId }\n  }");
       this.f = liveData;
       liveData = Transformations.map(liveData, a$d.a);
       a.o(liveData, "Transformations.map\(curr\x20\x02t?.coverThumbnailUrls\n  }\x00");
       this.g = liveData;
       this.h = new MutableLiveData(Integer.valueOf(0));
       this.i = new MutableLiveData(null);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<QPhoto>\(\)");
       this.j = publishSubje;
       this.k = new MutableLiveData(null);
       uod.J5(this);
    }
    public void Dc(QPhoto p0){
       b.a(this, p0);
    }
    public void S9(){
       b.b(this);
    }
    public final LiveData o0(){
       return this.f;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.onCleared();
       this.b.Qb(this);
       return;
    }
    public final MutableLiveData p0(){
       return this.k;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.b.Y5();
       return;
    }
    public final QPhoto r0(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.gf();
    }
    public final void s0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "6")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().w("MockFeedViewModel", "work:"+this.e+" end", objArray1);
       this.t0(-1);
       this.i.setValue(objArray);
       this.h.setValue(Integer.valueOf(-1));
       return;
    }
    public final void t0(int p0){
       PostStatus postStatus1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.e != p0) {
          Object[] objArray = new Object[0];
          a.C().w("MockFeedViewModel", "switch postWork{new:"+p0+",old:"+this.e+'}', objArray);
          this.e = p0;
          this.d.setValue(Integer.valueOf(p0));
          a tk = this.k;
          uoa = this.b;
          a.o(uoa, "mMockFeedRepo");
          ImmutableList immutableLis = uoa.Id();
          PostStatus postStatus = null;
          if (immutableLis != null) {
             Iterator iterator = immutableLis.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   postStatus1 = iterator.next();
                   Object obj = postStatus1;
                   a.o(obj, "it");
                   obj = (this.e == obj.getPostWorkInfoId())? 1: null;
                   if (!obj) {
                      continue ;
                   }
                }else {
                   postStatus1 = postStatus;
                }
                if (postStatus1 != null) {
                   postStatus = postStatus1.getFeedStatus();
                }
             }
          }
          tk.setValue(postStatus);
       }
       return;
    }
    public void tc(PostStatus p0,int p1,float p2,TabIdentifier p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), p3, this, a.class, "9")) {
          return;
       }
       a.p(p3, "targetTab");
       b.c(this, p0, p1, p2, p3);
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("MockFeedViewModel", "onProgressChanged\(\) called with: targetTab="+p3+" status = "+p0+", postWorkInfoId = "+p1+", progress = "+p2, objArray);
       if (p0 == PostStatus.UPLOAD_COMPLETE && (a.g(p3, b.h) || a.g(p3, b.c))) {
          a tb = this.b;
          a.o(tb, "mMockFeedRepo");
          ImmutableList immutableLis = tb.Id();
          Object obj = null;
          if (immutableLis != null) {
             Iterator iterator = immutableLis.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                String obj2 = obj1;
                a.o(obj2, "it");
                obj2 = (p1 == obj2.getPostWorkInfoId())? 1: null;
                if (obj2) {
                   obj = obj1;
                   break ;
                }
             }
          }
          Object[] objArray1 = new Object[i];
          a.C().w("MockFeedViewModel", "onProgressChanged\(\) uploadedQPhoto update photo="+obj, objArray1);
          this.i.setValue(obj);
          if (obj != null) {
             this.j.onNext(obj);
          }
       }
    label_00c7 :
       if (p1 == this.e) {
          if (this.k.getValue() != p0) {
             this.k.setValue(p0);
          }
          this.h.setValue(Integer.valueOf((int)(p2 * (float)100)));
       }
       return;
    }
    public void u4(ImmutableList p0,a p1,boolean p2){
       Integer integer1;
       PostStatus postStatus1;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "7")) {
          return;
       }
       a uoa = a.C();
       StringBuilder str = "onStatusChanged\(\) called with: info.id = ";
       PostStatus postStatus = null;
       Integer integer = (p1 != null)? Integer.valueOf(p1.getId()): postStatus;
       Object[] objArray = new Object[0];
       uoa.s("MockFeedViewModel", str+integer+", newComes ="+p2, objArray);
       if (p1 != null) {
          integer1 = Integer.valueOf(p1.getId());
          String str1 = (integer1.intValue() >= this.e)? 1: null;
          if (!str1) {
             integer1 = postStatus;
          }
          if (integer1 != null) {
             int i = integer1.intValue();
          label_006f :
             this.t0(i);
             i = this.b;
             a.o(i, "mMockFeedRepo");
             ImmutableList immutableLis = i.Id();
             if (immutableLis != null) {
                Iterator iterator = immutableLis.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      postStatus1 = iterator.next();
                      PostStatus obj = postStatus1;
                      a.o(obj, "it");
                      obj = (this.e == obj.getPostWorkInfoId())? 1: null;
                      if (!obj) {
                         continue ;
                      }
                   }else {
                      postStatus1 = postStatus;
                   }
                }
             }else {
                postStatus1 = postStatus;
             }
             if (this.e != -1) {
                PostStatus feedStatus = (postStatus1 != null)? postStatus1.getFeedStatus(): postStatus;
                if (feedStatus != PostStatus.UPLOAD_CANCELED) {
                   if (postStatus1 != null) {
                      postStatus = postStatus1.getFeedStatus();
                   }
                   if (postStatus != PostStatus.ENCODE_CANCELED && postStatus1 != null) {
                      return;
                   }
                }
             label_00c5 :
                k1.m(this.c);
                k1.r(this.c, 100);
                goto label_00d1 ;
             }else {
                goto label_00d1 ;
             }
          }
       }
       integer1 = this.e;
       goto label_006f ;
    }
}
