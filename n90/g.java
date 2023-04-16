package n90.g;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import q87.c;
import androidx.lifecycle.LiveData;
import crd.b;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.models.EmptyQMedia;
import com.yxcorp.gifshow.models.QMedia;
import w69.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;
import java.util.Arrays;
import java.lang.System;
import brd.t;
import x80.g;
import t45.d;
import brd.z;
import n90.g$g;
import erd.o;
import n90.g$a;
import erd.a;
import n90.g$b;
import erd.g;
import n90.g$c;
import n90.g$d;
import n90.g$e;
import n90.g$f;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import lnc.g7;
import t90.i;
import java.lang.StringBuilder;
import w46.b;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import n90.g$h;
import n90.g$i;
import n90.g$j;
import n90.g$k;
import n90.g$l;
import n90.g$m;
import n90.g$n;
import n90.g$o;
import androidx.lifecycle.Observer;

public final class g	// class@0026e3
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public g c;
    public boolean d;
    public b e;
    public b f;
    public byte[] g;
    public Observer h;
    public final LifecycleOwner i;

    public void g(LifecycleOwner p0){
       a.p(p0, "mLifecycleOwner");
       super();
       this.i = p0;
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAlbumDataHelper", "destroy invoked", objArray);
       this.b();
       this.c(0);
       this.a.removeObservers(this.i);
       this.b.removeObservers(this.i);
       this.c = null;
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAlbumDataHelper", "disposeDownload invoked", objArray);
       g te = this.e;
       if (te != null) {
          if (!te.isDisposed()) {
             Object[] objArray1 = new Object[0];
             e.D().w("KuaiShanAlbumDataHelper", "Download task has been disposed", objArray1);
             te.dispose();
          }
          this.e = null;
       }
       h1.a("KuaiShanAlbumDataHelper");
       this.d = false;
       return;
    }
    public final void c(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "7")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KuaiShanAlbumDataHelper", "disposePrepare invoked", objArray);
       if (p0) {
          this.d = true;
       }
       g tf = this.f;
       if (tf != null) {
          if (!tf.isDisposed()) {
             Object[] objArray1 = new Object[i];
             e.D().w("KuaiShanAlbumDataHelper", "Prepare task has been disposed", objArray1);
             tf.dispose();
          }
          this.f = null;
       }
       return;
    }
    public final void d(List p0,String p1,boolean p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "KuaiShanAlbumDataHelper";
       e.D().w(str, "doPrepare invoked", objArray);
       g tf = this.f;
       if (tf != null) {
          a.m(tf);
          if (!tf.isDisposed()) {
             e.w("Prepare tasks are in process");
             return;
          }
       }
       m1 om1 = m1.w0();
       a.o(om1, "KuaiShanManager.getInstance\(\)");
       o1 oo1 = om1.v0();
       KSTemplateDetailInfo kSTemplateDe = null;
       if (oo1 == null || !oo1.H0()) {
          if (oo1 != null) {
             kSTemplateDe = oo1.k0();
          }
          i.c("project is not ready", g7.b(kSTemplateDe));
          Object[] objArray1 = new Object[i];
          e.D().t(str, "doPrepareMedias: project is not ready "+oo1, objArray1);
          this.b.setValue(new KSException(-18, "project is not ready"));
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          int i1 = p0.size();
          g$e int i2 = 0;
          while (i2 < i1) {
             if (p0.get(i2) instanceof EmptyQMedia) {
                uArrayList.add(p0.get(i2));
             }else {
                QMedia qMedia = x0.a(p0.get(i2));
                a.o(qMedia, "QMediaUtils.cloneMedia\(mediaList[i]\)");
                uArrayList.add(qMedia);
             }
             i2++;
          }
          if (TextUtils.x(p1)) {
             p0 = PatchProxy.applyOneRefs(uArrayList, kSTemplateDe, e.class, "12");
             if (p0 != PatchProxyResult.class) {
             label_009a :
                uArrayList = p0;
             }else if(uArrayList.isEmpty()){
                String str1 = -1;
                i1 = 0;
                i2 = -1;
                int i3 = -1;
                int i4 = -1;
                while (i1 < uArrayList.size()) {
                   if (uArrayList.get(i1) instanceof EmptyQMedia) {
                      if (i2 == str1) {
                         i2 = i1;
                      }
                   }else if(i4 == str1){
                      i4 = i1;
                   }
                   i3 = Math.max(i3, i1);
                   i1 = i1 + 1;
                }
                if (i2 != str1 && i3 != str1) {
                   if (i2 > i3) {
                      str1 = e.x(uArrayList.subList(i, i2), uArrayList.size());
                      goto label_009a ;
                   }else {
                      QMedia[] qMediaArray = new QMedia[uArrayList.size()];
                      for (i1 = 0; i1 < uArrayList.size(); i1 = i1 + 1) {
                         qMediaArray[i1] = uArrayList.get(i1);
                      }
                      while (i2 < i3) {
                         if (qMediaArray[i2] instanceof EmptyQMedia) {
                            i1 = (!i2)? i4: i2 - 1;
                            object oobject = qMediaArray[i1];
                            if (oobject != null) {
                               qMediaArray[i2] = x0.a(oobject);
                               int i5 = i2 + 1;
                               while (qMediaArray[i5] instanceof EmptyQMedia) {
                                  qMediaArray[i5] = x0.a(oobject);
                                  i2 = i5;
                               }
                            }
                         }
                         i2++;
                      }
                      uArrayList = e.x(new ArrayList(Arrays.asList(qMediaArray).subList(i, (i3 + 1))), uArrayList.size());
                   }
                }
             }
             a.o(uArrayList, "KSUtil.autoFillMediaList\(realMediaList\)");
          }
          long l = System.currentTimeMillis();
          String templateId = oo1.getTemplateId();
          a.o(templateId, "project.templateId");
          g tc = this.c;
          if (tc != null) {
             kSTemplateDe = tc.c(uArrayList);
          }
          t ot = oo1.O0(uArrayList, p1, p2).observeOn(d.c).distinct().flatMap(new g$g(this, p2, oo1));
          if (kSTemplateDe == null) {
             kSTemplateDe = ot;
          }
          i2 = new g$e(this, oo1, l, templateId);
          this.f = kSTemplateDe.observeOn(d.a).doFinally(new g$a(this)).doOnSubscribe(new g$b(this)).doOnDispose(new g$c(l, templateId)).doOnError(new g$d(l, templateId)).subscribe(new g$d(l, templateId), new g$f(this));
          return;
       }
    }
    public final void e(KSTemplateDetailInfo p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, g.class, "5")) {
          return;
       }
       a.p(p0, "templateInfo");
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAlbumDataHelper", "downloadTemplate invoked with templateId: "+p0.getId()+", is "+"silent download: "+p1, objArray);
       if (p1 && !g7.b(p0)) {
          PostUtils.D("KuaiShanAlbumDataHelper", "this template does not support silent loading in album", new IllegalStateException("this template does not support silent loading in album"));
          return;
       }else {
          g te = this.e;
          if (te != null) {
             a.m(te);
             if (!te.isDisposed()) {
                Object[] objArray1 = new Object[0];
                e.D().A("KuaiShanAlbumDataHelper", "templateId: "+p0.getId()+" is downloading, method return", objArray1);
                this.d = p1;
                return;
             }
          }
          te = this.c;
          if (te != null) {
             this.e = te.b().subscribeOn(d.c).observeOn(d.a).doOnSubscribe(new g$h(this, p1)).doFinally(new g$i(this, p1)).subscribe(new g$j(this, p1), new g$k(this, p1));
             return;
          }else {
             this.e = h1.e("KuaiShanAlbumDataHelper", p0, null, 0).subscribeOn(d.c).observeOn(d.a).doOnSubscribe(new g$l(this, p1)).doFinally(new g$m(this)).subscribe(new g$n(this, p2), new g$o(this));
             return;
          }
       }
    }
    public final MutableLiveData f(){
       return this.b;
    }
    public final MutableLiveData g(){
       return this.a;
    }
    public final void h(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       a.p(p0, "observer");
       this.b.observe(this.i, p0);
       return;
    }
    public final void i(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       a.p(p0, "observer");
       this.a.observe(this.i, p0);
       return;
    }
}
