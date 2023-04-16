package com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import msd.a;
import java.util.List;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.graphics.Typeface;
import ekd.d0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import jp.a;
import com.kwai.framework.model.feed.BaseFeed;
import wb5.h;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$a$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.log.c0;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import qrd.l1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;
import android.view.View;
import com.yxcorp.gifshow.share.module.SimilarPhotoResponse;

public final class GuideShareMoreDialog$a	// class@001d02
{

    public void GuideShareMoreDialog$a(){
       super();
    }
    public void GuideShareMoreDialog$a(u p0){
       super();
    }
    public final void a(GifshowActivity p0,a p1,List p2,int p3,String p4,KwaiImageView p5,TextView p6){
       object oobject = p4;
       object oobject1 = p5;
       object oobject2 = p6;
       int i = 0;
       if (PatchProxy.isSupport2(GuideShareMoreDialog$a.class, "2")) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),oobject,oobject1,oobject2};
          if (PatchProxy.applyVoid(objArray, this, GuideShareMoreDialog$a.class, "2")) {
             return;
          }
       }
       if (p2.size() > p3) {
          oobject2.setTypeface(d0.c());
          PhotoMeta photoMeta = p2.get(p3).getPhotoMeta();
          if (photoMeta != null) {
             i = photoMeta.getLikeCount();
          }
          oobject2.setText(TextUtils.N((long)i));
          h.a(oobject1, p2.get(p3).mEntity, a.d);
          GuideShareMoreDialog$a$a uoa$a = new GuideShareMoreDialog$a$a(p0, p2, p3, p4, p1);
          oobject1.setOnClickListener(v12);
          c0.q().k(p2.get(p3).mEntity);
          QPhoto mEntity = p2.get(p3).mEntity;
          a.o(mEntity, "photos[index].mEntity");
          if (!PatchProxy.applyVoidTwoRefs(mEntity, oobject, this, GuideShareMoreDialog$a.class, "3")) {
             ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
             uAreaPackage.name = oobject;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHOW_PHOTO";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(mEntity);
             u1.B0(new ShowMetaData().setAreaPackage(uAreaPackage).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(r1.O0(mEntity)));
          }
       }
       PatchProxy.onMethodExit(GuideShareMoreDialog$a.class, "2");
       return;
    }
    public final void b(View p0,SimilarPhotoResponse p1,GifshowActivity p2,String p3,a p4){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       if (PatchProxy.isSupport2(GuideShareMoreDialog$a.class, "1")) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, this, GuideShareMoreDialog$a.class, "1")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "root");
       a.p(oobject1, "photos");
       a.p(oobject2, "activity");
       a.p(oobject3, "area");
       a.p(oobject4, "dismissAction");
       SimilarPhotoResponse mPhotos = oobject1.mPhotos;
       a.o(mPhotos, "photos.mPhotos");
       View view = oobject.findViewById(R.id.iv_pic_1);
       a.o(view, "root.findViewById\(R.id.iv_pic_1\)");
       View view1 = view;
       view = oobject.findViewById(R.id.tv_count_1);
       a.o(view, "root.findViewById\(R.id.tv_count_1\)");
       View view2 = view;
       a uoa = p4;
       String str = p3;
       String str1 = "photos.mPhotos";
       this.a(p2, uoa, mPhotos, 0, str, view1, view2);
       mPhotos = oobject1.mPhotos;
       a.o(mPhotos, str1);
       view = oobject.findViewById(R.id.iv_pic_2);
       a.o(view, "root.findViewById\(R.id.iv_pic_2\)");
       view1 = view;
       view = oobject.findViewById(R.id.tv_count_2);
       a.o(view, "root.findViewById\(R.id.tv_count_2\)");
       View view3 = view;
       this.a(p2, uoa, mPhotos, 1, str, view1, view3);
       SimilarPhotoResponse mPhotos1 = oobject1.mPhotos;
       a.o(mPhotos1, str1);
       View view4 = oobject.findViewById(R.id.iv_pic_3);
       a.o(view4, "root.findViewById\(R.id.iv_pic_3\)");
       View view5 = view4;
       View view6 = oobject.findViewById(R.id.tv_count_3);
       a.o(view6, "root.findViewById\(R.id.tv_count_3\)");
       View view7 = view6;
       this.a(p2, p4, mPhotos1, 2, p3, view5, view7);
       PatchProxy.onMethodExit(GuideShareMoreDialog$a.class, "1");
       return;
    }
}
