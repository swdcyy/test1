package com.kuaishou.protobuf.livestream.nano.SCMultiLineChatWishList;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.ChatWishList;

public final class SCMultiLineChatWishList extends MessageNano	// class@000d73
{
    public String chatId;
    public String multiLineChatId;
    public boolean open;
    public String sessionId;
    public long version;
    public Map wishListMap;
    public static SCMultiLineChatWishList[] _emptyArray;

    public void SCMultiLineChatWishList(){
       super();
       this.clear();
    }
    public static SCMultiLineChatWishList[] emptyArray(){
       if (SCMultiLineChatWishList._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMultiLineChatWishList._emptyArray == null) {
             SCMultiLineChatWishList[] sCMultiLineC = new SCMultiLineChatWishList[0];
             SCMultiLineChatWishList._emptyArray = sCMultiLineC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMultiLineChatWishList._emptyArray;
    }
    public static SCMultiLineChatWishList parseFrom(CodedInputByteBufferNano p0){
       return new SCMultiLineChatWishList().mergeFrom(p0);
    }
    public static SCMultiLineChatWishList parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMultiLineChatWishList(), p0);
    }
    public SCMultiLineChatWishList clear(){
       this.wishListMap = null;
       this.multiLineChatId = "";
       this.chatId = "";
       this.open = false;
       this.version = 0;
       this.sessionId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCMultiLineChatWishList twishListMap = this.wishListMap;
       int i1 = 4;
       if (twishListMap != null) {
          i = i + InternalNano.computeMapFieldSize(twishListMap, 1, i1, 11);
       }
       if (!(this.multiLineChatId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.multiLineChatId);
       }
       if (!(this.chatId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.chatId);
       }
       twishListMap = this.open;
       if (twishListMap != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(i1, twishListMap);
       }
       twishListMap = this.version;
       if (twishListMap) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, twishListMap);
       }
       if (!(this.sessionId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.sessionId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMultiLineChatWishList mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.sessionId = p0.readString();
                         }
                      }else {
                         this.version = p0.readUInt64();
                      }
                   }else {
                      this.open = p0.readBool();
                   }
                }else {
                   this.chatId = p0.readString();
                }
             }else {
                this.multiLineChatId = p0.readString();
             }
          }else {
             this.wishListMap = InternalNano.mergeMapEntry(p0, this.wishListMap, mapFactory, 4, 11, new ChatWishList(), 8, 18);
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCMultiLineChatWishList twishListMap = this.wishListMap;
       int i = 4;
       if (twishListMap != null) {
          InternalNano.serializeMapField(p0, twishListMap, 1, i, 11);
       }
       if (!(this.multiLineChatId).equals("")) {
          p0.writeString(2, this.multiLineChatId);
       }
       if (!(this.chatId).equals("")) {
          p0.writeString(3, this.chatId);
       }
       twishListMap = this.open;
       if (twishListMap != null) {
          p0.writeBool(i, twishListMap);
       }
       twishListMap = this.version;
       if (twishListMap) {
          p0.writeUInt64(5, twishListMap);
       }
       if (!(this.sessionId).equals("")) {
          p0.writeString(6, this.sessionId);
       }
       super.writeTo(p0);
       return;
    }
}
