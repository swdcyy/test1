package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$ErrorInfo;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostStickerEveLogger$ErrorInfo extends Enum	// class@00123c
{
    public final String description;
    public static final PostStickerEveLogger$ErrorInfo[] $VALUES;
    public static final PostStickerEveLogger$ErrorInfo NoDefaultScore;
    public static final PostStickerEveLogger$ErrorInfo NoNeedRerank;
    public static final PostStickerEveLogger$ErrorInfo NoScoreMap;

    static {
       PostStickerEveLogger$ErrorInfo uErrorInfo;
       PostStickerEveLogger$ErrorInfo[] uErrorInfoAr = new PostStickerEveLogger$ErrorInfo[]{uErrorInfo,uErrorInfo,uErrorInfo};
       uErrorInfo = new PostStickerEveLogger$ErrorInfo("NoNeedRerank", 0, "不需要重排");
       PostStickerEveLogger$ErrorInfo.NoNeedRerank = uErrorInfo;
       uErrorInfo = new PostStickerEveLogger$ErrorInfo("NoScoreMap", 1, "没有排序分数缓存");
       PostStickerEveLogger$ErrorInfo.NoScoreMap = uErrorInfo;
       uErrorInfo = new PostStickerEveLogger$ErrorInfo("NoDefaultScore", 2, "没有获取到defaultScore");
       PostStickerEveLogger$ErrorInfo.NoDefaultScore = uErrorInfo;
       PostStickerEveLogger$ErrorInfo.$VALUES = uErrorInfoAr;
    }
    public void PostStickerEveLogger$ErrorInfo(String p0,int p1,String p2){
       super(p0, p1);
       this.description = p2;
    }
    public static PostStickerEveLogger$ErrorInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostStickerEveLogger$ErrorInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostStickerEveLogger$ErrorInfo.class, p0);
    }
    public static PostStickerEveLogger$ErrorInfo[] values(){
       Object obj = PatchProxy.apply(null, null, PostStickerEveLogger$ErrorInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostStickerEveLogger$ErrorInfo.$VALUES.clone();
    }
    public final String getDescription(){
       return this.description;
    }
}
