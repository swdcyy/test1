package com.kuaishou.livestream.message.nano.LivePopUp$SCLivePopUp;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePopUp$LiveDialog;
import com.kuaishou.livestream.message.nano.LivePopUp$LiveToast;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.util.Objects;

public final class LivePopUp$SCLivePopUp extends MessageNano	// class@00124b
{
    public int popUpCase_;
    public Object popUp_;
    public static LivePopUp$SCLivePopUp[] _emptyArray;

    public void LivePopUp$SCLivePopUp(){
       super();
       this.popUpCase_ = 0;
       this.clear();
    }
    public static LivePopUp$SCLivePopUp[] emptyArray(){
       if (LivePopUp$SCLivePopUp._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePopUp$SCLivePopUp._emptyArray == null) {
             LivePopUp$SCLivePopUp[] sCLivePopUpA = new LivePopUp$SCLivePopUp[0];
             LivePopUp$SCLivePopUp._emptyArray = sCLivePopUpA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePopUp$SCLivePopUp._emptyArray;
    }
    public static LivePopUp$SCLivePopUp parseFrom(CodedInputByteBufferNano p0){
       return new LivePopUp$SCLivePopUp().mergeFrom(p0);
    }
    public static LivePopUp$SCLivePopUp parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePopUp$SCLivePopUp(), p0);
    }
    public LivePopUp$SCLivePopUp clear(){
       this.clearPopUp();
       this.cachedSize = -1;
       return this;
    }
    public LivePopUp$SCLivePopUp clearPopUp(){
       this.popUpCase_ = 0;
       this.popUp_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       int i1 = 1;
       if (this.popUpCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.popUp_);
       }
       if (this.popUpCase_ == 2) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, this.popUp_);
       }
       return i;
    }
    public LivePopUp$LiveDialog getDialog(){
       if (this.popUpCase_ == 2) {
          return this.popUp_;
       }
       return null;
    }
    public int getPopUpCase(){
       return this.popUpCase_;
    }
    public LivePopUp$LiveToast getToast(){
       if (this.popUpCase_ == 1) {
          return this.popUp_;
       }
       return null;
    }
    public boolean hasDialog(){
       boolean b = (this.popUpCase_ == 2)? true: false;
       return b;
    }
    public boolean hasToast(){
       boolean b = true;
       if (this.popUpCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePopUp$SCLivePopUp mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i1 = 2;
                if (this.popUpCase_ != i1) {
                   this.popUp_ = new LivePopUp$LiveDialog();
                }
                p0.readMessage(this.popUp_);
                this.popUpCase_ = i1;
             }
          }else {
             i1 = 1;
             if (this.popUpCase_ != i1) {
                this.popUp_ = new LivePopUp$LiveToast();
             }
             p0.readMessage(this.popUp_);
             this.popUpCase_ = i1;
          }
       }
       return this;
    }
    public LivePopUp$SCLivePopUp setDialog(LivePopUp$LiveDialog p0){
       Objects.requireNonNull(p0);
       this.popUpCase_ = 2;
       this.popUp_ = p0;
       return this;
    }
    public LivePopUp$SCLivePopUp setToast(LivePopUp$LiveToast p0){
       Objects.requireNonNull(p0);
       this.popUpCase_ = 1;
       this.popUp_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i = 1;
       if (this.popUpCase_ == i) {
          p0.writeMessage(i, this.popUp_);
       }
       if (this.popUpCase_ == 2) {
          p0.writeMessage(2, this.popUp_);
       }
       super.writeTo(p0);
       return;
    }
}
