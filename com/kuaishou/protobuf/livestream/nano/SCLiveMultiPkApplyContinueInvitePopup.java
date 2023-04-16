package com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkApplyContinueInvitePopup;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkContinueInviteUserInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.MultiPKSignalCommonInfo;

public final class SCLiveMultiPkApplyContinueInvitePopup extends MessageNano	// class@000d5f
{
    public MultiPKSignalCommonInfo commonInfo;
    public String noticeSubtitle;
    public String noticeTitle;
    public LiveMultiPkContinueInviteUserInfo[] userInfo;
    public static SCLiveMultiPkApplyContinueInvitePopup[] _emptyArray;

    public void SCLiveMultiPkApplyContinueInvitePopup(){
       super();
       this.clear();
    }
    public static SCLiveMultiPkApplyContinueInvitePopup[] emptyArray(){
       if (SCLiveMultiPkApplyContinueInvitePopup._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiPkApplyContinueInvitePopup._emptyArray == null) {
             SCLiveMultiPkApplyContinueInvitePopup[] sCLiveMultiP = new SCLiveMultiPkApplyContinueInvitePopup[0];
             SCLiveMultiPkApplyContinueInvitePopup._emptyArray = sCLiveMultiP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiPkApplyContinueInvitePopup._emptyArray;
    }
    public static SCLiveMultiPkApplyContinueInvitePopup parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiPkApplyContinueInvitePopup().mergeFrom(p0);
    }
    public static SCLiveMultiPkApplyContinueInvitePopup parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiPkApplyContinueInvitePopup(), p0);
    }
    public SCLiveMultiPkApplyContinueInvitePopup clear(){
       this.commonInfo = null;
       this.userInfo = LiveMultiPkContinueInviteUserInfo.emptyArray();
       this.noticeTitle = "";
       this.noticeSubtitle = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveMultiPkApplyContinueInvitePopup tcommonInfo = this.commonInfo;
       if (tcommonInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tcommonInfo);
       }
       tcommonInfo = this.userInfo;
       if (tcommonInfo != null && tcommonInfo.length > 0) {
          int i1 = 0;
          SCLiveMultiPkApplyContinueInvitePopup tuserInfo = this.userInfo;
          while (i1 < tuserInfo.length) {
             object oobject = tuserInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.noticeTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.noticeTitle);
       }
       if (!(this.noticeSubtitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.noticeSubtitle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiPkApplyContinueInvitePopup mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.noticeSubtitle = p0.readString();
                   }
                }else {
                   this.noticeTitle = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                SCLiveMultiPkApplyContinueInvitePopup tuserInfo = this.userInfo;
                int i2 = (tuserInfo == null)? 0: tuserInfo.length;
                i = i + i2;
                LiveMultiPkContinueInviteUserInfo[] liveMultiPkC = new LiveMultiPkContinueInviteUserInfo[i];
                if (i2) {
                   System.arraycopy(tuserInfo, 0, liveMultiPkC, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveMultiPkC[i2] = new LiveMultiPkContinueInviteUserInfo();
                   p0.readMessage(liveMultiPkC[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveMultiPkC[i2] = new LiveMultiPkContinueInviteUserInfo();
                p0.readMessage(liveMultiPkC[i2]);
                this.userInfo = liveMultiPkC;
             }
          }else if(this.commonInfo == null){
             this.commonInfo = new MultiPKSignalCommonInfo();
          }
          p0.readMessage(this.commonInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveMultiPkApplyContinueInvitePopup tcommonInfo = this.commonInfo;
       if (tcommonInfo != null) {
          p0.writeMessage(1, tcommonInfo);
       }
       tcommonInfo = this.userInfo;
       if (tcommonInfo != null && tcommonInfo.length > 0) {
          int i = 0;
          SCLiveMultiPkApplyContinueInvitePopup tuserInfo = this.userInfo;
          while (i < tuserInfo.length) {
             object oobject = tuserInfo[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.noticeTitle).equals(str)) {
          p0.writeString(3, this.noticeTitle);
       }
       if (!(this.noticeSubtitle).equals(str)) {
          p0.writeString(4, this.noticeSubtitle);
       }
       super.writeTo(p0);
       return;
    }
}
