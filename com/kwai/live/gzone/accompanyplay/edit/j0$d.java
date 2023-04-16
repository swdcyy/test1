package com.kwai.live.gzone.accompanyplay.edit.j0$d;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.j0;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveLinkBindConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import n37.f0;
import java.util.Iterator;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$SettingItem;
import n37.k;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySettingItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class j0$d implements g	// class@000bfd
{
    public final j0 b;

    public void j0$d(j0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$d.class, "1")) {
       }else {
          p0 = this.b.H;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, f0.class, "4")) {
             f0 y = p0.y;
             if (y != null) {
                Iterator iterator = y.iterator();
                while (iterator.hasNext()) {
                   LiveGzoneAccompanyFleetSetting$SettingItem settingItem = iterator.next();
                   k c = p0.x.c;
                   if (c != null) {
                      LiveLinkBindConfig mSettingItem = c.mSettingItems;
                      if (mSettingItem != null) {
                         Iterator iterator1 = mSettingItem.iterator();
                         while (iterator1.hasNext()) {
                            LiveGzoneAccompanySettingItem liveGzoneAcc = iterator1.next();
                            if (TextUtils.n(settingItem.mId, liveGzoneAcc.mItemId)) {
                               p0.r1(settingItem, liveGzoneAcc.mContent);
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
