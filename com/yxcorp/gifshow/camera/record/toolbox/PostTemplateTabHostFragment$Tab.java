package com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment$Tab;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostTemplateTabHostFragment$Tab extends Enum	// class@000f58
{
    public static final PostTemplateTabHostFragment$Tab[] $VALUES;
    public static final PostTemplateTabHostFragment$Tab FOLLOW_KRN;
    public static final PostTemplateTabHostFragment$Tab TEMPLATE;

    static {
       PostTemplateTabHostFragment$Tab tab = new PostTemplateTabHostFragment$Tab("TEMPLATE", 0);
       PostTemplateTabHostFragment$Tab.TEMPLATE = tab;
       PostTemplateTabHostFragment$Tab tab1 = new PostTemplateTabHostFragment$Tab("FOLLOW_KRN", 1);
       PostTemplateTabHostFragment$Tab.FOLLOW_KRN = tab1;
       PostTemplateTabHostFragment$Tab[] tabArray = new PostTemplateTabHostFragment$Tab[]{tab,tab1};
       PostTemplateTabHostFragment$Tab.$VALUES = tabArray;
    }
    public void PostTemplateTabHostFragment$Tab(String p0,int p1){
       super(p0, p1);
    }
    public static PostTemplateTabHostFragment$Tab valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostTemplateTabHostFragment$Tab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostTemplateTabHostFragment$Tab.class, p0);
    }
    public static PostTemplateTabHostFragment$Tab[] values(){
       Object obj = PatchProxy.apply(null, null, PostTemplateTabHostFragment$Tab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostTemplateTabHostFragment$Tab.$VALUES.clone();
    }
}
