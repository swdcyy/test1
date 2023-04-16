package com.kuaishou.protobuf.livestream.nano.SCLivePuzzleStatistics;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLivePuzzleStatistics extends MessageNano	// class@000d6f
{
    public String puzzleLineChatId;
    public LivePuzzleUserInfo[] puzzleUser;
    public long roomOwnerId;
    public int status;
    public long time;
    public long version;
    public static SCLivePuzzleStatistics[] _emptyArray;

    public void SCLivePuzzleStatistics(){
       super();
       this.clear();
    }
    public static SCLivePuzzleStatistics[] emptyArray(){
       if (SCLivePuzzleStatistics._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLivePuzzleStatistics._emptyArray == null) {
             SCLivePuzzleStatistics[] sCLivePuzzle = new SCLivePuzzleStatistics[0];
             SCLivePuzzleStatistics._emptyArray = sCLivePuzzle;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLivePuzzleStatistics._emptyArray;
    }
    public static SCLivePuzzleStatistics parseFrom(CodedInputByteBufferNano p0){
       return new SCLivePuzzleStatistics().mergeFrom(p0);
    }
    public static SCLivePuzzleStatistics parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLivePuzzleStatistics(), p0);
    }
    public SCLivePuzzleStatistics clear(){
       this.puzzleLineChatId = "";
       this.puzzleUser = LivePuzzleUserInfo.emptyArray();
       this.time = 0;
       this.version = 0;
       this.status = 0;
       this.roomOwnerId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.puzzleLineChatId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.puzzleLineChatId);
       }
       SCLivePuzzleStatistics tpuzzleUser = this.puzzleUser;
       if (tpuzzleUser != null && tpuzzleUser.length > 0) {
          int i1 = 0;
          SCLivePuzzleStatistics tpuzzleUser1 = this.puzzleUser;
          while (i1 < tpuzzleUser1.length) {
             object oobject = tpuzzleUser1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpuzzleUser = this.time;
       int i2 = 0;
       if (tpuzzleUser - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tpuzzleUser);
       }
       tpuzzleUser = this.version;
       if (tpuzzleUser - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tpuzzleUser);
       }
       tpuzzleUser = this.status;
       if (tpuzzleUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tpuzzleUser);
       }
       tpuzzleUser = this.roomOwnerId;
       if (tpuzzleUser - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tpuzzleUser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLivePuzzleStatistics mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.roomOwnerId = p0.readUInt64();
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && i != 3))) {
                            continue ;
                         }else {
                            this.status = i;
                         }
                      }
                   }else {
                      this.version = p0.readUInt64();
                   }
                }else {
                   this.time = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                SCLivePuzzleStatistics tpuzzleUser = this.puzzleUser;
                int i2 = (tpuzzleUser == null)? 0: tpuzzleUser.length;
                i = i + i2;
                LivePuzzleUserInfo[] livePuzzleUs = new LivePuzzleUserInfo[i];
                if (i2) {
                   System.arraycopy(tpuzzleUser, 0, livePuzzleUs, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   livePuzzleUs[i2] = new LivePuzzleUserInfo();
                   p0.readMessage(livePuzzleUs[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                livePuzzleUs[i2] = new LivePuzzleUserInfo();
                p0.readMessage(livePuzzleUs[i2]);
                this.puzzleUser = livePuzzleUs;
             }
          }else {
             this.puzzleLineChatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.puzzleLineChatId).equals("")) {
          p0.writeString(1, this.puzzleLineChatId);
       }
       SCLivePuzzleStatistics tpuzzleUser = this.puzzleUser;
       if (tpuzzleUser != null && tpuzzleUser.length > 0) {
          int i = 0;
          SCLivePuzzleStatistics tpuzzleUser1 = this.puzzleUser;
          while (i < tpuzzleUser1.length) {
             object oobject = tpuzzleUser1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       tpuzzleUser = this.time;
       int i1 = 0;
       if (tpuzzleUser - i1) {
          p0.writeUInt64(3, tpuzzleUser);
       }
       tpuzzleUser = this.version;
       if (tpuzzleUser - i1) {
          p0.writeUInt64(4, tpuzzleUser);
       }
       tpuzzleUser = this.status;
       if (tpuzzleUser != null) {
          p0.writeInt32(5, tpuzzleUser);
       }
       tpuzzleUser = this.roomOwnerId;
       if (tpuzzleUser - i1) {
          p0.writeUInt64(6, tpuzzleUser);
       }
       super.writeTo(p0);
       return;
    }
}
