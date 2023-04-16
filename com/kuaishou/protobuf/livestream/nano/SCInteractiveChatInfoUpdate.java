package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatInfoUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserCommonInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;

public final class SCInteractiveChatInfoUpdate extends MessageNano	// class@000d39
{
    public InteractiveChatBizIdentity bizIdentity;
    public String liveStreamId;
    public Map muteState;
    public String sessionId;
    public Map userCommonInfos;
    public long version;
    public static SCInteractiveChatInfoUpdate[] _emptyArray;

    public void SCInteractiveChatInfoUpdate(){
       super();
       this.clear();
    }
    public static SCInteractiveChatInfoUpdate[] emptyArray(){
       if (SCInteractiveChatInfoUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatInfoUpdate._emptyArray == null) {
             SCInteractiveChatInfoUpdate[] sCInteractiv = new SCInteractiveChatInfoUpdate[0];
             SCInteractiveChatInfoUpdate._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatInfoUpdate._emptyArray;
    }
    public static SCInteractiveChatInfoUpdate parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatInfoUpdate().mergeFrom(p0);
    }
    public static SCInteractiveChatInfoUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatInfoUpdate(), p0);
    }
    public SCInteractiveChatInfoUpdate clear(){
       this.bizIdentity = null;
       this.liveStreamId = "";
       this.muteState = null;
       this.sessionId = "";
       this.userCommonInfos = null;
       this.version = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCInteractiveChatInfoUpdate tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tbizIdentity);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       tbizIdentity = this.muteState;
       int i1 = 9;
       if (tbizIdentity != null) {
          i = i + InternalNano.computeMapFieldSize(tbizIdentity, 3, i1, 8);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.sessionId);
       }
       tbizIdentity = this.userCommonInfos;
       if (tbizIdentity != null) {
          i = i + InternalNano.computeMapFieldSize(tbizIdentity, 5, i1, 11);
       }
       tbizIdentity = this.version;
       if (tbizIdentity) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tbizIdentity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatInfoUpdate mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.version = p0.readUInt64();
                         }
                      }else {
                         this.userCommonInfos = InternalNano.mergeMapEntry(p0, this.userCommonInfos, mapFactory, 9, 11, new InteractiveChatUserCommonInfo(), 10, 18);
                      }
                   }else {
                      this.sessionId = p0.readString();
                   }
                }else {
                   this.muteState = InternalNano.mergeMapEntry(p0, this.muteState, mapFactory, 9, 8, null, 10, 16);
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else if(this.bizIdentity == null){
             this.bizIdentity = new InteractiveChatBizIdentity();
          }
          p0.readMessage(this.bizIdentity);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCInteractiveChatInfoUpdate tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(1, tbizIdentity);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       tbizIdentity = this.muteState;
       int i = 9;
       if (tbizIdentity != null) {
          InternalNano.serializeMapField(p0, tbizIdentity, 3, i, 8);
       }
       if (!(this.sessionId).equals(str)) {
          p0.writeString(4, this.sessionId);
       }
       tbizIdentity = this.userCommonInfos;
       if (tbizIdentity != null) {
          InternalNano.serializeMapField(p0, tbizIdentity, 5, i, 11);
       }
       tbizIdentity = this.version;
       if (tbizIdentity) {
          p0.writeUInt64(6, tbizIdentity);
       }
       super.writeTo(p0);
       return;
    }
}
