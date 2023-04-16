package com.yxcorp.zcompress.ZstdException;
import java.lang.RuntimeException;
import com.yxcorp.zcompress.Zstd;
import java.lang.String;

public class ZstdException extends RuntimeException	// class@001418
{
    public long code;

    public void ZstdException(long p0){
       super(Zstd.getErrorCode(p0), Zstd.getErrorName(p0));
    }
    public void ZstdException(long p0,String p1){
       super(p1);
       this.code = p0;
    }
    public long getErrorCode(){
       return this.code;
    }
}
