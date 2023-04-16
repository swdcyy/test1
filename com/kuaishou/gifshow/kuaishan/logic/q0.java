package com.kuaishou.gifshow.kuaishan.logic.q0;
import io.reactivex.g;
import java.lang.String;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import brd.v;
import mca.a;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import q87.c;
import o56.c;
import o56.a;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.clipkit.mv.ClipTemplateServiceManager;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadService;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kwai.video.clipkit.mv.ExtraInterface;
import com.kwai.video.clipkit.mv.ConstructSparkParam;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.ArrayList;
import com.kuaishou.gifshow.kuaishan.logic.g1;
import java.util.List;
import x80.l1;
import erd.f;
import com.kwai.video.clipkit.mv.ClipSparkConstructListener;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import brd.g;

public final class q0 implements g	// class@001a6c
{
    public final String b;
    public final KSTemplateDetailInfo c;
    public final String d;
    public final boolean e;

    public void q0(String p0,KSTemplateDetailInfo p1,String p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void subscribe(v p0){
       q0 tb = this.b;
       q0 tc = this.c;
       q0 td = this.d;
       q0 te = this.e;
       a.u();
       Object[] objArray = null;
       if (e.F()) {
          m1 om1 = m1.w0();
          Objects.requireNonNull(om1);
          boolean b = true;
          if (!PatchProxy.applyVoid(objArray, om1, m1.class, "1")) {
             int i = 0;
             Object[] objArray1 = new Object[i];
             String str1 = "KuaiShanManager";
             e.D().w(str1, "registerTemplateSharedResDownloadService\(\) invoked", objArray1);
             if (a.a().c()) {
                Host host = d.a().c("zhongtai");
                if (host != null && !TextUtils.x(host.toString())) {
                   ClipTemplateServiceManager.getInstance().setSpecialMaterialZtHost(host.toString());
                }
             }
             if (om1.i != null) {
                Object[] objArray2 = new Object[i];
                e.D().w(str1, "registerTemplateSharedResDownloadService\(\) already registered", objArray2);
             }else {
                ClipTemplateServiceManager.getInstance().setDownloadService(om1.j);
                om1.i = b;
             }
          }
          ConstructSparkParam uConstructSp = e.b(tb, e.l(KSDownloadHelperX.l().j(b)), e.m(), tc.mTemplateGrade);
          String str = PatchProxy.apply(objArray, objArray, e.class, "34");
          if (str != PatchProxyResult.class) {
          }else {
             str = PostUtils.r("spark_shared_res").getAbsolutePath();
          }
          ArrayList uArrayList = new ArrayList();
          g1 og1 = new g1(uArrayList, tc, td, p0, tb);
          p0.setCancellable(new l1(uArrayList, te));
          ClipMvUtils.constructSparkAsync(uConstructSp, str, v10);
       }else {
          e.v(objArray, "tryInstallKuaiShanRequiredSo failed");
          p0.onError(new IllegalStateException("tryInstallKuaiShanRequiredSo failed"));
       }
       return;
    }
}
