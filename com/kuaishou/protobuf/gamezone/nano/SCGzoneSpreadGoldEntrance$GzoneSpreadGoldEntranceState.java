package com.kuaishou.protobuf.gamezone.nano.SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState extends MessageNano	// class@000bdf
{
    public String animationUrl;
    public UserInfos$PicUrl[] bottomPicUrl;
    public long endTimeMills;
    public UserInfos$PicUrl[] picUrl;
    public long startTimeMills;
    public int state;
    public static SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState[] _emptyArray;

    public void SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState(){
       super();
       this.clear();
    }
    public static SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState[] emptyArray(){
       if (SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState._emptyArray == null) {
             SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState[] gzoneSpreadG = new SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState[0];
             SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState._emptyArray = gzoneSpreadG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState._emptyArray;
    }
    public static SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState().mergeFrom(p0);
    }
    public static SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState(), p0);
    }
    public SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState clear(){
       this.startTimeMills = 0;
       this.endTimeMills = 0;
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.bottomPicUrl = UserInfos$PicUrl.emptyArray();
       this.animationUrl = "";
       this.state = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState tstartTimeMi = this.startTimeMills;
       SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState gzoneSpreadG = null;
       if (tstartTimeMi - gzoneSpreadG) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstartTimeMi);
       }
       tstartTimeMi = this.endTimeMills;
       if (tstartTimeMi - gzoneSpreadG) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTimeMi);
       }
       tstartTimeMi = this.picUrl;
       int i1 = 0;
       if (tstartTimeMi != null && tstartTimeMi.length > 0) {
          int i2 = 0;
          gzoneSpreadG = this.picUrl;
          while (i2 < gzoneSpreadG.length) {
             object oobject = gzoneSpreadG[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstartTimeMi = this.bottomPicUrl;
       if (tstartTimeMi != null && tstartTimeMi.length > 0) {
          tstartTimeMi = this.bottomPicUrl;
          while (i1 < tstartTimeMi.length) {
             object oobject1 = tstartTimeMi[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.animationUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.animationUrl);
       }
       tstartTimeMi = this.state;
       if (tstartTimeMi != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tstartTimeMi);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState mergeFrom(CodedInputByteBufferNano p0){
       SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState tbottomPicUr;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && (i != 2 && i != 3))) {
                               continue ;
                            }else {
                               this.state = i;
                            }
                         }
                      }else {
                         this.animationUrl = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tbottomPicUr = this.bottomPicUrl;
                      i2 = (tbottomPicUr == null)? 0: tbottomPicUr.length;
                      i = i + i2;
                      picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(tbottomPicUr, 0, picUrlArray, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         picUrlArray[i2] = new UserInfos$PicUrl();
                         p0.readMessage(picUrlArray[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      picUrlArray[i2] = new UserInfos$PicUrl();
                      p0.readMessage(picUrlArray[i2]);
                      this.bottomPicUrl = picUrlArray;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tbottomPicUr = this.picUrl;
                   i2 = (tbottomPicUr == null)? 0: tbottomPicUr.length;
                   i = i + i2;
                   picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tbottomPicUr, 0, picUrlArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      picUrlArray[i2] = new UserInfos$PicUrl();
                      p0.readMessage(picUrlArray[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   this.picUrl = picUrlArray;
                }
             }else {
                this.endTimeMills = p0.readUInt64();
             }
          }else {
             this.startTimeMills = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState tstartTimeMi = this.startTimeMills;
       SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState gzoneSpreadG = null;
       if (tstartTimeMi - gzoneSpreadG) {
          p0.writeUInt64(1, tstartTimeMi);
       }
       tstartTimeMi = this.endTimeMills;
       if (tstartTimeMi - gzoneSpreadG) {
          p0.writeUInt64(2, tstartTimeMi);
       }
       tstartTimeMi = this.picUrl;
       int i = 0;
       if (tstartTimeMi != null && tstartTimeMi.length > 0) {
          int i1 = 0;
          gzoneSpreadG = this.picUrl;
          while (i1 < gzoneSpreadG.length) {
             object oobject = gzoneSpreadG[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstartTimeMi = this.bottomPicUrl;
       if (tstartTimeMi != null && tstartTimeMi.length > 0) {
          tstartTimeMi = this.bottomPicUrl;
          while (i < tstartTimeMi.length) {
             object oobject1 = tstartTimeMi[i];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.animationUrl).equals("")) {
          p0.writeString(5, this.animationUrl);
       }
       tstartTimeMi = this.state;
       if (tstartTimeMi != null) {
          p0.writeInt32(6, tstartTimeMi);
       }
       super.writeTo(p0);
       return;
    }
}
