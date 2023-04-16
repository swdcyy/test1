package com.kwai.feature.api.social.im.jsbridge.model.MessageSearchData;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class MessageSearchData implements Serializable	// class@0010fa
{
    public final List data;
    public final boolean hasMore;
    public final int type;

    public void MessageSearchData(int p0,boolean p1,List p2){
       a.p(p2, "data");
       super();
       this.type = p0;
       this.hasMore = p1;
       this.data = p2;
    }
    public final List getData(){
       return this.data;
    }
    public final boolean getHasMore(){
       return this.hasMore;
    }
    public final int getType(){
       return this.type;
    }
}
