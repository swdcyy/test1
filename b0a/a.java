package b0a.a;
import pm5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import nm5.e;
import com.kwai.feature.api.danmaku.model.DanmakuShowTypeConfig;
import nm5.m;
import tkd.b;
import tkd.d;
import im5.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class a extends c	// class@000343
{
    public QPhoto l;

    public void a(QPhoto p0){
       a.p(p0, "photo");
       super();
       this.l = p0;
       this.p(false);
       CommonMeta commonMeta = this.l.getCommonMeta();
       DanmakuInfo uDanmakuInfo = (commonMeta != null)? e.a(commonMeta): null;
       this.m(m.a(uDanmakuInfo));
       d.a(0x67df4ca).cI(this, this.l);
       if (m.g(this.a())) {
          this.r(true);
       }
       return;
    }
    public boolean j(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "params");
       int i = 1;
       if (p0 instanceof a) {
          a uoa = p0;
          if ((a.g(this.l.getDisclaimerMessage(), uoa.l.getDisclaimerMessage()) ^ i) || (this.l.isHdr() == uoa.l.isHdr() && !(a.g(this.a(), p0.a()) ^ i))) {
             i = false;
          }
       }
       return i;
    }
}
