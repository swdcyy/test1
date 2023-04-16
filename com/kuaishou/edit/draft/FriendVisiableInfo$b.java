package com.kuaishou.edit.draft.FriendVisiableInfo$b;
import com.kuaishou.edit.draft.i;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FriendVisiableInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FriendVisiableInfo$a;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type;
import com.kuaishou.edit.draft.FriendVisiableInfo$User;
import java.util.List;
import java.util.Collections;

public final class FriendVisiableInfo$b extends GeneratedMessageLite$Builder implements i	// class@0017b5
{

    public void FriendVisiableInfo$b(){
       super(FriendVisiableInfo.DEFAULT_INSTANCE);
    }
    public void FriendVisiableInfo$b(FriendVisiableInfo$a p0){
       super(FriendVisiableInfo.DEFAULT_INSTANCE);
    }
    public FriendVisiableInfo$b a(FriendVisiableInfo$Type p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public FriendVisiableInfo$Type getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public FriendVisiableInfo$User getUserList(int p0){
       return this.instance.getUserList(p0);
    }
    public int getUserListCount(){
       return this.instance.getUserListCount();
    }
    public List getUserListList(){
       return Collections.unmodifiableList(this.instance.getUserListList());
    }
}
