package com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerStats;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerDecoderStats;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerRenderStats;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientStat$EditorSdkPreviewPlayerStats extends MessageNano	// class@0013d9
{
    public ClientStat$EditorSdkPreviewPlayerDecoderStats[] decoderStats;
    public String editorMeta;
    public String editorSdkVersion;
    public ClientStat$EditorSdkPreviewPlayerRenderStats[] renderStats;
    public static ClientStat$EditorSdkPreviewPlayerStats[] _emptyArray;

    public void ClientStat$EditorSdkPreviewPlayerStats(){
       super();
       this.clear();
    }
    public static ClientStat$EditorSdkPreviewPlayerStats[] emptyArray(){
       if (ClientStat$EditorSdkPreviewPlayerStats._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EditorSdkPreviewPlayerStats._emptyArray == null) {
             ClientStat$EditorSdkPreviewPlayerStats[] uEditorSdkPr = new ClientStat$EditorSdkPreviewPlayerStats[0];
             ClientStat$EditorSdkPreviewPlayerStats._emptyArray = uEditorSdkPr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EditorSdkPreviewPlayerStats._emptyArray;
    }
    public static ClientStat$EditorSdkPreviewPlayerStats parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EditorSdkPreviewPlayerStats().mergeFrom(p0);
    }
    public static ClientStat$EditorSdkPreviewPlayerStats parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EditorSdkPreviewPlayerStats(), p0);
    }
    public ClientStat$EditorSdkPreviewPlayerStats clear(){
       this.decoderStats = ClientStat$EditorSdkPreviewPlayerDecoderStats.emptyArray();
       this.renderStats = ClientStat$EditorSdkPreviewPlayerRenderStats.emptyArray();
       this.editorSdkVersion = "";
       this.editorMeta = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$EditorSdkPreviewPlayerStats tdecoderStat = this.decoderStats;
       int i1 = 0;
       if (tdecoderStat != null && tdecoderStat.length > 0) {
          int i2 = 0;
          ClientStat$EditorSdkPreviewPlayerStats tdecoderStat1 = this.decoderStats;
          while (i2 < tdecoderStat1.length) {
             object oobject = tdecoderStat1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tdecoderStat = this.renderStats;
       if (tdecoderStat != null && tdecoderStat.length > 0) {
          tdecoderStat = this.renderStats;
          while (i1 < tdecoderStat.length) {
             object oobject1 = tdecoderStat[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.editorSdkVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.editorSdkVersion);
       }
       if (!(this.editorMeta).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.editorMeta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EditorSdkPreviewPlayerStats mergeFrom(CodedInputByteBufferNano p0){
       ClientStat$EditorSdkPreviewPlayerStats trenderStats;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.editorMeta = p0.readString();
                   }
                }else {
                   this.editorSdkVersion = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                trenderStats = this.renderStats;
                i2 = (trenderStats == null)? 0: trenderStats.length;
                i = i + i2;
                ClientStat$EditorSdkPreviewPlayerRenderStats[] uEditorSdkPr = new ClientStat$EditorSdkPreviewPlayerRenderStats[i];
                if (i2) {
                   System.arraycopy(trenderStats, 0, uEditorSdkPr, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uEditorSdkPr[i2] = new ClientStat$EditorSdkPreviewPlayerRenderStats();
                   p0.readMessage(uEditorSdkPr[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uEditorSdkPr[i2] = new ClientStat$EditorSdkPreviewPlayerRenderStats();
                p0.readMessage(uEditorSdkPr[i2]);
                this.renderStats = uEditorSdkPr;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             trenderStats = this.decoderStats;
             i2 = (trenderStats == null)? 0: trenderStats.length;
             i = i + i2;
             ClientStat$EditorSdkPreviewPlayerDecoderStats[] uEditorSdkPr1 = new ClientStat$EditorSdkPreviewPlayerDecoderStats[i];
             if (i2) {
                System.arraycopy(trenderStats, 0, uEditorSdkPr1, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uEditorSdkPr1[i2] = new ClientStat$EditorSdkPreviewPlayerDecoderStats();
                p0.readMessage(uEditorSdkPr1[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uEditorSdkPr1[i2] = new ClientStat$EditorSdkPreviewPlayerDecoderStats();
             p0.readMessage(uEditorSdkPr1[i2]);
             this.decoderStats = uEditorSdkPr1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$EditorSdkPreviewPlayerStats tdecoderStat = this.decoderStats;
       int i = 0;
       if (tdecoderStat != null && tdecoderStat.length > 0) {
          int i1 = 0;
          ClientStat$EditorSdkPreviewPlayerStats tdecoderStat1 = this.decoderStats;
          while (i1 < tdecoderStat1.length) {
             object oobject = tdecoderStat1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tdecoderStat = this.renderStats;
       if (tdecoderStat != null && tdecoderStat.length > 0) {
          tdecoderStat = this.renderStats;
          while (i < tdecoderStat.length) {
             object oobject1 = tdecoderStat[i];
             if (oobject1 != null) {
                p0.writeMessage(2, oobject1);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.editorSdkVersion).equals(str)) {
          p0.writeString(3, this.editorSdkVersion);
       }
       if (!(this.editorMeta).equals(str)) {
          p0.writeString(4, this.editorMeta);
       }
       super.writeTo(p0);
       return;
    }
}
