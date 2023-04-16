package com.yxcorp.gifshow.activity.GifshowActivity$AnchorPoint;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GifshowActivity$AnchorPoint extends Enum	// class@001335
{
    public static final GifshowActivity$AnchorPoint[] $VALUES;
    public static final GifshowActivity$AnchorPoint AT_USER_IN_COMMENT;
    public static final GifshowActivity$AnchorPoint AT_USER_IN_PHOTO_DESCRIPTION;
    public static final GifshowActivity$AnchorPoint AVATAR;
    public static final GifshowActivity$AnchorPoint DEFAULT;
    public static final GifshowActivity$AnchorPoint LONGPRESS;
    public static final GifshowActivity$AnchorPoint NAME;
    public static final GifshowActivity$AnchorPoint NOTICE_ITEM;
    public static final GifshowActivity$AnchorPoint NOTICE_ITEM_PHOTO;
    public static final GifshowActivity$AnchorPoint PHOTO_AUTHOR;
    public static final GifshowActivity$AnchorPoint PHOTO_LIKER;
    public static final GifshowActivity$AnchorPoint VERTICAL_AVATAR;

    static {
       GifshowActivity$AnchorPoint uAnchorPoint = new GifshowActivity$AnchorPoint("DEFAULT", 0);
       GifshowActivity$AnchorPoint.DEFAULT = uAnchorPoint;
       GifshowActivity$AnchorPoint uAnchorPoint1 = new GifshowActivity$AnchorPoint("AT_USER_IN_PHOTO_DESCRIPTION", 1);
       GifshowActivity$AnchorPoint.AT_USER_IN_PHOTO_DESCRIPTION = uAnchorPoint1;
       GifshowActivity$AnchorPoint uAnchorPoint2 = new GifshowActivity$AnchorPoint("AT_USER_IN_COMMENT", 2);
       GifshowActivity$AnchorPoint.AT_USER_IN_COMMENT = uAnchorPoint2;
       GifshowActivity$AnchorPoint uAnchorPoint3 = new GifshowActivity$AnchorPoint("PHOTO_LIKER", 3);
       GifshowActivity$AnchorPoint.PHOTO_LIKER = uAnchorPoint3;
       GifshowActivity$AnchorPoint uAnchorPoint4 = new GifshowActivity$AnchorPoint("PHOTO_AUTHOR", 4);
       GifshowActivity$AnchorPoint.PHOTO_AUTHOR = uAnchorPoint4;
       GifshowActivity$AnchorPoint uAnchorPoint5 = new GifshowActivity$AnchorPoint("NAME", 5);
       GifshowActivity$AnchorPoint.NAME = uAnchorPoint5;
       GifshowActivity$AnchorPoint uAnchorPoint6 = new GifshowActivity$AnchorPoint("VERTICAL_AVATAR", 6);
       GifshowActivity$AnchorPoint.VERTICAL_AVATAR = uAnchorPoint6;
       GifshowActivity$AnchorPoint uAnchorPoint7 = new GifshowActivity$AnchorPoint("AVATAR", 7);
       GifshowActivity$AnchorPoint.AVATAR = uAnchorPoint7;
       GifshowActivity$AnchorPoint uAnchorPoint8 = new GifshowActivity$AnchorPoint("LONGPRESS", 8);
       GifshowActivity$AnchorPoint.LONGPRESS = uAnchorPoint8;
       GifshowActivity$AnchorPoint uAnchorPoint9 = new GifshowActivity$AnchorPoint("NOTICE_ITEM_PHOTO", 9);
       GifshowActivity$AnchorPoint.NOTICE_ITEM_PHOTO = uAnchorPoint9;
       GifshowActivity$AnchorPoint uAnchorPoint10 = new GifshowActivity$AnchorPoint("NOTICE_ITEM", 10);
       GifshowActivity$AnchorPoint.NOTICE_ITEM = uAnchorPoint10;
       GifshowActivity$AnchorPoint[] uAnchorPoint11 = new GifshowActivity$AnchorPoint[11];
       uAnchorPoint11[0] = uAnchorPoint;
       uAnchorPoint11[1] = uAnchorPoint1;
       uAnchorPoint11[2] = uAnchorPoint2;
       uAnchorPoint11[3] = uAnchorPoint3;
       uAnchorPoint11[4] = uAnchorPoint4;
       uAnchorPoint11[5] = uAnchorPoint5;
       uAnchorPoint11[6] = uAnchorPoint6;
       uAnchorPoint11[7] = uAnchorPoint7;
       uAnchorPoint11[8] = uAnchorPoint8;
       uAnchorPoint11[9] = uAnchorPoint9;
       uAnchorPoint11[10] = uAnchorPoint10;
       GifshowActivity$AnchorPoint.$VALUES = uAnchorPoint11;
    }
    public void GifshowActivity$AnchorPoint(String p0,int p1){
       super(p0, p1);
    }
    public static GifshowActivity$AnchorPoint valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GifshowActivity$AnchorPoint.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GifshowActivity$AnchorPoint.class, p0);
    }
    public static GifshowActivity$AnchorPoint[] values(){
       Object obj = PatchProxy.apply(null, null, GifshowActivity$AnchorPoint.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GifshowActivity$AnchorPoint.$VALUES.clone();
    }
}
