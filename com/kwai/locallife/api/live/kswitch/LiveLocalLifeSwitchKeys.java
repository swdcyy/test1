package com.kwai.locallife.api.live.kswitch.LiveLocalLifeSwitchKeys;
import java.lang.Enum;
import com.kwai.locallife.api.live.kswitch.LiveLocalLifeSwitchKeys$From;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.locallife.api.live.kswitch.a$c;
import com.kwai.locallife.api.live.kswitch.a;

public final class LiveLocalLifeSwitchKeys extends Enum	// class@000e9e
{
    public Object mDefaultValue;
    public String mDescription;
    public LiveLocalLifeSwitchKeys$From mFrom;
    public String mKey;
    public String mUrl;
    public static final LiveLocalLifeSwitchKeys[] $VALUES;
    public static final LiveLocalLifeSwitchKeys KEY_SWITCH_LITE_BENEFIT_CARD;
    public static final LiveLocalLifeSwitchKeys KEY_SWITCH_LIVE_BULLET;
    public static final LiveLocalLifeSwitchKeys KEY_SWITCH_LIVE_NEW_PRODUCT_BUBBLE;
    public static final LiveLocalLifeSwitchKeys KEY_SWITCH_PREVIEW_LIVE_PRODUCT_CARD;

    static {
       LiveLocalLifeSwitchKeys$From uFrom = LiveLocalLifeSwitchKeys$From.SWITCH;
       LiveLocalLifeSwitchKeys liveLocalLif = new LiveLocalLifeSwitchKeys("KEY_SWITCH_LIVE_BULLET", 0, "LiveLocalLifeNewProductBubble", uFrom, true, "https://kswitch.corp.kuaishou.com/#/flag/targeting?project=kuaishou&environment=production&key=LiveLocalLifeNewProductBubble", "直播间飘屏");
       LiveLocalLifeSwitchKeys.KEY_SWITCH_LIVE_BULLET = v8;
       liveLocalLif = new LiveLocalLifeSwitchKeys("KEY_SWITCH_LIVE_NEW_PRODUCT_BUBBLE", 1, "LocalLifeNewProductBubble", uFrom, true, "https://kswitch.corp.kuaishou.com/#/flag/targeting?project=kuaishou&environment=production&key=LocalLifeNewProductBubble", "直播间上新气泡");
       LiveLocalLifeSwitchKeys.KEY_SWITCH_LIVE_NEW_PRODUCT_BUBBLE = v10;
       liveLocalLif = new LiveLocalLifeSwitchKeys("KEY_SWITCH_LITE_BENEFIT_CARD", 2, "LocalLifeLiteLiveBenefitCard", uFrom, true, "https://kswitch.corp.kuaishou.com/#/flag/targeting?project=kuaishou&environment=staging&key=LocalLifeLiteLiveBenefitCard", "Lite直播间/商品讲解卡");
       LiveLocalLifeSwitchKeys.KEY_SWITCH_LITE_BENEFIT_CARD = v11;
       liveLocalLif = new LiveLocalLifeSwitchKeys("KEY_SWITCH_PREVIEW_LIVE_PRODUCT_CARD", 3, "LocalLifePreviewLiveProductCard", uFrom, true, "https://kswitch.corp.kuaishou.com/#/flag/targeting?project=kuaishou&environment=production&key=LocalLifePreviewLiveProductCard", "简易直播间/商品讲解卡");
       LiveLocalLifeSwitchKeys.KEY_SWITCH_PREVIEW_LIVE_PRODUCT_CARD = v12;
       LiveLocalLifeSwitchKeys[] liveLocalLif1 = new LiveLocalLifeSwitchKeys[]{v8,v10,v11,v12};
       LiveLocalLifeSwitchKeys.$VALUES = liveLocalLif1;
    }
    public void LiveLocalLifeSwitchKeys(String p0,int p1,String p2,LiveLocalLifeSwitchKeys$From p3,Integer p4,String p5,String p6){
       super(p0, p1);
       this.mKey = "";
       this.mUrl = "";
       this.mDescription = "";
       this.mKey = p2;
       this.mFrom = p3;
       this.mDefaultValue = p4;
       this.mUrl = p5;
       this.mDescription = p6;
    }
    public void LiveLocalLifeSwitchKeys(String p0,int p1,String p2,LiveLocalLifeSwitchKeys$From p3,String p4,String p5){
       super(p0, p1);
       this.mKey = "";
       this.mUrl = "";
       this.mDescription = "";
       this.mKey = p2;
       this.mFrom = p3;
       this.mDefaultValue = Boolean.FALSE;
       this.mUrl = p4;
       this.mDescription = p5;
    }
    public void LiveLocalLifeSwitchKeys(String p0,int p1,String p2,LiveLocalLifeSwitchKeys$From p3,boolean p4,String p5,String p6){
       super(p0, p1);
       this.mKey = "";
       this.mUrl = "";
       this.mDescription = "";
       this.mKey = p2;
       this.mFrom = p3;
       this.mDefaultValue = Boolean.valueOf(p4);
       this.mUrl = p5;
       this.mDescription = p6;
    }
    public static LiveLocalLifeSwitchKeys valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLocalLifeSwitchKeys.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLocalLifeSwitchKeys.class, p0);
    }
    public static LiveLocalLifeSwitchKeys[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLocalLifeSwitchKeys.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLocalLifeSwitchKeys.$VALUES.clone();
    }
    public Object defaultValue(){
       return this.mDefaultValue;
    }
    public LiveLocalLifeSwitchKeys$From from(){
       return this.mFrom;
    }
    public a$c getter(){
       Object obj = PatchProxy.apply(null, this, LiveLocalLifeSwitchKeys.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b().a(this);
    }
    public String key(){
       return this.mKey;
    }
}
