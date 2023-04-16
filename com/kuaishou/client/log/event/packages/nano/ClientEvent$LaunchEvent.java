package com.kuaishou.client.log.event.packages.nano.ClientEvent$LaunchEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientEvent$LaunchEvent extends MessageNano	// class@000757
{
    public long allVisibleCost;
    public boolean cold;
    public long coldLaunchCount;
    public String detail;
    public long elementCount;
    public String extraStatInfo;
    public long fetchDataCost;
    public long frameworkCost;
    public long launchHomeActivityCost;
    public int mode;
    public boolean newLaunch;
    public String oaid;
    public long preMainCost;
    public String pushId;
    public int source;
    public long startFetchCost;
    public String target;
    public long timeCost;
    public boolean useCache;
    public static ClientEvent$LaunchEvent[] _emptyArray;

    public void ClientEvent$LaunchEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$LaunchEvent[] emptyArray(){
       if (ClientEvent$LaunchEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$LaunchEvent._emptyArray == null) {
             ClientEvent$LaunchEvent[] launchEventA = new ClientEvent$LaunchEvent[0];
             ClientEvent$LaunchEvent._emptyArray = launchEventA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$LaunchEvent._emptyArray;
    }
    public static ClientEvent$LaunchEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$LaunchEvent().mergeFrom(p0);
    }
    public static ClientEvent$LaunchEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$LaunchEvent(), p0);
    }
    public ClientEvent$LaunchEvent clear(){
       this.source = 0;
       this.cold = false;
       this.timeCost = 0;
       this.detail = "";
       this.target = "";
       this.frameworkCost = 0;
       this.fetchDataCost = 0;
       this.allVisibleCost = 0;
       this.elementCount = 0;
       this.useCache = false;
       this.mode = 0;
       this.launchHomeActivityCost = 0;
       this.coldLaunchCount = 0;
       this.pushId = "";
       this.startFetchCost = 0;
       this.newLaunch = false;
       this.preMainCost = 0;
       this.extraStatInfo = "";
       this.oaid = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$LaunchEvent tsource = this.source;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsource);
       }
       tsource = this.cold;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tsource);
       }
       tsource = this.timeCost;
       ClientEvent$LaunchEvent launchEvent = null;
       if (tsource - launchEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tsource);
       }
       String str = "";
       if (!(this.detail).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.detail);
       }
       if (!(this.target).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.target);
       }
       ClientEvent$LaunchEvent tframeworkCo = this.frameworkCost;
       if (tframeworkCo - launchEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tframeworkCo);
       }
       tframeworkCo = this.fetchDataCost;
       if (tframeworkCo - launchEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tframeworkCo);
       }
       tframeworkCo = this.allVisibleCost;
       if (tframeworkCo - launchEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tframeworkCo);
       }
       tframeworkCo = this.elementCount;
       if (tframeworkCo - launchEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tframeworkCo);
       }
       tsource = this.useCache;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tsource);
       }
       tsource = this.mode;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tsource);
       }
       tframeworkCo = this.launchHomeActivityCost;
       if (tframeworkCo - launchEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tframeworkCo);
       }
       tframeworkCo = this.coldLaunchCount;
       if (tframeworkCo - launchEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tframeworkCo);
       }
       if (!(this.pushId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.pushId);
       }
       tframeworkCo = this.startFetchCost;
       if (tframeworkCo - launchEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tframeworkCo);
       }
       tsource = this.newLaunch;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, tsource);
       }
       tframeworkCo = this.preMainCost;
       if (tframeworkCo - launchEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tframeworkCo);
       }
       if (!(this.extraStatInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.extraStatInfo);
       }
       if (!(this.oaid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.oaid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$LaunchEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 1:
                      break;
                    default:
                }
                this.source = i;
                break;
              case 16:
                this.cold = p0.readBool();
                break;
              case 24:
                this.timeCost = p0.readUInt64();
                break;
              case '"':
                this.detail = p0.readString();
                break;
              case '*':
                this.target = p0.readString();
                break;
              case '0':
                this.frameworkCost = p0.readUInt64();
                break;
              case '8':
                this.fetchDataCost = p0.readUInt64();
                break;
              case '@':
                this.allVisibleCost = p0.readUInt64();
                break;
              case 'H':
                this.elementCount = p0.readUInt64();
                break;
              case 'P':
                this.useCache = p0.readBool();
                break;
              case 'X':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.mode = i;
                }
                break;
              case '`':
                this.launchHomeActivityCost = p0.readUInt64();
                break;
              case 'h':
                this.coldLaunchCount = p0.readUInt64();
                break;
              case 'r':
                this.pushId = p0.readString();
                break;
              case 'x':
                this.startFetchCost = p0.readUInt64();
                break;
              case 128:
                this.newLaunch = p0.readBool();
                break;
              case 136:
                this.preMainCost = p0.readUInt64();
                break;
              case 146:
                this.extraStatInfo = p0.readString();
                break;
              case 154:
                this.oaid = p0.readString();
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
       ClientEvent$LaunchEvent tsource = this.source;
       if (tsource != null) {
          p0.writeInt32(1, tsource);
       }
       tsource = this.cold;
       if (tsource != null) {
          p0.writeBool(2, tsource);
       }
       tsource = this.timeCost;
       ClientEvent$LaunchEvent launchEvent = null;
       if (tsource - launchEvent) {
          p0.writeUInt64(3, tsource);
       }
       String str = "";
       if (!(this.detail).equals(str)) {
          p0.writeString(4, this.detail);
       }
       if (!(this.target).equals(str)) {
          p0.writeString(5, this.target);
       }
       ClientEvent$LaunchEvent tframeworkCo = this.frameworkCost;
       if (tframeworkCo - launchEvent) {
          p0.writeUInt64(6, tframeworkCo);
       }
       tframeworkCo = this.fetchDataCost;
       if (tframeworkCo - launchEvent) {
          p0.writeUInt64(7, tframeworkCo);
       }
       tframeworkCo = this.allVisibleCost;
       if (tframeworkCo - launchEvent) {
          p0.writeUInt64(8, tframeworkCo);
       }
       tframeworkCo = this.elementCount;
       if (tframeworkCo - launchEvent) {
          p0.writeUInt64(9, tframeworkCo);
       }
       tsource = this.useCache;
       if (tsource != null) {
          p0.writeBool(10, tsource);
       }
       tsource = this.mode;
       if (tsource != null) {
          p0.writeInt32(11, tsource);
       }
       tframeworkCo = this.launchHomeActivityCost;
       if (tframeworkCo - launchEvent) {
          p0.writeUInt64(12, tframeworkCo);
       }
       tframeworkCo = this.coldLaunchCount;
       if (tframeworkCo - launchEvent) {
          p0.writeUInt64(13, tframeworkCo);
       }
       if (!(this.pushId).equals(str)) {
          p0.writeString(14, this.pushId);
       }
       tframeworkCo = this.startFetchCost;
       if (tframeworkCo - launchEvent) {
          p0.writeUInt64(15, tframeworkCo);
       }
       tsource = this.newLaunch;
       if (tsource != null) {
          p0.writeBool(16, tsource);
       }
       tframeworkCo = this.preMainCost;
       if (tframeworkCo - launchEvent) {
          p0.writeUInt64(17, tframeworkCo);
       }
       if (!(this.extraStatInfo).equals(str)) {
          p0.writeString(18, this.extraStatInfo);
       }
       if (!(this.oaid).equals(str)) {
          p0.writeString(19, this.oaid);
       }
       super.writeTo(p0);
       return;
    }
}
