package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$SettingItem;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$Option;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$ValuesOptionContent;
import com.google.gson.Gson;

public class LiveGzoneAccompanyFleetSetting$SettingItem implements Serializable, a	// class@000c31
{
    public boolean mAutoEditing;
    public String mEditingItemValue;
    public String mHint;
    public String mId;
    public String mItemValue;
    public List mOptions;
    public boolean mShouldHideItem;
    public String mTips;
    public String mTitle;
    public int mType;
    public static final long serialVersionUID = 0x92fe0294f5c7e9e2;

    public void LiveGzoneAccompanyFleetSetting$SettingItem(){
       super();
       this.mShouldHideItem = false;
       this.mAutoEditing = false;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyFleetSetting$SettingItem.class, "1")) {
          return;
       }
       if (this.mType == 5) {
          if (!q.f(this.mOptions)) {
             Iterator iterator = this.mOptions.iterator();
             while (iterator.hasNext()) {
                LiveGzoneAccompanyFleetSetting$Option option = iterator.next();
                if (!TextUtils.x(option.mContent)) {
                   try{
                      option.mExtInfo = a.a.h(option.mContent, LiveGzoneAccompanyFleetSetting$ValuesOptionContent.class);
                   }catch(java.lang.Exception e0){
                      goto label_001f ;
                   }
                }
             }
          }
          if (q.f(this.mOptions)) {
             this.mShouldHideItem = true;
          }else if(this.mOptions.size() == 1 && "1".equals(this.mOptions.get(0).mValue)){
             this.mShouldHideItem = true;
             this.mEditingItemValue = "1";
          }
       }
    label_006d :
       return;
    }
}
