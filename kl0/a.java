package kl0.a;
import com.kuaishou.live.viewcontroller.ViewController;
import e93.a;
import e93.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.LiveLiteParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import tkd.b;
import tkd.d;
import nl9.u;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.utility.Log;
import qrd.l1;

public final class a extends ViewController	// class@002d62
{
    public View j;
    public ViewGroup k;
    public final a l;
    public final c m;

    public void a(a p0,c p1){
       a.p(p0, "mAudienceInfoService");
       a.p(p1, "mLiveLiteFragmentService");
       super();
       this.l = p0;
       this.m = p1;
    }
    public void F2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       LiveLiteParam liveLitePara = this.l.ok();
       a.o(liveLitePara, "mAudienceInfoService.liveLiteParam");
       LiveStreamFeed liveStreamFe = liveLitePara.getLiveStreamFeed();
       if (liveStreamFe != null && liveStreamFe.mAd != null) {
          View view = this.m.a().getView();
          if (!view instanceof ViewGroup) {
             view = objArray;
          }
          if (view != null) {
             this.k = view;
             View view1 = d.a(-1694791652).wK(this.B2(), this.k, liveStreamFe, false);
             if (view1 != null) {
                Log.g("AdDetailMonitor", "show ad monitor view ");
                objArray = view1;
             }
             this.j = objArray;
          }
       }
    label_0058 :
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tk = this.k;
       if (tk != null) {
          tk.removeView(this.j);
       }
       this.j = null;
       return;
    }
}
