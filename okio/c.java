package okio.c;
import okio.m;
import java.nio.channels.WritableByteChannel;
import okio.n;
import okio.ByteString;
import okio.b;
import java.io.OutputStream;
import java.lang.String;
import java.nio.charset.Charset;

public interface abstract c implements m, WritableByteChannel	// class@0020f2
{

    c R0(n p0,long p1);
    c Y0(ByteString p0);
    b buffer();
    c emit();
    c emitCompleteSegments();
    void flush();
    b m();
    OutputStream outputStream();
    c write(byte[] p0);
    c write(byte[] p0,int p1,int p2);
    c writeByte(int p0);
    c writeDecimalLong(long p0);
    c writeHexadecimalUnsignedLong(long p0);
    c writeInt(int p0);
    c writeIntLe(int p0);
    c writeLong(long p0);
    c writeLongLe(long p0);
    c writeShort(int p0);
    c writeShortLe(int p0);
    c writeString(String p0,int p1,int p2,Charset p3);
    c writeString(String p0,Charset p1);
    c writeUtf8(String p0);
    c writeUtf8(String p0,int p1,int p2);
    c writeUtf8CodePoint(int p0);
    long x1(n p0);
}
