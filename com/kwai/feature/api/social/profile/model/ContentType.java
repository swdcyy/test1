package com.kwai.feature.api.social.profile.model.ContentType;
import java.lang.Enum;
import com.kwai.feature.api.social.profile.model.ContentType$1;
import java.lang.String;
import com.kwai.feature.api.social.profile.model.ContentType$2;
import com.kwai.feature.api.social.profile.model.ContentType$3;
import com.kwai.feature.api.social.profile.model.ContentType$4;
import com.kwai.feature.api.social.profile.model.ContentType$5;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class ContentType extends Enum	// class@0011a6
{
    public final String mType;
    public static final ContentType[] $VALUES;
    public static final ContentType MATERIAL;
    public static final ContentType MATERIAL_BANNER;
    public static final ContentType PENDANT_AVATAR;
    public static final ContentType SIMPLE_BUTTON;
    public static final ContentType UNKNOWN;

    static {
       ContentType$1 u1 = new ContentType$1("UNKNOWN", 0, null);
       ContentType.UNKNOWN = u1;
       ContentType$2 u2 = new ContentType$2("PENDANT_AVATAR", 1, "PENDANT_AVATAR");
       ContentType.PENDANT_AVATAR = u2;
       ContentType$3 u3 = new ContentType$3("SIMPLE_BUTTON", 2, "SIMPLE_BUTTON");
       ContentType.SIMPLE_BUTTON = u3;
       ContentType$4 u4 = new ContentType$4("MATERIAL", 3, "MATERIAL");
       ContentType.MATERIAL = u4;
       ContentType$5 u5 = new ContentType$5("MATERIAL_BANNER", 4, "MATERIAL_BANNER");
       ContentType.MATERIAL_BANNER = u5;
       ContentType[] uContentType = new ContentType[]{u1,u2,u3,u4,u5};
       ContentType.$VALUES = uContentType;
    }
    public void ContentType(String p0,int p1,String p2){
       super(p0, p1);
       this.mType = p2;
    }
    public void ContentType(String p0,int p1,String p2,ContentType$1 p3){
       super(p0, p1, p2);
    }
    public static boolean equals(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ContentType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == p1 || (p0 != null && p0.equals(p1)))? true: false;
       return b;
    }
    public static Class fromType(String p0){
       object oobject;
       ContentType[] obj = PatchProxy.applyOneRefs(p0, null, ContentType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ContentType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return ContentType.UNKNOWN.getContentClass();
          }
          oobject = obj[i];
          if (ContentType.equals(oobject.mType, p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject.getContentClass();
    }
    public static ContentType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ContentType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ContentType.class, p0);
    }
    public static ContentType[] values(){
       Object obj = PatchProxy.apply(null, null, ContentType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ContentType.$VALUES.clone();
    }
    public abstract Class getContentClass();
    public String getType(){
       return this.mType;
    }
}
