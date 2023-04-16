package com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import huc.u;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$a;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$downloadDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$remoteFontRepo$2;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$fontDownloadHelper$2;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$fontListLiveDate$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import crd.a;
import java.lang.StringBuilder;
import di0.b;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$g;
import erd.o;
import java.lang.Integer;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.List;
import d0c.d;
import d0c.a;
import java.util.Iterator;
import java.lang.Iterable;
import huc.u$a;
import com.yxcorp.gifshow.model.CDNUrl;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$d;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$b;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$c;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$f;
import java.util.Objects;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$b;

public final class FontViewModel extends ViewModel implements u	// class@001452
{
    public boolean b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public int g;
    public int h;
    public static boolean i;
    public static final FontViewModel$a j;

    static {
       FontViewModel.j = new FontViewModel$a(null);
    }
    public void FontViewModel(){
       super();
       this.c = s.c(FontViewModel$downloadDisposable$2.INSTANCE);
       this.d = s.c(FontViewModel$remoteFontRepo$2.INSTANCE);
       this.e = s.c(FontViewModel$fontDownloadHelper$2.INSTANCE);
       this.f = s.c(FontViewModel$fontListLiveDate$2.INSTANCE);
       this.g = -1;
       this.h = -1;
    }
    public final void A0(int p0){
       this.g = p0;
    }
    public final void C0(){
       if (PatchProxy.applyVoid(null, this, FontViewModel.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FontBIZ", "stopDownloadTasks", objArray);
       this.v0().g();
       this.u0().dispose();
       return;
    }
    public final void D0(){
       if (PatchProxy.applyVoid(null, this, FontViewModel.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FontBIZ", "tryToLoadFontDataUseNetwork sHasFetchFontFromNet:"+FontViewModel.i, objArray);
       if (!FontViewModel.i || !this.w0().v()) {
          this.y0(true);
          FontViewModel.i = true;
       }
       return;
    }
    public t P(CachePolicy p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FontViewModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cachePolicy");
       int i = 0;
       boolean b = (p0 == CachePolicy.NETWORK_ELSE_CACHE)? true: false;
       Object[] objArray = new Object[i];
       a.D().w("FontBIZ", "loadFontDataObserver networkFirst:"+b, objArray);
       t ot = this.x0().c(p0).flatMap(new FontViewModel$g(this));
       a.o(ot, "remoteFontRepo.fetchConf¡­rver\(ArrayList\(it\)\)\n    }");
       return ot;
    }
    public Integer c0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FontViewModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fontId");
       int i = this.w0().v();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          String str = null;
          if (i2 >= i) {
             return str;
          }
          ListHolder value = this.w0().getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                d uod = list.get(i2);
                if (uod != null) {
                   str = uod.d();
                }
             }
          }
          if (a.g(p0, str)) {
             break ;
          }else {
             i2 = i2 + 1;
          }
       }
       Object[] objArray = new Object[i1];
       a.D().w("FontBIZ", "findFontPositionById i:"+i2+", fontId:"+p0, objArray);
       return Integer.valueOf(i2);
    }
    public d e0(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, FontViewModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       d uod = null;
       if (p0 == null) {
          obj = new Object[i];
          a.D().w("FontBIZ", "findFontById fontId:"+p0, obj);
          return uod;
       }else {
          ListHolder value = this.w0().getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   d uod1 = iterator.next();
                   if (a.g(p0, uod1.d())) {
                      uod = uod1;
                   }
                }
             }
          }
          obj = new Object[i];
          a.D().w("FontBIZ", "findFontById fontViewData:"+uod, obj);
          return uod;
       }
    }
    public void m0(int p0,u$a p1){
       FontViewModel uFontViewMod = FontViewModel.class;
       if (PatchProxy.isSupport(uFontViewMod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uFontViewMod, "11")) {
          return;
       }
       this.h = p0;
       d uod = this.w0().u(p0);
       a uoa = a.D();
       StringBuilder str = "downloadFont position: "+p0+", fileName: ";
       CDNUrl uCDNUrl = null;
       String str1 = (uod != null)? uod.c(): uCDNUrl;
       str = str+str1+", url: ";
       int i = 0;
       if (uod != null) {
          List list = uod.h();
          if (list != null) {
             CDNUrl uCDNUrl1 = list.get(i);
             if (uCDNUrl1 != null) {
                uCDNUrl = uCDNUrl1.mUrl;
             }
          }
       }
       Object[] objArray = new Object[i];
       uoa.A("FontBIZ", str+uCDNUrl+", fontDownloadCallBack:"+p1, objArray);
       if (uod != null) {
          this.u0().c(this.v0().a(uod).subscribeOn(d.c).observeOn(d.a).subscribe(new FontViewModel$d(uod, this, p0, p1), FontViewModel$e.b));
       }
       return;
    }
    public final t o0(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FontViewModel.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = t.fromCallable(new FontViewModel$b(this, p0)).subscribeOn(d.c).observeOn(d.a).map(new FontViewModel$c(this));
       a.o(ot, "Observable.fromCallable ¡­aultFont\(\)\n      it\n    }");
       return ot;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, FontViewModel.class, "22")) {
          return;
       }
       if (this.w0().v() > 0) {
          Object obj = this.w0().u(0);
          a.m(obj);
          if (!obj.j()) {
             obj = this.w0().u(0);
             a.m(obj);
             if (obj.i() == -1) {
                this.q0(0);
             }
          }
       }
       return;
    }
    public final void q0(int p0){
       FontViewModel uFontViewMod = FontViewModel.class;
       if (PatchProxy.isSupport(uFontViewMod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFontViewMod, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FontBIZ", "downloadFont position:"+p0, objArray);
       this.m0(p0, null);
       return;
    }
    public final Integer r0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FontViewModel.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fontFileName");
       int i = this.w0().v();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          String str = null;
          if (i2 >= i) {
             return str;
          }
          ListHolder value = this.w0().getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                d uod = list.get(i2);
                if (uod != null) {
                   str = uod.c();
                }
             }
          }
          if (a.g(p0, str)) {
             break ;
          }else {
             i2 = i2 + 1;
          }
       }
       Object[] objArray = new Object[i1];
       a.D().w("FontBIZ", "findFontPositionByFontFileName i:"+i2+", fontFileName:"+p0, objArray);
       return Integer.valueOf(i2);
    }
    public final String s0(){
       FontViewModel obj = PatchProxy.apply(null, this, FontViewModel.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj < null) {
          obj = null;
       }
       String str = "";
       if (this.w0().v() > obj) {
          Object obj1 = this.w0().u(obj);
          a.m(obj1);
          if (obj1.j()) {
             String obj2 = this.w0().u(obj);
             a.m(obj2);
             obj2 = obj2.c();
             if (obj2 != null) {
                str = obj2;
             }
          }
       }
       return str;
    }
    public final int t0(){
       return this.g;
    }
    public final a u0(){
       Object obj = PatchProxy.apply(null, this, FontViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final FontDownloadHelper v0(){
       Object obj = PatchProxy.apply(null, this, FontViewModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final b w0(){
       Object obj = PatchProxy.apply(null, this, FontViewModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final RemoteFontRepo x0(){
       Object obj = PatchProxy.apply(null, this, FontViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final void y0(boolean p0){
       FontViewModel uFontViewMod = FontViewModel.class;
       if (PatchProxy.isSupport(uFontViewMod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFontViewMod, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FontBIZ", "loadFontData networkFirst:"+p0+", isLoading:"+this.b, objArray);
       if (this.b != null) {
          return;
       }
       this.b = true;
       FontViewModel$f uof = new FontViewModel$f(this);
       RemoteFontRepo remoteFontRe = this.x0();
       Objects.requireNonNull(remoteFontRe);
       RemoteFontRepo remoteFontRe1 = RemoteFontRepo.class;
       if (!PatchProxy.isSupport(remoteFontRe1) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), uof, remoteFontRe, remoteFontRe1, "3")) {
          CachePolicy nETWORK_ELSE = (p0)? CachePolicy.NETWORK_ELSE_CACHE: CachePolicy.CACHE_ONLY;
          remoteFontRe.b(nETWORK_ELSE, uof);
       }
       return;
    }
    public final void z0(int p0){
       Object[] objArray;
       d uod;
       FontViewModel uFontViewMod = FontViewModel.class;
       if (PatchProxy.isSupport(uFontViewMod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFontViewMod, "9")) {
          return;
       }
       uFontViewMod = this.g;
       String str = "selectFont position:";
       if (uFontViewMod == p0) {
          objArray = new Object[0];
          a.D().w("FontBIZ", str+p0+" is selected", objArray);
          return;
       }else {
          StringBuilder str1 = null;
          if (uFontViewMod >= null && uFontViewMod < this.w0().v()) {
             ListHolder value = this.w0().getValue();
             if (value != null) {
                List list = value.c();
                if (list != null) {
                   uod = list.get(this.g);
                label_0066 :
                   if (p0 >= 0 && p0 < this.w0().v()) {
                      value = this.w0().getValue();
                      if (value != null) {
                         list = value.c();
                         if (list != null) {
                            str1 = list.get(p0);
                         }
                      }
                   }
                   if (str1 == null) {
                      objArray = new Object[0];
                      a.D().w("FontBIZ", str+p0+" value is null", objArray);
                      return;
                   }else if(uod != null){
                      uod.q(0);
                      b.z(this.w0(), this.g, uod, null, 4, null);
                   }
                   this.g = p0;
                   str1.q(true);
                   b.z(this.w0(), p0, str1, null, 4, null);
                   return;
                }
             }
          }
          uod = str1;
          goto label_0066 ;
       }
    }
}
