package com.facebook.imageformat.DefaultImageFormatChecker;
import com.facebook.imageformat.a$a;
import java.lang.String;
import nc.b;
import java.lang.Object;
import java.lang.Boolean;
import ab.e;
import com.facebook.imageformat.a;
import jb.c;
import nc.a;

public class DefaultImageFormatChecker implements a$a	// class@000467
{
    public final int MAX_HEADER_LENGTH;
    public static final byte[] BMP_HEADER;
    public static final int BMP_HEADER_LENGTH;
    public static final byte[] DNG_HEADER_II;
    public static final int DNG_HEADER_LENGTH;
    public static final byte[] DNG_HEADER_MM;
    public static final byte[] GIF_HEADER_87A;
    public static final byte[] GIF_HEADER_89A;
    public static final byte[] HEIF_HEADER_PREFIX;
    public static final byte[][] HEIF_HEADER_SUFFIXES;
    public static final byte[] ICO_HEADER;
    public static final int ICO_HEADER_LENGTH;
    public static final byte[] JPEG_HEADER;
    public static final int JPEG_HEADER_LENGTH;
    public static final byte[] PNG_HEADER;
    public static final int PNG_HEADER_LENGTH;

    static {
       byte[] uobyteArray = new byte[3]{0xff,0xd8,0xff};
       DefaultImageFormatChecker.JPEG_HEADER = uobyteArray;
       DefaultImageFormatChecker.JPEG_HEADER_LENGTH = uobyteArray.length;
       uobyteArray = new byte[8]{0x89,'P','N','G',0x0d,0x0a,0x1a,0x0a};
       DefaultImageFormatChecker.PNG_HEADER = uobyteArray;
       DefaultImageFormatChecker.PNG_HEADER_LENGTH = uobyteArray.length;
       DefaultImageFormatChecker.GIF_HEADER_87A = b.a("GIF87a");
       DefaultImageFormatChecker.GIF_HEADER_89A = b.a("GIF89a");
       uobyteArray = b.a("BM");
       DefaultImageFormatChecker.BMP_HEADER = uobyteArray;
       DefaultImageFormatChecker.BMP_HEADER_LENGTH = uobyteArray.length;
       byte[] uobyteArray1 = new byte[]{0x00,0x00,0x01,0x00}{b.a("heic"),b.a("heix"),b.a("hevc"),b.a("hevx")};
       DefaultImageFormatChecker.ICO_HEADER = uobyteArray1;
       DefaultImageFormatChecker.ICO_HEADER_LENGTH = uobyteArray1.length;
       DefaultImageFormatChecker.HEIF_HEADER_PREFIX = b.a("ftyp");
       byte[][] uobyteArray2 = new byte[][6];
       uobyteArray2[4] = b.a("mif1");
       uobyteArray2[5] = b.a("msf1");
       DefaultImageFormatChecker.HEIF_HEADER_SUFFIXES = uobyteArray2;
       byte[] uobyteArray3 = new byte[4]{'I','I','*',0x00};
       DefaultImageFormatChecker.DNG_HEADER_II = uobyteArray3;
       DefaultImageFormatChecker.DNG_HEADER_MM = new byte[4]{'M','M',0x00,'*'};
       DefaultImageFormatChecker.DNG_HEADER_LENGTH = uobyteArray3.length;
    }
    public void DefaultImageFormatChecker(){
       super();
       int[] ointArray = new int[]{21,20,DefaultImageFormatChecker.JPEG_HEADER_LENGTH,DefaultImageFormatChecker.PNG_HEADER_LENGTH,6,DefaultImageFormatChecker.BMP_HEADER_LENGTH,DefaultImageFormatChecker.ICO_HEADER_LENGTH,12};
       int i = 0;
       int i1 = 1;
       e.a(Boolean.valueOf(i1));
       int i2 = ointArray[i];
       while (i1 < 8) {
          if (ointArray[i1] > i2) {
             i2 = ointArray[i1];
          }
          i1 = i1 + 1;
       }
       this.MAX_HEADER_LENGTH = i2;
       return;
    }
    public static a getWebpFormat(byte[] p0,int p1){
       int i = 0;
       e.a(Boolean.valueOf(c.b(p0, i, p1)));
       int i1 = 12;
       if (c.d(p0, i1, c.h)) {
          return a.f;
       }
       if (c.d(p0, i1, c.i)) {
          return a.g;
       }
       byte[] uobyteArray = (p1 >= 21 && c.d(p0, i1, c.j))? 1: null;
       if (uobyteArray) {
          uobyteArray = c.j;
          boolean b = c.d(p0, i1, uobyteArray);
          int i2 = ((p0[20] & 2) == 2)? 1: 0;
          b = (b && i2)? 1: 0;
          if (b) {
             return a.j;
          }else {
             boolean b1 = c.d(p0, i1, uobyteArray);
             a uoa = ((p0[20] & 16) == 16)? 1: null;
             if (b1 && uoa) {
                i = 1;
             }
             if (i) {
                return a.i;
             }else {
                return a.h;
             }
          }
       }else {
          return a.c;
       }
    }
    public static boolean isBmpHeader(byte[] p0,int p1){
       byte[] bMP_HEADER = DefaultImageFormatChecker.BMP_HEADER;
       if (p1 < bMP_HEADER.length) {
          return false;
       }
       return b.c(p0, bMP_HEADER);
    }
    public static boolean isDngHeader(byte[] p0,int p1){
       boolean b = (p1 >= DefaultImageFormatChecker.DNG_HEADER_LENGTH && (b.c(p0, DefaultImageFormatChecker.DNG_HEADER_II) || b.c(p0, DefaultImageFormatChecker.DNG_HEADER_MM)))? true: false;
       return b;
    }
    public static boolean isGifHeader(byte[] p0,int p1){
       boolean b = false;
       if (p1 < 6) {
          return b;
       }
       if (b.c(p0, DefaultImageFormatChecker.GIF_HEADER_87A) || b.c(p0, DefaultImageFormatChecker.GIF_HEADER_89A)) {
          b = true;
       }
       return b;
    }
    public static boolean isHeifHeader(byte[] p0,int p1){
       if (p1 < 12) {
          return false;
       }
       if (p0[3] < 8) {
          return false;
       }
       if (!b.b(p0, DefaultImageFormatChecker.HEIF_HEADER_PREFIX, 4)) {
          return false;
       }
       byte[][] hEIF_HEADER_ = DefaultImageFormatChecker.HEIF_HEADER_SUFFIXES;
       int len = hEIF_HEADER_.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (b.b(p0, hEIF_HEADER_[i], 8)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean isIcoHeader(byte[] p0,int p1){
       byte[] iCO_HEADER = DefaultImageFormatChecker.ICO_HEADER;
       if (p1 < iCO_HEADER.length) {
          return false;
       }
       return b.c(p0, iCO_HEADER);
    }
    public static boolean isJpegHeader(byte[] p0,int p1){
       byte[] jPEG_HEADER = DefaultImageFormatChecker.JPEG_HEADER;
       boolean b = (p1 >= jPEG_HEADER.length && b.c(p0, jPEG_HEADER))? true: false;
       return b;
    }
    public static boolean isPngHeader(byte[] p0,int p1){
       byte[] pNG_HEADER = DefaultImageFormatChecker.PNG_HEADER;
       boolean b = (p1 >= pNG_HEADER.length && b.c(p0, pNG_HEADER))? true: false;
       return b;
    }
    public final a determineFormat(byte[] p0,int p1){
       e.d(p0);
       if (c.b(p0, 0, p1)) {
          return DefaultImageFormatChecker.getWebpFormat(p0, p1);
       }
       if (DefaultImageFormatChecker.isJpegHeader(p0, p1)) {
          return a.a;
       }
       if (DefaultImageFormatChecker.isPngHeader(p0, p1)) {
          return a.b;
       }
       if (DefaultImageFormatChecker.isGifHeader(p0, p1)) {
          return a.c;
       }
       if (DefaultImageFormatChecker.isBmpHeader(p0, p1)) {
          return a.d;
       }
       if (DefaultImageFormatChecker.isIcoHeader(p0, p1)) {
          return a.e;
       }
       if (DefaultImageFormatChecker.isHeifHeader(p0, p1)) {
          return a.k;
       }
       if (DefaultImageFormatChecker.isDngHeader(p0, p1)) {
          return a.l;
       }
       return a.c;
    }
    public int getHeaderSize(){
       return this.MAX_HEADER_LENGTH;
    }
}
