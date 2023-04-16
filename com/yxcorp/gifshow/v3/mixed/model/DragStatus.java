package com.yxcorp.gifshow.v3.mixed.model.DragStatus;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import yl8.b;

public class DragStatus extends DefaultObservableAndSyncable	// class@001552
{
    public boolean mIsDragging;
    public boolean mIsLeft;
    public MixVideoTrack mTrack;

    public void DragStatus(){
       super();
    }
    public void onDragBegin(MixVideoTrack p0,boolean p1){
       if (PatchProxy.isSupport(DragStatus.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, DragStatus.class, "1")) {
          return;
       }
       this.mIsDragging = true;
       this.mTrack = p0;
       this.mIsLeft = p1;
       this.notifyChanged();
       return;
    }
    public void onDragEnd(MixVideoTrack p0,boolean p1){
       if (PatchProxy.isSupport(DragStatus.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, DragStatus.class, "2")) {
          return;
       }
       this.mIsDragging = false;
       this.notifyChanged();
       return;
    }
    public void sync(DragStatus p0){
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
