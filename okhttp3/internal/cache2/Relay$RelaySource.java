package okhttp3.internal.cache2.Relay$RelaySource;
import okio.n;
import okhttp3.internal.cache2.Relay;
import java.lang.Object;
import okio.o;
import okhttp3.internal.cache2.FileOperator;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.io.Closeable;
import okhttp3.internal.Util;
import okio.b;
import java.lang.Thread;
import java.lang.Math;
import java.lang.IllegalStateException;
import java.lang.String;

public class Relay$RelaySource implements n	// class@001f82
{
    public FileOperator fileOperator;
    public long sourcePos;
    public final Relay this$0;
    public final o timeout;

    public void Relay$RelaySource(Relay p0){
       this.this$0 = p0;
       super();
       this.timeout = new o();
       this.fileOperator = new FileOperator(p0.file.getChannel());
    }
    public void close(){
       if (this.fileOperator == null) {
          return;
       }
       FileOperator uFileOperato = null;
       this.fileOperator = uFileOperato;
       Relay$RelaySource tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       Relay$RelaySource tthis$01 = this.this$0;
       int i = tthis$01.sourceCount - 1;
       tthis$01.sourceCount = i;
       if (!i) {
          Relay file = tthis$01.file;
          tthis$01.file = uFileOperato;
          uFileOperato = file;
       }
       _monitor_exit(tthis$0);
       if (uFileOperato != null) {
          Util.closeQuietly(uFileOperato);
       }
       return;
    }
    public long read(b p0,long p1){
       Relay$RelaySource this$01;
       long l3;
       Relay$RelaySource relaySource = this;
       long l = p1;
       if (relaySource.fileOperator == null) {
          throw new IllegalStateException("closed");
       }
       Relay$RelaySource this$0 = relaySource.this$0;
       _monitor_enter(this$0);
       while (true) {
          this$01 = relaySource.this$0;
          Relay upstreamPos = this$01.upstreamPos;
          Relay$RelaySource relaySource1 = 2;
          long l1 = -1;
          if (!relaySource.sourcePos - upstreamPos) {
             if (this$01.complete != null) {
                _monitor_exit(this$0);
                return l1;
             }else if(this$01.upstreamReader != null){
                relaySource.timeout.waitUntilNotified(this$01);
             }else {
                this$01.upstreamReader = Thread.currentThread();
                this$01 = 1;
                _monitor_exit(this$0);
             label_0041 :
                long l2 = 32;
                if (this$01 == relaySource1) {
                   l = Math.min(l, (upstreamPos - relaySource.sourcePos));
                   relaySource.fileOperator.read((relaySource.sourcePos + l2), p0, l);
                   relaySource.sourcePos = relaySource.sourcePos + l;
                   return l;
                }else {
                   this$01 = relaySource.this$0;
                   l3 = this$01.upstream.read(this$01.upstreamBuffer, this$01.bufferMaxSize);
                   if (!l3 - l1) {
                      relaySource.this$0.commit(upstreamPos);
                      Relay$RelaySource this$02 = relaySource.this$0;
                      _monitor_enter(this$02);
                      this$01 = relaySource.this$0;
                      this$01.upstreamReader = null;
                      this$01.notifyAll();
                      _monitor_exit(this$02);
                      return l1;
                   }else {
                      l = Math.min(l3, l);
                      relaySource.this$0.upstreamBuffer.f(p0, 0, l);
                      relaySource.sourcePos = relaySource.sourcePos + l;
                      relaySource.fileOperator.write((upstreamPos + l2), relaySource.this$0.upstreamBuffer.c(), l3);
                      this$0 = relaySource.this$0;
                      _monitor_enter(this$0);
                      this$01 = relaySource.this$0;
                      this$01.buffer.write(this$01.upstreamBuffer, l3);
                      this$01 = relaySource.this$0;
                      if (relaySource.this$0.buffer.p() - this$01.bufferMaxSize > 0) {
                         Relay buffer = this$01.buffer;
                         buffer.skip((buffer.p() - relaySource.this$0.bufferMaxSize));
                         break ;
                      }
                      break ;
                   }
                }
             }
          }else {
             long l4 = upstreamPos - this$01.buffer.p();
             Relay$RelaySource sourcePos = relaySource.sourcePos;
             if (sourcePos - l4 < 0) {
                _monitor_exit(this$0);
                this$01 = 2;
                goto label_0041 ;
             }else {
                l = Math.min(l, (upstreamPos - sourcePos));
                relaySource.this$0.buffer.f(p0, (relaySource.sourcePos - l4), l);
                relaySource.sourcePos = relaySource.sourcePos + l;
                _monitor_exit(this$0);
                return l;
             }
          }
       }
       Relay$RelaySource this$03 = relaySource.this$0;
       this$03.upstreamPos = this$03.upstreamPos + l3;
       _monitor_exit(this$0);
       _monitor_enter(this$03);
       this$01 = relaySource.this$0;
       this$01.upstreamReader = null;
       this$01.notifyAll();
       _monitor_exit(this$03);
       return l;
    }
    public o timeout(){
       return this.timeout;
    }
}
