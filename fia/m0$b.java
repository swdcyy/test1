package fia.m0$b;
import android.view.View$OnClickListener;
import android.app.Activity;
import fia.m0;
import com.yxcorp.gifshow.follow.common.data.FollowFeatureGuideSnackBarResponse;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class m0$b implements View$OnClickListener	// class@00291f
{
    public final Activity b;
    public final m0 c;
    public final FollowFeatureGuideSnackBarResponse d;

    public void m0$b(Activity p0,m0 p1,FollowFeatureGuideSnackBarResponse p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, m0$b.class, "1")) {
          return;
       }
       this.c.X8();
       PatchProxy.onMethodExit(m0$b.class, "1");
       return;
    }
}
