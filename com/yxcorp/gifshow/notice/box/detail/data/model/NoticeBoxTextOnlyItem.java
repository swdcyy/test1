package com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
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
import java.lang.StringBuilder;

public class NoticeBoxTextOnlyItem extends NoticeBoxBaseItem	// class@001258
{
    public String mContent;
    public CharSequence mContentSpannable;
    public String mLinkUrl;
    public String mTime;
    public long mTimestamp;
    public String mTitle;
    public boolean mUnread;
    public static final long serialVersionUID = 0xfbc2280a32d973c;

    public void NoticeBoxTextOnlyItem(){
       super();
       this.mContent = "";
       this.mTitle = "";
       this.mTime = "";
       this.mLinkUrl = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeBoxTextOnlyItem.class, "1");
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
       Object[] obj = PatchProxy.apply(null, this, NoticeBoxTextOnlyItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mNotifyId,Boolean.valueOf(this.mUnread)};
       return k.b(obj);
    }
    public void sync(NoticeBoxTextOnlyItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NoticeBoxTextOnlyItem.class, "3")) {
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
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxTextOnlyItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NoticeBoxItem{notifyId=\'"+this.mNotifyId+'''+", mContent=\'"+this.mContent+'''+", mTitle=\'"+this.mTitle+'''+", mTimestamp="+this.mTimestamp+", mUnread="+this.mUnread+", mTime=\'"+this.mTime+'''+", mLinkUrl=\'"+this.mLinkUrl+'''+", extParams=\'"+this.extParams+'''+'}';
    }
}
