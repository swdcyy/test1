package com.kwai.tokenshare.model.ShareConfigBizType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ShareConfigBizType extends Enum	// class@001928
{
    public int mValue;
    public static final ShareConfigBizType[] $VALUES;
    public static final ShareConfigBizType HOT_SEARCH_PAGE;
    public static final ShareConfigBizType MY_LIKE_PHOTOS;
    public static final ShareConfigBizType MY_QRCODE_PROFILE;
    public static final ShareConfigBizType PUBLIC_GROUP_CHAT;

    static {
       ShareConfigBizType shareConfigB = new ShareConfigBizType("PUBLIC_GROUP_CHAT", 0, 9);
       ShareConfigBizType.PUBLIC_GROUP_CHAT = shareConfigB;
       ShareConfigBizType shareConfigB1 = new ShareConfigBizType("MY_QRCODE_PROFILE", 1, 10);
       ShareConfigBizType.MY_QRCODE_PROFILE = shareConfigB1;
       ShareConfigBizType shareConfigB2 = new ShareConfigBizType("HOT_SEARCH_PAGE", 2, 11);
       ShareConfigBizType.HOT_SEARCH_PAGE = shareConfigB2;
       ShareConfigBizType shareConfigB3 = new ShareConfigBizType("MY_LIKE_PHOTOS", 3, 15);
       ShareConfigBizType.MY_LIKE_PHOTOS = shareConfigB3;
       ShareConfigBizType[] shareConfigB4 = new ShareConfigBizType[]{shareConfigB,shareConfigB1,shareConfigB2,shareConfigB3};
       ShareConfigBizType.$VALUES = shareConfigB4;
    }
    public void ShareConfigBizType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static ShareConfigBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ShareConfigBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ShareConfigBizType.class, p0);
    }
    public static ShareConfigBizType[] values(){
       Object obj = PatchProxy.apply(null, null, ShareConfigBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ShareConfigBizType.$VALUES.clone();
    }
}
