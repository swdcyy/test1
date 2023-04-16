package com.kwai.component.photo.detail.slide.DetailSlidePlayFragment;
import dd5.k;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFragment;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Collection;
import ed5.a;
import dd5.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import dd5.m;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import java.util.List;
import zv6.t;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import dd5.p;
import dd5.b$b;
import dd5.b;
import hd5.d;
import ed5.e;
import dw6.b;

public abstract class DetailSlidePlayFragment extends SlidePlayFragment implements k	// class@000a40
{
    public PhotoDetailParam t;
    public final List u;
    public SlidePlayViewModel v;
    public m w;
    public final e x;
    public int y;
    public int z;

    public void DetailSlidePlayFragment(){
       super();
       this.u = new CopyOnWriteArrayList(new ArrayList(30));
       this.x = new a();
    }
    public boolean D5(){
       return j.a(this);
    }
    public boolean gh(){
       DetailSlidePlayFragment obj = PatchProxy.apply(null, this, DetailSlidePlayFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = (obj != null && obj.enableSlidePlay())? true: false;
       return b;
    }
    public boolean hh(){
       DetailSlidePlayFragment obj = PatchProxy.apply(null, this, DetailSlidePlayFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = (obj != null && obj.isThanos())? true: false;
       return b;
    }
    public void ih(){
       if (PatchProxy.applyVoid(null, this, DetailSlidePlayFragment.class, "7")) {
          return;
       }
       super.ih();
       if (this.y > 1) {
          this.w.c();
       }
       return;
    }
    public void jh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DetailSlidePlayFragment.class, "6")) {
          return;
       }
       DetailSlidePlayFragment tv = this.v;
       boolean b = false;
       int i = (tv != null)? tv.e1(): 0;
       this.y = i;
       StringBuilder str = "mSlidePlayViewModel is null:";
       if (this.v == null) {
          b = true;
       }
       Log.g("DetailSlidePlayFragment", str+b+", mViewPagerChildCount = "+this.y);
       if (this.y > 1) {
          this.z = this.z + 1;
          this.w.o();
          tv = this.w;
          HashMap hashMap = PatchProxy.apply(objArray, this, DetailSlidePlayFragment.class, "8");
          if (hashMap != PatchProxyResult.class) {
          }else {
             hashMap = new HashMap();
             DetailSlidePlayFragment tt = this.t;
             if (tt != null) {
                hashMap.put("bizType", String.valueOf(tt.getBizType()));
                PhotoDetailParam mPhoto = this.t.mPhoto;
                if (mPhoto != null) {
                   hashMap.put("photoType", String.valueOf(mPhoto.getType()));
                   hashMap.put("photoId", String.valueOf(this.t.mPhoto.getPhotoId()));
                }
             }
             hashMap.put("useCount", String.valueOf(this.z));
             hashMap.put("page", this.o());
          }
          tv.b(hashMap);
          this.w.q("becomesAttachedOnPageSelected");
       }
       super.jh();
       if (this.y > 1) {
          this.w.e("becomesAttachedOnPageSelected");
       }
       return;
    }
    public int mh(){
       return this.p;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailSlidePlayFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       this.u.clear();
       DetailSlidePlayFragment tv = this.v;
       if (tv != null) {
          tv.t1().d(this);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailSlidePlayFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.v = SlidePlayViewModel.S0(this.getParentFragment());
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       m obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DetailSlidePlayFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p.b(this.getParentFragment());
       this.w = obj;
       b$b uob = new b$b();
       uob.b(false);
       obj.j(uob.a(), this);
       this.x.b().start();
       if (!PatchProxy.applyVoid(null, this, DetailSlidePlayFragment.class, "3") && (this.getArguments() != null && this.s != null)) {
          this.t = b.j(this.getArguments()).d("KEY_PHOTO_DETAIL_PARAM");
       }
    label_005e :
       return super.onCreateView(p0, p1, p2);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DetailSlidePlayFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.x.b().a();
       return;
    }
    public e qe(){
       return this.x;
    }
}
