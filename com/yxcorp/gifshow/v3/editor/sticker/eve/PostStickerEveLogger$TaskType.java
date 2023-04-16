package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$TaskType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostStickerEveLogger$TaskType extends Enum	// class@00123d
{
    public final String description;
    public static final PostStickerEveLogger$TaskType[] $VALUES;
    public static final PostStickerEveLogger$TaskType EveInference;
    public static final PostStickerEveLogger$TaskType PanelSort;

    static {
       PostStickerEveLogger$TaskType taskType;
       PostStickerEveLogger$TaskType[] taskTypeArra = new PostStickerEveLogger$TaskType[]{taskType,taskType};
       taskType = new PostStickerEveLogger$TaskType("PanelSort", 0, "ÌùÖ½ÖØÅÅ-Ãæ°åÅÅÐò");
       PostStickerEveLogger$TaskType.PanelSort = taskType;
       taskType = new PostStickerEveLogger$TaskType("EveInference", 1, "ÌùÖ½ÖØÅÅ-EVEÈÎÎñ-´¥·¢->Êä³ö");
       PostStickerEveLogger$TaskType.EveInference = taskType;
       PostStickerEveLogger$TaskType.$VALUES = taskTypeArra;
    }
    public void PostStickerEveLogger$TaskType(String p0,int p1,String p2){
       super(p0, p1);
       this.description = p2;
    }
    public static PostStickerEveLogger$TaskType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostStickerEveLogger$TaskType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostStickerEveLogger$TaskType.class, p0);
    }
    public static PostStickerEveLogger$TaskType[] values(){
       Object obj = PatchProxy.apply(null, null, PostStickerEveLogger$TaskType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostStickerEveLogger$TaskType.$VALUES.clone();
    }
    public final String getDescription(){
       return this.description;
    }
}
