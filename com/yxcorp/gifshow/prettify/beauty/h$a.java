package com.yxcorp.gifshow.prettify.beauty.h$a;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.util.List;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;

public class h$a implements Cloneable	// class@001109
{
    public int b;
    public boolean c;
    public boolean d;
    public CameraPageType e;
    public BeautifyConfig f;
    public List g;
    public List h;
    public List i;
    public List j;
    public List k;
    public List l;
    public List m;

    public void h$a(){
       super();
    }
    public h$a a(){
       h$a obj = PatchProxy.apply(null, this, h$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          ArrayList uArrayList = new ArrayList();
          h$a tg = this.g;
          if (tg != null) {
             uArrayList.addAll(tg);
          }
          obj.g = uArrayList;
          uArrayList = new ArrayList();
          tg = this.h;
          if (tg != null) {
             uArrayList.addAll(tg);
          }
          obj.h = uArrayList;
          uArrayList = new ArrayList();
          tg = this.i;
          if (tg != null) {
             uArrayList.addAll(tg);
          }
          obj.i = uArrayList;
          uArrayList = new ArrayList();
          tg = this.j;
          if (tg != null) {
             uArrayList.addAll(tg);
          }
          obj.j = uArrayList;
          uArrayList = new ArrayList();
          tg = this.k;
          if (tg != null) {
             uArrayList.addAll(tg);
          }
          obj.k = uArrayList;
          uArrayList = new ArrayList();
          tg = this.l;
          if (tg != null) {
             uArrayList.addAll(tg);
          }
          obj.l = uArrayList;
          uArrayList = new ArrayList();
          tg = this.m;
          if (tg != null) {
             uArrayList.addAll(tg);
          }
          obj.m = uArrayList;
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public h$a b(BeautifyConfig p0){
       this.f = p0;
       return this;
    }
    public h$a c(int p0){
       this.b = p0;
       return this;
    }
    public Object clone(){
       return this.a();
    }
    public h$a d(FilterConfig p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = new ArrayList();
          this.g = obj;
          obj.add(p0);
       }
       return this;
    }
    public h$a e(MagicEmoji$MagicFace p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = new ArrayList();
          this.i = obj;
          obj.add(p0);
       }
       return this;
    }
    public h$a f(List p0){
       this.i = p0;
       return this;
    }
    public h$a g(a p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = new ArrayList();
          this.h = obj;
          obj.add(p0);
       }
       return this;
    }
    public h$a h(CameraPageType p0){
       this.e = p0;
       return this;
    }
    public h$a i(boolean p0){
       this.c = p0;
       return this;
    }
    public h$a j(List p0){
       this.j = p0;
       return this;
    }
    public h$a k(boolean p0){
       this.d = p0;
       return this;
    }
}
