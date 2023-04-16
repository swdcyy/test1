package com.yxcorp.gifshow.notice.box.data.NoticeBox;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.lang.Integer;
import ok.k;
import yl8.b;
import java.lang.StringBuilder;
import java.util.Arrays;

public class NoticeBox extends DefaultObservableAndSyncable	// class@002160
{
    public HashMap mExtParams;
    public CDNUrl[] mIcon;
    public String mId;
    public String mLabel;
    public String mName;
    public boolean mShowMuteIcon;
    public boolean mShowRedDot;
    public long mTimestamp;
    public String mTitle;
    public boolean mUnread;
    public int mUnreadCount;
    public static final long serialVersionUID = 0x6197b6edc9e5bd92;

    public void NoticeBox(){
       super();
       this.mName = "";
       this.mLabel = "";
       this.mTitle = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeBox.class, "2");
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
       if (this.mShowMuteIcon != p0.mShowMuteIcon || (this.mShowRedDot == p0.mShowRedDot || (this.mUnreadCount != p0.mUnreadCount || (this.mUnread != p0.mUnread || !TextUtils.n(this.mId, p0.mId))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, NoticeBox.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mId,Boolean.valueOf(this.mShowMuteIcon),Integer.valueOf(this.mUnreadCount),Boolean.valueOf(this.mUnread)};
       return k.b(obj);
    }
    public void sync(NoticeBox p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NoticeBox.class, "1")) {
          return;
       }
       int i = 1;
       int i1 = TextUtils.n(this.mId, p0.mId) ^ i;
       if (this.mShowMuteIcon != p0.mShowMuteIcon) {
          i1 = 1;
       }
       if (this.mUnreadCount != p0.mUnreadCount) {
          i1 = 1;
       }
       if (this.mShowRedDot == p0.mShowRedDot) {
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
       Object obj = PatchProxy.apply(null, this, NoticeBox.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NoticeBox{mName=\'"+this.mName+'''+", mId=\'"+this.mId+'''+", mIcon="+Arrays.toString(this.mIcon)+", mLabel=\'"+this.mLabel+'''+", mTitle=\'"+this.mTitle+'''+", mTimestamp="+this.mTimestamp+", mShowMuteIcon="+this.mShowMuteIcon+", mUnreadCount="+this.mUnreadCount+", mUnread="+this.mUnread+", mShowRedDot="+this.mShowRedDot+", mExtParams="+this.mExtParams+'}';
    }
}
