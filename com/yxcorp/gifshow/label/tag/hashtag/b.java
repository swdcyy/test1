package com.yxcorp.gifshow.label.tag.hashtag.b;
import com.yxcorp.gifshow.label.tag.hashtag.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import gya.h;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import dkc.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.android.model.mix.TagItem;
import com.yxcorp.gifshow.rich.RichTextTagUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class b implements a$a	// class@001a10
{
    public QPhoto a;
    public int b;

    public void b(QPhoto p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(h p0,View p1,String p2,String p3,String p4){
       ClientContent$TagPackage tagPackage;
       b ta;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       ActivityInfo uActivityInf = p0.a(p2);
       if (uActivityInf != null) {
          tagPackage = b.k(uActivityInf, this.a);
          ta = this.a;
          b.s(ta, "topic_tag", tagPackage, b.e(ta.mEntity, tagPackage.identity, tagPackage.name, tagPackage.type), l0.a(uActivityInf.mKsOrderId), this.b());
       }else {
          TagItem tagItem = p0.c(p2);
          if (tagItem != null) {
             tagPackage = b.i(tagItem, this.a);
             ta = this.a;
             b.s(ta, "topic_tag", tagPackage, b.e(ta.mEntity, tagPackage.identity, tagPackage.name, tagPackage.type), l0.d(tagItem.mKsOrderId), this.b());
          }else {
             TagItem tagItem1 = p0.b(p2);
             if (tagItem1 != null) {
                tagPackage = b.i(tagItem1, this.a);
                ta = this.a;
                b.s(ta, "topic_tag", tagPackage, b.e(ta.mEntity, tagPackage.identity, tagPackage.name, tagPackage.type), l0.d(tagItem1.mKsOrderId), this.b());
             }else {
                tagPackage = b.m(p2, this.a);
                ta = this.a;
                b.s(ta, "topic_tag", tagPackage, b.e(ta.mEntity, tagPackage.identity, tagPackage.name, tagPackage.type), null, this.b());
             }
          }
       }
       String str = RichTextTagUtil.a(p2);
       if (!TextUtils.x(str)) {
          u1.u(3, l0.c(""), l0.b(str));
       }
       return;
    }
    public String b(){
       return null;
    }
}
