package com.kuaishou.live.report.LiveReportFragment$b;
import y8c.g;
import com.kuaishou.live.report.LiveReportFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kuaishou.live.report.LiveReportFragment$d;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import ml8.c;

public class LiveReportFragment$b extends g	// class@000f50
{
    public final LiveReportFragment w;

    public void LiveReportFragment$b(LiveReportFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       LiveReportFragment$b uob = LiveReportFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LiveReportFragment$b tw = this.w;
       return new f(a.i(p0, 0x7f0d0db2), new LiveReportFragment$d(tw, tw.getActivity()));
    }
}
