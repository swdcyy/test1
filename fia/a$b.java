package fia.a$b;
import android.view.View$OnClickListener;
import fia.a;
import com.yxcorp.gifshow.follow.common.data.FollowFeatureGuideSnackBarResponse;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$b implements View$OnClickListener	// class@0028e5
{
    public final a b;
    public final FollowFeatureGuideSnackBarResponse c;

    public void a$b(a p0,FollowFeatureGuideSnackBarResponse p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.b.e9(this.c);
       return;
    }
}
