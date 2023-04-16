package com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import java.lang.Object;

public class ChangeScreenVisibleEvent	// class@000a1f
{
    public final QPhoto a;
    public final ChangeScreenVisibleEvent$Operation b;
    public final ChangeScreenVisibilityCause c;

    public void ChangeScreenVisibleEvent(QPhoto p0){
       super(p0, ChangeScreenVisibleEvent$Operation.TOGGLE, ChangeScreenVisibilityCause.CLICK);
    }
    public void ChangeScreenVisibleEvent(QPhoto p0,ChangeScreenVisibilityCause p1){
       super(p0, ChangeScreenVisibleEvent$Operation.TOGGLE, p1);
    }
    public void ChangeScreenVisibleEvent(QPhoto p0,ChangeScreenVisibleEvent$Operation p1,ChangeScreenVisibilityCause p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
}
