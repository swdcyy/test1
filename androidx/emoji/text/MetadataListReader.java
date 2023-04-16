package androidx.emoji.text.MetadataListReader;
import java.lang.Object;
import androidx.emoji.text.MetadataListReader$OpenTypeReader;
import androidx.emoji.text.MetadataListReader$OffsetInfo;
import java.io.IOException;
import java.lang.String;
import android.content.res.AssetManager;
import d3.c;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.Throwable;
import androidx.emoji.text.MetadataListReader$InputStreamOpenTypeReader;
import java.nio.ByteBuffer;
import java.lang.StringBuilder;
import androidx.emoji.text.MetadataListReader$ByteBufferReader;
import java.nio.Buffer;

public class MetadataListReader	// class@000763
{

    public void MetadataListReader(){
       super();
    }
    public static MetadataListReader$OffsetInfo findOffsetInfo(MetadataListReader$OpenTypeReader p0){
       long l2;
       int i3;
       int i = 4;
       p0.skip(i);
       int i1 = p0.readUnsignedShort();
       if (i1 > 100) {
          throw new IOException("Cannot read metadata.");
       }
       p0.skip(6);
       int i2 = 0;
       long l = 0;
       while (true) {
          long l1 = -1;
          if (l < i1) {
             p0.skip(i);
             l2 = p0.readUnsignedInt();
             p0.skip(i);
             if (0x6d657461 == p0.readTag()) {
             label_0030 :
                if (l2 - l1) {
                   p0.skip((int)(l2 - p0.getPosition()));
                   p0.skip(12);
                   long l3 = p0.readUnsignedInt();
                   while ((long)i2 - l3 < 0) {
                      i3 = p0.readTag();
                      l1 = p0.readUnsignedInt();
                      long l4 = p0.readUnsignedInt();
                      if (0x456d6a69 == i3 || 0x656d6a69 == i3) {
                         return new MetadataListReader$OffsetInfo((l1 + l2), l4);
                      }
                      i2 = i2 + 1;
                   }
                }
                break ;
             }else {
                i3 = l + 1;
             }
          }else {
             l2 = l1;
             goto label_0030 ;
          }
       }
       throw new IOException("Cannot read metadata.");
    }
    public static c read(AssetManager p0,String p1){
       InputStream inputStream = SplitAssetHelper.open(p0, p1);
       c uoc = MetadataListReader.read(inputStream);
       if (inputStream != null) {
          inputStream.close();
       }
       return uoc;
    }
    public static c read(InputStream p0){
       MetadataListReader$InputStreamOpenTypeReader inputStreamO = new MetadataListReader$InputStreamOpenTypeReader(p0);
       MetadataListReader$OffsetInfo offsetInfo = MetadataListReader.findOffsetInfo(inputStreamO);
       inputStreamO.skip((int)(offsetInfo.getStartOffset() - inputStreamO.getPosition()));
       ByteBuffer uByteBuffer = ByteBuffer.allocate((int)offsetInfo.getLength());
       int i = p0.read(uByteBuffer.array());
       if (!(long)i - offsetInfo.getLength()) {
          return c.h(uByteBuffer);
       }
       throw new IOException("Needed "+offsetInfo.getLength()+" bytes, got "+i);
    }
    public static c read(ByteBuffer p0){
       p0 = p0.duplicate();
       p0.position((int)MetadataListReader.findOffsetInfo(new MetadataListReader$ByteBufferReader(p0)).getStartOffset());
       return c.h(p0);
    }
    public static long toUnsignedInt(int p0){
       return ((long)p0 & 0xffffffff);
    }
    public static int toUnsignedShort(short p0){
       return (p0 & 0xffff);
    }
}
