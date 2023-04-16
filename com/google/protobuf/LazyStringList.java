package com.google.protobuf.LazyStringList;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.ByteString;
import java.util.Collection;
import java.util.List;
import java.lang.Object;

public interface abstract LazyStringList implements ProtocolStringList	// class@000464
{

    void add(ByteString p0);
    void add(byte[] p0);
    boolean addAllByteArray(Collection p0);
    boolean addAllByteString(Collection p0);
    List asByteArrayList();
    byte[] getByteArray(int p0);
    ByteString getByteString(int p0);
    Object getRaw(int p0);
    List getUnderlyingElements();
    LazyStringList getUnmodifiableView();
    void mergeFrom(LazyStringList p0);
    void set(int p0,ByteString p1);
    void set(int p0,byte[] p1);
}
