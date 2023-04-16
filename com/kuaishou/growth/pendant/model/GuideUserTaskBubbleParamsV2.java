package com.kuaishou.growth.pendant.model.GuideUserTaskBubbleParamsV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.GuideUserTaskBubbleParamsV2$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class GuideUserTaskBubbleParamsV2 implements Serializable	// class@000667
{
    public int bubbleId;
    public String bubbleText;
    public int[] page;
    public String[] page2;
    public String type;
    public String userType;
    public static String COMMENT_TYPE;
    public static final GuideUserTaskBubbleParamsV2$a Companion;
    public static String FOLLOW_TYPE;
    public static String LIKE_TYPE;
    public static String SHARE_TYPE;
    public static final long serialVersionUID;

    static {
       GuideUserTaskBubbleParamsV2.Companion = new GuideUserTaskBubbleParamsV2$a(null);
       GuideUserTaskBubbleParamsV2.FOLLOW_TYPE = "FOLLOW";
       GuideUserTaskBubbleParamsV2.LIKE_TYPE = "LIKE";
       GuideUserTaskBubbleParamsV2.COMMENT_TYPE = "COMMENT";
       GuideUserTaskBubbleParamsV2.SHARE_TYPE = "SHARE";
    }
    public void GuideUserTaskBubbleParamsV2(){
       super();
    }
    public final int getBubbleId(){
       return this.bubbleId;
    }
    public final String getBubbleText(){
       return this.bubbleText;
    }
    public final int[] getPage(){
       return this.page;
    }
    public final String[] getPage2(){
       return this.page2;
    }
    public final String getType(){
       return this.type;
    }
    public final String getUserType(){
       return this.userType;
    }
    public final void setBubbleId(int p0){
       this.bubbleId = p0;
    }
    public final void setBubbleText(String p0){
       this.bubbleText = p0;
    }
    public final void setPage(int[] p0){
       this.page = p0;
    }
    public final void setPage2(String[] p0){
       this.page2 = p0;
    }
    public final void setType(String p0){
       this.type = p0;
    }
    public final void setUserType(String p0){
       this.userType = p0;
    }
}
