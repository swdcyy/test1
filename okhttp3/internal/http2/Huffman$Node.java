package okhttp3.internal.http2.Huffman$Node;
import java.lang.Object;

public final class Huffman$Node	// class@001fb8
{
    public final Huffman$Node[] children;
    public final int symbol;
    public final int terminalBits;

    public void Huffman$Node(){
       super();
       Huffman$Node[] nodeArray = new Huffman$Node[256];
       this.children = nodeArray;
       this.symbol = 0;
       this.terminalBits = 0;
    }
    public void Huffman$Node(int p0,int p1){
       super();
       this.children = null;
       this.symbol = p0;
       p0 = p1 & 0x07;
       if (!p0) {
          p0 = 8;
       }
       this.terminalBits = p0;
       return;
    }
}
