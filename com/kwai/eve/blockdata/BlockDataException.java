package com.kwai.eve.blockdata.BlockDataException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class BlockDataException extends Exception	// class@000dcb
{

    public void BlockDataException(String p0){
       a.p(p0, "error");
       super(p0);
    }
}
