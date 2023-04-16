package com.kwai.feature.post.api.thirdparty.ThirdPartyShareUtils$ShareMediaType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.regex.Pattern;
import qkd.b;
import java.util.regex.Matcher;

public final class ThirdPartyShareUtils$ShareMediaType extends Enum	// class@001451
{
    public String mMediaType;
    public static final ThirdPartyShareUtils$ShareMediaType[] $VALUES;
    public static final ThirdPartyShareUtils$ShareMediaType IMAGE;
    public static final ThirdPartyShareUtils$ShareMediaType Unknown;
    public static final ThirdPartyShareUtils$ShareMediaType Video;

    static {
       ThirdPartyShareUtils$ShareMediaType shareMediaTy = new ThirdPartyShareUtils$ShareMediaType("Video", 0, "video/");
       ThirdPartyShareUtils$ShareMediaType.Video = shareMediaTy;
       ThirdPartyShareUtils$ShareMediaType shareMediaTy1 = new ThirdPartyShareUtils$ShareMediaType("IMAGE", 1, "image/");
       ThirdPartyShareUtils$ShareMediaType.IMAGE = shareMediaTy1;
       ThirdPartyShareUtils$ShareMediaType shareMediaTy2 = new ThirdPartyShareUtils$ShareMediaType("Unknown", 2, "");
       ThirdPartyShareUtils$ShareMediaType.Unknown = shareMediaTy2;
       ThirdPartyShareUtils$ShareMediaType[] shareMediaTy3 = new ThirdPartyShareUtils$ShareMediaType[]{shareMediaTy,shareMediaTy1,shareMediaTy2};
       ThirdPartyShareUtils$ShareMediaType.$VALUES = shareMediaTy3;
    }
    public void ThirdPartyShareUtils$ShareMediaType(String p0,int p1,String p2){
       super(p0, p1);
       this.mMediaType = p2;
    }
    public static ThirdPartyShareUtils$ShareMediaType fromMediaFileName(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ThirdPartyShareUtils$ShareMediaType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return ThirdPartyShareUtils$ShareMediaType.Unknown;
       }
       if (b.F().matcher(p0).find()) {
          return ThirdPartyShareUtils$ShareMediaType.Video;
       }
       if (b.C().matcher(p0).find()) {
          return ThirdPartyShareUtils$ShareMediaType.IMAGE;
       }
       return ThirdPartyShareUtils$ShareMediaType.Unknown;
    }
    public static ThirdPartyShareUtils$ShareMediaType fromMediaTypeText(String p0){
       object oobject;
       ThirdPartyShareUtils$ShareMediaType[] obj = PatchProxy.applyOneRefs(p0, null, ThirdPartyShareUtils$ShareMediaType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return ThirdPartyShareUtils$ShareMediaType.Unknown;
       }
       obj = ThirdPartyShareUtils$ShareMediaType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return ThirdPartyShareUtils$ShareMediaType.Unknown;
          }
          oobject = obj[i];
          if (p0.startsWith(oobject.mMediaType)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static ThirdPartyShareUtils$ShareMediaType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ThirdPartyShareUtils$ShareMediaType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ThirdPartyShareUtils$ShareMediaType.class, p0);
    }
    public static ThirdPartyShareUtils$ShareMediaType[] values(){
       Object obj = PatchProxy.apply(null, null, ThirdPartyShareUtils$ShareMediaType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ThirdPartyShareUtils$ShareMediaType.$VALUES.clone();
    }
}
