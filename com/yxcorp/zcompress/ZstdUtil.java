package com.yxcorp.zcompress.ZstdUtil;
import java.lang.Object;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.String;
import java.lang.Math;
import java.nio.ByteBuffer;
import com.yxcorp.zcompress.Zstd;
import com.yxcorp.zcompress.ZstdDirectBufferCompressingStream;
import java.nio.channels.FileChannel;
import java.nio.Buffer;

public class ZstdUtil	// class@000a09
{
    public static boolean enableDebug;

    public void ZstdUtil(){
       super();
    }
    public static void compressFile(File p0,File p1,int p2){
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "r");
       ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(Math.min(0x100000, (int)randomAccess.length()));
       ByteBuffer uByteBuffer1 = ByteBuffer.allocateDirect(Math.min(0x200000, (int)Zstd.compressBound(randomAccess.length())));
       ZstdDirectBufferCompressingStream zstdDirectBu = new ZstdDirectBufferCompressingStream(uByteBuffer1, p2, new RandomAccessFile(p1, "rw").getChannel());
       while (randomAccess.getChannel().read(uByteBuffer) > 0) {
          uByteBuffer.flip();
          uByteBuffer1.clear();
          zstdDirectBu.compress(uByteBuffer);
          zstdDirectBu.flush();
          uByteBuffer.clear();
       }
       zstdDirectBu.close();
       return;
    }
    public final void enableDebug(){
       ZstdUtil.enableDebug = true;
    }
}
