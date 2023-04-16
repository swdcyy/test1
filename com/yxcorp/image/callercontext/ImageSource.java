package com.yxcorp.image.callercontext.ImageSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Package;
import java.lang.Class;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.a$a;

public final class ImageSource extends Enum	// class@001a00
{
    public static final ImageSource[] $VALUES;
    public static final ImageSource COMMENT_AD_IMAGE;
    public static final ImageSource COMMENT_AVATAR;
    public static final ImageSource COMMENT_EMOTION;
    public static final ImageSource COMMENT_PICTURE;
    public static final ImageSource DETAIL_ATLAS;
    public static final ImageSource DETAIL_COVER_IMAGE;
    public static final ImageSource DETAIL_COVER_VIDEO;
    public static final ImageSource FEED_AVATAR;
    public static final ImageSource FEED_COVER;
    public static final ImageSource FEED_COVER_PREFETCH;
    public static final ImageSource FEED_TOAST_AD;
    public static final ImageSource ICON;
    public static final ImageSource KRN;
    public static final ImageSource LIVE_RED_PACKET_SKIN;
    public static final String PACKAGE_NAME;
    public static final ImageSource TOOLBOX_FILM;
    public static final ImageSource TUNA_PROFILE;
    public static final ImageSource UNKNOWN;
    public static final ImageSource WIDGET_IMAGE;

    static {
       ImageSource imageSource = new ImageSource("UNKNOWN", 0);
       ImageSource.UNKNOWN = imageSource;
       ImageSource imageSource1 = new ImageSource("FEED_COVER", 1);
       ImageSource.FEED_COVER = imageSource1;
       ImageSource imageSource2 = new ImageSource("FEED_COVER_PREFETCH", 2);
       ImageSource.FEED_COVER_PREFETCH = imageSource2;
       ImageSource imageSource3 = new ImageSource("FEED_AVATAR", 3);
       ImageSource.FEED_AVATAR = imageSource3;
       ImageSource imageSource4 = new ImageSource("FEED_TOAST_AD", 4);
       ImageSource.FEED_TOAST_AD = imageSource4;
       ImageSource imageSource5 = new ImageSource("DETAIL_COVER_VIDEO", 5);
       ImageSource.DETAIL_COVER_VIDEO = imageSource5;
       ImageSource imageSource6 = new ImageSource("DETAIL_COVER_IMAGE", 6);
       ImageSource.DETAIL_COVER_IMAGE = imageSource6;
       ImageSource imageSource7 = new ImageSource("DETAIL_ATLAS", 7);
       ImageSource.DETAIL_ATLAS = imageSource7;
       ImageSource imageSource8 = new ImageSource("COMMENT_AVATAR", 8);
       ImageSource.COMMENT_AVATAR = imageSource8;
       ImageSource imageSource9 = new ImageSource("COMMENT_AD_IMAGE", 9);
       ImageSource.COMMENT_AD_IMAGE = imageSource9;
       ImageSource imageSource10 = new ImageSource("COMMENT_EMOTION", 10);
       ImageSource.COMMENT_EMOTION = imageSource10;
       ImageSource imageSource11 = new ImageSource("COMMENT_PICTURE", 11);
       ImageSource.COMMENT_PICTURE = imageSource11;
       ImageSource imageSource12 = new ImageSource("TUNA_PROFILE", 12);
       ImageSource.TUNA_PROFILE = imageSource12;
       ImageSource imageSource13 = new ImageSource("ICON", 13);
       ImageSource.ICON = imageSource13;
       ImageSource imageSource14 = imageSource13;
       ImageSource imageSource15 = new ImageSource("LIVE_RED_PACKET_SKIN", 14);
       ImageSource.LIVE_RED_PACKET_SKIN = imageSource15;
       ImageSource imageSource16 = imageSource15;
       ImageSource imageSource17 = new ImageSource("KRN", 15);
       ImageSource.KRN = imageSource17;
       ImageSource imageSource18 = imageSource17;
       imageSource13 = new ImageSource("WIDGET_IMAGE", 16);
       ImageSource.WIDGET_IMAGE = imageSource13;
       ImageSource imageSource19 = imageSource13;
       imageSource15 = new ImageSource("TOOLBOX_FILM", 17);
       ImageSource.TOOLBOX_FILM = imageSource15;
       ImageSource[] imageSourceA = new ImageSource[18];
       imageSourceA[0] = imageSource;
       imageSourceA[1] = imageSource1;
       imageSourceA[2] = imageSource2;
       imageSourceA[3] = imageSource3;
       imageSourceA[4] = imageSource4;
       imageSourceA[5] = imageSource5;
       imageSourceA[6] = imageSource6;
       imageSourceA[7] = imageSource7;
       imageSourceA[8] = imageSource8;
       imageSourceA[9] = imageSource9;
       imageSourceA[10] = imageSource10;
       imageSourceA[11] = imageSource11;
       imageSourceA[12] = imageSource12;
       imageSourceA[13] = imageSource14;
       imageSourceA[14] = imageSource16;
       imageSourceA[15] = imageSource18;
       imageSourceA[16] = imageSource19;
       imageSourceA[17] = imageSource15;
       ImageSource.$VALUES = imageSourceA;
       ImageSource.PACKAGE_NAME = ImageSource.class.getPackage().getName();
    }
    public void ImageSource(String p0,int p1){
       super(p0, p1);
    }
    public static ImageSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ImageSource.class, p0);
    }
    public static ImageSource[] values(){
       Object obj = PatchProxy.apply(null, null, ImageSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImageSource.$VALUES.clone();
    }
    public a newCallerContext(){
       a$a obj = PatchProxy.apply(null, this, ImageSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.d();
       obj.d(this);
       return obj.a();
    }
}
