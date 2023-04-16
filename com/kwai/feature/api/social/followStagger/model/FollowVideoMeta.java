package com.kwai.feature.api.social.followStagger.model.FollowVideoMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.feed.VideoFeed;
import fa6.e;
import fa6.b;

public class FollowVideoMeta implements Serializable	// class@0010d9
{
    public FeedUserAvatarInfo mUserAvatarInfo;
    public static final String PART_FIELD = "followVideoMeta";
    public static final long serialVersionUID = 0x4404d3627e303f74;

    public void FollowVideoMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, FollowVideoMeta.class, "1")) {
          return;
       }
       e uoe = new e(FollowVideoMeta.class, "", "followVideoMeta");
       uoe.a(null);
       c.a.e(VideoFeed.class, uoe);
       return;
    }
}
