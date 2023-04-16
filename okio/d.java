package okio.d;
import okio.n;
import java.nio.channels.ReadableByteChannel;
import okio.ByteString;
import okio.b;
import okio.m;
import cud.f;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.lang.String;

public interface abstract d implements n, ReadableByteChannel	// class@0020f3
{

    long H(ByteString p0,long p1);
    long L2(ByteString p0,long p1);
    long N(ByteString p0);
    boolean a0(long p0,ByteString p1);
    b buffer();
    long c1(m p0);
    int d0(f p0);
    boolean exhausted();
    long indexOf(byte p0);
    long indexOf(byte p0,long p1);
    long indexOf(byte p0,long p1,long p2);
    InputStream inputStream();
    void l3(b p0,long p1);
    b m();
    d peek();
    boolean q3(long p0,ByteString p1,int p2,int p3);
    int read(byte[] p0);
    int read(byte[] p0,int p1,int p2);
    byte readByte();
    byte[] readByteArray();
    byte[] readByteArray(long p0);
    ByteString readByteString();
    ByteString readByteString(long p0);
    long readDecimalLong();
    void readFully(byte[] p0);
    long readHexadecimalUnsignedLong();
    int readInt();
    int readIntLe();
    long readLong();
    long readLongLe();
    short readShort();
    short readShortLe();
    String readString(long p0,Charset p1);
    String readString(Charset p0);
    String readUtf8();
    String readUtf8(long p0);
    int readUtf8CodePoint();
    String readUtf8Line();
    String readUtf8LineStrict();
    String readUtf8LineStrict(long p0);
    boolean request(long p0);
    void require(long p0);
    void skip(long p0);
    long u2(ByteString p0);
}
