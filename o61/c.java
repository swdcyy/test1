package o61.c;
import j61.c;
import com.kuaishou.live.bottombar.component.widget.c;
import z61.b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qp.b;
import ok.x;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import z61.l;
import java.lang.Boolean;
import w61.c;
import w61.a;
import a71.a;
import com.kuaishou.live.bottombar.component.widget.a$a;

public final class c implements c	// class@003480
{
    public final c a;
    public final b b;

    public void c(c p0,b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(int p0){
       b mFeatureId;
       c c;
       boolean b;
       c ta = this.a;
       c tb = this.b;
       Objects.requireNonNull(ta);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(tb, Integer.valueOf(p0), ta, uoc, "21")) {
          b.f("LiveBaseBottomBarWidget", "BottomBarItem Click", "mText", tb.mText, "mFeatureId", Integer.valueOf(tb.mFeatureId));
          if (!PatchProxy.applyVoidOneRefs(tb, ta, uoc, "22") && tb.mShouldReportLogWithBottomBar != null) {
             String str = null;
             b mClickLogPar = tb.mClickLogParamsSupplier;
             if (mClickLogPar != null) {
                JsonObject jsonObject = mClickLogPar.get();
                if (jsonObject != null) {
                   str = jsonObject.toString();
                }
             }
             String str1 = str;
             mFeatureId = tb.mFeatureId;
             c k = ta.k;
             c = ta.c;
             b = (tb instanceof l && tb.mIsSelected != null)? true: false;
             a.b(0, mFeatureId, k, c, true, b, ta.f.get(), str1, tb.mEnableBreathAnimator);
          }
          b mClickCallba = tb.mClickCallback;
          if (mClickCallba != null && mClickCallba.a(p0)) {
             ta = ta.l;
             if (ta != null) {
                ta.c(p0);
             }
          }
       }
    label_0086 :
       return;
    }
}
