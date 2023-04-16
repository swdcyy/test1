package com.kwai.feature.api.feed.misc.tag.event.TagFollowStatEvent$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TagFollowStatEvent$Status extends Enum	// class@000f69
{
    public static final TagFollowStatEvent$Status[] $VALUES;
    public static final TagFollowStatEvent$Status FAIL;
    public static final TagFollowStatEvent$Status START;
    public static final TagFollowStatEvent$Status SUCCESS;

    static {
       TagFollowStatEvent$Status status = new TagFollowStatEvent$Status("START", 0);
       TagFollowStatEvent$Status.START = status;
       TagFollowStatEvent$Status status1 = new TagFollowStatEvent$Status("SUCCESS", 1);
       TagFollowStatEvent$Status.SUCCESS = status1;
       TagFollowStatEvent$Status status2 = new TagFollowStatEvent$Status("FAIL", 2);
       TagFollowStatEvent$Status.FAIL = status2;
       TagFollowStatEvent$Status[] statusArray = new TagFollowStatEvent$Status[]{status,status1,status2};
       TagFollowStatEvent$Status.$VALUES = statusArray;
    }
    public void TagFollowStatEvent$Status(String p0,int p1){
       super(p0, p1);
    }
    public static TagFollowStatEvent$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TagFollowStatEvent$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TagFollowStatEvent$Status.class, p0);
    }
    public static TagFollowStatEvent$Status[] values(){
       Object obj = PatchProxy.apply(null, null, TagFollowStatEvent$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TagFollowStatEvent$Status.$VALUES.clone();
    }
}
