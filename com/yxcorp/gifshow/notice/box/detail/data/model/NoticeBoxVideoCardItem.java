package com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import ok.k;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import yl8.b;

public class NoticeBoxVideoCardItem extends NoticeBoxBaseItem	// class@00125f
{
    public JsonObject extParams;
    public NoticeBoxVideoCardItem$CardPhotoInfo mCardPhotoInfo;
    public NoticeBoxVideoCardItem$ContentInfo mContentInfo;
    public String mLeftThumbnail;
    public String mLinkUrl;
    public NoticeBoxVideoCardItem$MaterialInfo mMaterialInfo;
    public NoticeBoxVideoCardItem$RightButtonInfo mRightButtonInfo;
    public String mTime;
    public boolean mUnread;
    public static final long serialVersionUID = 0x3e53f5b4746a1e80;

    public void NoticeBoxVideoCardItem(){
       super();
       this.mTime = "";
       this.mLinkUrl = "";
       this.mLeftThumbnail = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeBoxVideoCardItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mUnread != p0.mUnread || !TextUtils.n(this.mNotifyId, p0.mNotifyId)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, NoticeBoxVideoCardItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mNotifyId,Boolean.valueOf(this.mUnread)};
       return k.b(obj);
    }
    public void sync(NoticeBoxVideoCardItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NoticeBoxVideoCardItem.class, "3")) {
          return;
       }
       int i = 1;
       int i1 = TextUtils.n(this.mNotifyId, p0.mNotifyId) ^ i;
       if (this.mUnread == p0.mUnread) {
          i = i1;
       }
       if (i) {
          this.notifyChanged();
       }
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
