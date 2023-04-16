package com.kuaishou.edit.draft.AtFriend$b;
import z30.i;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AtFriend;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AtFriend$a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class AtFriend$b extends GeneratedMessageLite$Builder implements i	// class@001728
{

    public void AtFriend$b(){
       super(AtFriend.DEFAULT_INSTANCE);
    }
    public void AtFriend$b(AtFriend$a p0){
       super(AtFriend.DEFAULT_INSTANCE);
    }
    public AtFriend$b a(String p0){
       this.copyOnWrite();
       this.instance.setIdentifier(p0);
       return this;
    }
    public AtFriend$b b(boolean p0){
       this.copyOnWrite();
       this.instance.setIsMutualFriend(p0);
       return this;
    }
    public AtFriend$b c(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public String getIdentifier(){
       return this.instance.getIdentifier();
    }
    public ByteString getIdentifierBytes(){
       return this.instance.getIdentifierBytes();
    }
    public boolean getIsMutualFriend(){
       return this.instance.getIsMutualFriend();
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
}
