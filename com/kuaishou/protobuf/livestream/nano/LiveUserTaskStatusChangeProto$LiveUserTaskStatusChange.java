package com.kuaishou.protobuf.livestream.nano.LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange extends MessageNano	// class@000d23
{
    public long activityId;
    public long authorId;
    public long cycleNo;
    public boolean isCycle;
    public String jumpUrl;
    public long liveStreamId;
    public long taskId;
    public int taskStatus;
    public static LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange[] _emptyArray;

    public void LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange(){
       super();
       this.clear();
    }
    public static LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange[] emptyArray(){
       if (LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange._emptyArray == null) {
             LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange[] liveUserTask = new LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange[0];
             LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange._emptyArray = liveUserTask;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange._emptyArray;
    }
    public static LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange parseFrom(CodedInputByteBufferNano p0){
       return new LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange().mergeFrom(p0);
    }
    public static LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange(), p0);
    }
    public LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange clear(){
       this.liveStreamId = 0;
       this.authorId = 0;
       this.activityId = 0;
       this.taskId = 0;
       this.isCycle = false;
       this.cycleNo = 0;
       this.jumpUrl = "";
       this.taskStatus = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange tliveStreamI = this.liveStreamId;
       int i1 = 0;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tliveStreamI);
       }
       tliveStreamI = this.authorId;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tliveStreamI);
       }
       tliveStreamI = this.activityId;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tliveStreamI);
       }
       tliveStreamI = this.taskId;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tliveStreamI);
       }
       tliveStreamI = this.isCycle;
       if (tliveStreamI != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tliveStreamI);
       }
       tliveStreamI = this.cycleNo;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tliveStreamI);
       }
       if (!(this.jumpUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.jumpUrl);
       }
       tliveStreamI = this.taskStatus;
       if (tliveStreamI != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tliveStreamI);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  i = p0.readInt32();
                                  if (i && i != 1) {
                                     continue ;
                                  }else {
                                     this.taskStatus = i;
                                  }
                               }
                            }else {
                               this.jumpUrl = p0.readString();
                            }
                         }else {
                            this.cycleNo = p0.readUInt64();
                         }
                      }else {
                         this.isCycle = p0.readBool();
                      }
                   }else {
                      this.taskId = p0.readUInt64();
                   }
                }else {
                   this.activityId = p0.readUInt64();
                }
             }else {
                this.authorId = p0.readUInt64();
             }
          }else {
             this.liveStreamId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange tliveStreamI = this.liveStreamId;
       int i = 0;
       if (tliveStreamI - i) {
          p0.writeUInt64(1, tliveStreamI);
       }
       tliveStreamI = this.authorId;
       if (tliveStreamI - i) {
          p0.writeUInt64(2, tliveStreamI);
       }
       tliveStreamI = this.activityId;
       if (tliveStreamI - i) {
          p0.writeUInt64(3, tliveStreamI);
       }
       tliveStreamI = this.taskId;
       if (tliveStreamI - i) {
          p0.writeUInt64(4, tliveStreamI);
       }
       tliveStreamI = this.isCycle;
       if (tliveStreamI != null) {
          p0.writeBool(5, tliveStreamI);
       }
       tliveStreamI = this.cycleNo;
       if (tliveStreamI - i) {
          p0.writeUInt64(6, tliveStreamI);
       }
       if (!(this.jumpUrl).equals("")) {
          p0.writeString(7, this.jumpUrl);
       }
       tliveStreamI = this.taskStatus;
       if (tliveStreamI != null) {
          p0.writeInt32(8, tliveStreamI);
       }
       super.writeTo(p0);
       return;
    }
}
