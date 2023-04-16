package com.kwai.feature.api.social.im.jsbridge.model.SearchMessageInChatResult;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class SearchMessageInChatResult implements Serializable	// class@001104
{
    public final List dataList;
    public final boolean hasMore;
    public final String offset;

    public void SearchMessageInChatResult(String p0,boolean p1,List p2){
       a.p(p2, "dataList");
       super();
       this.offset = p0;
       this.hasMore = p1;
       this.dataList = p2;
    }
}
