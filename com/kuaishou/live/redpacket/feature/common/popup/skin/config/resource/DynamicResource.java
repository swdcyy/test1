package com.kuaishou.live.redpacket.feature.common.popup.skin.config.resource.DynamicResource;
import java.lang.Enum;
import com.kuaishou.live.redpacket.feature.common.popup.skin.config.DynamicResourceType;
import java.lang.String;
import com.kuaishou.live.redpacket.feature.common.popup.skin.config.resource.ResizeConfig;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DynamicResource extends Enum	// class@000f42
{
    public final ResizeConfig mResizeConfig;
    public final String mResourceName;
    public final DynamicResourceType mType;
    public static final DynamicResource[] $VALUES;
    public static final DynamicResource AUDIENCE_SEND_GIFT_BUTTON_BG;
    public static final DynamicResource BACKGROUND;
    public static final DynamicResource BOTTOM_AMBIENT;
    public static final DynamicResource BOTTOM_COVER;
    public static final DynamicResource CONDITION_JOIN_BUTTON_BG;
    public static final DynamicResource CONDITION_SEND_GIFT_BUTTON_BG;
    public static final DynamicResource COUNT_DOWN_BUTTON_BG;
    public static final DynamicResource INNER_PAGE;
    public static final DynamicResource OPEN_BUTTON_ANIM;
    public static final DynamicResource OPEN_BUTTON_BG;
    public static final DynamicResource TOP_AMBIENT;
    public static final DynamicResource TOP_COVER;

    static {
       DynamicResourceType uDynamicReso = DynamicResourceType.IMAGE;
       DynamicResource uDynamicReso1 = new DynamicResource("TOP_COVER", 0, "TOP_COVER", uDynamicReso, 260, 254);
       DynamicResource.TOP_COVER = v7;
       uDynamicReso1 = new DynamicResource("BOTTOM_COVER", 1, "BOTTOM_COVER", uDynamicReso, 260, 142);
       DynamicResource.BOTTOM_COVER = v9;
       uDynamicReso1 = new DynamicResource("BACKGROUND", 2, "BACKGROUND", uDynamicReso, 260, 335);
       DynamicResource.BACKGROUND = v10;
       uDynamicReso1 = new DynamicResource("TOP_AMBIENT", 3, "TOP_AMBIENT", uDynamicReso, 276, 124);
       DynamicResource.TOP_AMBIENT = v11;
       uDynamicReso1 = new DynamicResource("BOTTOM_AMBIENT", 4, "BOTTOM_AMBIENT", uDynamicReso, 276, 109);
       DynamicResource.BOTTOM_AMBIENT = v12;
       uDynamicReso1 = new DynamicResource("COUNT_DOWN_BUTTON_BG", 5, "COUNT_DOWN_BUTTON_BG", uDynamicReso, 89, 89);
       DynamicResource.COUNT_DOWN_BUTTON_BG = v13;
       uDynamicReso1 = new DynamicResource("OPEN_BUTTON_BG", 6, "OPEN_BUTTON_BG", uDynamicReso, 89, 89);
       DynamicResource.OPEN_BUTTON_BG = v14;
       DynamicResource uDynamicReso2 = new DynamicResource("OPEN_BUTTON_ANIM", 7, "OPEN_BUTTON_ANIM", DynamicResourceType.WEBP_ANIM, 89, 89);
       DynamicResource.OPEN_BUTTON_ANIM = v22;
       uDynamicReso1 = new DynamicResource("INNER_PAGE", 8, "INNER_PAGE", uDynamicReso, 236, 335);
       DynamicResource.INNER_PAGE = uDynamicReso2;
       uDynamicReso1 = new DynamicResource("CONDITION_JOIN_BUTTON_BG", 9, "CONDITION_JOIN_BUTTON_BG", uDynamicReso, 182, 48);
       DynamicResource.CONDITION_JOIN_BUTTON_BG = v16;
       uDynamicReso1 = new DynamicResource("CONDITION_SEND_GIFT_BUTTON_BG", 10, "CONDITION_SEND_GIFT_BUTTON_BG", uDynamicReso, 160, 56);
       DynamicResource.CONDITION_SEND_GIFT_BUTTON_BG = v17;
       uDynamicReso1 = new DynamicResource("AUDIENCE_SEND_GIFT_BUTTON_BG", 11, "AUDIENCE_SEND_GIFT_BUTTON_BG", uDynamicReso, 172, 36);
       DynamicResource.AUDIENCE_SEND_GIFT_BUTTON_BG = v18;
       DynamicResource[] uDynamicReso3 = new DynamicResource[12];
       uDynamicReso3[0] = v7;
       uDynamicReso3[1] = v9;
       uDynamicReso3[2] = v10;
       uDynamicReso3[3] = v11;
       uDynamicReso3[4] = v12;
       uDynamicReso3[5] = v13;
       uDynamicReso3[6] = v14;
       uDynamicReso3[7] = v22;
       uDynamicReso3[8] = uDynamicReso2;
       uDynamicReso3[9] = v16;
       uDynamicReso3[10] = v17;
       uDynamicReso3[11] = v18;
       DynamicResource.$VALUES = uDynamicReso3;
    }
    public void DynamicResource(String p0,int p1,String p2,DynamicResourceType p3,int p4,int p5){
       super(p0, p1);
       this.mResourceName = p2;
       this.mType = p3;
       this.mResizeConfig = new ResizeConfig(p4, p5);
    }
    public static DynamicResource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DynamicResource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DynamicResource.class, p0);
    }
    public static DynamicResource[] values(){
       Object obj = PatchProxy.apply(null, null, DynamicResource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DynamicResource.$VALUES.clone();
    }
    public DynamicResourceType getDynamicResourceType(){
       return this.mType;
    }
    public ResizeConfig getResizeConfig(){
       return this.mResizeConfig;
    }
    public String getResourceName(){
       return this.mResourceName;
    }
}
