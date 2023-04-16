package com.kuaishou.protobuf.livestream.nano.LiveMultiPkRightBottomInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkRightBottomInfo extends MessageNano	// class@000cc5
{
    public boolean disableShowFollowButton;
    public boolean disableShowMuteIcon;
    public boolean disableShowUserName;
    public static LiveMultiPkRightBottomInfo[] _emptyArray;

    public void LiveMultiPkRightBottomInfo(){
       super();
       this.clear();
    }
    public static LiveMultiPkRightBottomInfo[] emptyArray(){
       if (LiveMultiPkRightBottomInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkRightBottomInfo._emptyArray == null) {
             LiveMultiPkRightBottomInfo[] liveMultiPkR = new LiveMultiPkRightBottomInfo[0];
             LiveMultiPkRightBottomInfo._emptyArray = liveMultiPkR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkRightBottomInfo._emptyArray;
    }
    public static LiveMultiPkRightBottomInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkRightBottomInfo().mergeFrom(p0);
    }
    public static LiveMultiPkRightBottomInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkRightBottomInfo(), p0);
    }
    public LiveMultiPkRightBottomInfo clear(){
       this.disableShowMuteIcon = false;
       this.disableShowUserName = false;
       this.disableShowFollowButton = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkRightBottomInfo tdisableShow = this.disableShowMuteIcon;
       if (tdisableShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tdisableShow);
       }
       tdisableShow = this.disableShowUserName;
       if (tdisableShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tdisableShow);
       }
       tdisableShow = this.disableShowFollowButton;
       if (tdisableShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tdisableShow);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkRightBottomInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.disableShowFollowButton = p0.readBool();
                }
             }else {
                this.disableShowUserName = p0.readBool();
             }
          }else {
             this.disableShowMuteIcon = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkRightBottomInfo tdisableShow = this.disableShowMuteIcon;
       if (tdisableShow != null) {
          p0.writeBool(1, tdisableShow);
       }
       tdisableShow = this.disableShowUserName;
       if (tdisableShow != null) {
          p0.writeBool(2, tdisableShow);
       }
       tdisableShow = this.disableShowFollowButton;
       if (tdisableShow != null) {
          p0.writeBool(3, tdisableShow);
       }
       super.writeTo(p0);
       return;
    }
}
