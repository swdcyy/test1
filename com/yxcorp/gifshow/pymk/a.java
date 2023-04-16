package com.yxcorp.gifshow.pymk.a;
import io.reactivex.i;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Object;
import brd.c0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.pymk.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.a0;
import com.kwai.framework.model.user.RichTextMeta;
import java.util.Iterator;
import java.util.List;
import com.kwai.framework.model.user.RichTextMeta$Param;
import com.yxcorp.gifshow.helper.d;
import wkd.b;
import sca.e;
import com.kwai.framework.model.user.QUserContactName;
import brd.t;
import com.yxcorp.gifshow.helper.b;
import erd.r;
import x6c.m;
import erd.g;
import crd.b;

public final class a implements i	// class@0016ae
{
    public final UserExtraInfo a;
    public final int b;

    public void a(UserExtraInfo p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(c0 p0){
       a ta = this.a;
       a tb = this.b;
       UserExtraInfo mRecoTextInf = ta.mRecoTextInfo;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       RichTextMeta$Param obj1 = PatchProxy.applyOneRefs(mRecoTextInf, obj, b.class, "10");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else {
          RichTextMeta mParamList = mRecoTextInf.mParamList;
          if (mParamList != null) {
             Iterator iterator = mParamList.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next().mContactName;
                if (obj1 != null) {
                   a0 uoa0 = PatchProxy.applyOneRefs(obj1, obj, d.class, "1");
                   if (uoa0 != patchProxyRe) {
                   }else {
                      uoa0 = b.a(0x5419c6da).b(obj1).filter(b.b).first("");
                   }
                   obj = uoa0;
                   break ;
                }
             }
          }
       }
       if (obj != null) {
          obj.Q(new m(ta, p0, tb));
       }else {
          b.i(ta, p0, tb);
       }
       return;
    }
}
