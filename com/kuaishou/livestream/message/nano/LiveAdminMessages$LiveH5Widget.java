package com.kuaishou.livestream.message.nano.LiveAdminMessages$LiveH5Widget;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAdminMessages$LiveH5Widget extends MessageNano	// class@0010f9
{
    public boolean enableClose;
    public boolean enableDrag;
    public long endTime;
    public int expansionHalfScreenHeightPercent;
    public int expansionType;
    public String expansionUrl;
    public int heightInDp;
    public String id;
    public int position;
    public long startTime;
    public String url;
    public int widthInDp;
    public static LiveAdminMessages$LiveH5Widget[] _emptyArray;

    public void LiveAdminMessages$LiveH5Widget(){
       super();
       this.clear();
    }
    public static LiveAdminMessages$LiveH5Widget[] emptyArray(){
       if (LiveAdminMessages$LiveH5Widget._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdminMessages$LiveH5Widget._emptyArray == null) {
             LiveAdminMessages$LiveH5Widget[] liveH5Widget = new LiveAdminMessages$LiveH5Widget[0];
             LiveAdminMessages$LiveH5Widget._emptyArray = liveH5Widget;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdminMessages$LiveH5Widget._emptyArray;
    }
    public static LiveAdminMessages$LiveH5Widget parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdminMessages$LiveH5Widget().mergeFrom(p0);
    }
    public static LiveAdminMessages$LiveH5Widget parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdminMessages$LiveH5Widget(), p0);
    }
    public LiveAdminMessages$LiveH5Widget clear(){
       this.id = "";
       this.startTime = 0;
       this.endTime = 0;
       this.position = 0;
       this.widthInDp = 0;
       this.heightInDp = 0;
       this.url = "";
       this.expansionUrl = "";
       this.expansionType = 0;
       this.expansionHalfScreenHeightPercent = 0;
       this.enableDrag = false;
       this.enableClose = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveAdminMessages$LiveH5Widget tstartTime = this.startTime;
       if (tstartTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tstartTime);
       }
       LiveAdminMessages$LiveH5Widget tposition = this.position;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tposition);
       }
       tposition = this.widthInDp;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tposition);
       }
       tposition = this.heightInDp;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tposition);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.url);
       }
       if (!(this.expansionUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.expansionUrl);
       }
       tposition = this.expansionType;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tposition);
       }
       tposition = this.expansionHalfScreenHeightPercent;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tposition);
       }
       tposition = this.enableDrag;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tposition);
       }
       tposition = this.enableClose;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tposition);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdminMessages$LiveH5Widget mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 16:
                this.startTime = p0.readUInt64();
                break;
              case 24:
                this.endTime = p0.readUInt64();
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && i != 3))) {
                   continue ;
                }else {
                   this.position = i;
                }
                break;
              case '(':
                this.widthInDp = p0.readUInt32();
                break;
              case '0':
                this.heightInDp = p0.readUInt32();
                break;
              case ':':
                this.url = p0.readString();
                break;
              case 'B':
                this.expansionUrl = p0.readString();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.expansionType = i;
                }
                break;
              case 'P':
                this.expansionHalfScreenHeightPercent = p0.readUInt32();
                break;
              case 'X':
                this.enableDrag = p0.readBool();
                break;
              case '`':
                this.enableClose = p0.readBool();
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
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       LiveAdminMessages$LiveH5Widget tstartTime = this.startTime;
       if (tstartTime) {
          p0.writeUInt64(2, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime) {
          p0.writeUInt64(3, tstartTime);
       }
       LiveAdminMessages$LiveH5Widget tposition = this.position;
       if (tposition != null) {
          p0.writeInt32(4, tposition);
       }
       tposition = this.widthInDp;
       if (tposition != null) {
          p0.writeUInt32(5, tposition);
       }
       tposition = this.heightInDp;
       if (tposition != null) {
          p0.writeUInt32(6, tposition);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(7, this.url);
       }
       if (!(this.expansionUrl).equals(str)) {
          p0.writeString(8, this.expansionUrl);
       }
       tposition = this.expansionType;
       if (tposition != null) {
          p0.writeInt32(9, tposition);
       }
       tposition = this.expansionHalfScreenHeightPercent;
       if (tposition != null) {
          p0.writeUInt32(10, tposition);
       }
       tposition = this.enableDrag;
       if (tposition != null) {
          p0.writeBool(11, tposition);
       }
       tposition = this.enableClose;
       if (tposition != null) {
          p0.writeBool(12, tposition);
       }
       super.writeTo(p0);
       return;
    }
}
