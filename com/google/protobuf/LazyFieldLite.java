package com.google.protobuf.LazyFieldLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.lang.Object;
import com.google.protobuf.ByteString;
import java.lang.String;
import java.util.Objects;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.Parser;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Writer;

public class LazyFieldLite	// class@000460
{
    public ByteString delayedBytes;
    public ExtensionRegistryLite extensionRegistry;
    public ByteString memoizedBytes;
    public MessageLite value;
    public static final ExtensionRegistryLite EMPTY_REGISTRY;

    static {
       LazyFieldLite.EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();
    }
    public void LazyFieldLite(){
       super();
    }
    public void LazyFieldLite(ExtensionRegistryLite p0,ByteString p1){
       super();
       LazyFieldLite.checkArguments(p0, p1);
       this.extensionRegistry = p0;
       this.delayedBytes = p1;
    }
    public static void checkArguments(ExtensionRegistryLite p0,ByteString p1){
       Objects.requireNonNull(p0, "found null ExtensionRegistry");
       Objects.requireNonNull(p1, "found null ByteString");
    }
    public static LazyFieldLite fromValue(MessageLite p0){
       LazyFieldLite lazyFieldLit = new LazyFieldLite();
       lazyFieldLit.setValue(p0);
       return lazyFieldLit;
    }
    public static MessageLite mergeValueAndBytes(MessageLite p0,ByteString p1,ExtensionRegistryLite p2){
       try{
          p0 = p0.toBuilder().mergeFrom(p1, p2).build();
          return p0;
       }catch(com.google.protobuf.InvalidProtocolBufferException e0){
       }
    }
    public void clear(){
       this.delayedBytes = null;
       this.value = null;
       this.memoizedBytes = null;
    }
    public boolean containsDefaultInstance(){
       ByteString eMPTY = ByteString.EMPTY;
       if (this.memoizedBytes != eMPTY) {
          if (this.value == null) {
             LazyFieldLite tdelayedByte = this.delayedBytes;
             if (tdelayedByte != null && tdelayedByte != eMPTY) {
             }
          }else {
          }
       }
    label_0013 :
       boolean b = true;
    label_0014 :
       return b;
    }
    public void ensureInitialized(MessageLite p0){
       if (this.value != null) {
          return;
       }
       _monitor_enter(this);
       if (this.value != null) {
          _monitor_exit(this);
          return;
       }else if(this.delayedBytes != null){
          this.value = p0.getParserForType().parseFrom(this.delayedBytes, this.extensionRegistry);
          this.memoizedBytes = this.delayedBytes;
       }else {
          this.value = p0;
          this.memoizedBytes = ByteString.EMPTY;
       }
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LazyFieldLite) {
          return false;
       }
       LazyFieldLite tvalue = this.value;
       LazyFieldLite value = p0.value;
       if (tvalue == null && value == null) {
          return this.toByteString().equals(p0.toByteString());
       }
       if (tvalue != null && value != null) {
          return tvalue.equals(value);
       }
       if (tvalue != null) {
          return tvalue.equals(p0.getValue(tvalue.getDefaultInstanceForType()));
       }
       return this.getValue(value.getDefaultInstanceForType()).equals(value);
    }
    public int getSerializedSize(){
       if (this.memoizedBytes != null) {
          return this.memoizedBytes.size();
       }
       LazyFieldLite tdelayedByte = this.delayedBytes;
       if (tdelayedByte != null) {
          return tdelayedByte.size();
       }
       if (this.value != null) {
          return this.value.getSerializedSize();
       }
       return 0;
    }
    public MessageLite getValue(MessageLite p0){
       this.ensureInitialized(p0);
       return this.value;
    }
    public int hashCode(){
       return 1;
    }
    public void merge(LazyFieldLite p0){
       if (p0.containsDefaultInstance()) {
          return;
       }
       if (this.containsDefaultInstance()) {
          this.set(p0);
          return;
       }else if(this.extensionRegistry == null){
          this.extensionRegistry = p0.extensionRegistry;
       }
       LazyFieldLite tdelayedByte = this.delayedBytes;
       if (tdelayedByte != null) {
          LazyFieldLite delayedBytes = p0.delayedBytes;
          if (delayedBytes != null) {
             this.delayedBytes = tdelayedByte.concat(delayedBytes);
             return;
          }
       }
       if (this.value == null && p0.value != null) {
          this.setValue(LazyFieldLite.mergeValueAndBytes(p0.value, this.delayedBytes, this.extensionRegistry));
          return;
       }else if(this.value != null && p0.value == null){
          this.setValue(LazyFieldLite.mergeValueAndBytes(this.value, p0.delayedBytes, p0.extensionRegistry));
          return;
       }else {
          this.setValue(this.value.toBuilder().mergeFrom(p0.value).build());
          return;
       }
    }
    public void mergeFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       if (this.containsDefaultInstance()) {
          this.setByteString(p0.readBytes(), p1);
          return;
       }else if(this.extensionRegistry == null){
          this.extensionRegistry = p1;
       }
       LazyFieldLite tdelayedByte = this.delayedBytes;
       if (tdelayedByte != null) {
          this.setByteString(tdelayedByte.concat(p0.readBytes()), this.extensionRegistry);
          return;
       }else {
          try{
             this.setValue(this.value.toBuilder().mergeFrom(p0, p1).build());
             return;
          }catch(com.google.protobuf.InvalidProtocolBufferException e0){
          }
       }
    }
    public void set(LazyFieldLite p0){
       this.delayedBytes = p0.delayedBytes;
       this.value = p0.value;
       this.memoizedBytes = p0.memoizedBytes;
       p0 = p0.extensionRegistry;
       if (p0 != null) {
          this.extensionRegistry = p0;
       }
       return;
    }
    public void setByteString(ByteString p0,ExtensionRegistryLite p1){
       LazyFieldLite.checkArguments(p1, p0);
       this.delayedBytes = p0;
       this.extensionRegistry = p1;
       this.value = null;
       this.memoizedBytes = null;
    }
    public MessageLite setValue(MessageLite p0){
       LazyFieldLite tvalue = this.value;
       this.delayedBytes = null;
       this.memoizedBytes = null;
       this.value = p0;
       return tvalue;
    }
    public ByteString toByteString(){
       if (this.memoizedBytes != null) {
          return this.memoizedBytes;
       }
       LazyFieldLite tdelayedByte = this.delayedBytes;
       if (tdelayedByte != null) {
          return tdelayedByte;
       }
       _monitor_enter(this);
       if (this.memoizedBytes != null) {
          _monitor_exit(this);
          return this.memoizedBytes;
       }else if(this.value == null){
          this.memoizedBytes = ByteString.EMPTY;
       }else {
          this.memoizedBytes = this.value.toByteString();
       }
       _monitor_exit(this);
       return this.memoizedBytes;
    }
    public void writeTo(Writer p0,int p1){
       if (this.memoizedBytes != null) {
          p0.writeBytes(p1, this.memoizedBytes);
       }else {
          LazyFieldLite tdelayedByte = this.delayedBytes;
          if (tdelayedByte != null) {
             p0.writeBytes(p1, tdelayedByte);
          }else if(this.value != null){
             p0.writeMessage(p1, this.value);
          }else {
             p0.writeBytes(p1, ByteString.EMPTY);
          }
       }
       return;
    }
}
