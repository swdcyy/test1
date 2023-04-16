package com.kwai.feature.api.feed.misc.tag.event.TagFollowStatEvent$Source;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TagFollowStatEvent$Source extends Enum	// class@000f68
{
    public static final TagFollowStatEvent$Source[] $VALUES;
    public static final TagFollowStatEvent$Source SEARCH_RESULT_TAG;
    public static final TagFollowStatEvent$Source TAG_PAGE;
    public static final TagFollowStatEvent$Source TAG_VOTE_POPUP;
    public static final TagFollowStatEvent$Source TOPIC_DETAIL_PAGE;

    static {
       TagFollowStatEvent$Source source = new TagFollowStatEvent$Source("TAG_PAGE", 0);
       TagFollowStatEvent$Source.TAG_PAGE = source;
       TagFollowStatEvent$Source source1 = new TagFollowStatEvent$Source("TOPIC_DETAIL_PAGE", 1);
       TagFollowStatEvent$Source.TOPIC_DETAIL_PAGE = source1;
       TagFollowStatEvent$Source source2 = new TagFollowStatEvent$Source("TAG_VOTE_POPUP", 2);
       TagFollowStatEvent$Source.TAG_VOTE_POPUP = source2;
       TagFollowStatEvent$Source source3 = new TagFollowStatEvent$Source("SEARCH_RESULT_TAG", 3);
       TagFollowStatEvent$Source.SEARCH_RESULT_TAG = source3;
       TagFollowStatEvent$Source[] sourceArray = new TagFollowStatEvent$Source[]{source,source1,source2,source3};
       TagFollowStatEvent$Source.$VALUES = sourceArray;
    }
    public void TagFollowStatEvent$Source(String p0,int p1){
       super(p0, p1);
    }
    public static TagFollowStatEvent$Source valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TagFollowStatEvent$Source.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TagFollowStatEvent$Source.class, p0);
    }
    public static TagFollowStatEvent$Source[] values(){
       Object obj = PatchProxy.apply(null, null, TagFollowStatEvent$Source.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TagFollowStatEvent$Source.$VALUES.clone();
    }
}
