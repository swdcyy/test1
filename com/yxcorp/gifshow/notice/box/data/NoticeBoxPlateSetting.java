package com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yl8.b;

public class NoticeBoxPlateSetting extends DefaultObservableAndSyncable	// class@002161
{
    public String mBoxId;
    public boolean mIsMuted;
    public String mPlateIcon;
    public int mPlateId;
    public String mPlateName;

    public void NoticeBoxPlateSetting(){
       super();
       this.mPlateName = "";
       this.mPlateIcon = "";
    }
    public void sync(NoticeBoxPlateSetting p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NoticeBoxPlateSetting.class, "1")) {
          return;
       }
       int i = 0;
       int i1 = 1;
       if (this.mPlateId != p0.mPlateId || !TextUtils.n(this.mBoxId, p0.mBoxId)) {
          i = 1;
       }
       if (this.mIsMuted == p0.mIsMuted) {
          i1 = i;
       }
       if (i1) {
          this.notifyChanged();
       }
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
