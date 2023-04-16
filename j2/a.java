package j2.a;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.lang.String;
import j2.a$c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.io.InputStream;
import java.nio.ByteOrder;
import android.content.res.AssetManager$AssetInputStream;
import java.lang.IllegalArgumentException;
import java.io.FileInputStream;
import java.io.Closeable;
import j2.a$a;
import j2.a$b;
import j2.a$d;
import java.lang.Double;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.BufferedInputStream;
import java.nio.ByteBuffer;
import java.lang.Math;
import java.lang.System;
import java.util.Set;
import java.lang.CharSequence;

public class a	// class@00221e
{
    public final String a;
    public final AssetManager$AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public Set e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public byte[] j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public static final byte[] A;
    public static final byte[] B;
    public static SimpleDateFormat C;
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final a$c[] G;
    public static final a$c[] H;
    public static final a$c[] I;
    public static final a$c[] J;
    public static final a$c[] K;
    public static final a$c L;
    public static final a$c[] M;
    public static final a$c[] N;
    public static final a$c[] O;
    public static final a$c[] P;
    public static final a$c[][] Q;
    public static final a$c[] R;
    public static final a$c S;
    public static final a$c T;
    public static final HashMap[] U;
    public static final HashMap[] V;
    public static final HashSet W;
    public static final HashMap X;
    public static final Charset Y;
    public static final byte[] Z;
    public static final Pattern a0;
    public static final Pattern b0;
    public static final String r;
    public static final List s;
    public static final List t;
    public static final int u;
    public static final int v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final byte[] z;

    static {
       Integer integer;
       Integer integer1;
       Integer integer3;
       Integer integer4;
       Integer integer5;
       Integer[] integerArray = new Integer[]{integer,Integer.valueOf(6),integer1,integer3};
       integer = Integer.valueOf(1);
       integer1 = Integer.valueOf(3);
       Integer integer2 = Integer.valueOf(2);
       integer3 = Integer.valueOf(8);
       a.s = Arrays.asList(integerArray);
       integerArray = new Integer[]{integer2,integer4,Integer.valueOf(4),integer5};
       integer4 = Integer.valueOf(7);
       integer5 = Integer.valueOf(5);
       a.t = Arrays.asList(integerArray);
       a.w = new int[3]{8,8,8};
       int[] ointArray = new int[]{4};
       a.x = ointArray;
       ointArray = new int[]{8};
       a.y = ointArray;
       a.z = new byte[3]{0xff,0xd8,0xff};
       a.A = new byte[6]{'O','L','Y','M','P',0x00};
       a.B = new byte[10]{'O','L','Y','M','P','U','S',0x00,'I','I'};
       String[] stringArray = new String[]{"","BYTE","STRING","USHORT","ULONG","URATIONAL","SBYTE","UNDEFINED","SSHORT","SLONG","SRATIONAL","SINGLE","DOUBLE"};
       a.D = stringArray;
       a.E = new int[14]{0,1,1,2,4,8,1,1,2,4,8,4,8,1};
       a.F = new byte[8]{'A','S','C','I','I',0x00,0x00,0x00};
       a$c[] uocArray = new a$c[41];
       uocArray[0] = new a$c("NewSubfileType", 254, 4);
       uocArray[1] = new a$c("SubfileType", 255, 4);
       uocArray[2] = new a$c("ImageWidth", 256, 3, 4);
       uocArray[3] = new a$c("ImageLength", 257, 3, 4);
       uocArray[4] = new a$c("BitsPerSample", 258, 3);
       uocArray[5] = new a$c("Compression", 259, 3);
       uocArray[6] = new a$c("PhotometricInterpretation", 262, 3);
       uocArray[7] = new a$c("ImageDescription", 270, 2);
       uocArray[8] = new a$c("Make", 271, 2);
       uocArray[9] = new a$c("Model", 272, 2);
       uocArray[10] = new a$c("StripOffsets", 273, 3, 4);
       uocArray[11] = new a$c("Orientation", 274, 3);
       uocArray[12] = new a$c("SamplesPerPixel", 277, 3);
       uocArray[13] = new a$c("RowsPerStrip", 278, 3, 4);
       uocArray[14] = new a$c("StripByteCounts", 279, 3, 4);
       uocArray[15] = new a$c("XResolution", 282, 5);
       uocArray[16] = new a$c("YResolution", 283, 5);
       uocArray[17] = new a$c("PlanarConfiguration", 284, 3);
       uocArray[18] = new a$c("ResolutionUnit", 296, 3);
       uocArray[19] = new a$c("TransferFunction", 301, 3);
       uocArray[20] = new a$c("Software", 305, 2);
       uocArray[21] = new a$c("DateTime", 306, 2);
       uocArray[22] = new a$c("Artist", 315, 2);
       uocArray[23] = new a$c("WhitePoint", 318, 5);
       uocArray[24] = new a$c("PrimaryChromaticities", 319, 5);
       uocArray[25] = new a$c("SubIFDPointer", 330, 4);
       uocArray[26] = new a$c("JPEGInterchangeFormat", 513, 4);
       uocArray[27] = new a$c("JPEGInterchangeFormatLength", 514, 4);
       uocArray[28] = new a$c("YCbCrCoefficients", 529, 5);
       uocArray[29] = new a$c("YCbCrSubSampling", 530, 3);
       uocArray[30] = new a$c("YCbCrPositioning", 531, 3);
       uocArray[31] = new a$c("ReferenceBlackWhite", 532, 5);
       uocArray[32] = new a$c("Copyright", 0x8298, 2);
       uocArray[33] = new a$c("ExifIFDPointer", 0x8769, 4);
       uocArray[34] = new a$c("GPSInfoIFDPointer", 0x8825, 4);
       uocArray[35] = new a$c("SensorTopBorder", 4, 4);
       uocArray[36] = new a$c("SensorLeftBorder", 5, 4);
       uocArray[37] = new a$c("SensorBottomBorder", 6, 4);
       uocArray[38] = new a$c("SensorRightBorder", 7, 4);
       uocArray[39] = new a$c("ISO", 23, 3);
       uocArray[40] = new a$c("JpgFromRaw", 46, 7);
       a.G = uocArray;
       a$c[] uocArray1 = new a$c[59];
       uocArray1[0] = new a$c("ExposureTime", 0x829a, 5);
       uocArray1[1] = new a$c("FNumber", 0x829d, 5);
       uocArray1[2] = new a$c("ExposureProgram", 0x8822, 3);
       uocArray1[3] = new a$c("SpectralSensitivity", 0x8824, 2);
       uocArray1[4] = new a$c("PhotographicSensitivity", 0x8827, 3);
       uocArray1[5] = new a$c("OECF", 0x8828, 7);
       uocArray1[6] = new a$c("ExifVersion", 0x9000, 2);
       uocArray1[7] = new a$c("DateTimeOriginal", 0x9003, 2);
       uocArray1[8] = new a$c("DateTimeDigitized", 0x9004, 2);
       uocArray1[9] = new a$c("ComponentsConfiguration", 0x9101, 7);
       uocArray1[10] = new a$c("CompressedBitsPerPixel", 0x9102, 5);
       uocArray1[11] = new a$c("ShutterSpeedValue", 0x9201, 10);
       uocArray1[12] = new a$c("ApertureValue", 0x9202, 5);
       uocArray1[13] = new a$c("BrightnessValue", 0x9203, 10);
       uocArray1[14] = new a$c("ExposureBiasValue", 0x9204, 10);
       uocArray1[15] = new a$c("MaxApertureValue", 0x9205, 5);
       uocArray1[16] = new a$c("SubjectDistance", 0x9206, 5);
       uocArray1[17] = new a$c("MeteringMode", 0x9207, 3);
       uocArray1[18] = new a$c("LightSource", 0x9208, 3);
       uocArray1[19] = new a$c("Flash", 0x9209, 3);
       uocArray1[20] = new a$c("FocalLength", 0x920a, 5);
       uocArray1[21] = new a$c("SubjectArea", 0x9214, 3);
       uocArray1[22] = new a$c("MakerNote", 0x927c, 7);
       uocArray1[23] = new a$c("UserComment", 0x9286, 7);
       uocArray1[24] = new a$c("SubSecTime", 0x9290, 2);
       uocArray1[25] = new a$c("SubSecTimeOriginal", 0x9291, 2);
       uocArray1[26] = new a$c("SubSecTimeDigitized", 0x9292, 2);
       uocArray1[27] = new a$c("FlashpixVersion", 0xa000, 7);
       uocArray1[28] = new a$c("ColorSpace", 0xa001, 3);
       uocArray1[29] = new a$c("PixelXDimension", 0xa002, 3, 4);
       uocArray1[30] = new a$c("PixelYDimension", 0xa003, 3, 4);
       uocArray1[31] = new a$c("RelatedSoundFile", 0xa004, 2);
       uocArray1[32] = new a$c("InteroperabilityIFDPointer", 0xa005, 4);
       uocArray1[33] = new a$c("FlashEnergy", 0xa20b, 5);
       uocArray1[34] = new a$c("SpatialFrequencyResponse", 0xa20c, 7);
       uocArray1[35] = new a$c("FocalPlaneXResolution", 0xa20e, 5);
       uocArray1[36] = new a$c("FocalPlaneYResolution", 0xa20f, 5);
       uocArray1[37] = new a$c("FocalPlaneResolutionUnit", 0xa210, 3);
       uocArray1[38] = new a$c("SubjectLocation", 0xa214, 3);
       uocArray1[39] = new a$c("ExposureIndex", 0xa215, 5);
       uocArray1[40] = new a$c("SensingMethod", 0xa217, 3);
       uocArray1[41] = new a$c("FileSource", 0xa300, 7);
       uocArray1[42] = new a$c("SceneType", 0xa301, 7);
       uocArray1[43] = new a$c("CFAPattern", 0xa302, 7);
       uocArray1[44] = new a$c("CustomRendered", 0xa401, 3);
       uocArray1[45] = new a$c("ExposureMode", 0xa402, 3);
       uocArray1[46] = new a$c("WhiteBalance", 0xa403, 3);
       uocArray1[47] = new a$c("DigitalZoomRatio", 0xa404, 5);
       uocArray1[48] = new a$c("FocalLengthIn35mmFilm", 0xa405, 3);
       uocArray1[49] = new a$c("SceneCaptureType", 0xa406, 3);
       uocArray1[50] = new a$c("GainControl", 0xa407, 3);
       uocArray1[51] = new a$c("Contrast", 0xa408, 3);
       uocArray1[52] = new a$c("Saturation", 0xa409, 3);
       uocArray1[53] = new a$c("Sharpness", 0xa40a, 3);
       uocArray1[54] = new a$c("DeviceSettingDescription", 0xa40b, 7);
       uocArray1[55] = new a$c("SubjectDistanceRange", 0xa40c, 3);
       uocArray1[56] = new a$c("ImageUniqueID", 0xa420, 2);
       uocArray1[57] = new a$c("DNGVersion", 0xc612, 1);
       uocArray1[58] = new a$c("DefaultCropSize", 0xc620, 3, 4);
       a.H = uocArray1;
       a$c[] uocArray2 = new a$c[31];
       uocArray2[0] = new a$c("GPSVersionID", 0, 1);
       uocArray2[1] = new a$c("GPSLatitudeRef", 1, 2);
       uocArray2[2] = new a$c("GPSLatitude", 2, 5);
       uocArray2[3] = new a$c("GPSLongitudeRef", 3, 2);
       uocArray2[4] = new a$c("GPSLongitude", 4, 5);
       uocArray2[5] = new a$c("GPSAltitudeRef", 5, 1);
       uocArray2[6] = new a$c("GPSAltitude", 6, 5);
       uocArray2[7] = new a$c("GPSTimeStamp", 7, 5);
       uocArray2[8] = new a$c("GPSSatellites", 8, 2);
       uocArray2[9] = new a$c("GPSStatus", 9, 2);
       uocArray2[10] = new a$c("GPSMeasureMode", 10, 2);
       uocArray2[11] = new a$c("GPSDOP", 11, 5);
       uocArray2[12] = new a$c("GPSSpeedRef", 12, 2);
       uocArray2[13] = new a$c("GPSSpeed", 13, 5);
       uocArray2[14] = new a$c("GPSTrackRef", 14, 2);
       uocArray2[15] = new a$c("GPSTrack", 15, 5);
       uocArray2[16] = new a$c("GPSImgDirectionRef", 16, 2);
       uocArray2[17] = new a$c("GPSImgDirection", 17, 5);
       uocArray2[18] = new a$c("GPSMapDatum", 18, 2);
       uocArray2[19] = new a$c("GPSDestLatitudeRef", 19, 2);
       uocArray2[20] = new a$c("GPSDestLatitude", 20, 5);
       uocArray2[21] = new a$c("GPSDestLongitudeRef", 21, 2);
       uocArray2[22] = new a$c("GPSDestLongitude", 22, 5);
       uocArray2[23] = new a$c("GPSDestBearingRef", 23, 2);
       uocArray2[24] = new a$c("GPSDestBearing", 24, 5);
       uocArray2[25] = new a$c("GPSDestDistanceRef", 25, 2);
       uocArray2[26] = new a$c("GPSDestDistance", 26, 5);
       uocArray2[27] = new a$c("GPSProcessingMethod", 27, 7);
       uocArray2[28] = new a$c("GPSAreaInformation", 28, 7);
       uocArray2[29] = new a$c("GPSDateStamp", 29, 2);
       uocArray2[30] = new a$c("GPSDifferential", 30, 3);
       a.I = uocArray2;
       a$c[] uocArray3 = new a$c[]{new a$c("InteroperabilityIndex", 1, 2)};
       a.J = uocArray3;
       a$c[] uocArray4 = new a$c[37];
       uocArray4[0] = new a$c("NewSubfileType", 254, 4);
       uocArray4[1] = new a$c("SubfileType", 255, 4);
       uocArray4[2] = new a$c("ThumbnailImageWidth", 256, 3, 4);
       uocArray4[3] = new a$c("ThumbnailImageLength", 257, 3, 4);
       uocArray4[4] = new a$c("BitsPerSample", 258, 3);
       uocArray4[5] = new a$c("Compression", 259, 3);
       uocArray4[6] = new a$c("PhotometricInterpretation", 262, 3);
       uocArray4[7] = new a$c("ImageDescription", 270, 2);
       uocArray4[8] = new a$c("Make", 271, 2);
       uocArray4[9] = new a$c("Model", 272, 2);
       uocArray4[10] = new a$c("StripOffsets", 273, 3, 4);
       uocArray4[11] = new a$c("Orientation", 274, 3);
       uocArray4[12] = new a$c("SamplesPerPixel", 277, 3);
       uocArray4[13] = new a$c("RowsPerStrip", 278, 3, 4);
       uocArray4[14] = new a$c("StripByteCounts", 279, 3, 4);
       uocArray4[15] = new a$c("XResolution", 282, 5);
       uocArray4[16] = new a$c("YResolution", 283, 5);
       uocArray4[17] = new a$c("PlanarConfiguration", 284, 3);
       uocArray4[18] = new a$c("ResolutionUnit", 296, 3);
       uocArray4[19] = new a$c("TransferFunction", 301, 3);
       uocArray4[20] = new a$c("Software", 305, 2);
       uocArray4[21] = new a$c("DateTime", 306, 2);
       uocArray4[22] = new a$c("Artist", 315, 2);
       uocArray4[23] = new a$c("WhitePoint", 318, 5);
       uocArray4[24] = new a$c("PrimaryChromaticities", 319, 5);
       uocArray4[25] = new a$c("SubIFDPointer", 330, 4);
       uocArray4[26] = new a$c("JPEGInterchangeFormat", 513, 4);
       uocArray4[27] = new a$c("JPEGInterchangeFormatLength", 514, 4);
       uocArray4[28] = new a$c("YCbCrCoefficients", 529, 5);
       uocArray4[29] = new a$c("YCbCrSubSampling", 530, 3);
       uocArray4[30] = new a$c("YCbCrPositioning", 531, 3);
       uocArray4[31] = new a$c("ReferenceBlackWhite", 532, 5);
       uocArray4[32] = new a$c("Copyright", 0x8298, 2);
       uocArray4[33] = new a$c("ExifIFDPointer", 0x8769, 4);
       uocArray4[34] = new a$c("GPSInfoIFDPointer", 0x8825, 4);
       uocArray4[35] = new a$c("DNGVersion", 0xc612, 1);
       uocArray4[36] = new a$c("DefaultCropSize", 0xc620, 3, 4);
       a.K = uocArray4;
       a.L = new a$c("StripOffsets", 273, 3);
       a$c[] uocArray5 = new a$c[]{new a$c("ThumbnailImage", 256, 7),new a$c("CameraSettingsIFDPointer", 8224, 4),new a$c("ImageProcessingIFDPointer", 8256, 4)};
       a.M = uocArray5;
       a$c[] uocArray6 = new a$c[]{new a$c("PreviewImageStart", 257, 4),new a$c("PreviewImageLength", 258, 4)};
       Integer integer6 = integer3;
       a.N = uocArray6;
       a$c[] uocArray7 = new a$c[]{new a$c("AspectFrame", 4371, 3)};
       Integer integer7 = integer4;
       a.O = uocArray7;
       a$c[] uocArray8 = new a$c[]{new a$c("ColorSpace", 55, 3)};
       Integer integer8 = integer1;
       a.P = uocArray8;
       a$c[][] uocArray9 = new a$c[][10];
       uocArray9[0] = uocArray;
       uocArray9[1] = uocArray1;
       uocArray9[2] = uocArray2;
       uocArray9[3] = uocArray3;
       uocArray9[4] = uocArray4;
       uocArray9[5] = uocArray;
       uocArray9[6] = uocArray5;
       uocArray9[7] = uocArray6;
       uocArray9[8] = uocArray7;
       uocArray9[9] = uocArray8;
       a.Q = uocArray9;
       uocArray5 = new a$c[]{new a$c("SubIFDPointer", 330, 4),new a$c("ExifIFDPointer", 0x8769, 4),new a$c("GPSInfoIFDPointer", 0x8825, 4),new a$c("InteroperabilityIFDPointer", 0xa005, 4),new a$c("CameraSettingsIFDPointer", 8224, 1),new a$c("ImageProcessingIFDPointer", 8256, 1)};
       a.R = uocArray5;
       a.S = new a$c("JPEGInterchangeFormat", 513, 4);
       a.T = new a$c("JPEGInterchangeFormatLength", 514, 4);
       HashMap[] hashMapArray = new HashMap[uocArray9.length];
       a.U = hashMapArray;
       hashMapArray = new HashMap[uocArray9.length];
       a.V = hashMapArray;
       String[] stringArray1 = new String[]{"FNumber","DigitalZoomRatio","ExposureTime","SubjectDistance","GPSTimeStamp"};
       a.W = new HashSet(Arrays.asList(stringArray1));
       a.X = new HashMap();
       Charset uCharset = Charset.forName("US-ASCII");
       a.Y = uCharset;
       a.Z = ("Exif\xff\x02\xff\x02\xff\x02\xff\x02\x00").getBytes(uCharset);
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
       a.C = simpleDateFo;
       simpleDateFo.setTimeZone(TimeZone.getTimeZone("UTC"));
       int i = 0;
       a$c[][] q = a.Q;
       while (i < q.length) {
          a.U[i] = new HashMap();
          a.V[i] = new HashMap();
          object oobject = q[i];
          int len = oobject.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             object oobject1 = oobject[i1];
             a.U[i].put(Integer.valueOf(oobject1.a), oobject1);
             a.V[i].put(oobject1.b, oobject1);
          }
          i = i + 1;
       }
       HashMap x = a.X;
       uocArray = a.R;
       x.put(Integer.valueOf(uocArray[0].a), integer5);
       x.put(Integer.valueOf(uocArray[1].a), integer);
       x.put(Integer.valueOf(uocArray[2].a), integer2);
       x.put(Integer.valueOf(uocArray[3].a), integer8);
       x.put(Integer.valueOf(uocArray[4].a), integer7);
       x.put(Integer.valueOf(uocArray[5].a), integer6);
       a.a0 = Pattern.compile(".*[1-9].*");
       a.b0 = Pattern.compile("^\([0-9][0-9]\):\([0-9][0-9]\):\([0-9][0-9]\)$");
    }
    public void a(InputStream p0){
       super();
       a$c[][] q = a.Q;
       HashMap[] hashMapArray = new HashMap[q.length];
       this.d = hashMapArray;
       this.e = new HashSet(q.length);
       this.f = ByteOrder.BIG_ENDIAN;
       if (p0 == null) {
          throw new IllegalArgumentException("inputStream cannot be null");
       }
       String str = null;
       this.a = str;
       this.b = (p0 instanceof AssetManager$AssetInputStream)? p0: str;
       this.v(p0);
       return;
    }
    public void a(String p0){
       super();
       a$c[][] q = a.Q;
       HashMap[] hashMapArray = new HashMap[q.length];
       this.d = hashMapArray;
       this.e = new HashSet(q.length);
       this.f = ByteOrder.BIG_ENDIAN;
       if (p0 == null) {
          throw new IllegalArgumentException("filename cannot be null");
       }
       this.b = null;
       this.a = p0;
       FileInputStream uFileInputSt = new FileInputStream(p0);
       this.v(uFileInputSt);
       a.b(uFileInputSt);
       return;
    }
    public static void b(Closeable p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.lang.RuntimeException e0){
             throw e0;
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static long[] c(Object p0){
       if (p0 instanceof int[]) {
          long[] olongArray = new long[p0.length];
          for (int i = 0; i < p0.length; i = i + 1) {
             olongArray[i] = (long)p0[i];
          }
          return olongArray;
       }else if(p0 instanceof long[]){
          return p0;
       }else {
          return null;
       }
    }
    public static boolean p(byte[] p0){
       int i = 0;
       while (true) {
          byte[] z = a.z;
          if (i >= z.length) {
             return true;
          }
          if (p0[i] != z[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final void A(a$a p0,int p1){
       a$b uob = this.d[p1].get("ImageWidth");
       if (this.d[p1].get("ImageLength") == null || uob == null) {
          a$b uob1 = this.d[p1].get("JPEGInterchangeFormat");
          if (uob1 != null) {
             this.h(p0, uob1.i(this.f), p1);
          }
       }
       return;
    }
    public final void B(a$a p0){
       object oobject = this.d[4];
       a$b uob = oobject.get("Compression");
       int i = 6;
       if (uob != null) {
          int i1 = uob.i(this.f);
          this.k = i1;
          if (i1 != 1) {
             if (i1 != i) {
                if (i1 == 7) {
                }
             }else {
                this.n(p0, oobject);
             }
          }else if(this.t(oobject)){
             this.o(p0, oobject);
          }
       }else {
          this.k = i;
          this.n(p0, oobject);
       }
       return;
    }
    public final void C(int p0,int p1){
       if (!this.d[p0].isEmpty() && !this.d[p1].isEmpty()) {
          a$b uob = this.d[p0].get("ImageLength");
          a$b uob1 = this.d[p0].get("ImageWidth");
          a$b uob2 = this.d[p1].get("ImageLength");
          a$b uob3 = this.d[p1].get("ImageWidth");
          if (uob != null && (uob1 == null || (uob2 != null && uob3 != null))) {
             int i = uob1.i(this.f);
             int i1 = uob3.i(this.f);
             if (uob.i(this.f) < uob2.i(this.f) && i < i1) {
                a td = this.d;
                object oobject = td[p0];
                td[p0] = td[p1];
                td[p1] = oobject;
             }
          }
       }
    label_0071 :
       return;
    }
    public final void D(a$a p0,int p1){
       a$b uob5;
       a$b uob = this.d[p1].get("DefaultCropSize");
       a$b uob1 = this.d[p1].get("SensorTopBorder");
       a$b uob2 = this.d[p1].get("SensorLeftBorder");
       a$b uob3 = this.d[p1].get("SensorBottomBorder");
       a$b uob4 = this.d[p1].get("SensorRightBorder");
       if (uob != null) {
          if (uob.a == 5) {
             a$d[] uodArray = uob.k(this.f);
             if (uodArray == null || uodArray.length != 2) {
                Arrays.toString(uodArray);
                return;
             }else {
                uob = a$b.d(uodArray[0], this.f);
                uob5 = a$b.d(uodArray[1], this.f);
             }
          }else {
             int[] ointArray = uob.k(this.f);
             if (ointArray == null || ointArray.length != 2) {
                Arrays.toString(ointArray);
                return;
             }else {
                uob = a$b.f(ointArray[0], this.f);
                uob5 = a$b.f(ointArray[1], this.f);
             }
          }
          this.d[p1].put("ImageWidth", uob);
          this.d[p1].put("ImageLength", uob5);
       }else if(uob1 != null && (uob2 != null && (uob3 != null && uob4 != null))){
          int i = uob1.i(this.f);
          int i1 = uob3.i(this.f);
          int i2 = uob4.i(this.f);
          int i3 = uob2.i(this.f);
          if (i1 > i && i2 > i3) {
             this.d[p1].put("ImageLength", a$b.f((i1 - i), this.f));
             this.d[p1].put("ImageWidth", a$b.f((i2 - i3), this.f));
          }
       }else {
          this.A(p0, p1);
       }
       return;
    }
    public final void E(InputStream p0){
       int i = 0;
       this.C(i, 5);
       this.C(i, 4);
       this.C(5, 4);
       a$b uob = this.d[1].get("PixelXDimension");
       a$b uob1 = this.d[1].get("PixelYDimension");
       if (uob != null && uob1 != null) {
          this.d[i].put("ImageWidth", uob);
          this.d[i].put("ImageLength", uob1);
       }
       if (this.d[4].isEmpty() && this.u(this.d[5])) {
          a td = this.d;
          td[4] = td[5];
          td[5] = new HashMap();
       }
       this.u(this.d[4]);
       return;
    }
    public final void a(){
       String str = this.d("DateTimeOriginal");
       int i = 0;
       if (str != null) {
          String str1 = "DateTime";
          if (this.d(str1) == null) {
             this.d[i].put(str1, a$b.a(str));
          }
       }
       str = "ImageWidth";
       if (this.d(str) == null) {
          this.d[i].put(str, a$b.b(0, this.f));
       }
       str = "ImageLength";
       if (this.d(str) == null) {
          this.d[i].put(str, a$b.b(0, this.f));
       }
       str = "Orientation";
       if (this.d(str) == null) {
          this.d[i].put(str, a$b.b(0, this.f));
       }
       if (this.d("LightSource") == null) {
          this.d[1].put("LightSource", a$b.b(0, this.f));
       }
       return;
    }
    public String d(String p0){
       a$b a;
       a$b uob = this.g(p0);
       String str = null;
       if (uob == null) {
          return str;
       }
       if (!a.W.contains(p0)) {
          return uob.j(this.f);
       }
       if (!p0.equals("GPSTimeStamp")) {
          return Double.toString(uob.h(this.f));
       }
       a = uob.a;
       if (a != 5 && a != 10) {
          return str;
       }
       a$d[] uodArray = uob.k(this.f);
       if (uodArray != null) {
          int i = 3;
          if (uodArray.length == i) {
             Object[] objArray = new Object[i];
             objArray[0] = Integer.valueOf((int)((float)uodArray[0].a / (float)uodArray[0].b));
             objArray[1] = Integer.valueOf((int)((float)uodArray[1].a / (float)uodArray[1].b));
             objArray[2] = Integer.valueOf((int)((float)uodArray[2].a / (float)uodArray[2].b));
             return String.format("%02d:%02d:%02d", objArray);
          }
       }
       Arrays.toString(uodArray);
       return str;
    }
    public double e(String p0,double p1){
       a$b uob = this.g(p0);
       if (uob == null) {
          return p1;
       }
       try{
          return uob.h(this.f);
       }catch(java.lang.NumberFormatException e0){
          return p1;
       }
    }
    public int f(String p0,int p1){
       a$b uob = this.g(p0);
       if (uob == null) {
          return p1;
       }
       try{
          return uob.i(this.f);
       }catch(java.lang.NumberFormatException e0){
          return p1;
       }
    }
    public final a$b g(String p0){
       a$b uob;
       if (("ISOSpeedRatings").equals(p0)) {
          p0 = "PhotographicSensitivity";
       }
       int i = 0;
       while (true) {
          if (i >= a.Q.length) {
             return null;
          }
          uob = this.d[i].get(p0);
          if (uob != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uob;
    }
    public final void h(a$a p0,int p1,int p2){
       byte[] uobyteArray;
       p0.e(ByteOrder.BIG_ENDIAN);
       p0.d((long)p1);
       int b = p0.readByte();
       String str = "Invalid marker: ";
       if (b != -1) {
          throw new IOException(str+Integer.toHexString((b & 0x00ff)));
       }
       p1 = p1 + 1;
       if (p0.readByte() != -40) {
          throw new IOException(str+Integer.toHexString((b & 0x00ff)));
       }
       p1 = p1 + 1;
       while (true) {
          b = p0.readByte();
          if (b != -1) {
             throw new IOException("Invalid marker:"+Integer.toHexString((b & 0x00ff)));
          }
          p1 = p1 + 1;
          b = p0.readByte();
          p1 = p1 + 1;
          if (b == -39 || b == -38) {
             break ;
          }else {
             int i = p0.readUnsignedShort() - 2;
             p1 = p1 + 2;
             if (i < 0) {
                throw new IOException("Invalid length");
             }
             String str1 = "Invalid exif";
             if (b != -31) {
                if (b != -2) {
                   switch (b){
                       case 0xffffffc0:
                       case 0xffffffc2:
                       case 0xffffffc3:
                       case 0xffffffc1:
                         break;
                       default:
                         switch (b){
                             case 0xffffffc5:
                             case 0xffffffc7:
                             case 0xffffffc6:
                               break;
                             default:
                               switch (b){
                                   case 0xffffffc9:
                                   case 0xffffffcb:
                                   case 0xffffffca:
                                     break;
                                   default:
                                     switch (b){
                                         case 0xffffffcd:
                                         case 0xffffffcf:
                                         case 0xffffffce:
                                           break;
                                         default:
                                     }
                                     if (p0.skipBytes(1) == 1) {
                                        this.d[p2].put("ImageLength", a$b.b((long)p0.readUnsignedShort(), this.f));
                                        this.d[p2].put("ImageWidth", a$b.b((long)p0.readUnsignedShort(), this.f));
                                        i = i - 5;
                                     }else {
                                        throw new IOException("Invalid SOFx");
                                     }
                               }
                         }
                   }
                }else {
                   uobyteArray = new byte[i];
                   if (p0.read(uobyteArray) == i) {
                      str = "UserComment";
                      if (this.d(str) == null) {
                         this.d[1].put(str, a$b.a(new String(uobyteArray, a.Y)));
                      label_00b2 :
                         i = 0;
                      }else {
                         goto label_00b2 ;
                      }
                   }else {
                      throw new IOException(str1);
                   }
                }
             }else {
                b = 6;
                if (i >= b) {
                   byte[] uobyteArray1 = new byte[b];
                   if (p0.read(uobyteArray1) == b) {
                      p1 = p1 + 6;
                      i = i - 6;
                      if (Arrays.equals(uobyteArray1, a.Z)) {
                         if (i > 0) {
                            this.l = p1;
                            uobyteArray = new byte[i];
                            if (p0.read(uobyteArray) == i) {
                               p1 = p1 + i;
                               this.y(uobyteArray, p2);
                               goto label_00b2 ;
                            }else {
                               throw new IOException(str1);
                            }
                         }else {
                            throw new IOException(str1);
                         }
                      }
                   }else {
                      throw new IOException(str1);
                   }
                }
             }
             if (i >= 0) {
                if (p0.skipBytes(i) == i) {
                   p1 = p1 + i;
                }else {
                   throw new IOException("Invalid JPEG segment");
                }
             }else {
                throw new IOException("Invalid length");
             }
          }
       }
       p0.e(this.f);
       return;
    }
    public final int i(BufferedInputStream p0){
       p0.mark(5000);
       byte[] uobyteArray = new byte[5000];
       p0.read(uobyteArray);
       p0.reset();
       if (a.p(uobyteArray)) {
          return 4;
       }
       if (this.r(uobyteArray)) {
          return 9;
       }
       if (this.q(uobyteArray)) {
          return 7;
       }
       if (this.s(uobyteArray)) {
          return 10;
       }
       return 0;
    }
    public final void j(a$a p0){
       this.l(p0);
       int i = 1;
       a$b uob = this.d[i].get("MakerNote");
       if (uob != null) {
          a$a uoa = new a$a(uob.c);
          uoa.e(this.f);
          byte[] a = a.A;
          byte[] uobyteArray = new byte[a.length];
          uoa.readFully(uobyteArray);
          uoa.d(0);
          byte[] b = a.B;
          byte[] uobyteArray1 = new byte[b.length];
          uoa.readFully(uobyteArray1);
          if (Arrays.equals(uobyteArray, a)) {
             uoa.d(8);
          }else if(Arrays.equals(uobyteArray1, b)){
             uoa.d(12);
          }
          this.z(uoa, 6);
          uob = this.d[7].get("PreviewImageStart");
          a$b uob1 = this.d[7].get("PreviewImageLength");
          if (uob != null && uob1 != null) {
             int i1 = 5;
             this.d[i1].put("JPEGInterchangeFormat", uob);
             this.d[i1].put("JPEGInterchangeFormatLength", uob1);
          }
          uob = this.d[8].get("AspectFrame");
          if (uob != null) {
             int[] ointArray = uob.k(this.f);
             if (ointArray == null || ointArray.length != 4) {
                Arrays.toString(ointArray);
             }else {
                int i2 = 2;
                if (ointArray[i2] > ointArray[0]) {
                   int i3 = 3;
                   if (ointArray[i3] > ointArray[i]) {
                      i2 = (ointArray[i2] - ointArray[0]) + i;
                      i3 = (ointArray[i3] - ointArray[i]) + i;
                      if (i2 < i3) {
                         i2 = i2 + i3;
                         i3 = i2 - i3;
                         i2 = i2 - i3;
                      }
                      this.d[0].put("ImageWidth", a$b.f(i2, this.f));
                      this.d[0].put("ImageLength", a$b.f(i3, this.f));
                   }
                }
             }
          }
       }
    label_00e0 :
       return;
    }
    public final void k(a$a p0){
       p0.skipBytes(84);
       byte[] uobyteArray = new byte[4];
       byte[] uobyteArray1 = new byte[4];
       p0.read(uobyteArray);
       p0.skipBytes(4);
       p0.read(uobyteArray1);
       this.h(p0, ByteBuffer.wrap(uobyteArray).getInt(), 5);
       p0.d((long)ByteBuffer.wrap(uobyteArray1).getInt());
       p0.e(ByteOrder.BIG_ENDIAN);
       int i = p0.readInt();
       int i1 = 0;
       a uoa = null;
       while (true) {
          if (uoa >= i) {
             return;
          }
          int i2 = p0.readUnsignedShort();
          if (p0.readUnsignedShort() == a.L.a) {
             break ;
          }else {
             p0.skipBytes(i2);
             uoa = uoa + 1;
          }
       }
       this.d[i1].put("ImageLength", a$b.f(p0.readShort(), this.f));
       this.d[i1].put("ImageWidth", a$b.f(p0.readShort(), this.f));
       return;
    }
    public final void l(a$a p0){
       this.w(p0, p0.available());
       this.z(p0, 0);
       this.D(p0, 0);
       this.D(p0, 5);
       this.D(p0, 4);
       this.E(p0);
       if (this.c == 8) {
          int i = 1;
          a$b uob = this.d[i].get("MakerNote");
          if (uob != null) {
             a$a uoa = new a$a(uob.c);
             uoa.e(this.f);
             uoa.d(6);
             this.z(uoa, 9);
             uob = this.d[9].get("ColorSpace");
             if (uob != null) {
                this.d[i].put("ColorSpace", uob);
             }
          }
       }
       return;
    }
    public final void m(a$a p0){
       this.l(p0);
       int i = 0;
       if (this.d[i].get("JpgFromRaw") != null) {
          this.h(p0, this.p, 5);
       }
       a$b uob = this.d[i].get("ISO");
       a$b uob1 = this.d[1].get("PhotographicSensitivity");
       if (uob != null && uob1 == null) {
          this.d[1].put("PhotographicSensitivity", uob);
       }
       return;
    }
    public final void n(a$a p0,HashMap p1){
       a$b uob = p1.get("JPEGInterchangeFormat");
       a$b uob1 = p1.get("JPEGInterchangeFormatLength");
       if (uob != null && uob1 != null) {
          int i = uob.i(this.f);
          int i1 = Math.min(uob1.i(this.f), (p0.available() - i));
          a tc = this.c;
          if (tc != 4 && (tc == 9 || tc == 10)) {
             tc = this.l;
          }else if(tc == 7){
             tc = this.m;
          }else if(i > 0 && i1 > 0){
             this.g = true;
             this.h = i;
             this.i = i1;
             if (this.a == null && this.b == null) {
                byte[] uobyteArray = new byte[i1];
                p0.d((long)i);
                p0.readFully(uobyteArray);
                this.j = uobyteArray;
             }
          }
          i = i + tc;
          goto label_0040 ;
       }
    label_005e :
       return;
    }
    public final void o(a$a p0,HashMap p1){
       a$b uob = p1.get("StripOffsets");
       a$b uob1 = p1.get("StripByteCounts");
       if (uob != null && uob1 != null) {
          long[] olongArray = a.c(uob.k(this.f));
          long[] olongArray1 = a.c(uob1.k(this.f));
          if (olongArray == null) {
             return;
          }else if(olongArray1 == null){
             return;
          }else {
             long l = 0;
             int len = olongArray1.length;
             for (int i = 0; i < len; i = i + 1) {
                l = l + olongArray1[i];
             }
             int i1 = (int)l;
             byte[] uobyteArray = new byte[i1];
             i = 0;
             int i2 = 0;
             for (len = 0; len < olongArray.length; len = len + 1) {
                int i3 = (int)olongArray1[len];
                int i4 = (int)olongArray[len] - i;
                p0.d((long)i4);
                i = i + i4;
                byte[] uobyteArray1 = new byte[i3];
                p0.read(uobyteArray1);
                i = i + i3;
                System.arraycopy(uobyteArray1, 0, uobyteArray, i2, i3);
                i2 = i2 + i3;
             }
             this.g = true;
             this.j = uobyteArray;
             this.i = i1;
          }
       }
       return;
    }
    public final boolean q(byte[] p0){
       a$a uoa = new a$a(p0);
       ByteOrder uByteOrder = this.x(uoa);
       this.f = uByteOrder;
       uoa.e(uByteOrder);
       boolean s = uoa.readShort();
       uoa.close();
       s = (s == 0x4f52 || s == 0x5352)? true: false;
       return s;
    }
    public final boolean r(byte[] p0){
       byte[] bytes = ("FUJIFILMCCD-RAW").getBytes(Charset.defaultCharset());
       int i = 0;
       while (true) {
          if (i >= bytes.length) {
             return true;
          }
          if (p0[i] != bytes[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final boolean s(byte[] p0){
       a$a uoa = new a$a(p0);
       ByteOrder uByteOrder = this.x(uoa);
       this.f = uByteOrder;
       uoa.e(uByteOrder);
       boolean s = uoa.readShort();
       uoa.close();
       s = (s == 85)? true: false;
       return s;
    }
    public final boolean t(HashMap p0){
       a$b uob = p0.get("BitsPerSample");
       if (uob != null) {
          int[] ointArray = uob.k(this.f);
          int[] w = a.w;
          if (Arrays.equals(w, ointArray)) {
             return true;
          }else if(this.c == 3){
             a$b uob1 = p0.get("PhotometricInterpretation");
             if (uob1 != null) {
                int i = uob1.i(this.f);
                if (i != 1 || (Arrays.equals(ointArray, a.y) || (i == 6 && Arrays.equals(ointArray, w)))) {
                   return true;
                }
             }
          }
       }
       return false;
    }
    public final boolean u(HashMap p0){
       a$b uob = p0.get("ImageLength");
       a$b uob1 = p0.get("ImageWidth");
       if (uob != null && uob1 != null) {
          int i = uob1.i(this.f);
          if (uob.i(this.f) <= 512 && i <= 512) {
             return true;
          }
       }
       return false;
    }
    public final void v(InputStream p0){
       try{
          for (int i = 0; i < a.Q.length; i = i + 1) {
             this.d[i] = new HashMap();
          }
          BufferedInputStream uBufferedInp = new BufferedInputStream(p0, 5000);
          this.c = this.i(uBufferedInp);
          a$a uoa = new a$a(uBufferedInp);
          switch (this.c){
              case 0:
              case 2:
              case 3:
              case 5:
              case 6:
              case 8:
              case 11:
              case 1:
                this.l(uoa);
                break;
              case 4:
                this.h(uoa, 0, 0);
                break;
              case 7:
                this.j(uoa);
                break;
              case 9:
                this.k(uoa);
                break;
              case 10:
                this.m(uoa);
                break;
              default:
          }
          this.B(uoa);
          this.q = true;
       }catch(java.io.IOException e0){
          this.q = e0;
       }
       this.a();
       return;
    }
    public final void w(a$a p0,int p1){
       ByteOrder uByteOrder = this.x(p0);
       this.f = uByteOrder;
       p0.e(uByteOrder);
       int i = p0.readUnsignedShort();
       a tc = this.c;
       if (tc == 7 || (tc != 10 && i != 42)) {
          throw new IOException("Invalid start code: "+Integer.toHexString(i));
       }
       i = p0.readInt();
       if (i < 8 || i >= p1) {
          throw new IOException("Invalid first Ifd offset: "+i);
       }
       i = i - 8;
       if (i <= 0 || p0.skipBytes(i) == i) {
          return;
       }
       throw new IOException("Couldn\'t jump to first Ifd: "+i);
    }
    public final ByteOrder x(a$a p0){
       short s = p0.readShort();
       if (s == 0x4949) {
          return ByteOrder.LITTLE_ENDIAN;
       }
       if (s == 0x4d4d) {
          return ByteOrder.BIG_ENDIAN;
       }
       throw new IOException("Invalid byte order: "+Integer.toHexString(s));
    }
    public final void y(byte[] p0,int p1){
       a$a uoa = new a$a(p0);
       this.w(uoa, p0.length);
       this.z(uoa, p1);
    }
    public final void z(a$a p0,int p1){
       int i5;
       long l2;
       short s1;
       int i6;
       int i7;
       int i8;
       a uoa = this;
       a$a uoa1 = p0;
       int i = p1;
       uoa.e.add(Integer.valueOf(uoa1.e));
       if ((uoa1.e + 2) > uoa1.d) {
          return;
       }
       int s = p0.readShort();
       if ((uoa1.e + (s * 12)) <= uoa1.d && s > 0) {
          int i1 = 0;
          a uoa2 = null;
          while (i1 < s) {
             int i2 = p0.readUnsignedShort();
             int i3 = p0.readUnsignedShort();
             int i4 = p0.readInt();
             long l = (long)p0.a() + 4;
             a$c uoc = a.U[i].get(Integer.valueOf(i2));
             long l1 = 7;
             if (uoc != null && i3 > 0) {
                int[] e = a.E;
                if (i3 < e.length) {
                   if (!uoc.a(i3)) {
                      object oobject = a.D[i3];
                   }else if(i3 == l1){
                      i3 = uoc.c;
                   }
                   i5 = i2;
                   l1 = (long)i4 * (long)e[i3];
                   if (l1 - uoa2 < 0 || l1 - 0x7fffffff > 0) {
                   label_0087 :
                      l2 = 0;
                   label_0088 :
                      if (!l2) {
                         uoa1.d(l);
                         s1 = s;
                         i6 = i1;
                      }else {
                         String str = "Compression";
                         if (l1 - 4 > 0) {
                            i6 = p0.readInt();
                            uoa2 = uoa.c;
                            if (uoa2 == 7) {
                               if (("MakerNote").equals(uoc.b)) {
                                  uoa.m = i6;
                               }else if(i == 6 && ("ThumbnailImage").equals(uoc.b)){
                                  uoa.n = i6;
                                  uoa.o = i4;
                                  s1 = s;
                                  i7 = i3;
                                  i8 = i4;
                                  i4 = 4;
                                  uoa.d[i4].put(str, a$b.f(6, uoa.f));
                                  uoa.d[i4].put("JPEGInterchangeFormat", a$b.b((long)uoa.n, uoa.f));
                                  uoa.d[i4].put("JPEGInterchangeFormatLength", a$b.b((long)uoa.o, uoa.f));
                               }
                               s1 = s;
                               i7 = i3;
                               i8 = i4;
                            }else {
                               s1 = s;
                               i7 = i3;
                               i8 = i4;
                               if (uoa2 == 10 && ("JpgFromRaw").equals(uoc.b)) {
                                  uoa.p = i6;
                               }
                            }
                            long l3 = (long)i6;
                            long l4 = l3 + l1;
                            i6 = i1;
                            if (l4 - (long)uoa1.d <= 0) {
                               uoa1.d(l3);
                            }else {
                               uoa1.d(l);
                            }
                         }else {
                            s1 = s;
                            i6 = i1;
                            i7 = i3;
                            i8 = i4;
                         }
                         Integer integer = a.X.get(Integer.valueOf(i5));
                         s = 8;
                         i1 = 3;
                         if (integer != null) {
                            long l5 = -1;
                            i3 = i7;
                            if (i3 != i1) {
                               if (i3 != 4) {
                                  if (i3 != s) {
                                     if (i3 != 9 && i3 != 13) {
                                     label_0168 :
                                        if (l5 - null > 0 && (l5 - (long)uoa1.d < 0 && !uoa.e.contains(Integer.valueOf((int)l5)))) {
                                           uoa1.d(l5);
                                           uoa.z(uoa1, integer.intValue());
                                        }
                                     label_018c :
                                        uoa1.d(l);
                                     }else {
                                        s = p0.readInt();
                                     }
                                  }else {
                                     s = p0.readShort();
                                  }
                               }else {
                                  l5 = p0.c();
                                  goto label_0168 ;
                               }
                            }else {
                               s = p0.readUnsignedShort();
                            }
                            l5 = (long)s;
                            goto label_0168 ;
                         }else {
                            byte[] uobyteArray = new byte[(int)l1];
                            uoa1.readFully(uobyteArray);
                            a$b uob = new a$b(i7, i8, uobyteArray);
                            uoa.d[p1].put(uoc.b, uob);
                            if (("DNGVersion").equals(uoc.b)) {
                               uoa.c = i1;
                            }
                            if (("Make").equals(uoc.b) || (!("Model").equals(uoc.b) || ((uob.j(uoa.f)).contains("PENTAX") || (str.equals(uoc.b) && uob.i(uoa.f) == 0xffff)))) {
                               uoa.c = s;
                            }
                            if ((long)p0.a() - l) {
                               uoa1.d(l);
                            }
                         }
                      }
                      i1 = i6 + 1;
                      i1 = (short)i1;
                      i = p1;
                      s = s1;
                   }else {
                      l2 = 1;
                      goto label_0088 ;
                   }
                }
             }
             i5 = i2;
             l1 = uoa2;
             goto label_0087 ;
          }
          if ((p0.a() + 4) <= uoa1.d) {
             i = p0.readInt();
             long l6 = (long)i;
             if (l6 - null > 0 && (i < uoa1.d && !uoa.e.contains(Integer.valueOf(i)))) {
                uoa1.d(l6);
                s = 4;
                if (uoa.d[s].isEmpty()) {
                   uoa.z(uoa1, s);
                }else if(uoa.d[5].isEmpty()){
                   uoa.z(uoa1, 5);
                }
             }
          }
       }
       return;
    }
}
