package com.yxcorp.gifshow.notice.krn.style.ContentAlign;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ContentAlign extends Enum	// class@0021b1
{
    public static final ContentAlign[] $VALUES;
    public static final ContentAlign BOTTOM;
    public static final ContentAlign CENTER;

    static {
       ContentAlign uContentAlig = new ContentAlign("BOTTOM", 0);
       ContentAlign.BOTTOM = uContentAlig;
       ContentAlign uContentAlig1 = new ContentAlign("CENTER", 1);
       ContentAlign.CENTER = uContentAlig1;
       ContentAlign[] uContentAlig2 = new ContentAlign[]{uContentAlig,uContentAlig1};
       ContentAlign.$VALUES = uContentAlig2;
    }
    public void ContentAlign(String p0,int p1){
       super(p0, p1);
    }
    public static ContentAlign valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ContentAlign.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ContentAlign.class, p0);
    }
    public static ContentAlign[] values(){
       Object obj = PatchProxy.apply(null, null, ContentAlign.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ContentAlign.$VALUES.clone();
    }
}
