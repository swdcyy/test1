package com.kuaishou.log.realshow.nano.ClickLogs$ClickFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;

public final class ClickLogs$ClickFeed extends MessageNano	// class@0014a0
{
    public String actionLogId;
    public long clientIncrementId;
    public long clientTimestamp;
    public StidContainerProto$StidPackage commonStid;
    public long correlationId;
    public String expParams;
    public ClientEvent$ExpTagTransList expTagList;
    public int feedType;
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public String photoInfo;
    public String reportContext;
    public String serverExpTag;
    public String source;
    public int subType;
    public static ClickLogs$ClickFeed[] _emptyArray;

    public void ClickLogs$ClickFeed(){
       super();
       this.clear();
    }
    public static ClickLogs$ClickFeed[] emptyArray(){
       if (ClickLogs$ClickFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClickLogs$ClickFeed._emptyArray == null) {
             ClickLogs$ClickFeed[] uClickFeedAr = new ClickLogs$ClickFeed[0];
             ClickLogs$ClickFeed._emptyArray = uClickFeedAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClickLogs$ClickFeed._emptyArray;
    }
    public static ClickLogs$ClickFeed parseFrom(CodedInputByteBufferNano p0){
       return new ClickLogs$ClickFeed().mergeFrom(p0);
    }
    public static ClickLogs$ClickFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClickLogs$ClickFeed(), p0);
    }
    public ClickLogs$ClickFeed clear(){
       this.serverExpTag = "";
       this.source = "";
       this.photoInfo = "";
       this.expTagList = null;
       this.feedType = 0;
       this.subType = 0;
       this.reportContext = "";
       this.expParams = "";
       this.correlationId = 0;
       this.actionLogId = "";
       this.clientTimestamp = 0;
       this.clientIncrementId = 0;
       this.commonStid = null;
       this.interStidContainer = null;
       this.interStExParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.serverExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.serverExpTag);
       }
       if (!(this.source).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.source);
       }
       if (!(this.photoInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.photoInfo);
       }
       ClickLogs$ClickFeed texpTagList = this.expTagList;
       if (texpTagList != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, texpTagList);
       }
       texpTagList = this.feedType;
       if (texpTagList != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, texpTagList);
       }
       texpTagList = this.subType;
       if (texpTagList != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, texpTagList);
       }
       if (!(this.reportContext).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.reportContext);
       }
       if (!(this.expParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.expParams);
       }
       ClickLogs$ClickFeed tcorrelation = this.correlationId;
       if (tcorrelation) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tcorrelation);
       }
       if (!(this.actionLogId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.actionLogId);
       }
       tcorrelation = this.clientTimestamp;
       if (tcorrelation) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tcorrelation);
       }
       tcorrelation = this.clientIncrementId;
       if (tcorrelation) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tcorrelation);
       }
       texpTagList = this.commonStid;
       if (texpTagList != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, texpTagList);
       }
       texpTagList = this.interStidContainer;
       if (texpTagList != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, texpTagList);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.interStExParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClickLogs$ClickFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.serverExpTag = p0.readString();
                break;
              case 18:
                this.source = p0.readString();
                break;
              case 26:
                this.photoInfo = p0.readString();
                break;
              case '"':
                if (this.expTagList == null) {
                   this.expTagList = new ClientEvent$ExpTagTransList();
                }
                p0.readMessage(this.expTagList);
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != i1 && i != 2)) {
                   continue ;
                }else {
                   this.feedType = i;
                }
                break;
              case '0':
                i = p0.readInt32();
                if (i && i != i1) {
                   continue ;
                }else {
                   this.subType = i;
                }
                break;
              case ':':
                this.reportContext = p0.readString();
                break;
              case 'B':
                this.expParams = p0.readString();
                break;
              case 'H':
                this.correlationId = p0.readUInt64();
                break;
              case 'R':
                this.actionLogId = p0.readString();
                break;
              case 'X':
                this.clientTimestamp = p0.readUInt64();
                break;
              case '`':
                this.clientIncrementId = p0.readUInt64();
                break;
              case 'j':
                if (this.commonStid == null) {
                   this.commonStid = new StidContainerProto$StidPackage();
                }
                p0.readMessage(this.commonStid);
                break;
              case 'r':
                if (this.interStidContainer == null) {
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
                break;
              case 'z':
                this.interStExParams = p0.readString();
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
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(1, this.serverExpTag);
       }
       if (!(this.source).equals(str)) {
          p0.writeString(2, this.source);
       }
       if (!(this.photoInfo).equals(str)) {
          p0.writeString(3, this.photoInfo);
       }
       ClickLogs$ClickFeed texpTagList = this.expTagList;
       if (texpTagList != null) {
          p0.writeMessage(4, texpTagList);
       }
       texpTagList = this.feedType;
       if (texpTagList != null) {
          p0.writeInt32(5, texpTagList);
       }
       texpTagList = this.subType;
       if (texpTagList != null) {
          p0.writeInt32(6, texpTagList);
       }
       if (!(this.reportContext).equals(str)) {
          p0.writeString(7, this.reportContext);
       }
       if (!(this.expParams).equals(str)) {
          p0.writeString(8, this.expParams);
       }
       ClickLogs$ClickFeed tcorrelation = this.correlationId;
       if (tcorrelation) {
          p0.writeUInt64(9, tcorrelation);
       }
       if (!(this.actionLogId).equals(str)) {
          p0.writeString(10, this.actionLogId);
       }
       tcorrelation = this.clientTimestamp;
       if (tcorrelation) {
          p0.writeUInt64(11, tcorrelation);
       }
       tcorrelation = this.clientIncrementId;
       if (tcorrelation) {
          p0.writeUInt64(12, tcorrelation);
       }
       texpTagList = this.commonStid;
       if (texpTagList != null) {
          p0.writeMessage(13, texpTagList);
       }
       texpTagList = this.interStidContainer;
       if (texpTagList != null) {
          p0.writeMessage(14, texpTagList);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(15, this.interStExParams);
       }
       super.writeTo(p0);
       return;
    }
}
