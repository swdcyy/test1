package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$AudienceRedPackSkin;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$ConditionRedPackSkin;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo;
import java.lang.Object;
import java.util.Objects;

public final class LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme extends MessageNano	// class@00117c
{
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo commonInfo;
    public int skinInfoCase_;
    public Object skinInfo_;
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme(){
       super();
       this.skinInfoCase_ = 0;
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme._emptyArray == null) {
             LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme[] uCustomRedPa = new LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme[0];
             LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme._emptyArray = uCustomRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme(), p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme clear(){
       this.commonInfo = null;
       this.clearSkinInfo();
       this.cachedSize = -1;
       return this;
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme clearSkinInfo(){
       this.skinInfoCase_ = 0;
       this.skinInfo_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme tcommonInfo = this.commonInfo;
       if (tcommonInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tcommonInfo);
       }
       int i1 = 2;
       if (this.skinInfoCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.skinInfo_);
       }
       i1 = 3;
       if (this.skinInfoCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.skinInfo_);
       }
       if (this.skinInfoCase_ == 4) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, this.skinInfo_);
       }
       return i;
    }
    public LiveCustomRedPackSkinMessage$AudienceRedPackSkin getAudienceRedPackSkin(){
       if (this.skinInfoCase_ == 4) {
          return this.skinInfo_;
       }
       return null;
    }
    public LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin getCommonOrArrowRedPackSkin(){
       if (this.skinInfoCase_ == 2) {
          return this.skinInfo_;
       }
       return null;
    }
    public LiveCustomRedPackSkinMessage$ConditionRedPackSkin getConditionRedPackSkin(){
       if (this.skinInfoCase_ == 3) {
          return this.skinInfo_;
       }
       return null;
    }
    public int getSkinInfoCase(){
       return this.skinInfoCase_;
    }
    public boolean hasAudienceRedPackSkin(){
       boolean b = (this.skinInfoCase_ == 4)? true: false;
       return b;
    }
    public boolean hasCommonOrArrowRedPackSkin(){
       boolean b = (this.skinInfoCase_ == 2)? true: false;
       return b;
    }
    public boolean hasConditionRedPackSkin(){
       boolean b = (this.skinInfoCase_ == 3)? true: false;
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i1 = 4;
                      if (this.skinInfoCase_ != i1) {
                         this.skinInfo_ = new LiveCustomRedPackSkinMessage$AudienceRedPackSkin();
                      }
                      p0.readMessage(this.skinInfo_);
                      this.skinInfoCase_ = i1;
                   }
                }else {
                   i1 = 3;
                   if (this.skinInfoCase_ != i1) {
                      this.skinInfo_ = new LiveCustomRedPackSkinMessage$ConditionRedPackSkin();
                   }
                   p0.readMessage(this.skinInfo_);
                   this.skinInfoCase_ = i1;
                }
             }else {
                i1 = 2;
                if (this.skinInfoCase_ != i1) {
                   this.skinInfo_ = new LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin();
                }
                p0.readMessage(this.skinInfo_);
                this.skinInfoCase_ = i1;
             }
          }else if(this.commonInfo == null){
             this.commonInfo = new LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo();
          }
          p0.readMessage(this.commonInfo);
       }
       return this;
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme setAudienceRedPackSkin(LiveCustomRedPackSkinMessage$AudienceRedPackSkin p0){
       Objects.requireNonNull(p0);
       this.skinInfoCase_ = 4;
       this.skinInfo_ = p0;
       return this;
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme setCommonOrArrowRedPackSkin(LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin p0){
       Objects.requireNonNull(p0);
       this.skinInfoCase_ = 2;
       this.skinInfo_ = p0;
       return this;
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme setConditionRedPackSkin(LiveCustomRedPackSkinMessage$ConditionRedPackSkin p0){
       Objects.requireNonNull(p0);
       this.skinInfoCase_ = 3;
       this.skinInfo_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme tcommonInfo = this.commonInfo;
       if (tcommonInfo != null) {
          p0.writeMessage(1, tcommonInfo);
       }
       int i = 2;
       if (this.skinInfoCase_ == i) {
          p0.writeMessage(i, this.skinInfo_);
       }
       i = 3;
       if (this.skinInfoCase_ == i) {
          p0.writeMessage(i, this.skinInfo_);
       }
       if (this.skinInfoCase_ == 4) {
          p0.writeMessage(4, this.skinInfo_);
       }
       super.writeTo(p0);
       return;
    }
}
