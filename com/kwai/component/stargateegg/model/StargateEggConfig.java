package com.kwai.component.stargateegg.model.StargateEggConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.component.bifrost.res.BifrostVideoResourceEntry;
import com.kwai.component.bifrost.res.BifrostCommonResourceEntry;
import vg5.b;
import java.lang.Integer;
import com.kwai.component.stargateegg.model.StargateEggGravity;
import com.yxcorp.gifshow.model.CDNUrl;

public class StargateEggConfig implements Serializable	// class@000b3e
{
    public String mActivityId;
    public int mActivityPriority;
    public List mEggTriggerLis;
    public long mEndTime;
    public long mStartTime;
    public static final long serialVersionUID = 0xa4cb9d23ca2bac32;

    public void StargateEggConfig(){
       super();
    }
    public static StargateEggConfig buildConfig(List p0,String p1){
       StargateEggConfig obj = PatchProxy.applyTwoRefs(p0, p1, null, StargateEggConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StargateEggConfig();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          BifrostVideoResourceEntry uBifrostVide = iterator.next();
          if (uBifrostVide.getUrls() == null || uBifrostVide.getUrls().isEmpty()) {
             continue ;
          }else {
             b uob = new b();
             uob.height = Integer.valueOf(uBifrostVide.mHeight);
             uob.width = Integer.valueOf(uBifrostVide.mWidth);
             uob.key = uBifrostVide.getUrls().get(0);
             uob.sceneType = p1;
             int i = uBifrostVide.mWarmUpNecessary ^ 0x01;
             uob.noRequireWarmUp = i;
             StargateEggGravity bOTTOM = (uBifrostVide.mGravity == 4)? StargateEggGravity.BOTTOM: StargateEggGravity.CENTER;
             uob.gravity = bOTTOM;
             List urls = uBifrostVide.getUrls();
             ArrayList uArrayList1 = PatchProxy.applyOneRefs(urls, null, StargateEggConfig.class, "2");
             if (uArrayList1 != PatchProxyResult.class) {
             }else {
                uArrayList1 = new ArrayList();
                Iterator iterator1 = urls.iterator();
                while (iterator1.hasNext()) {
                   uArrayList1.add(new CDNUrl("", iterator1.next()));
                }
             }
             uob.animation = uArrayList1;
             uArrayList.add(uob);
             uob.a = obj;
          }
       }
       obj.mEggTriggerLis = uArrayList;
       obj.mActivityId = p1;
       obj.mEndTime = Long.MAX_VALUE;
       obj.mStartTime = 1;
       return obj;
    }
}
