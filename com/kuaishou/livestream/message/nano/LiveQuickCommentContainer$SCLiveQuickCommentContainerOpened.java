package com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$LiveQuickCommentItem;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened extends MessageNano	// class@001257
{
    public String bizId;
    public boolean clickDisappear;
    public LiveQuickCommentContainer$LiveQuickCommentItem[] comment;
    public long delayDisplayMs;
    public long displayExpireTimestamp;
    public long priority;
    public long slideInternalMs;
    public int[] triggerCondition;
    public static LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened[] _emptyArray;

    public void LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened(){
       super();
       this.clear();
    }
    public static LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened[] emptyArray(){
       if (LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened._emptyArray == null) {
             LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened[] sCLiveQuickC = new LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened[0];
             LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened._emptyArray = sCLiveQuickC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened._emptyArray;
    }
    public static LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened().mergeFrom(p0);
    }
    public static LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened(), p0);
    }
    public LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened clear(){
       this.bizId = "";
       this.priority = 0;
       this.comment = LiveQuickCommentContainer$LiveQuickCommentItem.emptyArray();
       this.triggerCondition = WireFormatNano.EMPTY_INT_ARRAY;
       this.clickDisappear = false;
       this.slideInternalMs = 0;
       this.displayExpireTimestamp = 0;
       this.delayDisplayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened tcomment1;
       int i = super.computeSerializedSize();
       int i1 = 1;
       if (!(this.bizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.bizId);
       }
       LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened tpriority = this.priority;
       if (tpriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tpriority);
       }
       LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened tcomment = this.comment;
       int i2 = 0;
       if (tcomment != null && tcomment.length > 0) {
          i3 = 0;
          tcomment1 = this.comment;
          while (i3 < tcomment1.length) {
             object oobject = tcomment1[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i3 = i3 + 1;
          }
       }
       tcomment = this.triggerCondition;
       if (tcomment != null && tcomment.length > 0) {
          i3 = 0;
          tcomment1 = this.triggerCondition;
          while (i2 < tcomment1.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tcomment1[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tcomment1.length * 1);
       }
       tcomment = this.clickDisappear;
       if (tcomment != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tcomment);
       }
       tcomment = this.slideInternalMs;
       if (tcomment) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tcomment);
       }
       tcomment = this.displayExpireTimestamp;
       if (tcomment) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tcomment);
       }
       tcomment = this.delayDisplayMs;
       if (tcomment) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tcomment);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened mergeFrom(CodedInputByteBufferNano p0){
       int i3;
       int i4;
       int i5;
       LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened ttriggerCond;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                int i1 = 26;
                int i2 = 0;
                if (i != i1) {
                   i1 = 32;
                   i3 = 1;
                   if (i != i1) {
                      if (i != 34) {
                         if (i != 40) {
                            if (i != 48) {
                               if (i != 56) {
                                  if (i != 64) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.delayDisplayMs = p0.readUInt64();
                                  }
                               }else {
                                  this.displayExpireTimestamp = p0.readUInt64();
                               }
                            }else {
                               this.slideInternalMs = p0.readUInt64();
                            }
                         }else {
                            this.clickDisappear = p0.readBool();
                         }
                      }else {
                         i = p0.pushLimit(p0.readRawVarint32());
                         i1 = p0.getPosition();
                         i4 = 0;
                         while (p0.getBytesUntilLimit() > 0) {
                            i5 = p0.readInt32();
                            if (i5 && i5 != i3) {
                               continue ;
                            }
                            i4 = i4 + 1;
                         }
                         if (i4) {
                            p0.rewindToPosition(i1);
                            ttriggerCond = this.triggerCondition;
                            i5 = (ttriggerCond == null)? 0: ttriggerCond.length;
                            i4 = i4 + i5;
                            int[] ointArray = new int[i4];
                            if (i5) {
                               System.arraycopy(ttriggerCond, i2, ointArray, i2, i5);
                            }
                            while (p0.getBytesUntilLimit() > 0) {
                               i1 = p0.readInt32();
                               if (i1 && i1 != i3) {
                                  continue ;
                               }
                               i2 = i5 + 1;
                               ointArray[i5] = i1;
                               i5 = i2;
                            }
                            this.triggerCondition = ointArray;
                         }
                         p0.popLimit(i);
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      int[] ointArray1 = new int[i];
                      i4 = 0;
                      i5 = 0;
                      while (i4 < i) {
                         if (i4) {
                            p0.readTag();
                         }
                         int i6 = p0.readInt32();
                         if (!i6 || i6 == i3) {
                            int i7 = i5 + 1;
                            ointArray1[i5] = i6;
                            i5 = i7;
                         }
                         i4 = i4 + 1;
                      }
                      if (i5) {
                         LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened ttriggerCond1 = this.triggerCondition;
                         i4 = (ttriggerCond1 == null)? 0: ttriggerCond1.length;
                         if (!i4 && i5 == i) {
                            this.triggerCondition = ointArray1;
                         }else {
                            i = i4 + i5;
                            int[] ointArray2 = new int[i];
                            if (i4) {
                               System.arraycopy(ttriggerCond1, i2, ointArray2, i2, i4);
                            }
                            System.arraycopy(ointArray1, i2, ointArray2, i4, i5);
                            this.triggerCondition = ointArray2;
                         }
                      }
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   ttriggerCond = this.comment;
                   i3 = (ttriggerCond == null)? 0: ttriggerCond.length;
                   i = i + i3;
                   LiveQuickCommentContainer$LiveQuickCommentItem[] liveQuickCom = new LiveQuickCommentContainer$LiveQuickCommentItem[i];
                   if (i3) {
                      System.arraycopy(ttriggerCond, i2, liveQuickCom, i2, i3);
                   }
                   i1 = i - 1;
                   while (i3 < i1) {
                      liveQuickCom[i3] = new LiveQuickCommentContainer$LiveQuickCommentItem();
                      p0.readMessage(liveQuickCom[i3]);
                      p0.readTag();
                      i3 = i3 + 1;
                   }
                   liveQuickCom[i3] = new LiveQuickCommentContainer$LiveQuickCommentItem();
                   p0.readMessage(liveQuickCom[i3]);
                   this.comment = liveQuickCom;
                }
             }else {
                this.priority = p0.readUInt64();
             }
          }else {
             this.bizId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.bizId).equals("")) {
          p0.writeString(1, this.bizId);
       }
       LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened tpriority = this.priority;
       int i = 0;
       if (tpriority - i) {
          p0.writeUInt64(2, tpriority);
       }
       tpriority = this.comment;
       int i1 = 0;
       if (tpriority != null && tpriority.length > 0) {
          int i2 = 0;
          LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened tcomment = this.comment;
          while (i2 < tcomment.length) {
             object oobject = tcomment[i2];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tpriority = this.triggerCondition;
       if (tpriority != null && tpriority.length > 0) {
          tpriority = this.triggerCondition;
          while (i1 < tpriority.length) {
             p0.writeInt32(4, tpriority[i1]);
             i1 = i1 + 1;
          }
       }
       tpriority = this.clickDisappear;
       if (tpriority != null) {
          p0.writeBool(5, tpriority);
       }
       tpriority = this.slideInternalMs;
       if (tpriority - i) {
          p0.writeUInt64(6, tpriority);
       }
       tpriority = this.displayExpireTimestamp;
       if (tpriority - i) {
          p0.writeUInt64(7, tpriority);
       }
       tpriority = this.delayDisplayMs;
       if (tpriority - i) {
          p0.writeUInt64(8, tpriority);
       }
       super.writeTo(p0);
       return;
    }
}
