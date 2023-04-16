package com.kuaishou.livestream.message.nano.SCLiveAudienceBottomBarConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveAudienceBottomBarConfig extends MessageNano	// class@00140f
{
    public static SCLiveAudienceBottomBarConfig[] _emptyArray;

    public void SCLiveAudienceBottomBarConfig(){
       super();
       this.clear();
    }
    public static SCLiveAudienceBottomBarConfig[] emptyArray(){
       if (SCLiveAudienceBottomBarConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAudienceBottomBarConfig._emptyArray == null) {
             SCLiveAudienceBottomBarConfig[] sCLiveAudien = new SCLiveAudienceBottomBarConfig[0];
             SCLiveAudienceBottomBarConfig._emptyArray = sCLiveAudien;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAudienceBottomBarConfig._emptyArray;
    }
    public static SCLiveAudienceBottomBarConfig parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAudienceBottomBarConfig().mergeFrom(p0);
    }
    public static SCLiveAudienceBottomBarConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAudienceBottomBarConfig(), p0);
    }
    public SCLiveAudienceBottomBarConfig clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAudienceBottomBarConfig mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
