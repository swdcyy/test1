package okhttp3.internal.http2.Huffman;
import java.lang.Object;
import okhttp3.internal.http2.Huffman$Node;
import java.lang.IllegalStateException;
import java.lang.String;
import java.io.ByteArrayOutputStream;
import okio.ByteString;
import okio.c;

public class Huffman	// class@001fb9
{
    public final Huffman$Node root;
    public static final int[] CODES;
    public static final byte[] CODE_LENGTHS;
    public static final Huffman INSTANCE;

    static {
       Huffman.CODES = new int[256]{8184,0x7fffd8,0xfffffe2,0xfffffe3,0xfffffe4,0xfffffe5,0xfffffe6,0xfffffe7,0xfffffe8,0xffffea,0x3ffffffc,0xfffffe9,0xfffffea,0x3ffffffd,0xfffffeb,0xfffffec,0xfffffed,0xfffffee,0xfffffef,0xffffff0,0xffffff1,0xffffff2,0x3ffffffe,0xffffff3,0xffffff4,0xffffff5,0xffffff6,0xffffff7,0xffffff8,0xffffff9,0xffffffa,0xffffffb,20,1016,1017,4090,8185,21,248,2042,1018,1019,249,2043,250,22,23,24,0,1,2,25,26,27,28,29,30,31,92,251,0x7ffc,32,4091,1020,8186,'!',']','^','_','`','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',252,'s',253,8187,0x7fff0,8188,0x3ffc,'"',0x7ffd,3,'#',4,'$',5,'%','&',39,6,'t','u','(',')','*',7,'+','v',',',8,9,'-','w','x','y','z','{',0x7ffe,2044,0x3ffd,8189,0xffffffc,0xfffe6,0x3fffd2,0xfffe7,0xfffe8,0x3fffd3,0x3fffd4,0x3fffd5,0x7fffd9,0x3fffd6,0x7fffda,0x7fffdb,0x7fffdc,0x7fffdd,0x7fffde,0xffffeb,0x7fffdf,0xffffec,0xffffed,0x3fffd7,0x7fffe0,0xffffee,0x7fffe1,0x7fffe2,0x7fffe3,0x7fffe4,0x1fffdc,0x3fffd8,0x7fffe5,0x3fffd9,0x7fffe6,0x7fffe7,0xffffef,0x3fffda,0x1fffdd,0xfffe9,0x3fffdb,0x3fffdc,0x7fffe8,0x7fffe9,0x1fffde,0x7fffea,0x3fffdd,0x3fffde,0xfffff0,0x1fffdf,0x3fffdf,0x7fffeb,0x7fffec,0x1fffe0,0x1fffe1,0x3fffe0,0x1fffe2,0x7fffed,0x3fffe1,0x7fffee,0x7fffef,0xfffea,0x3fffe2,0x3fffe3,0x3fffe4,0x7ffff0,0x3fffe5,0x3fffe6,0x7ffff1,0x3ffffe0,0x3ffffe1,0xfffeb,0x7fff1,0x3fffe7,0x7ffff2,0x3fffe8,0x1ffffec,0x3ffffe2,0x3ffffe3,0x3ffffe4,0x7ffffde,0x7ffffdf,0x3ffffe5,0xfffff1,0x1ffffed,0x7fff2,0x1fffe3,0x3ffffe6,0x7ffffe0,0x7ffffe1,0x3ffffe7,0x7ffffe2,0xfffff2,0x1fffe4,0x1fffe5,0x3ffffe8,0x3ffffe9,0xffffffd,0x7ffffe3,0x7ffffe4,0x7ffffe5,0xfffec,0xfffff3,0xfffed,0x1fffe6,0x3fffe9,0x1fffe7,0x1fffe8,0x7ffff3,0x3fffea,0x3fffeb,0x1ffffee,0x1ffffef,0xfffff4,0xfffff5,0x3ffffea,0x7ffff4,0x3ffffeb,0x7ffffe6,0x3ffffec,0x3ffffed,0x7ffffe7,0x7ffffe8,0x7ffffe9,0x7ffffea,0x7ffffeb,0xffffffe,0x7ffffec,0x7ffffed,0x7ffffee,0x7ffffef,0x7fffff0,0x3ffffee};
       Huffman.CODE_LENGTHS = new byte[256]{0x0d,0x17,0x1c,0x1c,0x1c,0x1c,0x1c,0x1c,0x1c,0x18,0x1e,0x1c,0x1c,0x1e,0x1c,0x1c,0x1c,0x1c,0x1c,0x1c,0x1c,0x1c,0x1e,0x1c,0x1c,0x1c,0x1c,0x1c,0x1c,0x1c,0x1c,0x1c,0x06,0x0a,0x0a,0x0c,0x0d,0x06,0x08,0x0b,0x0a,0x0a,0x08,0x0b,0x08,0x06,0x06,0x06,0x05,0x05,0x05,0x06,0x06,0x06,0x06,0x06,0x06,0x06,0x07,0x08,0x0f,0x06,0x0c,0x0a,0x0d,0x06,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x07,0x08,0x07,0x08,0x0d,0x13,0x0d,0x0e,0x06,0x0f,0x05,0x06,0x05,0x06,0x05,0x06,0x06,0x06,0x05,0x07,0x07,0x06,0x06,0x06,0x05,0x06,0x07,0x06,0x05,0x05,0x06,0x07,0x07,0x07,0x07,0x07,0x0f,0x0b,0x0e,0x0d,0x1c,0x14,0x16,0x14,0x14,0x16,0x16,0x16,0x17,0x16,0x17,0x17,0x17,0x17,0x17,0x18,0x17,0x18,0x18,0x16,0x17,0x18,0x17,0x17,0x17,0x17,0x15,0x16,0x17,0x16,0x17,0x17,0x18,0x16,0x15,0x14,0x16,0x16,0x17,0x17,0x15,0x17,0x16,0x16,0x18,0x15,0x16,0x17,0x17,0x15,0x15,0x16,0x15,0x17,0x16,0x17,0x17,0x14,0x16,0x16,0x16,0x17,0x16,0x16,0x17,0x1a,0x1a,0x14,0x13,0x16,0x17,0x16,0x19,0x1a,0x1a,0x1a,0x1b,0x1b,0x1a,0x18,0x19,0x13,0x15,0x1a,0x1b,0x1b,0x1a,0x1b,0x18,0x15,0x15,0x1a,0x1a,0x1c,0x1b,0x1b,0x1b,0x14,0x18,0x14,0x15,0x16,0x15,0x15,0x17,0x16,0x16,0x19,0x19,0x18,0x18,0x1a,0x17,0x1a,0x1b,0x1a,0x1a,0x1b,0x1b,0x1b,0x1b,0x1b,0x1c,0x1b,0x1b,0x1b,0x1b,0x1b,0x1a};
       Huffman.INSTANCE = new Huffman();
    }
    public void Huffman(){
       super();
       this.root = new Huffman$Node();
       this.buildTree();
    }
    public static Huffman get(){
       return Huffman.INSTANCE;
    }
    public final void addCode(int p0,int p1,byte p2){
       int i;
       Huffman$Node node = new Huffman$Node(p0, p2);
       Huffman troot = this.root;
       while (true) {
          int b = 8;
          if (p2 > b) {
             i = p2 - 8;
             i = (byte)i;
             b = p1 >> i;
             b = b & 0x00ff;
             Huffman$Node children = troot.children;
             if (children != null) {
                if (children[b] == null) {
                   children[b] = new Huffman$Node();
                }
                troot = troot.children[b];
             }else {
                break ;
             }
          }else {
             b = b - p2;
             p1 = (p1 << b) & 0x00ff;
             i = 1 << b;
             b = p1;
             int i1 = p1 + i;
             while (b < i1) {
                troot.children[b] = node;
                b = b + 1;
             }
             return;
          }
       }
       throw new IllegalStateException("invalid dictionary: prefix not unique");
    }
    public final void buildTree(){
       int i = 0;
       byte[] cODE_LENGTHS = Huffman.CODE_LENGTHS;
       while (i < cODE_LENGTHS.length) {
          this.addCode(i, Huffman.CODES[i], cODE_LENGTHS[i]);
          i = i + 1;
       }
       return;
    }
    public byte[] decode(byte[] p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       Huffman troot = this.root;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (i < p0.length) {
          int i3 = p0[i] & 0x00ff;
          i1 = i1 << 8;
          i1 = i1 | i3;
          i2 = i2 + 8;
          while (i2 >= 8) {
             i3 = i2 - 8;
             i3 = i1 >> i3;
             i3 = i3 & 0x00ff;
             troot = troot.children[i3];
             if (troot.children == null) {
                uByteArrayOu.write(troot.symbol);
                i2 = i2 - troot.terminalBits;
                troot = this.root;
             }else {
                i2 = i2 - 8;
             }
          }
          i = i + 1;
       }
       while (i2 > 0) {
          int i4 = i2 - 8;
          i4 = i1 << i4;
          i4 = i4 & 0x00ff;
          object oobject = troot.children[i4];
          if (oobject.children != null || oobject.terminalBits > i2) {
             break ;
          }else {
             uByteArrayOu.write(oobject.symbol);
             i2 = i2 - oobject.terminalBits;
             troot = this.root;
          }
       }
       return uByteArrayOu.toByteArray();
    }
    public void encode(ByteString p0,c p1){
       int i = 0;
       long l = 0;
       int i1 = 0;
       int i2 = 255;
       while (i < p0.size()) {
          byte i3 = p0.getByte(i) & i2;
          i3 = Huffman.CODE_LENGTHS[i3];
          l = l << i3;
          l = l | (long)Huffman.CODES[i3];
          i1 = i1 + i3;
          while (i1 >= 8) {
             i1 = i1 - 8;
             long l1 = l >> i1;
             p1.writeByte((int)l1);
          }
          i = i + 1;
       }
       if (i1 > 0) {
          p1.writeByte((int)((long)(i2 >> i1) | (l << (i1 - 8))));
       }
       return;
    }
    public int encodedLength(ByteString p0){
       long l = 0;
       for (int i = 0; i < p0.size(); i = i + 1) {
          int i1 = p0.getByte(i) & 0x00ff;
          l = l + (long)Huffman.CODE_LENGTHS[i1];
       }
       return (int)((l + 7) >> 3);
    }
}