package com.google.archivepatcher.applier.b;
import com.google.archivepatcher.applier.a;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.util.Arrays;
import com.google.archivepatcher.applier.e;
import java.util.ArrayList;
import nk.b;
import com.google.archivepatcher.applier.PatchFormatException;
import com.google.archivepatcher.shared.PatchConstants$CompatibilityWindowId;
import com.google.archivepatcher.shared.JreDeflateParameters;
import com.google.archivepatcher.shared.PatchConstants$DeltaFormat;
import lk.a;
import lk.b;
import java.util.List;
import java.util.Collections;
import com.google.archivepatcher.shared.h;
import com.google.archivepatcher.shared.e;
import com.google.archivepatcher.applier.c;
import com.google.archivepatcher.applier.d;
import java.io.RandomAccessFile;
import mk.a;
import java.io.FilterOutputStream;

public class b implements a	// class@0016f9
{
    public final File a;

    public void b(){
       super(null);
    }
    public void b(File p0){
       super();
       if (p0 == null) {
          p0 = new File(System.getProperty("java.io.tmpdir"));
       }
       this.a = p0;
       return;
    }
    public void a(File p0,InputStream p1,OutputStream p2){
       if (!this.a.exists()) {
          this.a.mkdirs();
       }
       File uFile = File.createTempFile("gfbfv1", "old", this.a);
       this.b(p0, uFile, p1, p2);
       uFile.delete();
       return;
    }
    public final void b(File p0,File p1,InputStream p2,OutputStream p3){
       long l4;
       long l6;
       long l7;
       long l8;
       int i3;
       long l9;
       b uob1;
       DataInputStream uDataInputSt = new DataInputStream(p2);
       byte[] bytes = ("GFbFv1_0").getBytes("US-ASCII");
       byte[] uobyteArray = new byte[bytes.length];
       uDataInputSt.readFully(uobyteArray);
       if (!Arrays.equals(bytes, uobyteArray)) {
          throw new PatchFormatException("Bad identifier");
       }
       uDataInputSt.skip(4);
       long l = uDataInputSt.readLong();
       e.a(l, "delta-friendly old file size");
       long l1 = (long)uDataInputSt.readInt();
       e.a(l1, "old file uncompression instruction count");
       int i = (int)l1;
       ArrayList uArrayList = new ArrayList(i);
       int i1 = 0;
       String str = -1;
       while (true) {
          if (i1 < i) {
             long l2 = uDataInputSt.readLong();
             e.a(l2, "old file uncompression range offset");
             long l3 = uDataInputSt.readLong();
             e.a(l3, "old file uncompression range length");
             if (l2 - str >= 0) {
                l4 = l2;
                b uob = new b(l4, l3, null);
                uArrayList.add(v10);
                l4 = l4 + l3;
                i1 = i1 + 1;
             }else {
                break ;
             }
          }else {
             i = uDataInputSt.readInt();
             e.a((long)i, "delta-friendly new file recompression instruction count");
             ArrayList uArrayList1 = new ArrayList(i);
             int i2 = 0;
             long l5 = -1;
          label_0083 :
             if (i2 < i) {
                l6 = uDataInputSt.readLong();
                e.a(l6, "delta-friendly new file recompression range offset");
                l7 = uDataInputSt.readLong();
                e.a(l7, "delta-friendly new file recompression range length");
                if (l6 - l5 < 0) {
                   throw new PatchFormatException("delta-friendly new file recompression ranges out of order or overlapping");
                }
                l5 = l6 + l7;
                l8 = (long)PatchConstants$CompatibilityWindowId.DEFAULT_DEFLATE.patchValue;
                e.b((long)uDataInputSt.readByte(), l8, l8, "compatibility window id");
                l8 = (long)uDataInputSt.readUnsignedByte();
                e.b(l8, 1, 9, "recompression level");
                i3 = (int)l8;
                l9 = (long)uDataInputSt.readUnsignedByte();
                e.b(l9, 0, 2, "recompression strategy");
                int i4 = (int)l9;
                l9 = (long)uDataInputSt.readUnsignedByte();
                e.b(l9, 0, 1, "recompression nowrap");
                boolean i5 = (int)l9;
                i5 = (!i5)? false: true;
                uob1 = new b(l6, l7, JreDeflateParameters.of(i3, i4, i5));
                uArrayList1.add(l9);
                i2 = i2 + 1;
                i3 = p2;
                goto label_0083 ;
             }else {
                l8 = (long)uDataInputSt.readInt();
                e.b(l8, 1, 1, "num delta records");
                i3 = (int)l8;
                ArrayList uArrayList2 = new ArrayList(i3);
                i = 0;
                while (i < i3) {
                   l6 = (long)uDataInputSt.readByte();
                   l9 = (long)PatchConstants$DeltaFormat.BSDIFF.patchValue;
                   l7 = l6;
                   long l10 = l6;
                   e.b(l7, l9, l9, "delta format");
                   long l11 = uDataInputSt.readLong();
                   e.a(l11, "delta-friendly old file work range offset");
                   long l12 = uDataInputSt.readLong();
                   e.a(l12, "delta-friendly old file work range length");
                   l6 = uDataInputSt.readLong();
                   e.a(l6, "delta-friendly new file work range offset");
                   l4 = uDataInputSt.readLong();
                   e.a(l4, "delta-friendly new file work range length");
                   long l13 = l4;
                   l4 = uDataInputSt.readLong();
                   e.a(l4, "delta length");
                   long l14 = l4;
                   b uob2 = new b(l11, l12, null);
                   a uoa = v14;
                   uob1 = new b(l6, l13, null);
                   a uoa1 = new a(PatchConstants$DeltaFormat.fromPatchValue((byte)(int)l10), v23, v24, l14);
                   uArrayList2.add(uoa);
                   i = i + 1;
                   l = l;
                }
                b uob3 = new b(Collections.unmodifiableList(uArrayList), l, Collections.unmodifiableList(uArrayList1), Collections.unmodifiableList(uArrayList2));
                File uFile = p1;
                h oh = new h(uFile, i3.c);
                b a = i3.a;
                File uFile1 = p0;
                boolean b = false;
                try{
                   e.a(a, uFile1, oh, b, 0x8000);
                   oh.close();
                   c uoc = new c(p2, i3.d.get(0).d);
                   d uod = new d(i3.b, p3, 0x8000);
                   RandomAccessFile randomAccess = new RandomAccessFile(e0, "r");
                   try{
                      a.a(randomAccess, uod, uoc);
                      randomAccess.close();
                      uod.flush();
                      return;
                   }catch(java.lang.Exception e0){
                   }
                }catch(java.lang.Exception e0){
                }
             }
          }
       }
       throw new PatchFormatException("old file uncompression ranges out of order or overlapping");
    }
}
