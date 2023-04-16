package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$SettingItem;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$Option;

public class LiveGzoneAccompanyFleetSetting implements Serializable	// class@000c33
{
    public LiveGzoneAccompanyBindGameAccountInfo mBindGameAccountInfo;
    public LiveGzoneAccompanyBindGameAccountInfo mEditingGameAccountInfo;
    public String mEditingTitle;
    public String mFleetId;
    public List mFleetSettingItems;
    public String mFleetTitle;
    public boolean mIsEmptyFleet;
    public static final long serialVersionUID = 0xdcd138689ec07f7c;

    public void LiveGzoneAccompanyFleetSetting(){
       super();
    }
    public void clearSettingItemValue(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyFleetSetting.class, "2")) {
          return;
       }
       this.mIsEmptyFleet = true;
       this.mEditingTitle = this.mFleetTitle;
       if (q.f(this.mFleetSettingItems)) {
          return;
       }
       Iterator iterator = this.mFleetSettingItems.iterator();
       while (iterator.hasNext()) {
          LiveGzoneAccompanyFleetSetting$SettingItem settingItem = iterator.next();
          settingItem.mEditingItemValue = null;
          settingItem.mItemValue = null;
       }
       this.mEditingGameAccountInfo = null;
       return;
    }
    public String getEditingBindGameUid(){
       LiveGzoneAccompanyFleetSetting tmEditingGam = this.mEditingGameAccountInfo;
       if (tmEditingGam != null) {
          return tmEditingGam.mGameUid;
       }
       return null;
    }
    public boolean isAutoEdit(){
       Iterator obj = PatchProxy.apply(null, this, LiveGzoneAccompanyFleetSetting.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (q.f(this.mFleetSettingItems)) {
          return b;
       }
       obj = this.mFleetSettingItems.iterator();
       while (obj.hasNext()) {
          if (obj.next().mAutoEditing != null) {
             b = true;
             break ;
          }
       }
       return b;
    }
    public boolean isEmptySetting(){
       Iterator obj = PatchProxy.apply(null, this, LiveGzoneAccompanyFleetSetting.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.n(this.mFleetTitle, this.mEditingTitle)) {
          return false;
       }
       if (q.f(this.mFleetSettingItems)) {
          return true;
       }
       obj = this.mFleetSettingItems.iterator();
       while (true) {
          if (obj.hasNext()) {
             LiveGzoneAccompanyFleetSetting$SettingItem settingItem = obj.next();
             if (!TextUtils.x(settingItem.mEditingItemValue) || !TextUtils.x(settingItem.mItemValue)) {
                return false;
             }
             continue ;
          }else if(this.mBindGameAccountInfo != null){
             return false;
          }else {
             break ;
          }
       }
       return true;
    }
    public boolean isItemValueChanged(){
       Iterator obj = PatchProxy.apply(null, this, LiveGzoneAccompanyFleetSetting.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!TextUtils.n(this.mFleetTitle, this.mEditingTitle)) {
          return b;
       }
       boolean b1 = false;
       if (q.f(this.mFleetSettingItems)) {
          return b1;
       }
       obj = this.mFleetSettingItems.iterator();
       while (true) {
          if (obj.hasNext()) {
             LiveGzoneAccompanyFleetSetting$SettingItem settingItem = obj.next();
             if (TextUtils.x(settingItem.mItemValue) && (!TextUtils.x(settingItem.mEditingItemValue) && !TextUtils.n(settingItem.mItemValue, settingItem.mEditingItemValue))) {
                b1 = 1;
             }
          }
          LiveGzoneAccompanyFleetSetting tmBindGameAc = this.mBindGameAccountInfo;
          if (tmBindGameAc != null) {
             LiveGzoneAccompanyFleetSetting tmEditingGam = this.mEditingGameAccountInfo;
             if (tmEditingGam == null || !TextUtils.n(tmEditingGam.mGameUid, tmBindGameAc.mGameUid)) {
                return b;
             }
          }else if(this.mEditingGameAccountInfo != null){
             break ;
          }
          b = b1;
          break ;
       }
       return b;
    }
    public void resetEditingItemValue(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyFleetSetting.class, "1")) {
          return;
       }
       this.mEditingTitle = this.mFleetTitle;
       if (q.f(this.mFleetSettingItems)) {
          return;
       }
       Iterator iterator = this.mFleetSettingItems.iterator();
       while (iterator.hasNext()) {
          LiveGzoneAccompanyFleetSetting$SettingItem settingItem = iterator.next();
          if (settingItem.mType == 2 && !q.f(settingItem.mOptions)) {
             Iterator iterator1 = settingItem.mOptions.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (TextUtils.n(iterator1.next().mValue, settingItem.mItemValue)) {
                      settingItem.mEditingItemValue = settingItem.mItemValue;
                   }
                }
             }
          }else if(settingItem.mShouldHideItem == null && TextUtils.x(settingItem.mEditingItemValue)){
             settingItem.mEditingItemValue = settingItem.mItemValue;
          }
          this.mEditingGameAccountInfo = this.mBindGameAccountInfo;
       }
       return;
    }
    public void updateItemValues(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyFleetSetting.class, "3")) {
          return;
       }
       this.mIsEmptyFleet = false;
       this.mFleetTitle = this.mEditingTitle;
       if (q.f(this.mFleetSettingItems)) {
          return;
       }
       Iterator iterator = this.mFleetSettingItems.iterator();
       while (iterator.hasNext()) {
          LiveGzoneAccompanyFleetSetting$SettingItem settingItem = iterator.next();
          settingItem.mItemValue = settingItem.mEditingItemValue;
       }
       this.mBindGameAccountInfo = this.mEditingGameAccountInfo;
       return;
    }
}
