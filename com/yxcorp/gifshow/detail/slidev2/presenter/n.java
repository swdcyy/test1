package com.yxcorp.gifshow.detail.slidev2.presenter.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.n$a;
import b8a.x0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import xe5.d;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import vy6.a;
import java.util.List;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import uw9.o;
import q87.c;
import xe5.r;
import le5.f;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;
import java.lang.Boolean;
import kp.r1;
import xe5.r$c;
import ekd.i;
import java.util.HashMap;
import java.util.Map;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class n extends PresenterV2	// class@0019c9
{
    public f p;
    public BaseFragment q;
    public QPhoto r;
    public List s;
    public PhotoDetailParam t;
    public SlidePlayViewModel u;
    public r v;
    public final a w;
    public final e x;
    public static String y;
    public static String z;

    public void n(){
       super();
       this.w = new n$a(this);
       this.x = new x0(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "2")) {
          return;
       }
       this.u = SlidePlayViewModel.B0(this.q.getParentFragment());
       String str = "unknown";
       if (TextUtils.x(n.y) || str.equals(n.y)) {
          int width = this.m8().getWidth();
          int height = this.m8().getHeight();
          d uod = d.class;
          if (PatchProxy.isSupport(uod)) {
             Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(width), Integer.valueOf(height), objArray, uod, "3");
             if (obj != PatchProxyResult.class) {
                str = obj;
             }else if(!width){
                str = ((float)height / (((float)width * 0x3f800000) / 9.00f))+":9";
             }
          }else {
             goto label_005a ;
          }
          n.y = str;
       }
       n.z = "SOLID";
       this.u.P(this.q, this.w);
       this.s.add(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       this.u.D(this.q, this.w);
       this.s.remove(this.x);
       return;
    }
    public void P8(){
       int i;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "4")) {
          return;
       }
       n tv = this.v;
       if (tv == null) {
          return;
       }
       PhotoDetailLogger photoDetailL = this.p.get();
       if (photoDetailL == null) {
          return;
       }
       Object[] objArray1 = new Object[0];
       o.C().w("AdapterLoggerPresenter", "initLoggerParams: ....", objArray1);
       r r = tv.R;
       boolean b = f.u();
       r obj = PatchProxy.applyOneRefs(tv, this, on, "5");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          obj = tv.a;
          if (obj != null) {
             QPhoto mEntity = obj.mEntity;
             if (mEntity != null && mEntity.a(PhotoMeta.class) != null) {
                i = tv.a.mEntity.a(PhotoMeta.class).mFrameStyle;
             }
          }
          i = 0;
       }
       r t = tv.t;
       boolean b1 = true;
       if (t != null) {
          String str = null;
          if (t.mWidthRatio - str > 0 && t.mHeightRatio - str > 0) {
             b2 = true;
          label_0079 :
             HashMap obj1 = PatchProxy.applyOneRefs(tv, objArray, d.class, "2");
             boolean b3 = (obj1 != patchProxyRe)? obj1.booleanValue(): r1.h2(tv.a);
             if (b3 || r.c == null) {
                b1 = false;
             }
             b3 = i.c();
             photoDetailL.setFullScreenPhone(b);
             photoDetailL.setBlackMatrix(i);
             photoDetailL.setSubtitles(b2);
             photoDetailL.setCutShape(r.b);
             photoDetailL.setTakeUpTotally(b1);
             photoDetailL.setImmerseStyle(b3);
             Object[] objArray2 = new Object[0];
             o.C().w("AdapterLoggerPresenter", "initLoggerParams: ....isFullScreen:"+b, objArray2);
             objArray2 = new Object[0];
             o.C().w("AdapterLoggerPresenter", "initLoggerParams: ....result.mHasCroped:"+r.b, objArray2);
             objArray2 = new Object[0];
             o.C().w("AdapterLoggerPresenter", "initLoggerParams: ....takeUpTotally:"+b1, objArray2);
             objArray2 = new Object[0];
             o.C().w("AdapterLoggerPresenter", "initLoggerParams: ....sBottombarType:"+n.z, objArray2);
             if (!TextUtils.x(n.y) && !("unknown").equals(n.y)) {
                photoDetailL.setScreenScale(n.y);
             }
             if (!TextUtils.x(n.z)) {
                photoDetailL.setBottombarType(n.z);
             }
             String str1 = "clip_percentage";
             String str2 = "clip_type";
             if (!TextUtils.x(r.d)) {
                this.p.get().addUrlParamKeyVal(str2, r.d).addUrlParamKeyVal(str1, String.valueOf(r.e));
             }
             if (!this.r.isLongPhotos() && !this.r.isAtlasPhotos()) {
                obj1 = new HashMap();
                if (!TextUtils.x(r.d)) {
                   obj1.put(str2, TextUtils.k(r.d));
                   obj1.put(str1, String.valueOf(r.e));
                }
                obj1.put("full_screen_phone", String.valueOf(b));
                obj1.put("black_matrix", String.valueOf(i));
                obj1.put("subtitles", String.valueOf(b2));
                obj1.put("cut_shape", String.valueOf(r.b));
                obj1.put("take_up_totally", String.valueOf(b1));
                obj1.put("immerse_style", String.valueOf(b3));
                obj1.put("screen_scale", String.valueOf(n.y));
                obj1.put("bottom_type", String.valueOf(n.z));
                if (!TextUtils.x(r.f)) {
                   obj1.put("hit_ladder", String.valueOf(r.f));
                   photoDetailL.setHitLadder(String.valueOf(r.f));
                }
                obj1.put("screen_play_scale", String.valueOf(r.h));
                obj1.put("photo_original_scale", String.valueOf(r.g));
                if (!TextUtils.x(r.i)) {
                   obj1.put("subtitle_clip_type", String.valueOf(r.i));
                }
                Object[] objArray3 = new Object[0];
                o.C().w("AdapterLoggerPresenter", "initLoggerParams: ....hit_ladder:"+r.f, objArray3);
                objArray3 = new Object[0];
                o.C().w("AdapterLoggerPresenter", "initLoggerParams: ....subtitle_clip_type:"+r.i, objArray3);
                photoDetailL.getAdapterParams().putAll(obj1);
             }
             return;
          }
       }
       b2 = false;
       goto label_0079 ;
    }
    public void R8(r p0){
       this.v = p0;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.t = this.q8(PhotoDetailParam.class);
       this.p = this.x8("DETAIL_LOGGER");
       this.q = this.r8("DETAIL_FRAGMENT");
       this.s = this.r8("SLIDE_PLAY_SIZE_CHANGED_LIST");
       return;
    }
}
