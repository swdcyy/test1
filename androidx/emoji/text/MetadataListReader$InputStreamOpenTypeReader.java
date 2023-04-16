package androidx.emoji.text.MetadataListReader$InputStreamOpenTypeReader;
import androidx.emoji.text.MetadataListReader$OpenTypeReader;
import java.io.InputStream;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.io.IOException;
import java.lang.String;
import java.nio.Buffer;
import androidx.emoji.text.MetadataListReader;

public class MetadataListReader$InputStreamOpenTypeReader implements MetadataListReader$OpenTypeReader	// class@000760
{
    public final byte[] mByteArray;
    public final ByteBuffer mByteBuffer;
    public final InputStream mInputStream;
    public long mPosition;

    public void MetadataListReader$InputStreamOpenTypeReader(InputStream p0){
       super();
       this.mPosition = 0;
       this.mInputStream = p0;
       byte[] uobyteArray = new byte[4];
       this.mByteArray = uobyteArray;
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       this.mByteBuffer = uByteBuffer;
       uByteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
    public long getPosition(){
       return this.mPosition;
    }
    public final void read(int p0){
       if (this.mInputStream.read(this.mByteArray, 0, p0) != p0) {
          throw new IOException("read failed");
       }
       this.mPosition = this.mPosition + (long)p0;
       return;
    }
    public int readTag(){
       this.mByteBuffer.position(0);
       this.read(4);
       return this.mByteBuffer.getInt();
    }
    public long readUnsignedInt(){
       this.mByteBuffer.position(0);
       this.read(4);
       return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
    }
    public int readUnsignedShort(){
       this.mByteBuffer.position(0);
       this.read(2);
       return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
    }
    public void skip(int p0){
       while (true) {
          if (p0 <= 0) {
             return;
          }
          int i = (int)this.mInputStream.skip((long)p0);
          if (i >= 1) {
             p0 = p0 - i;
             long l = this.mPosition + (long)i;
             this.mPosition = l;
          }else {
             break ;
          }
       }
       throw new IOException("Skip didn\'t move at least 1 byte forward");
    }
}
