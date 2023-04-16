package com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.a;
import erd.o;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Object;
import pr3.d;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaishanSegmentVideoEditFragment;
import com.yxcorp.gifshow.upload.AuditFrameSwitch;
import java.lang.String;
import com.yxcorp.gifshow.encode.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.AuditFrameUploadParam;
import java.lang.reflect.Type;
import t45.d;
import brd.z;
import grc.k;

public final class a implements o	// class@00101c
{
    public final QMedia b;

    public void a(QMedia p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       if (p0.b() && (p0.c != null && AuditFrameSwitch.getSwitch().mKuaiShanEnabled != null)) {
          d c = p0.c;
          t ot = PatchProxy.applyOneRefs(c, null, k1.class, "3");
          if (ot != PatchProxyResult.class) {
          }else {
             AuditFrameUploadParam value = a.t().getValue("rawFrameUploadParam2", AuditFrameUploadParam.class, new AuditFrameUploadParam());
             ot = k1.b(c, value.mMaxCount, value.mFlashFrameInterval, value.mShortSideLength);
          }
          p0 = ot.takeLast(1).observeOn(d.a).map(new k(tb, p0));
       }else {
          p0 = t.just(p0);
       }
       return p0;
    }
}
