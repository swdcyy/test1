package com.google.protobuf.RawMessageInfo;
import com.google.protobuf.MessageInfo;
import com.google.protobuf.MessageLite;
import java.lang.String;
import java.lang.Object;
import com.google.protobuf.ProtoSyntax;

public final class RawMessageInfo implements MessageInfo	// class@00049f
{
    public final MessageLite defaultInstance;
    public final int flags;
    public final String info;
    public final Object[] objects;

    public void RawMessageInfo(MessageLite p0,String p1,Object[] p2){
       super();
       this.defaultInstance = p0;
       this.info = p1;
       this.objects = p2;
       char c = p1.charAt(0);
       if (c < 0xd800) {
          this.flags = c;
       }else {
          int i = c & 0x1fff;
          int i1 = 13;
          int i2 = 1;
          int i3 = i2 + 1;
          char c1 = p1.charAt(i2);
          while (c1 >= 0xd800) {
             i2 = c1 & 0x1fff;
             i2 = i2 << i1;
             i = i | i2;
             i1 = i1 + 13;
             i2 = i3;
          }
          this.flags = i | (c1 << i1);
       }
       return;
    }
    public MessageLite getDefaultInstance(){
       return this.defaultInstance;
    }
    public Object[] getObjects(){
       return this.objects;
    }
    public String getStringInfo(){
       return this.info;
    }
    public ProtoSyntax getSyntax(){
       ProtoSyntax pROTO2 = ((this.flags & 1) == 1)? ProtoSyntax.PROTO2: ProtoSyntax.PROTO3;
       return pROTO2;
    }
    public boolean isMessageSetWireFormat(){
       boolean b = ((this.flags & 2) == 2)? true: false;
       return b;
    }
}
