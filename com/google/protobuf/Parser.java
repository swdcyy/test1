package com.google.protobuf.Parser;
import java.io.InputStream;
import java.lang.Object;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;

public interface abstract Parser	// class@000498
{

    Object parseDelimitedFrom(InputStream p0);
    Object parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1);
    Object parseFrom(ByteString p0);
    Object parseFrom(ByteString p0,ExtensionRegistryLite p1);
    Object parseFrom(CodedInputStream p0);
    Object parseFrom(CodedInputStream p0,ExtensionRegistryLite p1);
    Object parseFrom(InputStream p0);
    Object parseFrom(InputStream p0,ExtensionRegistryLite p1);
    Object parseFrom(ByteBuffer p0);
    Object parseFrom(ByteBuffer p0,ExtensionRegistryLite p1);
    Object parseFrom(byte[] p0);
    Object parseFrom(byte[] p0,int p1,int p2);
    Object parseFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3);
    Object parseFrom(byte[] p0,ExtensionRegistryLite p1);
    Object parsePartialDelimitedFrom(InputStream p0);
    Object parsePartialDelimitedFrom(InputStream p0,ExtensionRegistryLite p1);
    Object parsePartialFrom(ByteString p0);
    Object parsePartialFrom(ByteString p0,ExtensionRegistryLite p1);
    Object parsePartialFrom(CodedInputStream p0);
    Object parsePartialFrom(CodedInputStream p0,ExtensionRegistryLite p1);
    Object parsePartialFrom(InputStream p0);
    Object parsePartialFrom(InputStream p0,ExtensionRegistryLite p1);
    Object parsePartialFrom(byte[] p0);
    Object parsePartialFrom(byte[] p0,int p1,int p2);
    Object parsePartialFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3);
    Object parsePartialFrom(byte[] p0,ExtensionRegistryLite p1);
}
