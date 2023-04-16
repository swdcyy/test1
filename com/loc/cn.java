package com.loc.cn;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import com.loc.cp;
import com.loc.fs;

public abstract class cn	// class@0013c3
{
    public cp a;
    public ByteBuffer b;

    public void cn(int p0){
       super();
       ByteBuffer uByteBuffer = ByteBuffer.allocate(p0);
       this.b = uByteBuffer;
       uByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
       this.a = new cp(this.b);
    }
    public final cn a(){
       this.a.a(this.b);
       return this;
    }
}
