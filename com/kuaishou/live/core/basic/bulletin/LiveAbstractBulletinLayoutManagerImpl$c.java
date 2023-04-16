package com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$c;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.view.View;

public final class LiveAbstractBulletinLayoutManagerImpl$c implements View$OnLayoutChangeListener	// class@000821
{
    public boolean b;
    public int c;
    public final LiveAbstractBulletinLayoutManagerImpl d;

    public void LiveAbstractBulletinLayoutManagerImpl$c(LiveAbstractBulletinLayoutManagerImpl p0){
       this.d = p0;
       super();
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(LiveAbstractBulletinLayoutManagerImpl$c.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAbstractBulletinLayoutManagerImpl$c.class, "2")) {
          return;
       }
       LiveAbstractBulletinLayoutManagerImpl$c td = this.d;
       Objects.requireNonNull(td);
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = PatchProxy.apply(null, td, LiveAbstractBulletinLayoutManagerImpl.class, "3");
       if (liveAbstract != PatchProxyResult.class) {
       }else {
          liveAbstract = td.b;
          if (liveAbstract == null) {
             a.S("bulletinContainer");
          }
       }
       int i = liveAbstract.getHeight() - p0;
       int i1 = this.c - i;
       float f = (i > 0 && i1 > 0)? - (float)i1: 0;
       LiveAbstractBulletinLayoutManagerImpl.E(this.d, "updateGifSlotMinHeight bottom:"+p0+" height:"+i+" minHeight:"+this.c+" translationY:"+f, null, 2, null);
       this.d.x().setTranslationY(f);
       return;
    }
    public final boolean b(){
       return this.b;
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(LiveAbstractBulletinLayoutManagerImpl$c.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, LiveAbstractBulletinLayoutManagerImpl$c.class, "1")) {
             return;
          }
       }
       a.p(p0, "v");
       this.a(p4);
       return;
    }
}
