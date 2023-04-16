package com.yxcorp.gifshow.detail.slidev2.presenter.feature.c;
import erd.b;
import androidx.lifecycle.ViewModel;
import androidx.collection.LruCache;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.Objects;
import android.content.res.Resources;
import android.content.Context;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Collection;
import ekd.q;
import e8a.e;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.entity.QPhoto;
import e8a.d;
import e0a.j;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;

public class c extends ViewModel implements b	// class@00193d
{
    public final LruCache b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public void c(){
       super();
       this.b = new LruCache(20);
    }
    public static c o0(FragmentActivity p0){
       c uoc = c.class;
       c obj = PatchProxy.applyOneRefs(p0, null, uoc, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ViewModelProviders.of(p0).get(uoc);
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, uoc, "2") && obj.f == null) {
          obj.f = true;
          int color = p0.getResources().getColor(R.color.arg_RES_7f061c32);
          obj.d = color;
          obj.c = color;
          obj.e = p0.getResources().getColor(0x7f061bf1);
       }
       return obj;
    }
    public void accept(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
       }else if(p0 == null || q.f(p0.getItems())){
          if (p1.booleanValue()) {
             this.b.evictAll();
          }
          c.a(new e(this, p0));
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       super.onCleared();
       this.b.evictAll();
       this.f = false;
       return;
    }
    public d p0(QPhoto p0,boolean p1){
       d obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p1) {
          d uod = new d(p0, this.d, this.e, this.c, Boolean.FALSE, j.g());
          return p1;
       }else {
          d uod1 = this.b.get(p0.getPhotoId());
          if (uod1 == null) {
             obj = new d(p0, this.d, this.e, this.c, Boolean.FALSE, j.g());
             this.b.put(p0.getPhotoId(), uod1);
             Object[] objArray = new Object[0];
             o.C().w("FeatureCaptionManager", "instance--photoId = "+p0.getPhotoId()+" caption: "+p0.getCaption(), objArray);
          }
          return uod1;
       }
    }
}
