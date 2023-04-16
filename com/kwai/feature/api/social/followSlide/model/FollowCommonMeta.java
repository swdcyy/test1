package com.kwai.feature.api.social.followSlide.model.FollowCommonMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.CommonMeta;
import fa6.e;
import fa6.b;

public class FollowCommonMeta implements Serializable	// class@0010cb
{
    public FollowSlideRecoGuide mFollowSlideRecoGuide;
    public static final String PART_FIELD = "followCommonMeta";
    public static final long serialVersionUID = 0x1fbd07d777ee5ffa;

    public void FollowCommonMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, FollowCommonMeta.class, "1")) {
          return;
       }
       e uoe = new e(FollowCommonMeta.class, "", "followCommonMeta");
       uoe.a(null);
       c.a.e(CommonMeta.class, uoe);
       return;
    }
}
