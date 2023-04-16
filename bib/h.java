package bib.h;
import com.kwai.camerasdk.stats.StatsListener;
import bib.k;
import java.lang.Object;
import java.lang.String;
import com.kwai.camerasdk.models.PreviewStats;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import com.kwai.camerasdk.models.SessionStats;

public class h implements StatsListener	// class@0003d6
{
    public final k a;

    public void h(k p0){
       this.a = p0;
       super();
    }
    public void OnPipelineInfo(String p0){
    }
    public void onDebugInfo(String p0){
    }
    public void onPreviewStats(PreviewStats p0){
    }
    public void onReportJsonStats(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       u1.R("DaenerysStats", p0, 13);
       return;
    }
    public void onSessionSegmentStats(SessionStats p0){
    }
}
