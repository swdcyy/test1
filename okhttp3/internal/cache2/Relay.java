package okhttp3.internal.cache2.Relay;
import java.lang.String;
import okio.ByteString;
import java.io.RandomAccessFile;
import okio.n;
import java.lang.Object;
import okio.b;
import java.io.File;
import okhttp3.internal.cache2.FileOperator;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.io.Closeable;
import okhttp3.internal.Util;
import okhttp3.internal.cache2.Relay$RelaySource;
import java.lang.IllegalArgumentException;

public final class Relay	// class@001f83
{
    public final b buffer;
    public final long bufferMaxSize;
    public boolean complete;
    public RandomAccessFile file;
    public final ByteString metadata;
    public int sourceCount;
    public n upstream;
    public final b upstreamBuffer;
    public long upstreamPos;
    public Thread upstreamReader;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;

    static {
       Relay.PREFIX_CLEAN = ByteString.encodeUtf8("OkHttp cache v1\n");
       Relay.PREFIX_DIRTY = ByteString.encodeUtf8("OkHttp DIRTY :\(\n");
    }
    public void Relay(RandomAccessFile p0,n p1,long p2,ByteString p3,long p4){
       super();
       this.upstreamBuffer = new b();
       this.buffer = new b();
       this.file = p0;
       this.upstream = p1;
       boolean b = (p1 == null)? true: false;
       this.complete = b;
       this.upstreamPos = p2;
       this.metadata = p3;
       this.bufferMaxSize = p4;
       return;
    }
    public static Relay edit(File p0,n p1,ByteString p2,long p3){
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "rw");
       Relay relay = new Relay(randomAccess, p1, 0, p2, p3);
       randomAccess.setLength(0);
       p0.writeHeader(Relay.PREFIX_DIRTY, -1, -1);
       return p0;
    }
    public static Relay read(File p0){
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "rw");
       FileOperator uFileOperato = new FileOperator(randomAccess.getChannel());
       b uob = new b();
       uFileOperato.read(0, uob, 32);
       ByteString pREFIX_CLEAN = Relay.PREFIX_CLEAN;
       if (!uob.readByteString((long)pREFIX_CLEAN.size()).equals(pREFIX_CLEAN)) {
          throw new IOException("unreadable cache file");
       }
       long l = uob.readLong();
       uob = new b();
       uFileOperato.read((l + 32), uob, uob.readLong());
       ByteString uByteString = uob.readByteString();
       Relay relay = new Relay(randomAccess, null, l, uByteString, 0);
       return uFileOperato;
    }
    public void commit(long p0){
       this.writeMetadata(p0);
       this.file.getChannel().force(false);
       this.writeHeader(Relay.PREFIX_CLEAN, p0, (long)this.metadata.size());
       this.file.getChannel().force(false);
       _monitor_enter(this);
       this.complete = true;
       _monitor_exit(this);
       Util.closeQuietly(this.upstream);
       this.upstream = null;
    }
    public boolean isClosed(){
       boolean b = (this.file == null)? true: false;
       return b;
    }
    public ByteString metadata(){
       return this.metadata;
    }
    public n newSource(){
       _monitor_enter(this);
       if (this.file == null) {
          _monitor_exit(this);
          return null;
       }else {
          this.sourceCount = this.sourceCount + 1;
          _monitor_exit(this);
          return new Relay$RelaySource(this);
       }
    }
    public final void writeHeader(ByteString p0,long p1,long p2){
       b uob = new b();
       uob.u(p0);
       uob.I(p1);
       uob.I(p2);
       if (uob.p() - 32) {
          throw new IllegalArgumentException();
       }
       new FileOperator(this.file.getChannel()).write(0, uob, 32);
       return;
    }
    public final void writeMetadata(long p0){
       b uob = new b();
       uob.u(this.metadata);
       new FileOperator(this.file.getChannel()).write((32 + p0), uob, (long)this.metadata.size());
    }
}
