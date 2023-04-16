package com.kwai.live.gzone.competition.LiveGzoneCompetitionCalendarPopup$mDailyCompetitionViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import m47.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public final class LiveGzoneCompetitionCalendarPopup$mDailyCompetitionViewModel$2 extends Lambda implements a	// class@000cba
{
    public final FragmentActivity $activity;

    public void LiveGzoneCompetitionCalendarPopup$mDailyCompetitionViewModel$2(FragmentActivity p0){
       this.$activity = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneCompetitionCalendarPopup$mDailyCompetitionViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewModelProviders.of(this.$activity).get(b.class);
    }
}
