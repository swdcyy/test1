package com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType;
import java.lang.Enum;
import com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType$1;
import java.lang.String;
import java.lang.Class;
import com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType$2;
import fx5.b;
import com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType$3;
import com.kwai.feature.api.social.profile.model.PendantAvatarContent;
import com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType$4;
import fx5.i;
import java.util.HashMap;
import m3c.b;
import java.lang.Object;
import java.util.Map;
import fx5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import m3c.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.q;

public abstract class EmptyGuideType extends Enum	// class@00133c
{
    public final Class mClazz;
    public static final EmptyGuideType[] $VALUES;
    public static final EmptyGuideType PENDANT_AVATAR;
    public static final EmptyGuideType POST;
    public static final EmptyGuideType SIMPLE_BUTTON;
    public static final EmptyGuideType UNKNOWN;
    public static final Map sContent2TypeMap;

    static {
       int i = 0;
       EmptyGuideType$1 u1 = new EmptyGuideType$1("UNKNOWN", i, null);
       EmptyGuideType.UNKNOWN = u1;
       int i1 = 1;
       EmptyGuideType$2 u2 = new EmptyGuideType$2("POST", i1, b.class);
       EmptyGuideType.POST = u2;
       EmptyGuideType$3 u3 = new EmptyGuideType$3("PENDANT_AVATAR", 2, PendantAvatarContent.class);
       EmptyGuideType.PENDANT_AVATAR = u3;
       EmptyGuideType$4 u4 = new EmptyGuideType$4("SIMPLE_BUTTON", 3, i.class);
       EmptyGuideType.SIMPLE_BUTTON = u4;
       EmptyGuideType[] uEmptyGuideT = new EmptyGuideType[]{u1,u2,u3,u4};
       EmptyGuideType.$VALUES = uEmptyGuideT;
       EmptyGuideType.sContent2TypeMap = new HashMap();
       EmptyGuideType[] uEmptyGuideT1 = EmptyGuideType.values();
       int len = uEmptyGuideT1.length;
       for (; i < len; i = i + 1) {
          object oobject = uEmptyGuideT1[i];
          EmptyGuideType.sContent2TypeMap.put(oobject.mClazz, new b(oobject));
       }
    }
    public void EmptyGuideType(String p0,int p1,Class p2){
       super(p0, p1);
       this.mClazz = p2;
    }
    public void EmptyGuideType(String p0,int p1,Class p2,EmptyGuideType$1 p3){
       super(p0, p1, p2);
    }
    public static a fromContent(a p0,BaseFragment p1,RecyclerFragment p2,ProfileParam p3){
       Map obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EmptyGuideType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class class = p0.getClass();
       obj = EmptyGuideType.sContent2TypeMap;
       class = (obj.containsKey(class))? obj.get(class).invoke(p1, p2, p3): null;
       return class;
    }
    public static EmptyGuideType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EmptyGuideType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EmptyGuideType.class, p0);
    }
    public static EmptyGuideType[] values(){
       Object obj = PatchProxy.apply(null, null, EmptyGuideType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EmptyGuideType.$VALUES.clone();
    }
    public abstract a createProcessor(BaseFragment p0,RecyclerFragment p1,ProfileParam p2);
}
