package en1.d;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import android.content.Intent;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailPageActivity;
import android.content.Context;
import androidx.fragment.app.c;
import sr5.a;
import sr5.b;
import com.yxcorp.utility.n;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailHalfScreenContainerFragment;
import java.util.Objects;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailHalfScreenContainerFragment$a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import un1.k;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListFragment;

public final class d	// class@0021d0
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public static final void a(Activity p0,String p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, d.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "hotSpotId");
       Intent intent = new Intent(p0, LiveHotSpotDetailPageActivity.class);
       intent.putExtra("hot_spot_id", p1);
       intent.putExtra("hot_spot_entry_src", p2);
       p0.startActivity(intent);
       return;
    }
    public static final void b(Activity p0,c p1,a p2,b p3,String p4,int p5){
       LiveHotSpotDetailHalfScreenContainerFragment liveHotSpotD;
       d uod = d.class;
       int i = 4;
       int i1 = 1;
       int i2 = 5;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, uod, "3")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "manager");
       a.p(p4, "hotSpotId");
       LiveHotSpotDetailHalfScreenContainerFragment$a g = LiveHotSpotDetailHalfScreenContainerFragment.G;
       int i3 = (int)((float)n.j(p0) * 0x3f4a3d71);
       Objects.requireNonNull(g);
       if (PatchProxy.isSupport(LiveHotSpotDetailHalfScreenContainerFragment$a.class)) {
          Object[] objArray1 = new Object[i2];
          objArray1[0] = Integer.valueOf(i3);
          objArray1[i1] = p4;
          objArray1[2] = Integer.valueOf(p5);
          objArray1[3] = p2;
          objArray1[i] = p3;
          liveHotSpotD = PatchProxy.apply(objArray1, g, LiveHotSpotDetailHalfScreenContainerFragment$a.class, "1");
          if (liveHotSpotD != PatchProxyResult.class) {
          label_007f :
             liveHotSpotD.Cb(p1, liveHotSpotD.getClass().getSimpleName());
             return;
          }
       }
       a.p(p4, "hotSpotId");
       liveHotSpotD = new LiveHotSpotDetailHalfScreenContainerFragment(p4, p5, p2, p3);
       liveHotSpotD.Bh(-1, i3);
       goto label_007f ;
    }
    public final void c(boolean p0,Activity p1,c p2,int p3,String p4,String p5,String p6,a p7,b p8,k p9){
       object oobject = p2;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[10];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = oobject;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, this, uod, "7")) {
             return;
          }
       }else {
          int i = this;
       }
       LiveHotSpotRankListFragment liveHotSpotR = new LiveHotSpotRankListFragment((int)((float)n.j(p1) * 0x3f4a3d71), p0, p3, p4, p5, p6, p2, p7, p8, p9);
       v13.Cb(oobject, "LiveHotSpotRankListFragment");
       return;
    }
}
