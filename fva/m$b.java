package fva.m$b;
import android.view.View$OnLongClickListener;
import fva.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;
import lnc.a1;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import brd.t;
import com.yxcorp.gifshow.feed.g;
import fva.m$b$a;
import erd.g;
import crd.b;

public final class m$b implements View$OnLongClickListener	// class@002a13
{
    public final m b;

    public void m$b(m p0){
       this.b = p0;
       super();
    }
    public final boolean onLongClick(View p0){
       Rect obj = PatchProxy.applyOneRefs(p0, this, m$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new Rect();
       p0.getLocalVisibleRect(obj);
       if ((obj.right - obj.left) < a1.d(0x7f070340)) {
          return false;
       }
       g.e(m.P8(this.b).mPhotoId, m.P8(this.b).mServerExpTag).subscribe(new m$b$a(this, p0));
       return true;
    }
}
