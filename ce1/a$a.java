package ce1.a$a;
import yd1.o;
import ce1.a;
import java.lang.Object;
import yd1.b;
import ae1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.View;
import dp3.g;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import be1.b;
import lp3.c;
import lp3.e;
import java.util.Map;
import com.kwai.framework.model.user.UserInfo;
import cw4.d;
import ee1.a;

public final class a$a implements o	// class@0004a3
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public final void a(b p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "widget");
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, a.class, "20")) {
          View view = p0.getView();
          a.m(view);
          Bitmap uBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap$Config.ARGB_8888);
          view.draw(new Canvas(uBitmap));
          if (p1 != null) {
             a d = ta.d;
             if (d == null) {
                a.S("liveServiceManager");
             }
             c uoc = d.a(b.class);
             a.o(uoc, "liveServiceManager.getSe¡­iChatService::class.java\)");
             Map map = uoc.z7();
             if (map != null && ((map.isEmpty() ^ 0x01) && map.containsKey(p1.e.mId))) {
                d uod = map.get(p1.e.mId);
                a d1 = ta.d;
                if (d1 == null) {
                   a.S("liveServiceManager");
                }
                a.m(uod);
                d1.a(a.class).c1(uBitmap, uod.c);
             }
          }
       label_008e :
          p0.u();
       }
       return;
    }
}
