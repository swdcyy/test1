package com.kwai.feature.api.feed.misc.tag.event.TagFollowStatEvent$Operation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TagFollowStatEvent$Operation extends Enum	// class@000f67
{
    public static final TagFollowStatEvent$Operation[] $VALUES;
    public static final TagFollowStatEvent$Operation FOLLOW;
    public static final TagFollowStatEvent$Operation UNFOLLOW;

    static {
       TagFollowStatEvent$Operation operation = new TagFollowStatEvent$Operation("FOLLOW", 0);
       TagFollowStatEvent$Operation.FOLLOW = operation;
       TagFollowStatEvent$Operation operation1 = new TagFollowStatEvent$Operation("UNFOLLOW", 1);
       TagFollowStatEvent$Operation.UNFOLLOW = operation1;
       TagFollowStatEvent$Operation[] operationArr = new TagFollowStatEvent$Operation[]{operation,operation1};
       TagFollowStatEvent$Operation.$VALUES = operationArr;
    }
    public void TagFollowStatEvent$Operation(String p0,int p1){
       super(p0, p1);
    }
    public static TagFollowStatEvent$Operation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TagFollowStatEvent$Operation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TagFollowStatEvent$Operation.class, p0);
    }
    public static TagFollowStatEvent$Operation[] values(){
       Object obj = PatchProxy.apply(null, null, TagFollowStatEvent$Operation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TagFollowStatEvent$Operation.$VALUES.clone();
    }
}
