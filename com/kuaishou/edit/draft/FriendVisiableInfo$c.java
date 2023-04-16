package com.kuaishou.edit.draft.FriendVisiableInfo$c;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$HeadUrlInfo;
import java.util.List;

public interface abstract FriendVisiableInfo$c implements MessageLiteOrBuilder	// class@0017b6
{

    String getHeadUrl();
    ByteString getHeadUrlBytes();
    FriendVisiableInfo$User$HeadUrlInfo getHeadUrls(int p0);
    int getHeadUrlsCount();
    List getHeadUrlsList();
    String getId();
    ByteString getIdBytes();
    boolean getIsFollowing();
    String getName();
    ByteString getNameBytes();
    boolean getVisitorBeFollowed();
}
