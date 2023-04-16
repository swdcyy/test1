package gn9.c;
import n3d.a;
import android.app.Activity;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import android.net.Uri;

public final class c implements a	// class@0024ce
{
    public final Activity b;

    public void c(Activity p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (qCurrentUser.isLogined()) {
          Uri uri = Uri.parse("kwai://krn?bundleId=FeedSchoolTab&componentName=Identification&source=SCHOOL_MAP");
          a.o(uri, "Uri.parse\(IDENTIFICATION_SCHEME\)");
          Intent intent = new Intent();
          intent.setAction("android.intent.action.VIEW");
          intent.setData(uri);
          this.b.startActivity(intent);
       }
       return;
    }
}
