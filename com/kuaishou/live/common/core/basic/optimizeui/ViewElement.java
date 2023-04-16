package com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import java.lang.Boolean;

public final class ViewElement extends Enum	// class@000eb1
{
    public final long defaultDelayTime;
    public final String key;
    public static final ViewElement[] $VALUES;
    public static final ViewElement BOTTOM_BAR;
    public static final ViewElement CHAT_SMALL_SCREEN;
    public static final ViewElement COMMENT;
    public static final ViewElement COMMENT_NOTICE;
    public static final ViewElement ENTER_ROOM_EFFECT;
    public static final ViewElement LYRICS_PENDANT;
    public static final ViewElement RIGHT_PENDANT;
    public static final ViewElement STICKER;
    public static final ViewElement SUBSCRIBE_PENDANT;
    public static final ViewElement TOP_BAR;
    public static final ViewElement TOP_BROADCAST;
    public static final ViewElement TOP_PENDANT_ASSOCIATE;
    public static final ViewElement TOP_PENDANT_TEMPORARY;

    static {
       ViewElement[] viewElementA = new ViewElement[13];
       ViewElement viewElement = new ViewElement("TOP_BAR", 0, "topBar", 500);
       ViewElement.TOP_BAR = v7;
       viewElementA[0] = v7;
       ViewElement viewElement1 = new ViewElement("BOTTOM_BAR", 1, "bottomBar", 500);
       ViewElement.BOTTOM_BAR = viewElement;
       viewElementA[1] = viewElement;
       ViewElement viewElement2 = new ViewElement("TOP_PENDANT_ASSOCIATE", 2, "topPendantAssociate", 500);
       ViewElement.TOP_PENDANT_ASSOCIATE = viewElement;
       viewElementA[2] = viewElement;
       viewElement2 = new ViewElement("TOP_PENDANT_TEMPORARY", 3, "topPendantTemporary", 1000);
       ViewElement.TOP_PENDANT_TEMPORARY = viewElement;
       viewElementA[3] = viewElement;
       viewElement2 = new ViewElement("COMMENT", 4, "comment", 1000);
       ViewElement.COMMENT = viewElement;
       viewElementA[4] = viewElement;
       viewElement2 = new ViewElement("RIGHT_PENDANT", 5, "rightPendant", 1000);
       ViewElement.RIGHT_PENDANT = viewElement;
       viewElementA[5] = viewElement;
       viewElement2 = new ViewElement("ENTER_ROOM_EFFECT", 6, "enterRoomEffect", 1500);
       ViewElement.ENTER_ROOM_EFFECT = viewElement;
       viewElementA[6] = viewElement;
       viewElement2 = new ViewElement("COMMENT_NOTICE", 7, "commentNotice", 1500);
       ViewElement.COMMENT_NOTICE = viewElement;
       viewElementA[7] = viewElement;
       viewElement2 = new ViewElement("SUBSCRIBE_PENDANT", 8, "subscribePendant", 1500);
       ViewElement.SUBSCRIBE_PENDANT = viewElement;
       viewElementA[8] = viewElement;
       viewElement2 = new ViewElement("STICKER", 9, "sticker", 1500);
       ViewElement.STICKER = viewElement;
       viewElementA[9] = viewElement;
       viewElement2 = new ViewElement("LYRICS_PENDANT", 10, "lyricsPendant", 1500);
       ViewElement.LYRICS_PENDANT = viewElement;
       viewElementA[10] = viewElement;
       viewElement2 = new ViewElement("TOP_BROADCAST", 11, "topBroadcast", 1500);
       ViewElement.TOP_BROADCAST = viewElement;
       viewElementA[11] = viewElement;
       viewElement2 = new ViewElement("CHAT_SMALL_SCREEN", 12, "chatSmallScreen", 1500);
       ViewElement.CHAT_SMALL_SCREEN = viewElement;
       viewElementA[12] = viewElement;
       ViewElement.$VALUES = viewElementA;
    }
    public void ViewElement(String p0,int p1,String p2,long p3){
       super(p0, p1);
       this.key = p2;
       this.defaultDelayTime = p3;
    }
    public static ViewElement valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewElement.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ViewElement.class, p0);
    }
    public static ViewElement[] values(){
       Object obj = PatchProxy.apply(null, null, ViewElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewElement.$VALUES.clone();
    }
    public final long getDelayTime(){
       long l;
       Object[] objArray = null;
       JsonObject obj = PatchProxy.apply(objArray, this, ViewElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = a.t().u("SOURCE_LIVE").getValue("liveUiShowDelayTimeConfig", JsonObject.class, objArray);
       if (obj != null) {
          JsonElement jsonElement = obj.e0(this.key);
          if (jsonElement != null) {
             l = jsonElement.t();
          label_0039 :
             return l;
          }
       }
       l = this.defaultDelayTime;
       goto label_0039 ;
    }
    public final String getKey$live_common_release(){
       return this.key;
    }
    public final boolean shouldForbiddenGradientAnim(){
       Object obj = PatchProxy.apply(null, this, ViewElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getDelayTime() <= 0)? true: false;
       return b;
    }
}
