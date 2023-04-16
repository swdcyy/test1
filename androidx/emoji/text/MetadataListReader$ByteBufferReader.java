package androidx.emoji.text.MetadataListReader$ByteBufferReader;
import androidx.emoji.text.MetadataListReader$OpenTypeReader;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.nio.ByteOrder;
import androidx.emoji.text.MetadataListReader;
import java.nio.Buffer;

public class MetadataListReader$ByteBufferReader implements MetadataListReader$OpenTypeReader	// class@00075f
{
    public final ByteBuffer mByteBuffer;

    public void MetadataListReader$ByteBufferReader(ByteBuffer p0){
       super();
       this.mByteBuffer = p0;
       p0.order(ByteOrder.BIG_ENDIAN);
    }
    public long getPosition(){
       return (long)this.mByteBuffer.position();
    }
    public int readTag(){
       return this.mByteBuffer.getInt();
    }
    public long readUnsignedInt(){
       return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
    }
    public int readUnsignedShort(){
       return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
    }
    public void skip(int p0){
       MetadataListReader$ByteBufferReader tmByteBuffer = this.mByteBuffer;
       tmByteBuffer.position((tmByteBuffer.position() + p0));
    }
}
