package com.kuaishou.live.core.show.beauty.LiveBeautifyConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.beauty.LiveBeautifyConfig$SelectedBeautifyTip;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;

public class LiveBeautifyConfig implements Serializable	// class@0009f8
{
    public List mBeautifyLevelConfigList;
    public int mBeautyLevelResetDays;
    public int mNewsTagTimes;
    public String mPromptMessage;
    public List mSelectedBeautifyTipList;
    public static final long serialVersionUID = 0x9241e25ed916449a;

    public void LiveBeautifyConfig(){
       super();
       this.mBeautyLevelResetDays = 3;
    }
    public LiveBeautifyConfig$SelectedBeautifyTip getBeautifyTip(int p0){
       Iterator obj;
       LiveBeautifyConfig$SelectedBeautifyTip selectedBeau;
       if (PatchProxy.isSupport(LiveBeautifyConfig.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveBeautifyConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (q.f(this.mSelectedBeautifyTipList)) {
          return null;
       }else {
          obj = this.mSelectedBeautifyTipList.iterator();
          while (true) {
             if (!obj.hasNext()) {
                return null;
             }
             selectedBeau = obj.next();
             if (selectedBeau != null && selectedBeau.mId == p0) {
                break ;
             }
          }
          return selectedBeau;
       }
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, LiveBeautifyConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.mBeautifyLevelConfigList) ^ 0x01);
    }
}
