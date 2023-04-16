package com.kuaishou.edit.draft.FriendVisiableInfo$User$a;
import com.kuaishou.edit.draft.FriendVisiableInfo$c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FriendVisiableInfo$User;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FriendVisiableInfo$a;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$HeadUrlInfo;
import java.util.List;
import java.util.Collections;

public final class FriendVisiableInfo$User$a extends GeneratedMessageLite$Builder implements FriendVisiableInfo$c	// class@0017b1
{

    public void FriendVisiableInfo$User$a(){
       super(FriendVisiableInfo$User.DEFAULT_INSTANCE);
    }
    public void FriendVisiableInfo$User$a(FriendVisiableInfo$a p0){
       super(FriendVisiableInfo$User.DEFAULT_INSTANCE);
    }
    public String getHeadUrl(){
       return this.instance.getHeadUrl();
    }
    public ByteString getHeadUrlBytes(){
       return this.instance.getHeadUrlBytes();
    }
    public FriendVisiableInfo$User$HeadUrlInfo getHeadUrls(int p0){
       return this.instance.getHeadUrls(p0);
    }
    public int getHeadUrlsCount(){
       return this.instance.getHeadUrlsCount();
    }
    public List getHeadUrlsList(){
       return Collections.unmodifiableList(this.instance.getHeadUrlsList());
    }
    public String getId(){
       return this.instance.getId();
    }
    public ByteString getIdBytes(){
       return this.instance.getIdBytes();
    }
    public boolean getIsFollowing(){
       return this.instance.getIsFollowing();
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
    public boolean getVisitorBeFollowed(){
       return this.instance.getVisitorBeFollowed();
    }
}
