package pa6.p;
import java.lang.Object;
import com.kwai.framework.model.user.UserOwnerCount;

public class p	// class@002184
{
    public boolean isBlacked;
    public int isFollowed;
    public CDNUrl[] mAvatarPendants;
    public boolean mCommentDeny;
    public boolean mDownloadDeny;
    public boolean mFollowRequesting;
    public boolean mMessageDeny;
    public boolean mMissUDeny;
    public UserOwnerCount mOwnerCount;
    public String mOwnerHead;
    public CDNUrl[] mOwnerHeads;
    public String mOwnerId;
    public String mOwnerName;
    public String mOwnerSex;
    public int mPendantType;
    public boolean mPrivacyUser;
    public boolean mUserBanned;
    public boolean mUserMsgDeny;
    public String mUserProfileBgUrl;
    public CDNUrl[] mUserProfileBgUrls;
    public String mUserText;
    public boolean mVerified;

    public void p(){
       super();
       this.isFollowed = -1;
       this.mOwnerCount = new UserOwnerCount();
    }
}
