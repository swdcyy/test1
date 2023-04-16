package gn9.d;
import u07.u;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.net.Uri;
import android.content.Intent;
import com.kwai.library.widget.popup.common.c;

public final class d implements u	// class@0024cf
{
    public final Activity b;

    public void d(Activity p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "<anonymous parameter 1>");
       Uri uri = Uri.parse("kwai://krn?bundleId=FeedSchoolTab&componentName=Identification&source=SCHOOL_MAP");
       a.o(uri, "Uri.parse\(IDENTIFICATION_SCHEME\)");
       Intent intent = new Intent();
       intent.setAction("android.intent.action.VIEW");
       intent.setData(uri);
       this.b.startActivity(intent);
       p0.o();
       return;
    }
}
