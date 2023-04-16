package g22.h;
import vq5.b;
import com.kuaishou.live.core.show.activitydialog.d;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.DialogFragment;
import z12.x;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.x0;
import fg6.a;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialogUrlData;
import com.google.gson.Gson;
import java.lang.Throwable;
import rp5.a;
import lp3.c;
import lp3.e;
import androidx.fragment.app.c;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialog;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialogUrlData$ActivityTabData;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;

public final class h implements b	// class@002a4a
{
    public final d a;

    public void h(d p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       int i;
       LiveActivityBottomDialogUrlData liveActivity;
       LiveActivityBottomDialog liveActivity1;
       h ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, d.class, "5")) {
       }else {
          String str = "LiveActivityDialogPresenter";
          if (x.s(ta.t)) {
             b.P(LiveLogTag.LIVE_ACTIVITY_DIALOG.appendTag(str), "showActivityBottomDialog, isDialogShowing");
          }else {
             String str1 = x0.b(p0, "data", "");
             try{
                i = 0;
                liveActivity = a.a.h(str1, LiveActivityBottomDialogUrlData.class);
             }catch(java.lang.Exception e11){
                LiveLogTag lIVE_ACTIVIT = LiveLogTag.LIVE_ACTIVITY_DIALOG;
                lIVE_ACTIVIT.appendTag(str);
                LiveLogTag liveLogTag = lIVE_ACTIVIT;
                b.y(liveLogTag, "fromJson error", e11);
                liveActivity = i;
             }
             c childFragmen = ta.p.a(a.class).getChildFragmentManager();
             d p = ta.p;
             d s = ta.s;
             d q = ta.q;
             d r = ta.r;
             if (PatchProxy.isSupport(LiveActivityBottomDialog.class)) {
                Object[] objArray = new Object[]{p,s,q,r,liveActivity};
                liveActivity1 = PatchProxy.apply(objArray, i, LiveActivityBottomDialog.class, "1");
                if (liveActivity1 != PatchProxyResult.class) {
                }else {
                label_008a :
                   liveActivity1 = new LiveActivityBottomDialog();
                   liveActivity1.B = p;
                   liveActivity1.C = s;
                   liveActivity1.D = q;
                   liveActivity1.E = r;
                   if (liveActivity != null) {
                      LiveActivityBottomDialogUrlData mPage = liveActivity.mPage;
                      if (mPage == null) {
                         mPage = new ArrayList();
                      }
                      liveActivity1.F = mPage;
                      liveActivity1.H = liveActivity.mHeightRatio;
                      liveActivity = liveActivity.mTab;
                      liveActivity1.G = liveActivity;
                      if (liveActivity != null) {
                         liveActivity1.N = liveActivity.mIsHide;
                      }
                   }
                }
             }else {
                goto label_008a ;
             }
             ta.t = liveActivity1;
             liveActivity1.Cb(childFragmen, "mLiveActivityBottomDialog");
          }
       }
       return;
    }
}
