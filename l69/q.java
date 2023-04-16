package l69.q;
import erd.o;
import l69.o;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import com.yxcorp.gifshow.aicut.logic.AICutGeneratorException;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import h69.g;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Workspace$Type;
import u80.d;
import tkd.b;
import tkd.d;
import u80.h;
import com.kuaishou.gifshow.kuaishan.KSSource;
import brd.t;
import h69.j;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import qr4.i;
import qr4.m$k0;
import com.kuaishou.edit.draft.Workspace$Source;
import h69.h;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import java.util.Objects;
import android.content.Intent;
import zv9.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import voc.m;
import eba.a;
import haa.a;
import java.util.ArrayList;
import java.util.List;
import lnc.j5;
import lq.i;

public final class q implements o	// class@002ca8
{
    public final o b;
    public final VideoContext c;

    public void q(o p0,VideoContext p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, q.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          VideoTemplate videoTemplat = this.b.b().J0();
          if (videoTemplat == null) {
             videoTemplat = this.b.b().H0();
          }
          if (!this.b.b() instanceof AICutAnnualMemoryProject || !a.g(videoTemplat.getId(), "-1")) {
             boolean b = true;
             if (videoTemplat.getType() == b) {
                Object[] objArray = new Object[0];
                g.D().w("KwaiAICutProject", "createNewDraft TYPE_FLASH", objArray);
                Workspace$b uob = p0.k();
                uob.t(Workspace$Type.KUAISHAN);
                a.o(uob, "it.ensureFirstBuilder\(\).бн\(Workspace.Type.KUAISHAN\)");
                uob.u(this.b.d());
                d uod = this.b.b().I0();
                if (uod != null) {
                   d.a(-711186681).pw(p0, uod, KSSource.AI_CUT);
                }
             }
             this.b.o(p0, videoTemplat, 0, b);
             String str = this.b.b().K0();
             if (str != null) {
                o b1 = this.b.b;
                a.m(b1);
                j.d.s(b1, str, b);
             }
             this.b.n(this.c);
             if (DraftUtils.S(p0)) {
                this.c.f0();
                this.c.F().b.I0 = 16;
             }
             this.b.p(p0);
             if (this.b.b() instanceof AICutAnnualMemoryProject) {
                if (this.b.e() != Workspace$Source.ANNUAL_ALBUM_2022) {
                   b = false;
                }
                d.a(-1595266550).A7(p0, b, videoTemplat.getAiCutStyle().mCoverFrameTime, this.b.c());
             }
             q tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p0, tb, o.class, "26")) {
                String str1 = a.c(null);
                if (!TextUtils.x(str1)) {
                   Object[] objArray1 = new Object[0];
                   g.D().w("KwaiAICutProject", "addTagStickerIfNeed, text = "+str1, objArray1);
                   d.a(0x27ab2faf).Mc(false, a.q(p0), str1, new ArrayList(), true);
                }
             }
             j5.a(p0);
             if (i.h()) {
                q tb1 = this.b;
                i.m().d(tb1.b, tb1.c());
                ot = t.just(p0);
             }else {
                throw new AICutGeneratorException(AICutErrorCode.APPLY_TEMPLATE_FAILED);
             }
          }else {
             throw new AICutGeneratorException(AICutErrorCode.APPLY_TEMPLATE_FAILED);
          }
       }
       return ot;
    }
}
