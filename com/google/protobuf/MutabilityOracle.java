package com.google.protobuf.MutabilityOracle;
import com.google.protobuf.MutabilityOracle$1;

public interface abstract MutabilityOracle	// class@00048a
{
    public static final MutabilityOracle IMMUTABLE;

    static {
       MutabilityOracle.IMMUTABLE = new MutabilityOracle$1();
    }
    void ensureMutable();
}
