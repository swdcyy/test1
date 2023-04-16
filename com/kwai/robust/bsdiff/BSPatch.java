package com.kwai.robust.bsdiff.BSPatch;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import com.kwai.robust.bsdiff.BSUtil;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BSPatch	// class@001415
{
    public static final int RETURN_DIFF_FILE_ERR = 2;
    public static final int RETURN_NEW_FILE_ERR = 4;
    public static final int RETURN_OLD_FILE_ERR = 3;
    public static final int RETURN_SUCCESS = 1;

    public void BSPatch(){
       super();
    }
    public static String getErrorString(int p0){
       if (p0 == 2) {
          return "RETURN_DIFF_FILE_ERR: diffFile is null, or the diffFile does not exist";
       }
       if (p0 == 3) {
          return "RETURN_OLD_FILE_ERR: oldFile is null, or the oldFile does not exist";
       }
       if (p0 != 4) {
          return "the patch process is end up successfully";
       }
       return "RETURN_NEW_FILE_ERR: newFile is null, or can not create the newFile";
    }
    public static int patchFast(File p0,File p1,File p2,int p3){
       if (p0 != null) {
          int i = 0;
          if (p0.length() - i > 0) {
             if (p1 == null) {
                return 4;
             }else if(p2 == null || p2.length() - i <= 0){
                return 2;
             }else {
                i = (int)p2.length();
                byte[] uobyteArray = new byte[i];
                FileInputStream uFileInputSt = new FileInputStream(p2);
                BSUtil.readFromStream(uFileInputSt, uobyteArray, 0, i);
                uFileInputSt.close();
                FileOutputStream uFileOutputS = new FileOutputStream(p1);
                uFileOutputS.write(BSPatch.patchFast(new BufferedInputStream(new FileInputStream(p0)), (int)p0.length(), uobyteArray, p3));
                uFileOutputS.close();
                return 1;
             }
          }
       }
       return 3;
    }
    public static int patchFast(InputStream p0,InputStream p1,File p2){
       if (p0 == null) {
          return 3;
       }
       if (p2 == null) {
          return 4;
       }
       if (p1 == null) {
          return 2;
       }
       byte[] uobyteArray = BSUtil.inputStreamToByte(p0);
       byte[] uobyteArray1 = BSUtil.inputStreamToByte(p1);
       uobyteArray = BSPatch.patchFast(uobyteArray, uobyteArray.length, uobyteArray1, uobyteArray1.length, 0);
       FileOutputStream uFileOutputS = new FileOutputStream(p2);
       uFileOutputS.write(uobyteArray);
       uFileOutputS.close();
       return 1;
    }
    public static byte[] patchFast(InputStream p0,int p1,byte[] p2,int p3){
       byte[] uobyteArray = new byte[p1];
       BSUtil.readFromStream(p0, uobyteArray, 0, p1);
       p0.close();
       return BSPatch.patchFast(uobyteArray, p1, p2, p2.length, p3);
    }
    public static byte[] patchFast(InputStream p0,InputStream p1){
       byte[] uobyteArray = null;
       if (p0 == null) {
          return uobyteArray;
       }
       if (p1 == null) {
          return uobyteArray;
       }
       byte[] uobyteArray1 = BSUtil.inputStreamToByte(p0);
       byte[] uobyteArray2 = BSUtil.inputStreamToByte(p1);
       return BSPatch.patchFast(uobyteArray1, uobyteArray1.length, uobyteArray2, uobyteArray2.length, 0);
    }
    public static byte[] patchFast(byte[] p0,int p1,byte[] p2,int p3,int p4){
       int i6;
       byte[] uobyteArray = p2;
       int i = p3;
       DataInputStream uDataInputSt = new DataInputStream(new ByteArrayInputStream(uobyteArray, 0, i));
       uDataInputSt.skip(8);
       long l = uDataInputSt.readLong();
       long l1 = uDataInputSt.readLong();
       int i1 = (int)uDataInputSt.readLong();
       uDataInputSt.close();
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(uobyteArray, 0, i);
       long l2 = 32;
       uByteArrayIn.skip(l2);
       DataInputStream uDataInputSt1 = new DataInputStream(new GZIPInputStream(uByteArrayIn));
       uByteArrayIn = new ByteArrayInputStream(uobyteArray, 0, i);
       uByteArrayIn.skip((l + l2));
       GZIPInputStream gZIPInputStr = new GZIPInputStream(uByteArrayIn);
       uByteArrayIn = new ByteArrayInputStream(uobyteArray, 0, i);
       uByteArrayIn.skip(((l1 + l) + l2));
       GZIPInputStream gZIPInputStr1 = new GZIPInputStream(uByteArrayIn);
       byte[] uobyteArray1 = new byte[i1];
       int[] ointArray = new int[3];
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (i2 < i1) {
             int i4 = 0;
             int i5 = 2;
             while (i4 <= i5) {
                ointArray[i4] = uDataInputSt1.readInt();
                i4 = i4 + 1;
             }
             i4 = ointArray[0] + i2;
             if (i4 > i1) {
                throw new IOException("Corrupt by wrong patch file.");
             }
             if (!BSUtil.readFromStream(gZIPInputStr, uobyteArray1, i2, ointArray[0])) {
                throw new IOException("Corrupt by wrong patch file.");
             }
             i4 = 0;
             while (i4 < ointArray[0]) {
                i6 = i3 + i4;
                int i7 = p1;
                if (i6 >= 0 && i6 < i7) {
                   int i8 = i2 + i4;
                   int i9 = uobyteArray1[i8] + p0[i6];
                   uobyteArray1[i8] = (byte)i9;
                }
                i4 = i4 + 1;
             }
             i2 = i2 + ointArray[0];
             i3 = i3 + ointArray[0];
             i4 = 1;
             i6 = ointArray[i4] + i2;
             if (i6 > i1) {
                throw new IOException("Corrupt by wrong patch file.");
             }
             if (BSUtil.readFromStream(gZIPInputStr1, uobyteArray1, i2, ointArray[i4])) {
                i2 = i2 + ointArray[i4];
                i3 = i3 + ointArray[i5];
             }else {
             }
          }else {
             uDataInputSt1.close();
             gZIPInputStr.close();
             gZIPInputStr1.close();
             return uobyteArray1;
          }
       }
       throw new IOException("Corrupt by wrong patch file.");
    }
    public static int patchLessMemory(RandomAccessFile p0,int p1,byte[] p2,int p3,File p4,int p5){
       int i = p1;
       byte[] uobyteArray = p2;
       int i1 = p3;
       File uFile = p4;
       if (!p0 || i <= 0) {
          return 3;
       }
       if (!uFile) {
          return 4;
       }
       if (!uobyteArray || i1 <= 0) {
          return 2;
       }
       DataInputStream uDataInputSt = new DataInputStream(new ByteArrayInputStream(uobyteArray, 0, i1));
       uDataInputSt.skip(8);
       long l = uDataInputSt.readLong();
       long l1 = uDataInputSt.readLong();
       int i2 = (int)uDataInputSt.readLong();
       uDataInputSt.close();
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(uobyteArray, 0, i1);
       long l2 = 32;
       uByteArrayIn.skip(l2);
       DataInputStream uDataInputSt1 = new DataInputStream(new GZIPInputStream(uByteArrayIn));
       ByteArrayInputStream uByteArrayIn1 = new ByteArrayInputStream(uobyteArray, 0, i1);
       uByteArrayIn1.skip((l + l2));
       GZIPInputStream gZIPInputStr = new GZIPInputStream(uByteArrayIn1);
       ByteArrayInputStream uByteArrayIn2 = new ByteArrayInputStream(uobyteArray, 0, i1);
       uByteArrayIn2.skip(((l1 + l) + l2));
       GZIPInputStream gZIPInputStr1 = new GZIPInputStream(uByteArrayIn2);
       FileOutputStream uFileOutputS = new FileOutputStream(uFile);
       int[] ointArray = new int[3];
       int i3 = 0;
       int i4 = 0;
       while (true) {
          int i5 = 1;
          if (i3 < i2) {
             for (int i6 = 0; i6 <= 2; i6 = i6 + 1) {
                ointArray[i6] = uDataInputSt1.readInt();
             }
             i6 = ointArray[0] + i3;
             if (i6 > i2) {
                uFileOutputS.close();
             }else {
                byte[] uobyteArray1 = new byte[ointArray[0]];
                if (!BSUtil.readFromStream(gZIPInputStr, uobyteArray1, 0, ointArray[0])) {
                   uFileOutputS.close();
                }else {
                   byte[] uobyteArray2 = new byte[ointArray[0]];
                   RandomAccessFile randomAccess = p0;
                   if (randomAccess.read(uobyteArray2, 0, ointArray[0]) < ointArray[0]) {
                      uFileOutputS.close();
                   }else {
                      int i7 = 0;
                      while (i7 < ointArray[0]) {
                         int i8 = i4 + i7;
                         int i9 = p1;
                         if (i8 >= 0 && i8 < i9) {
                            i8 = uobyteArray1[i7] + uobyteArray2[i7];
                            uobyteArray1[i7] = (byte)i8;
                         }
                         i7 = i7 + 1;
                      }
                      uFileOutputS.write(uobyteArray1);
                      i3 = i3 + ointArray[0];
                      i4 = i4 + ointArray[0];
                      i6 = ointArray[i5] + i3;
                      if (i6 > i2) {
                         uFileOutputS.close();
                      }else {
                         uobyteArray1 = new byte[ointArray[i5]];
                         if (!BSUtil.readFromStream(gZIPInputStr1, uobyteArray1, 0, ointArray[i5])) {
                            uFileOutputS.close();
                            p0.close();
                            uFileOutputS.close();
                            return 2;
                         }else {
                            uFileOutputS.write(uobyteArray1);
                            uFileOutputS.flush();
                            i3 = i3 + ointArray[i5];
                            i4 = i4 + ointArray[2];
                            randomAccess.seek((long)i4);
                         }
                      }
                   }
                   p0.close();
                }
             }
             p0.close();
          }else {
             uDataInputSt1.close();
             gZIPInputStr.close();
             gZIPInputStr1.close();
             p0.close();
             uFileOutputS.close();
             return i5;
          }
       }
       uFileOutputS.close();
       return 2;
    }
    public static int patchLessMemory(RandomAccessFile p0,File p1,File p2,int p3){
       if (p0 != null) {
          int i = 0;
          if (p0.length() - i > 0) {
             if (p1 == null) {
                return 4;
             }else if(p2 == null || p2.length() - i <= 0){
                return 2;
             }else {
                int i1 = (int)p2.length();
                byte[] uobyteArray = new byte[i1];
                FileInputStream uFileInputSt = new FileInputStream(p2);
                BSUtil.readFromStream(uFileInputSt, uobyteArray, 0, i1);
                uFileInputSt.close();
                return BSPatch.patchLessMemory(p0, (int)p0.length(), uobyteArray, i1, p1, p3);
             }
          }
       }
       return 3;
    }
}
