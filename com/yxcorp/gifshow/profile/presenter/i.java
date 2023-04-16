package com.yxcorp.gifshow.profile.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import s1c.r0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import com.kuaishou.android.model.mix.CommonMeta;
import v2c.g;
import android.view.View;
import android.widget.TextView;
import cw9.e;
import com.yxcorp.gifshow.profile.presenter.h;
import java.lang.Runnable;
import t45.c;
import y8c.g;
import ekd.m1;
import com.yxcorp.gifshow.profile.adapter.g;
import v1c.m;

public class i extends PresenterV2	// class@00144d
{
    public QPhoto p;
    public r0 q;
    public m r;
    public i s;
    public ViewStub t;
    public View u;

    public void i(){
       super();
    }
    public void E8(){
       boolean b;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "4")) {
          this.t.setLayoutResource(R.layout.arg_RES_7f0d1200);
          if (this.q.d != null) {
             View obj = PatchProxy.apply(objArray, this, oi, "5");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                b = ProfileLastSeenUtil.b(this.q.d.mPhotoID, this.p, this.s);
                if (b) {
                   List list = KsLogProfileTag.PHOTO_LAST_SEEN.appendTag("ProfileLastSeePhotoPresenter");
                   StringBuilder str = "find last seen photoID: "+this.p.getPhotoId()+"  shareInfo: ";
                   String str1 = (this.p.getCommonMeta() == null)? "": this.p.getCommonMeta().mShareInfo;
                   g.e(list, str+str1);
                }
             }
             if (b) {
                obj = this.t.getTag();
                if (obj instanceof View) {
                   obj.setVisibility(0);
                }else {
                   obj = this.t.inflate();
                   this.t.setTag(obj);
                   obj.setVisibility(0);
                   TextView textView = obj.findViewById(R.id.textview);
                   if (!PatchProxy.applyVoidOneRefs(textView, this, oi, "6")) {
                      float f = e.c();
                      if (f - 0x3f800000) {
                         c.a(new h(f, textView));
                      }
                   }
                }
                this.u.setTag(R.id.viewtag, "1");
                this.r.n1("PROFILE_LAST_SEE_ID", this.p.getPhotoId());
             }
          }
          this.u.setTag(R.id.viewtag, "0");
          Object tag = this.t.getTag();
          if (tag instanceof View) {
             tag.setVisibility(8);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a32d3);
       this.u = m1.f(p0, 0x7f0a3108);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(r0.class);
       this.r = this.q8(g.class);
       this.s = this.r8("DETAIL_PAGE_LIST");
       return;
    }
}
