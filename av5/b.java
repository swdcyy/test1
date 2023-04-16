package av5.b;
import f55.c;
import p55.a;
import com.kwai.feature.api.social.bridge.beans.FollowSearch$FriendSearchParams;
import f55.g;
import android.app.Activity;
import com.kwai.feature.api.social.bridge.beans.JsRemoveFansParams;
import com.kwai.feature.api.social.bridge.beans.RelationDeleteRedDot;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.bridge.beans.TietieChatPanel$TietieChatParams;
import com.kwai.feature.api.social.bridge.beans.FollowSearch$FollowSearchParams;
import com.kwai.feature.api.social.bridge.beans.JsUserAliasParams;
import com.kwai.feature.api.social.bridge.beans.FollowSearch$FollowUpdateUserParams;
import java.lang.String;
import com.kwai.feature.api.social.bridge.beans.FollowSearch$FollowSearchSyncParams;
import com.kwai.feature.api.social.bridge.beans.JsRelationUnReadFeedParam;
import com.kwai.feature.api.social.bridge.beans.EditUserAliasName;

public interface abstract b implements c	// class@0003bc
{

    void E6(a p0,FollowSearch$FriendSearchParams p1,g p2);
    void K1(Activity p0,JsRemoveFansParams p1,g p2);
    void M4(a p0,RelationDeleteRedDot p1);
    void Ma(a p0,GifshowActivity p1,TietieChatPanel$TietieChatParams p2,g p3);
    void W(a p0,FollowSearch$FollowSearchParams p1,g p2);
    void Y(Activity p0,g p1);
    void Z5(Activity p0,JsUserAliasParams p1,g p2);
    void g7(Activity p0,g p1);
    void j7(a p0,FollowSearch$FollowUpdateUserParams p1);
    void k7(Activity p0,g p1);
    void na(String p0,String p1);
    void p1(a p0,Activity p1,FollowSearch$FollowSearchSyncParams p2);
    void u9(GifshowActivity p0,JsRelationUnReadFeedParam p1,g p2);
    void x1(a p0,GifshowActivity p1,EditUserAliasName p2,g p3);
    void y8(Activity p0,g p1);
}
