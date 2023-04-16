package com.kwai.live.gzone.accompanyplay.audience.k0$d;
import erd.o;
import com.kwai.live.gzone.accompanyplay.audience.k0;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserGameInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Iterator;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$SettingItem;
import com.kwai.live.gzone.accompanyplay.model.LiveLinkBindConfig;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySettingItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$Option;

public class k0$d implements o	// class@000b8c
{
    public final k0 b;

    public void k0$d(k0 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       LiveGzoneAccompanyFleetSetting$Option mValue;
       Integer integer = PatchProxy.applyOneRefs(p0, this, k0$d.class, "1");
       if (integer != PatchProxyResult.class) {
       }else if(p0.mLivelinkBindConfig != null){
          LiveGzoneAccompanyUserGameInfoResponse mFleetSettin = p0.mFleetSettingItems;
          if (mFleetSettin != null) {
             Iterator iterator = mFleetSettin.iterator();
          label_0021 :
             if (iterator.hasNext()) {
                LiveGzoneAccompanyFleetSetting$SettingItem settingItem = iterator.next();
                Iterator iterator1 = p0.mLivelinkBindConfig.mSettingItems.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      LiveGzoneAccompanySettingItem liveGzoneAcc = iterator1.next();
                      if (TextUtils.x(liveGzoneAcc.mContent)) {
                         integer = Integer.valueOf(0x989681);
                         break ;
                      }else {
                         if (TextUtils.n(liveGzoneAcc.mItemId, settingItem.mId)) {
                            if (!q.f(settingItem.mOptions)) {
                               Iterator iterator2 = settingItem.mOptions.iterator();
                               while (true) {
                                  if (iterator2.hasNext()) {
                                     LiveGzoneAccompanyFleetSetting$Option option = iterator2.next();
                                     if (TextUtils.n(option.mContent, liveGzoneAcc.mContent)) {
                                        mValue = option.mValue;
                                     }else {
                                        continue ;
                                     }
                                  }else {
                                     mValue = "";
                                  }
                               }
                            }else {
                               mValue = liveGzoneAcc.mContent;
                            }
                            if (!TextUtils.n(settingItem.mItemValue, mValue)) {
                               integer = Integer.valueOf(0x989682);
                               break ;
                            }
                         }
                      }
                   }else {
                      goto label_0021 ;
                   }
                }
             }else {
                integer = Integer.valueOf(0);
             }
          }
       }
       integer = Integer.valueOf(0);
       return integer;
    }
}
