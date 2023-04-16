package com.kwai.feature.api.feed.misc.tag.event.TagFollowStatEvent;
import com.kwai.feature.api.feed.misc.tag.event.TagFollowStatEvent$Operation;
import com.kwai.feature.api.feed.misc.tag.event.TagFollowStatEvent$Status;
import com.kwai.feature.api.feed.misc.tag.event.TagFollowStatEvent$Source;
import java.lang.String;
import java.lang.Object;

public class TagFollowStatEvent	// class@000f6a
{
    public final TagFollowStatEvent$Operation a;
    public final TagFollowStatEvent$Status b;
    public final TagFollowStatEvent$Source c;
    public final String d;

    public void TagFollowStatEvent(TagFollowStatEvent$Operation p0,TagFollowStatEvent$Status p1,TagFollowStatEvent$Source p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
}
