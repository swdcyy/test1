package okhttp3.internal.http2.Hpack$Reader;
import okio.n;
import java.lang.Object;
import java.util.ArrayList;
import okhttp3.internal.http2.Header;
import okio.d;
import okio.l;
import java.util.Arrays;
import java.lang.System;
import java.util.List;
import java.util.Collection;
import okio.ByteString;
import okhttp3.internal.http2.Hpack;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.String;
import okhttp3.internal.http2.Huffman;

public final class Hpack$Reader	// class@001f9a
{
    public Header[] dynamicTable;
    public int dynamicTableByteCount;
    public int headerCount;
    public final List headerList;
    public final int headerTableSizeSetting;
    public int maxDynamicTableByteCount;
    public int nextHeaderIndex;
    public final d source;

    public void Hpack$Reader(int p0,int p1,n p2){
       super();
       this.headerList = new ArrayList();
       Header[] headerArray = new Header[8];
       this.dynamicTable = headerArray;
       this.nextHeaderIndex = headerArray.length - 1;
       this.headerCount = 0;
       this.dynamicTableByteCount = 0;
       this.headerTableSizeSetting = p0;
       this.maxDynamicTableByteCount = p1;
       this.source = l.d(p2);
    }
    public void Hpack$Reader(int p0,n p1){
       super(p0, p0, p1);
    }
    public final void adjustDynamicTableByteCount(){
       Hpack$Reader tmaxDynamicT = this.maxDynamicTableByteCount;
       Hpack$Reader tdynamicTabl = this.dynamicTableByteCount;
       if (tmaxDynamicT < tdynamicTabl) {
          if (tmaxDynamicT == null) {
             this.clearDynamicTable();
          }else {
             this.evictToRecoverBytes((tdynamicTabl - tmaxDynamicT));
          }
       }
       return;
    }
    public final void clearDynamicTable(){
       Arrays.fill(this.dynamicTable, null);
       this.nextHeaderIndex = this.dynamicTable.length - 1;
       this.headerCount = 0;
       this.dynamicTableByteCount = 0;
    }
    public final int dynamicTableIndex(int p0){
       return ((this.nextHeaderIndex + 1) + p0);
    }
    public final int evictToRecoverBytes(int p0){
       int i = 0;
       if (p0 > 0) {
          int i1 = this.dynamicTable.length - 1;
          Hpack$Reader tnextHeaderI = this.nextHeaderIndex;
          while (i1 >= tnextHeaderI && p0 > 0) {
             tnextHeaderI = this.dynamicTable;
             p0 = p0 - tnextHeaderI[i1].hpackSize;
             int i2 = this.dynamicTableByteCount - tnextHeaderI[i1].hpackSize;
             this.dynamicTableByteCount = i2;
             int i3 = this.headerCount - 1;
             this.headerCount = i3;
             i = i + 1;
             i1 = i1 - 1;
          }
          System.arraycopy(this.dynamicTable, (tnextHeaderI + 1), this.dynamicTable, ((tnextHeaderI + 1) + i), this.headerCount);
          this.nextHeaderIndex = this.nextHeaderIndex + i;
       }
       return i;
    }
    public List getAndResetHeaderList(){
       this.headerList.clear();
       return new ArrayList(this.headerList);
    }
    public final ByteString getName(int p0){
       if (this.isStaticHeader(p0)) {
          return Hpack.STATIC_HEADER_TABLE[p0].name;
       }
       int i = this.dynamicTableIndex((p0 - Hpack.STATIC_HEADER_TABLE.length));
       if (i >= 0) {
          Hpack$Reader tdynamicTabl = this.dynamicTable;
          if (i < tdynamicTabl.length) {
             return tdynamicTabl[i].name;
          }
       }
       p0++;
       throw new IOException("Header index too large "+p0);
    }
    public final void insertIntoDynamicTable(int p0,Header p1){
       this.headerList.add(p1);
       Header hpackSize = p1.hpackSize;
       int i = -1;
       if (p0 != i) {
          hpackSize = hpackSize - this.dynamicTable[this.dynamicTableIndex(p0)].hpackSize;
       }
       Hpack$Reader tmaxDynamicT = this.maxDynamicTableByteCount;
       if (hpackSize > tmaxDynamicT) {
          this.clearDynamicTable();
          return;
       }else {
          int i1 = this.evictToRecoverBytes(((this.dynamicTableByteCount + hpackSize) - tmaxDynamicT));
          if (p0 == i) {
             Hpack$Reader tdynamicTabl = this.dynamicTable;
             if ((this.headerCount + 1) > tdynamicTabl.length) {
                Header[] headerArray = new Header[(tdynamicTabl.length * 2)];
                System.arraycopy(tdynamicTabl, 0, headerArray, tdynamicTabl.length, tdynamicTabl.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArray;
             }
             Hpack$Reader tnextHeaderI = this.nextHeaderIndex;
             this.nextHeaderIndex = tnextHeaderI - 1;
             this.dynamicTable[tnextHeaderI] = p1;
             this.headerCount = this.headerCount + 1;
          }else {
             this.dynamicTable[(p0 + (this.dynamicTableIndex(p0) + i1))] = p1;
          }
          this.dynamicTableByteCount = this.dynamicTableByteCount + hpackSize;
          return;
       }
    }
    public final boolean isStaticHeader(int p0){
       int i = 1;
       if (p0 < 0 || p0 > (Hpack.STATIC_HEADER_TABLE.length - i)) {
          i = false;
       }
       return i;
    }
    public int maxDynamicTableByteCount(){
       return this.maxDynamicTableByteCount;
    }
    public final int readByte(){
       return (this.source.readByte() & 0x00ff);
    }
    public ByteString readByteString(){
       int i = this.readByte();
       Huffman huffman = ((i & 0x0080) == 128)? 1: null;
       i = this.readInt(i, 127);
       if (huffman) {
          return ByteString.of(Huffman.get().decode(this.source.readByteArray((long)i)));
       }else {
          return this.source.readByteString((long)i);
       }
    }
    public void readHeaders(){
       while (true) {
          if (this.source.exhausted()) {
             return;
          }
          int i = this.source.readByte() & 0x00ff;
          String str = 128;
          if (i == str) {
             throw new IOException("index == 0");
          }
          int i1 = i & 0x0080;
          if (i1 == str) {
             i = this.readInt(i, 127) - 1;
             this.readIndexedHeader(i);
          }else {
             str = 64;
             if (i == str) {
                this.readLiteralHeaderWithIncrementalIndexingNewName();
             }else {
                i1 = i & 0x40;
                if (i1 == str) {
                   i = this.readInt(i, 63) - 1;
                   this.readLiteralHeaderWithIncrementalIndexingIndexedName(i);
                }else {
                   int i2 = i & 0x20;
                   if (i2 == 32) {
                      i = this.readInt(i, 31);
                      this.maxDynamicTableByteCount = i;
                      if (i >= 0 && i <= this.headerTableSizeSetting) {
                         this.adjustDynamicTableByteCount();
                      }else {
                         break ;
                      }
                   }else if(i == 16 || !i){
                      this.readLiteralHeaderWithoutIndexingNewName();
                   }else {
                      i = this.readInt(i, 15) - 1;
                      this.readLiteralHeaderWithoutIndexingIndexedName(i);
                   }
                }
             }
          }
       }
       throw new IOException("Invalid dynamic table size update "+this.maxDynamicTableByteCount);
    }
    public final void readIndexedHeader(int p0){
       if (this.isStaticHeader(p0)) {
          this.headerList.add(Hpack.STATIC_HEADER_TABLE[p0]);
       }else {
          int i = this.dynamicTableIndex((p0 - Hpack.STATIC_HEADER_TABLE.length));
          if (i >= 0) {
             Hpack$Reader tdynamicTabl = this.dynamicTable;
             if (i < tdynamicTabl.length) {
                this.headerList.add(tdynamicTabl[i]);
             }
          }
          p0++;
          throw new IOException("Header index too large "+p0);
       }
       return;
    }
    public int readInt(int p0,int p1){
       p0 = p0 & p1;
       if (p0 < p1) {
          return p0;
       }
       p0 = 0;
       int i = this.readByte();
       int i1 = i & 0x0080;
       while (i1) {
          i = i & 0x7f;
          i = i << p0;
          p1 = p1 + i;
          p0 = p0 + 7;
       }
       return (p1 + (i << p0));
    }
    public final void readLiteralHeaderWithIncrementalIndexingIndexedName(int p0){
       this.insertIntoDynamicTable(-1, new Header(this.getName(p0), this.readByteString()));
    }
    public final void readLiteralHeaderWithIncrementalIndexingNewName(){
       this.insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(this.readByteString()), this.readByteString()));
    }
    public final void readLiteralHeaderWithoutIndexingIndexedName(int p0){
       this.headerList.add(new Header(this.getName(p0), this.readByteString()));
    }
    public final void readLiteralHeaderWithoutIndexingNewName(){
       this.headerList.add(new Header(Hpack.checkLowercase(this.readByteString()), this.readByteString()));
    }
}
