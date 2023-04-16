package k6a.v;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserCoverMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import android.content.Context;
import java.lang.StringBuffer;
import android.net.Uri;
import java.lang.Exception;
import y8c.d;
import k6a.u;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.google.common.collect.ImmutableMap$b;
import zk.g;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.gifshow.log.model.CommonParams;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public final class v implements View$OnClickListener	// class@002c03
{
    public final m$a b;

    public void v(m$a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       v b = this.b;
       m$a p = b.p;
       UserCoverMeta mPhotoID = p.mCoverMeta.mPhotoID;
       User mId = p.mId;
       if (PatchProxy.applyVoidTwoRefsWithListener(mPhotoID, mId, b, m$a.class, "5")) {
       }else if(b.A != null && !TextUtils.x(mPhotoID)){
          if (b.getActivity() == null) {
             PatchProxy.onMethodExit(m$a.class, "5");
          }else {
             PhotoDetailParam photoDetailP = null;
             Intent intent = new Intent(b.getActivity(), PhotoDetailActivity.y3(photoDetailP));
             StringBuffer str = "kwai://work/"+mPhotoID;
             if (!TextUtils.x(mId)) {
                str = str+"?userId="+mId;
             }
             try{
                intent.setData(Uri.parse(str));
                intent.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100e5);
                if (b.getActivity() != null) {
                   b.getActivity().startActivityForResult(intent, 1025);
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
             p = b.p;
             int i = b.q.get();
             if (!PatchProxy.isSupport2(u.class, "7") || !PatchProxy.applyVoidTwoRefsWithListener(p, Integer.valueOf(i), photoDetailP, u.class, "7")) {
                if (p == null || ("empty").equals(p.mId)) {
                   PatchProxy.onMethodExit(u.class, "7");
                }else {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "ACQUAINTANCE_PHOTO_CARD";
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
                   uContentPack.photoPackage = photoPackage;
                   photoPackage.type = 1;
                   User mCoverMeta = p.mCoverMeta;
                   if (mCoverMeta != null) {
                      photoPackage.identity = mCoverMeta.mPhotoID;
                      if (!TextUtils.x(mCoverMeta.mExpTag)) {
                         uContentPack.photoPackage.expTag = p.mCoverMeta.mExpTag;
                      }
                      uContentPack.photoPackage.index = (long)i;
                   }
                   ClientContent$ContentPackage photoPackage1 = uContentPack.photoPackage;
                   photoPackage1.llsid = p.mLlsid;
                   photoPackage1.sAuthorId = p.mId;
                   ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                   uClickEvent.direction = 0;
                   uClickEvent.type = 1;
                   uClickEvent.elementPackage = uElementPack;
                   uClickEvent.contentPackage = uContentPack;
                   ImmutableMap$b uob = new ImmutableMap$b();
                   uob.c("element_action", new g("ACQUAINTANCE_PHOTO_CARD"));
                   uob.c("page_name", new g("FEATURED_PAGE"));
                   CommonParams uCommonParam = new CommonParams();
                   uCommonParam.mEntryTag = uob.a();
                   b.a(0x4b316083).Y("", uClickEvent, null, false, null, uCommonParam, null);
                   PatchProxy.onMethodExit(u.class, "7");
                }
             }
          }
       }
       PatchProxy.onMethodExit(m$a.class, "5");
       return;
    }
}
