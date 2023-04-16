package com.kwai.feature.api.social.reminder.model.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.social.reminder.model.ReminderRecommendUserListFeed;

public final class b implements PhotoType$a	// class@0011bc
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final BaseFeed a(){
       return new ReminderRecommendUserListFeed();
    }
}
