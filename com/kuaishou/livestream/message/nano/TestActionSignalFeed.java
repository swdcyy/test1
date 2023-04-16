package com.kuaishou.livestream.message.nano.TestActionSignalFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class TestActionSignalFeed extends MessageNano	// class@001476
{
    public String content;
    public String deviceHash;
    public String id;
    public LiveAudienceState senderState;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public static TestActionSignalFeed[] _emptyArray;

    public void TestActionSignalFeed(){
       super();
       this.clear();
    }
    public static TestActionSignalFeed[] emptyArray(){
       if (TestActionSignalFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TestActionSignalFeed._emptyArray == null) {
             TestActionSignalFeed[] testActionSi = new TestActionSignalFeed[0];
             TestActionSignalFeed._emptyArray = testActionSi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TestActionSignalFeed._emptyArray;
    }
    public static TestActionSignalFeed parseFrom(CodedInputByteBufferNano p0){
       return new TestActionSignalFeed().mergeFrom(p0);
    }
    public static TestActionSignalFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TestActionSignalFeed(), p0);
    }
    public TestActionSignalFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.content = "";
       this.sortRank = 0;
       this.deviceHash = "";
       this.senderState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       TestActionSignalFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       TestActionSignalFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.content);
       }
       ttime = this.sortRank;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.deviceHash);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TestActionSignalFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else if(this.senderState == null){
                               this.senderState = new LiveAudienceState();
                            }
                            p0.readMessage(this.senderState);
                         }else {
                            this.deviceHash = p0.readString();
                         }
                      }else {
                         this.sortRank = p0.readUInt64();
                      }
                   }else {
                      this.content = p0.readString();
                   }
                }else {
                   this.time = p0.readUInt64();
                }
             }else if(this.user == null){
                this.user = new UserInfos$UserInfo();
             }
             p0.readMessage(this.user);
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       TestActionSignalFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       TestActionSignalFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(4, this.content);
       }
       ttime = this.sortRank;
       if (ttime) {
          p0.writeUInt64(5, ttime);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(6, this.deviceHash);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(7, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
