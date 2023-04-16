package org.java_websocket.framing.d;
import iwd.c;
import org.java_websocket.enums.Opcode;
import java.lang.Object;
import java.nio.ByteBuffer;
import mwd.b;
import java.nio.Buffer;
import java.lang.Class;
import java.lang.Enum;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class d implements c	// class@002154
{
    public boolean a;
    public Opcode b;
    public ByteBuffer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public void d(Opcode p0){
       super();
       this.b = p0;
       this.c = b.a();
       this.a = true;
       this.d = false;
       this.e = false;
       this.f = false;
       this.g = false;
    }
    public void a(c p0){
       ByteBuffer payloadData = p0.getPayloadData();
       if (this.c == null) {
          this.c = ByteBuffer.allocate(payloadData.remaining());
          payloadData.mark();
          this.c.put(payloadData);
          payloadData.reset();
       }else {
          payloadData.mark();
          d tc = this.c;
          tc.position(tc.limit());
          tc = this.c;
          tc.limit(tc.capacity());
          if (payloadData.remaining() > this.c.remaining()) {
             ByteBuffer uByteBuffer = ByteBuffer.allocate((payloadData.remaining() + this.c.capacity()));
             this.c.flip();
             uByteBuffer.put(this.c);
             uByteBuffer.put(payloadData);
             this.c = uByteBuffer;
          }else {
             this.c.put(payloadData);
          }
          this.c.rewind();
          payloadData.reset();
       }
       this.a = p0.isFin();
       return;
    }
    public abstract void b();
    public void c(boolean p0){
       this.a = p0;
    }
    public void d(ByteBuffer p0){
       this.c = p0;
    }
    public void e(boolean p0){
       this.d = p0;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       d tc = this.c;
       p0 = p0.c;
       if (tc != null) {
          b = tc.equals(p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
    public Opcode getOpcode(){
       return this.b;
    }
    public ByteBuffer getPayloadData(){
       return this.c;
    }
    public boolean getTransfereMasked(){
       return this.d;
    }
    public int hashCode(){
       int i = ((this.a * 31) + this.b.hashCode()) * 31;
       d tc = this.c;
       int i1 = (tc != null)? tc.hashCode(): 0;
       return (((((((((i + i1) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g);
    }
    public boolean isFin(){
       return this.a;
    }
    public boolean isRSV1(){
       return this.e;
    }
    public boolean isRSV2(){
       return this.f;
    }
    public boolean isRSV3(){
       return this.g;
    }
    public String toString(){
       StringBuilder str = "Framedata{ optcode:"+this.getOpcode()+", fin:"+this.isFin()+", rsv1:"+this.isRSV1()+", rsv2:"+this.isRSV2()+", rsv3:"+this.isRSV3()+", payloadlength:[pos:"+this.c.position()+", len:"+this.c.remaining()+"], payload:";
       String str1 = (this.c.remaining() > 1000)? "\(too big to display\)": new String(this.c.array());
       return str+str1+'}';
    }
}
