package com.yxcorp.gifshow.channel.stagger.model.a;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.channel.stagger.model.LiveStreamNewStyleFeed;

public final class a implements PhotoType$a	// class@001072
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final BaseFeed a(){
       return new LiveStreamNewStyleFeed();
    }
}
