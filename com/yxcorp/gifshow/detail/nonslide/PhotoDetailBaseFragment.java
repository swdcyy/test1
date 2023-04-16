package com.yxcorp.gifshow.detail.nonslide.PhotoDetailBaseFragment;
import vy6.a;
import uw9.g;
import dd5.k;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.ArrayList;
import ed5.c;
import dd5.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.b;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.robust.PatchProxyResult;
import uw9.p3;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import x1a.a$a;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.kuaishou.android.model.mix.TubeMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentParam;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import x1a.a;
import java.util.Locale;
import java.lang.Integer;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import ed5.e;

public abstract class PhotoDetailBaseFragment extends BaseFragment implements a, g, k	// class@0015c8
{
    public final List j;
    public NormalDetailBizParam k;
    public PhotoDetailParam l;
    public View m;
    public boolean n;
    public boolean o;
    public final e p;

    public void PhotoDetailBaseFragment(){
       super();
       this.j = new ArrayList(30);
       this.p = new c();
    }
    public boolean D5(){
       return j.a(this);
    }
    public int M(){
       return 4;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailBaseFragment.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, PhotoDetailBaseFragment.class, "1") && (this.gh() && this.n == null)) {
          this.n = true;
          this.i2();
       }
    label_0029 :
       if (!PatchProxy.applyVoid(null, this, PhotoDetailBaseFragment.class, "3") && (this.gh() && this.o == null)) {
          this.o = true;
          this.k1();
       }
    label_0045 :
       return;
    }
    public void dh(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailBaseFragment.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, PhotoDetailBaseFragment.class, "2") && (this.gh() && this.n != null)) {
          this.n = false;
          this.F1();
       }
    label_0029 :
       if (!PatchProxy.applyVoid(null, this, PhotoDetailBaseFragment.class, "4") && (this.gh() && this.o != null)) {
          this.o = false;
          this.B0();
       }
    label_0045 :
       return;
    }
    public abstract b eh();
    public abstract PhotoDetailLogger fh();
    public int getPage(){
       return 7;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PhotoDetailBaseFragment obj = PatchProxy.apply(objArray, this, PhotoDetailBaseFragment.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.l;
       PhotoDetailBaseFragment tk = this.k;
       String str = PatchProxy.applyTwoRefs(obj, tk, objArray, p3.class, "2");
       if (str != patchProxyRe) {
       }else if(obj == null || tk == null){
          str = "";
       }else {
          a$a uoa = p3.a(obj);
          if (!PatchProxy.applyVoidThreeRefs(obj, tk, uoa, null, p3.class, "11") && tk.mReplaceFragmentParam != null) {
             PhotoDetailParam mPhoto = obj.mPhoto;
             if (mPhoto != null && (mPhoto.getTubeMeta() != null && mPhoto.getTubeMeta().mTubeEpisodeInfo != null)) {
                uoa.D = tk.mReplaceFragmentParam.mIsAutoPlay;
                uoa.E = mPhoto.getTubeMeta().mTubeEpisodeInfo.mEpisodeNumber + 1;
             }
          }
       label_0062 :
          str = uoa.a().toString();
       }
       return str;
    }
    public String getUrl(){
       PhotoDetailBaseFragment obj = PatchProxy.apply(null, this, PhotoDetailBaseFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj != null) {
          PhotoDetailParam mPhoto = obj.mPhoto;
          if (mPhoto != null) {
             Object[] objArray = new Object[]{mPhoto.getUserId(),this.l.mPhoto.getPhotoId(),Integer.valueOf(this.l.mPhoto.getType()),this.l.mPhoto.getExpTag()};
             return String.format(Locale.US, "ks://photo/%s/%s/%d/%s", objArray);
          }
       }
       return "ks://photo";
    }
    public abstract boolean gh();
    public abstract void hh();
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailBaseFragment.class, "10")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.getActivity() instanceof PhotoDetailActivity && this.k.mFromSlidePlayPhotoClick != null) {
          p0.U = true;
       }
       PhotoDetailBaseFragment tl = this.l;
       if (tl != null && tl.getDetailLogParam() != null) {
          this.l.getDetailLogParam().addPageUrlParam("detail_type", "NORMAL");
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailBaseFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       this.hh();
       return;
    }
    public e qe(){
       return this.p;
    }
}
