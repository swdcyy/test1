package com.yxcorp.gifshow.reminder.data.model.ReminderItem;
import im8.g;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import w30.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import rcc.h;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import java.lang.Integer;
import yl8.b;
import java.lang.StringBuilder;

public class ReminderItem extends DefaultObservableAndSyncable implements g	// class@001a72
{
    public String mCategory;
    public final f mClientLog;
    public JsonElement mClientLogInfo;
    public ReminderContentInfo mContentInfo;
    public Object mData;
    public int mDataType;
    public boolean mHasItemClicked;
    public boolean mHasRealShown;
    public boolean mHasShown;
    public String mId;
    public boolean mIsUnRead;
    public int mListPosition;
    public int mPosition;
    public JsonElement mRawValue;
    public ReminderItem mSection;
    public long mTimestamp;
    public int mViewType;
    public static final long serialVersionUID = 0x301d29e331f42415;

    public void ReminderItem(){
       super();
       this.mDataType = 0;
       this.mViewType = 0;
       this.mId = "";
       this.mClientLog = new f();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReminderItem.class, "1");
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
       if (this.mDataType != p0.mDataType || (this.mViewType != p0.mViewType || !k.a(this.mData, p0.mData))) {
          b = false;
       }
       return b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReminderItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ReminderItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ReminderItem.class, new h());
       }else {
          obj.put(ReminderItem.class, null);
       }
       return obj;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ReminderItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mDataType),Integer.valueOf(this.mViewType),this.mData};
       return k.b(obj);
    }
    public void sync(ReminderItem p0){
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReminderItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReminderItem{mSection="+this.mSection+", mDataType="+this.mDataType+", mRawValue="+this.mRawValue+", mViewType="+this.mViewType+", mData="+this.mData+", mPosition="+this.mPosition+'}';
    }
}
