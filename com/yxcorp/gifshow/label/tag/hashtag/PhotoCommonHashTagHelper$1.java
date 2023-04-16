package com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper$1;
import com.yxcorp.gifshow.util.ColorURLSpan;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.TagItem;
import java.lang.CharSequence;
import java.util.List;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import dkc.b;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import gw8.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import java.util.HashMap;
import java.util.Map;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper$a;

public class PhotoCommonHashTagHelper$1 extends ColorURLSpan	// class@001a08
{
    public final String v;
    public final String w;
    public final PhotoCommonHashTagHelper x;

    public void PhotoCommonHashTagHelper$1(PhotoCommonHashTagHelper p0,String p1,String p2,String p3,String p4){
       this.x = p0;
       this.v = p3;
       this.w = p4;
       super(p1, p2);
    }
    public void onClick(View p0){
       TagItem tagItem1;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoCommonHashTagHelper$1.class, str)) {
          return;
       }
       super.onClick(p0);
       PhotoCommonHashTagHelper$1 tv = this.v;
       TagItem tagItem = null;
       ClientContent$KsOrderInfoPackage ksOrderInfoP = null;
       if (this.x.c != null) {
          tagItem1 = new TagItem();
          tagItem1.mTag = PhotoCommonHashTagHelper.f((this.w).trim(), "");
          int i = this.x.c.indexOf(tagItem1);
          if (i != -1) {
             tagItem1 = this.x.c.get(i);
             tv = this.x.c.get(i).mTag;
             tagItem = tagItem1.mCount;
          }
       }else {
          tagItem1 = ksOrderInfoP;
       }
       if (this.x.f != null && !TextUtils.x(this.v)) {
          QPhoto qPhoto = new QPhoto(this.x.f);
          ClientContent$TagPackage tagPackage = b.m(tv, qPhoto);
          tagPackage.photoCount = (long)tagItem;
          CommonParams uCommonParam = b.e(this.x.f, "", TextUtils.I(tv), 2);
          ActivityInfo uActivityInf = a.a(tagPackage.name);
          if (uActivityInf != null && !TextUtils.x(uActivityInf.mKsOrderId)) {
             ksOrderInfoP = l0.a(uActivityInf.mKsOrderId);
          }
          ClientContent$KsOrderInfoPackage ksOrderInfoP1 = ksOrderInfoP;
          HashMap hashMap = new HashMap();
          hashMap.put("tag_area", "FEED_LEFT_CORNER");
          if (this.x.j == null) {
             str = "0";
          }
          hashMap.put("is_backgroud", str);
          b.t(qPhoto, "topic_tag", tagPackage, uCommonParam, ksOrderInfoP1, hashMap);
       }
       tv = this.x;
       PhotoCommonHashTagHelper k = tv.k;
       if (k != null) {
          k.a(p0, tagItem1, tv.f);
       }
       return;
    }
}
