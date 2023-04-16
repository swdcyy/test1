package com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.Cloneable;
import com.google.protobuf.MessageLite;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;

public interface abstract MessageLite$Builder implements MessageLiteOrBuilder, Cloneable	// class@00047a
{

    MessageLite build();
    MessageLite buildPartial();
    MessageLite$Builder clear();
    MessageLite$Builder clone();
    boolean mergeDelimitedFrom(InputStream p0);
    boolean mergeDelimitedFrom(InputStream p0,ExtensionRegistryLite p1);
    MessageLite$Builder mergeFrom(ByteString p0);
    MessageLite$Builder mergeFrom(ByteString p0,ExtensionRegistryLite p1);
    MessageLite$Builder mergeFrom(CodedInputStream p0);
    MessageLite$Builder mergeFrom(CodedInputStream p0,ExtensionRegistryLite p1);
    MessageLite$Builder mergeFrom(MessageLite p0);
    MessageLite$Builder mergeFrom(InputStream p0);
    MessageLite$Builder mergeFrom(InputStream p0,ExtensionRegistryLite p1);
    MessageLite$Builder mergeFrom(byte[] p0);
    MessageLite$Builder mergeFrom(byte[] p0,int p1,int p2);
    MessageLite$Builder mergeFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3);
    MessageLite$Builder mergeFrom(byte[] p0,ExtensionRegistryLite p1);
}
