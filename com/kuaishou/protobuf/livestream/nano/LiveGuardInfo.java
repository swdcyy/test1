package com.kuaishou.protobuf.livestream.nano.LiveGuardInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveGuardInfo extends MessageNano	// class@000c93
{
    public long deadline;
    public UserInfos$PicUrl[] emptyGuardPict;
    public UserInfos$PicUrl[] emptyGuardPictInPanel;
    public int guardGradeNo;
    public UserInfos$PicUrl[] guardRing;
    public UserInfos$UserInfo guardUserInfo;
    public boolean needShowAction;
    public UserInfos$PicUrl[] panelBgPict;
    public UserInfos$PicUrl[] panelGuardRing;
    public int status;
    public static LiveGuardInfo[] _emptyArray;

    public void LiveGuardInfo(){
       super();
       this.clear();
    }
    public static LiveGuardInfo[] emptyArray(){
       if (LiveGuardInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGuardInfo._emptyArray == null) {
             LiveGuardInfo[] liveGuardInf = new LiveGuardInfo[0];
             LiveGuardInfo._emptyArray = liveGuardInf;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGuardInfo._emptyArray;
    }
    public static LiveGuardInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveGuardInfo().mergeFrom(p0);
    }
    public static LiveGuardInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGuardInfo(), p0);
    }
    public LiveGuardInfo clear(){
       this.status = 0;
       this.emptyGuardPict = UserInfos$PicUrl.emptyArray();
       this.emptyGuardPictInPanel = UserInfos$PicUrl.emptyArray();
       this.guardRing = UserInfos$PicUrl.emptyArray();
       this.panelGuardRing = UserInfos$PicUrl.emptyArray();
       this.guardUserInfo = null;
       this.guardGradeNo = 0;
       this.deadline = 0;
       this.panelBgPict = UserInfos$PicUrl.emptyArray();
       this.needShowAction = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveGuardInfo temptyGuardP;
       object oobject;
       int i = super.computeSerializedSize();
       LiveGuardInfo tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tstatus);
       }
       tstatus = this.emptyGuardPict;
       int i1 = 0;
       if (tstatus != null && tstatus.length > 0) {
          i2 = 0;
          temptyGuardP = this.emptyGuardPict;
          while (i2 < temptyGuardP.length) {
             oobject = temptyGuardP[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstatus = this.emptyGuardPictInPanel;
       if (tstatus != null && tstatus.length > 0) {
          i2 = 0;
          temptyGuardP = this.emptyGuardPictInPanel;
          while (i2 < temptyGuardP.length) {
             oobject = temptyGuardP[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstatus = this.guardRing;
       if (tstatus != null && tstatus.length > 0) {
          i2 = 0;
          temptyGuardP = this.guardRing;
          while (i2 < temptyGuardP.length) {
             oobject = temptyGuardP[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstatus = this.panelGuardRing;
       if (tstatus != null && tstatus.length > 0) {
          i2 = 0;
          temptyGuardP = this.panelGuardRing;
          while (i2 < temptyGuardP.length) {
             oobject = temptyGuardP[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstatus = this.guardUserInfo;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tstatus);
       }
       tstatus = this.guardGradeNo;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tstatus);
       }
       temptyGuardP = this.deadline;
       if (temptyGuardP) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(8, temptyGuardP);
       }
       tstatus = this.panelBgPict;
       if (tstatus != null && tstatus.length > 0) {
          tstatus = this.panelBgPict;
          while (i1 < tstatus.length) {
             object oobject1 = tstatus[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tstatus = this.needShowAction;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGuardInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveGuardInfo temptyGuardP;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.status = i;
                }
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                temptyGuardP = this.emptyGuardPict;
                i2 = (temptyGuardP == null)? 0: temptyGuardP.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(temptyGuardP, i1, picUrlArray, i1, i2);
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
                this.emptyGuardPict = picUrlArray;
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                temptyGuardP = this.emptyGuardPictInPanel;
                i2 = (temptyGuardP == null)? 0: temptyGuardP.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(temptyGuardP, i1, picUrlArray, i1, i2);
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
                this.emptyGuardPictInPanel = picUrlArray;
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                temptyGuardP = this.guardRing;
                i2 = (temptyGuardP == null)? 0: temptyGuardP.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(temptyGuardP, i1, picUrlArray, i1, i2);
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
                this.guardRing = picUrlArray;
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                temptyGuardP = this.panelGuardRing;
                i2 = (temptyGuardP == null)? 0: temptyGuardP.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(temptyGuardP, i1, picUrlArray, i1, i2);
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
                this.panelGuardRing = picUrlArray;
                break;
              case '2':
                if (this.guardUserInfo == null) {
                   this.guardUserInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.guardUserInfo);
                break;
              case '8':
                this.guardGradeNo = p0.readInt32();
                break;
              case '@':
                this.deadline = p0.readInt64();
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                temptyGuardP = this.panelBgPict;
                i2 = (temptyGuardP == null)? 0: temptyGuardP.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(temptyGuardP, i1, picUrlArray, i1, i2);
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
                this.panelBgPict = picUrlArray;
                break;
              case 'P':
                this.needShowAction = p0.readBool();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveGuardInfo temptyGuardP;
       object oobject;
       LiveGuardInfo tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(1, tstatus);
       }
       tstatus = this.emptyGuardPict;
       int i = 0;
       if (tstatus != null && tstatus.length > 0) {
          i1 = 0;
          temptyGuardP = this.emptyGuardPict;
          while (i1 < temptyGuardP.length) {
             oobject = temptyGuardP[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstatus = this.emptyGuardPictInPanel;
       if (tstatus != null && tstatus.length > 0) {
          i1 = 0;
          temptyGuardP = this.emptyGuardPictInPanel;
          while (i1 < temptyGuardP.length) {
             oobject = temptyGuardP[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstatus = this.guardRing;
       if (tstatus != null && tstatus.length > 0) {
          i1 = 0;
          temptyGuardP = this.guardRing;
          while (i1 < temptyGuardP.length) {
             oobject = temptyGuardP[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstatus = this.panelGuardRing;
       if (tstatus != null && tstatus.length > 0) {
          i1 = 0;
          temptyGuardP = this.panelGuardRing;
          while (i1 < temptyGuardP.length) {
             oobject = temptyGuardP[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstatus = this.guardUserInfo;
       if (tstatus != null) {
          p0.writeMessage(6, tstatus);
       }
       tstatus = this.guardGradeNo;
       if (tstatus != null) {
          p0.writeInt32(7, tstatus);
       }
       temptyGuardP = this.deadline;
       if (temptyGuardP) {
          p0.writeInt64(8, temptyGuardP);
       }
       tstatus = this.panelBgPict;
       if (tstatus != null && tstatus.length > 0) {
          tstatus = this.panelBgPict;
          while (i < tstatus.length) {
             object oobject1 = tstatus[i];
             if (oobject1 != null) {
                p0.writeMessage(9, oobject1);
             }
             i = i + 1;
          }
       }
       tstatus = this.needShowAction;
       if (tstatus != null) {
          p0.writeBool(10, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
