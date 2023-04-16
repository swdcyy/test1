package okhttp3.internal.http2.Hpack$Writer;
import okio.b;
import java.lang.Object;
import okhttp3.internal.http2.Header;
import java.util.Arrays;
import java.lang.System;
import java.lang.Math;
import okio.ByteString;
import okhttp3.internal.http2.Huffman;
import okio.c;
import java.util.List;
import okhttp3.internal.http2.Hpack;
import java.util.Map;
import java.lang.Integer;
import okhttp3.internal.Util;

public final class Hpack$Writer	// class@001f9b
{
    public Header[] dynamicTable;
    public int dynamicTableByteCount;
    public boolean emitDynamicTableSizeUpdate;
    public int headerCount;
    public int headerTableSizeSetting;
    public int maxDynamicTableByteCount;
    public int nextHeaderIndex;
    public final b out;
    public int smallestHeaderTableSizeSetting;
    public final boolean useCompression;

    public void Hpack$Writer(int p0,boolean p1,b p2){
       super();
       this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
       Header[] headerArray = new Header[8];
       this.dynamicTable = headerArray;
       this.nextHeaderIndex = headerArray.length - 1;
       this.headerCount = 0;
       this.dynamicTableByteCount = 0;
       this.headerTableSizeSetting = p0;
       this.maxDynamicTableByteCount = p0;
       this.useCompression = p1;
       this.out = p2;
    }
    public void Hpack$Writer(b p0){
       super(4096, true, p0);
    }
    public final void adjustDynamicTableByteCount(){
       Hpack$Writer tmaxDynamicT = this.maxDynamicTableByteCount;
       Hpack$Writer tdynamicTabl = this.dynamicTableByteCount;
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
    public final int evictToRecoverBytes(int p0){
       int i3;
       int i = 0;
       if (p0 > 0) {
          int i1 = this.dynamicTable.length - 1;
          Hpack$Writer tnextHeaderI = this.nextHeaderIndex;
          while (i1 >= tnextHeaderI && p0 > 0) {
             tnextHeaderI = this.dynamicTable;
             p0 = p0 - tnextHeaderI[i1].hpackSize;
             int i2 = this.dynamicTableByteCount - tnextHeaderI[i1].hpackSize;
             this.dynamicTableByteCount = i2;
             i3 = this.headerCount - 1;
             this.headerCount = i3;
             i = i + 1;
             i1 = i1 - 1;
          }
          System.arraycopy(this.dynamicTable, (tnextHeaderI + 1), this.dynamicTable, ((tnextHeaderI + 1) + i), this.headerCount);
          Hpack$Writer tnextHeaderI1 = this.nextHeaderIndex;
          i3 = tnextHeaderI1 + 1;
          Arrays.fill(this.dynamicTable, i3, ((tnextHeaderI1 + 1) + i), null);
          this.nextHeaderIndex = this.nextHeaderIndex + i;
       }
       return i;
    }
    public final void insertIntoDynamicTable(Header p0){
       Header hpackSize = p0.hpackSize;
       Hpack$Writer tmaxDynamicT = this.maxDynamicTableByteCount;
       if (hpackSize > tmaxDynamicT) {
          this.clearDynamicTable();
          return;
       }else {
          this.evictToRecoverBytes(((this.dynamicTableByteCount + hpackSize) - tmaxDynamicT));
          Hpack$Writer tdynamicTabl = this.dynamicTable;
          if ((this.headerCount + 1) > tdynamicTabl.length) {
             Header[] headerArray = new Header[(tdynamicTabl.length * 2)];
             System.arraycopy(tdynamicTabl, 0, headerArray, tdynamicTabl.length, tdynamicTabl.length);
             this.nextHeaderIndex = this.dynamicTable.length - 1;
             this.dynamicTable = headerArray;
          }
          tmaxDynamicT = this.nextHeaderIndex;
          this.nextHeaderIndex = tmaxDynamicT - 1;
          this.dynamicTable[tmaxDynamicT] = p0;
          this.headerCount = this.headerCount + 1;
          this.dynamicTableByteCount = this.dynamicTableByteCount + hpackSize;
          return;
       }
    }
    public void setHeaderTableSizeSetting(int p0){
       this.headerTableSizeSetting = p0;
       p0 = Math.min(p0, 0x4000);
       Hpack$Writer tmaxDynamicT = this.maxDynamicTableByteCount;
       if (tmaxDynamicT == p0) {
          return;
       }
       if (p0 < tmaxDynamicT) {
          this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, p0);
       }
       this.emitDynamicTableSizeUpdate = true;
       this.maxDynamicTableByteCount = p0;
       this.adjustDynamicTableByteCount();
       return;
    }
    public void writeByteString(ByteString p0){
       if (this.useCompression != null && Huffman.get().encodedLength(p0) < p0.size()) {
          b uob = new b();
          Huffman.get().encode(p0, uob);
          p0 = uob.readByteString();
          this.writeInt(p0.size(), 127, 128);
          this.out.u(p0);
       }else {
          this.writeInt(p0.size(), 127, 0);
          this.out.u(p0);
       }
       return;
    }
    public void writeHeaders(List p0){
       int i5;
       int i6;
       int i7;
       if (this.emitDynamicTableSizeUpdate != null) {
          Hpack$Writer tsmallestHea = this.smallestHeaderTableSizeSetting;
          int i = 32;
          int i1 = 31;
          if (tsmallestHea < this.maxDynamicTableByteCount) {
             this.writeInt(tsmallestHea, i1, i);
          }
          this.emitDynamicTableSizeUpdate = false;
          this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
          this.writeInt(this.maxDynamicTableByteCount, i1, i);
       }
       int i2 = p0.size();
       int i3 = 0;
       while (i3 < i2) {
          Header header = p0.get(i3);
          ByteString uByteString = header.name.toAsciiLowercase();
          Header value = header.value;
          Integer integer = Hpack.NAME_TO_FIRST_INDEX.get(uByteString);
          Hpack$Writer writer = -1;
          int i4 = 1;
          if (integer != null) {
             i5 = integer.intValue() + i4;
             if (i5 > i4 && i5 < 8) {
                Header[] sTATIC_HEADE = Hpack.STATIC_HEADER_TABLE;
                i6 = i5 - 1;
                if (Util.equal(sTATIC_HEADE[i6].value, value)) {
                   i7 = i5;
                }else if(Util.equal(sTATIC_HEADE[i5].value, value)){
                   i7 = i5 + 1;
                   int i8 = i7;
                   i7 = i5;
                   i5 = i8;
                }
             }
             i7 = i5;
             i5 = -1;
          }else {
             i5 = -1;
             i7 = -1;
          }
          if (i5 == writer) {
             i6 = this.nextHeaderIndex + i4;
             i4 = this.dynamicTable.length;
             while (i6 < i4) {
                if (Util.equal(this.dynamicTable[i6].name, uByteString)) {
                   if (Util.equal(this.dynamicTable[i6].value, value)) {
                      i6 = i6 - this.nextHeaderIndex;
                      i5 = Hpack.STATIC_HEADER_TABLE.length + i6;
                      break ;
                   }else if(i7 == writer){
                      i7 = i6 - this.nextHeaderIndex;
                      i7 = i7 + Hpack.STATIC_HEADER_TABLE.length;
                   }
                }
                i6 = i6 + 1;
             }
          }
          if (i5 != writer) {
             this.writeInt(i5, 127, 128);
          }else {
             i5 = 64;
             if (i7 == writer) {
                this.out.y(i5);
                this.writeByteString(uByteString);
                this.writeByteString(value);
                this.insertIntoDynamicTable(header);
             }else if(uByteString.startsWith(Header.PSEUDO_PREFIX) && !Header.TARGET_AUTHORITY.equals(uByteString)){
                this.writeInt(i7, 15, false);
                this.writeByteString(value);
             }else {
                this.writeInt(i7, 63, i5);
                this.writeByteString(value);
                this.insertIntoDynamicTable(header);
             }
          }
          i3 = i3 + 1;
       }
       return;
    }
    public void writeInt(int p0,int p1,int p2){
       if (p0 < p1) {
          this.out.y((p0 | p2));
          return;
       }else {
          this.out.y((p2 | p1));
          p0 = p0 - p1;
          p1 = 128;
          while (p0 >= p1) {
             p2 = p0 & 0x7f;
             p1 = p1 | p2;
             this.out.y(p1);
             p0 = p0 >> 7;
          }
          this.out.y(p0);
          return;
       }
    }
}
