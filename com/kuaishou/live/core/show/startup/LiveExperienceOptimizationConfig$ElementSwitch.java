package com.kuaishou.live.core.show.startup.LiveExperienceOptimizationConfig$ElementSwitch;
import java.io.Serializable;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import java.lang.Boolean;

public class LiveExperienceOptimizationConfig$ElementSwitch implements Serializable	// class@00108c
{
    public boolean enableAudienceMagicFace;
    public boolean enableAudienceTopic;
    public boolean enableBroadcast;
    public boolean enableCommentNotice;
    public boolean enableDistrictRankNotice;
    public boolean enableFollowCommentNotice;
    public boolean enableLeftTopNotice;
    public boolean enableLeftTopRevenueWidget;
    public boolean enableLiveMusicAudience;
    public boolean enableNotification;
    public boolean enableRightBottomRevenue;
    public boolean enableTopNotice;
    public boolean enableWealthGrade;
    public boolean enableWishListAudience;
    public static final long serialVersionUID = 0x987fd65485202568;

    public void LiveExperienceOptimizationConfig$ElementSwitch(){
       super();
    }
    public Map toMap(){
       LinkedHashMap obj = PatchProxy.apply(null, this, LiveExperienceOptimizationConfig$ElementSwitch.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       obj.put("enableAudienceTopic", Boolean.valueOf(this.enableAudienceTopic));
       obj.put("enableNotification", Boolean.valueOf(this.enableNotification));
       obj.put("enableTopNoticeOrBroadcastNotice", Boolean.valueOf(this.enableTopNotice));
       obj.put("enableLeftTopNotice", Boolean.valueOf(this.enableLeftTopNotice));
       obj.put("enableDistrictRankNotice", Boolean.valueOf(this.enableDistrictRankNotice));
       obj.put("enableWishListAudience", Boolean.valueOf(this.enableWishListAudience));
       obj.put("enableLeftTopRevenueWidget", Boolean.valueOf(this.enableLeftTopRevenueWidget));
       obj.put("enableRightBottomRevenue", Boolean.valueOf(this.enableRightBottomRevenue));
       obj.put("enableLiveMusicAudience", Boolean.valueOf(this.enableLiveMusicAudience));
       obj.put("enableCommentNotice", Boolean.valueOf(this.enableCommentNotice));
       obj.put("enableFollowCommentNotice", Boolean.valueOf(this.enableFollowCommentNotice));
       obj.put("enableAudienceMagicFace", Boolean.valueOf(this.enableAudienceMagicFace));
       obj.put("enableWealthGrade", Boolean.valueOf(this.enableWealthGrade));
       obj.put("enableBroadcast", Boolean.valueOf(this.enableBroadcast));
       return obj;
    }
}
