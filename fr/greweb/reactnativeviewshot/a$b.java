package fr.greweb.reactnativeviewshot.a$b;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.lang.OutOfMemoryError;
import java.util.Arrays;

public class a$b extends ByteArrayOutputStream	// class@000e58
{

    public void a$b(byte[] p0){
       super(0);
       this.buf = p0;
    }
    public ByteBuffer a(int p0){
       ByteArrayOutputStream tbuf = this.buf;
       if (tbuf.length < p0) {
          int i = tbuf.length << 1;
          if ((i - p0) < 0) {
             i = p0;
          }
          if ((i - 0x7ffffff7) > 0) {
             if (p0 >= 0) {
                i = (p0 > 0x7ffffff7)? Integer.MAX_VALUE: 0x7ffffff7;
             }else {
                throw new OutOfMemoryError();
             }
          }
          this.buf = Arrays.copyOf(tbuf, i);
       }
       return ByteBuffer.wrap(this.buf);
    }
    public byte[] c(){
       return this.buf;
    }
    public void d(int p0){
       this.count = p0;
    }
}
