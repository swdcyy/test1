package com.kuaishou.gifshow.kuaishan.logic.f;
import erd.o;
import java.lang.String;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.io.File;
import elb.h0;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.model.FileMd5Info;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.a0;
import u80.e;
import w46.b;
import java.lang.StringBuilder;
import q87.c;

public final class f implements o	// class@001a0e
{
    public final String b;
    public final KSTemplateDetailInfo c;

    public void f(String p0,KSTemplateDetailInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       boolean b1;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (uBoolean != patchProxyRe) {
       }else {
          a.p(p0, "it");
          boolean b = true;
          int i = 0;
          if (h0.a(new File(this.b), p0)) {
             File uFile = new File(this.b);
             FileMd5Info obj = PatchProxy.applyTwoRefs(uFile, p0, null, e.class, "46");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(q.f(p0)){
                Iterator iterator = p0.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj = iterator.next();
                      if (!TextUtils.x(obj.mMd5) && !TextUtils.n(obj.mMd5, a0.b(new File(uFile, obj.mFileName)))) {
                         objArray = new Object[i];
                         e.D().t("KSUtil", "checkResourceValid fail", objArray);
                         b1 = false;
                         break ;
                      }
                   }
                }
             }
             b1 = true;
             if (b1) {
             label_0087 :
                objArray = new Object[i];
                e.D().w("KS_Hodor", "verifyTemplate: "+this.c.getUniqueIdentifier()+" is valid="+b+' '+"checklist="+p0.size(), objArray);
                uBoolean = Boolean.valueOf(b);
             }
          }
          b = false;
          goto label_0087 ;
       }
       return uBoolean;
    }
}
