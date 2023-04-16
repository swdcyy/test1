package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialPanelBaseFragment$b;
import v8a.l$d;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialPanelBaseFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import v8a.a;
import java.lang.Boolean;

public final class SerialPanelBaseFragment$b implements l$d	// class@0019f6
{
    public final SerialPanelBaseFragment a;

    public void SerialPanelBaseFragment$b(SerialPanelBaseFragment p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1,int p2,float p3){
       if (PatchProxy.isSupport(SerialPanelBaseFragment$b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Float.valueOf(p3), this, SerialPanelBaseFragment$b.class, "1")) {
          return;
       }
       SerialPanelBaseFragment$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(SerialPanelBaseFragment.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Float.valueOf(p3), ta, SerialPanelBaseFragment.class, "4")) {
          Iterator iterator = ta.T.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0, p1, p2, p3);
          }
       }
       return;
    }
    public void s(boolean p0){
       SerialPanelBaseFragment$b uob = SerialPanelBaseFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       if (!PatchProxy.isSupport(SerialPanelBaseFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, SerialPanelBaseFragment.class, "6")) {
          Iterator iterator = uob.T.iterator();
          while (iterator.hasNext()) {
             iterator.next().s(p0);
          }
          if (!p0) {
             uob.Ph();
          }
       }
       return;
    }
    public void t(boolean p0){
       SerialPanelBaseFragment$b uob = SerialPanelBaseFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       if (!PatchProxy.isSupport(SerialPanelBaseFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, SerialPanelBaseFragment.class, "5")) {
          Iterator iterator = uob.T.iterator();
          while (iterator.hasNext()) {
             iterator.next().t(p0);
          }
       }
       return;
    }
}
