package com.kuaishou.edit.draft.Friend$b;
import z30.j0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Friend;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Friend$a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class Friend$b extends GeneratedMessageLite$Builder implements j0	// class@0017aa
{

    public void Friend$b(){
       super(Friend.DEFAULT_INSTANCE);
    }
    public void Friend$b(Friend$a p0){
       super(Friend.DEFAULT_INSTANCE);
    }
    public Friend$b a(String p0){
       this.copyOnWrite();
       this.instance.setFile(p0);
       return this;
    }
    public Friend$b b(String p0){
       this.copyOnWrite();
       this.instance.setId(p0);
       return this;
    }
    public String getFile(){
       return this.instance.getFile();
    }
    public ByteString getFileBytes(){
       return this.instance.getFileBytes();
    }
    public String getId(){
       return this.instance.getId();
    }
    public ByteString getIdBytes(){
       return this.instance.getIdBytes();
    }
}
