package a08.p$b;
import java.lang.Runnable;
import android.view.View;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import a08.p;
import l08.c;
import java.lang.Object;
import java.lang.String;
import n08.a;
import g08.a;
import java.util.Objects;
import com.kuaishou.merchant.actionreport.ActionReportManager;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import java.lang.CharSequence;
import zsd.u;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.actionreport.ActionReport$ActionType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kuaishou.merchant.actionreport.ActionReport;
import trd.t0;
import mv.d;
import com.kuaishou.bowl.event.utils.StageName;
import d08.b;
import c08.a;
import q08.c;
import f08.f;
import f08.f$a;

public final class p$b implements Runnable	// class@000016
{
    public final View b;
    public final PendantMountInfo c;
    public final p d;
    public final c e;

    public void p$b(View p0,PendantMountInfo p1,p p2,c p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       String str2;
       this.b.setTag(R.id.dynamic_pendant_view_pendantId, this.e.e());
       p a = this.d.a;
       Map map = null;
       boolean b = (a != null)? a.a(this.b, this.e.f().e()): false;
       if (b) {
          this.e.b();
          p$b te = this.e;
          p$b tc = this.c;
          Objects.requireNonNull(this.d);
          Map obj = null;
          if (te != null) {
             ActionReportManager b1 = ActionReportManager.b;
             String str = te.d();
             MaterialDataItem materialData = te.f().c();
             MaterialDataItem materialData1 = (materialData != null)? materialData.pendantCode: obj;
             PendantUtil$Companion a1 = PendantUtil.a;
             String str1 = te.e();
             String liveStreamId = (tc != null)? tc.getLiveStreamId(): obj;
             long materialId = (tc != null)? tc.getMaterialId(): 0;
             Objects.requireNonNull(a1);
             boolean b2 = (str1 == null || u.S1(str1))? true: false;
             if (!b2) {
                if (liveStreamId == null || u.S1(liveStreamId)) {
                   map = 1;
                }
                if (map == null) {
                   str2 = liveStreamId+'_'+materialId+'_';
                   if (str1.length() > str2.length()) {
                      str2 = str1.substring(str2.length());
                      a.o(str2, "\(this as java.lang.String\).substring\(startIndex\)");
                   label_00b7 :
                      ActionReport$ActionType sHOW = ActionReport$ActionType.SHOW;
                      Objects.requireNonNull(b1);
                      if (!PatchProxy.applyVoidFourRefs(str, materialData1, str2, sHOW, b1, ActionReportManager.class, "4")) {
                         ActionReport uActionRepor = b1.a().get(str);
                         if (uActionRepor != null) {
                            uActionRepor.a(materialData1, str2, sHOW);
                         }
                      }
                   }
                }
             }
          label_00b5 :
             str2 = "";
             goto label_00b7 ;
          }
       label_00db :
          p.b(this.d, this.e, "mount success", false, null, true, 12, null);
          map = t0.z();
          if (!PatchProxy.applyVoidOneRefs(map, obj, d.class, "15")) {
             obj = d.b();
             if (map != null) {
                obj.putAll(d.l(map));
             }
             d.m("DYNAMIC_MOUNT_VIEW_SUC", obj);
          }
          p$b te1 = this.e;
          c.b(StageName.pendant_mount_view_end, te1, te1.c().b(), this.e.c().e());
       }else {
          f$a.t(f.a, this.e.d(), this.e.e(), "mount failed", null, false, true, 24, null);
          d.g(this.e.c().d(), t0.z());
       }
       return;
    }
}
