package com.kuaishou.edit.draft.i;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type;
import com.kuaishou.edit.draft.FriendVisiableInfo$User;
import java.util.List;

public interface abstract i implements MessageLiteOrBuilder	// class@001932
{

    FriendVisiableInfo$Type getType();
    int getTypeValue();
    FriendVisiableInfo$User getUserList(int p0);
    int getUserListCount();
    List getUserListList();
}
