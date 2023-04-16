package okhttp3.internal.http2.Http2;
import java.lang.String;
import okio.ByteString;
import java.lang.Object;
import java.lang.Integer;
import okhttp3.internal.Util;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Byte;
import java.lang.IllegalArgumentException;
import java.io.IOException;

public final class Http2	// class@001f9d
{
    public static final String[] BINARY;
    public static final ByteString CONNECTION_PREFACE;
    public static final String[] FLAGS;
    public static final String[] FRAME_NAMES;

    static {
       int i3;
       int i4;
       Http2.CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
       String[] stringArray = new String[]{"DATA","HEADERS","PRIORITY","RST_STREAM","SETTINGS","PUSH_PROMISE","PING","GOAWAY","WINDOW_UPDATE","CONTINUATION"};
       Http2.FRAME_NAMES = stringArray;
       stringArray = new String[64];
       Http2.FLAGS = stringArray;
       stringArray = new String[256];
       Http2.BINARY = stringArray;
       int i = 0;
       int i1 = 0;
       String[] bINARY = Http2.BINARY;
       char c = ' ';
       int i2 = 1;
       while (i1 < bINARY.length) {
          Object[] objArray = new Object[i2];
          objArray[i] = Integer.toBinaryString(i1);
          bINARY[i1] = (Util.format("%8s", objArray)).replace(c, '0');
          i1 = i1 + 1;
       }
       String[] fLAGS = Http2.FLAGS;
       fLAGS[i] = "";
       fLAGS[i2] = "END_STREAM";
       int[] ointArray = new int[i2];
       ointArray[i] = i2;
       fLAGS[8] = "PADDED";
       i1 = 0;
       String str = "|PADDED";
       while (i1 < i2) {
          i3 = ointArray[i1];
          String[] fLAGS1 = Http2.FLAGS;
          i4 = i3 | 0x08;
          fLAGS1[i4] = fLAGS1[i3]+str;
          i1 = i1 + 1;
       }
       fLAGS = Http2.FLAGS;
       fLAGS[4] = "END_HEADERS";
       fLAGS[c] = "PRIORITY";
       fLAGS[36] = "END_HEADERS|PRIORITY";
       i1 = 3;
       int[] ointArray1 = new int[i1]{4,32,'$'};
       i3 = 0;
       while (i3 < i1) {
          int i5 = ointArray1[i3];
          for (i4 = 0; i4 < i2; i4 = i4 + 1) {
             int i6 = ointArray[i4];
             String[] fLAGS2 = Http2.FLAGS;
             int i7 = i6 | i5;
             fLAGS2[i7] = fLAGS2[i6]+'|'+fLAGS2[i5];
             i7 = i7 | 8;
             fLAGS2[i7] = fLAGS2[i6]+'|'+fLAGS2[i5]+str;
          }
          i3 = i3 + 1;
       }
       fLAGS = Http2.FLAGS;
       while (i < fLAGS.length) {
          if (fLAGS[i] == null) {
             fLAGS[i] = Http2.BINARY[i];
          }
          i = i + 1;
       }
    }
    public void Http2(){
       super();
    }
    public static String formatFlags(byte p0,byte p1){
       String str;
       if (!p1) {
          return "";
       }
       if (p0 != 2 && p0 != 3) {
          if (p0 != 4 && p0 != 6) {
             if (p0 != 7 && p0 != 8) {
                String[] fLAGS = Http2.FLAGS;
                object oobject = (p1 < fLAGS.length)? fLAGS[p1]: Http2.BINARY[p1];
                if (p0 == 5 && (p1 & 0x04)) {
                   return oobject.replace("HEADERS", "PUSH_PROMISE");
                }else if(!p0 && (p1 & 0x20)){
                   return oobject.replace("PRIORITY", "COMPRESSED");
                }else {
                   return oobject;
                }
             }
          }else if(p1 == 1){
             str = "ACK";
          }else {
             str = Http2.BINARY[p1];
          }
          return str;
       }
       return Http2.BINARY[p1];
    }
    public static String frameLog(boolean p0,int p1,int p2,byte p3,byte p4){
       object oobject;
       String[] fRAME_NAMES = Http2.FRAME_NAMES;
       if (p3 < fRAME_NAMES.length) {
          oobject = fRAME_NAMES[p3];
       }else {
          Object[] objArray1 = new Object[]{Byte.valueOf(p3)};
          oobject = Util.format("0x%02x", objArray1);
       }
       String str = Http2.formatFlags(p3, p4);
       Object[] objArray = new Object[5];
       String str1 = (p0)? "<<": ">>";
       objArray[0] = str1;
       objArray[1] = Integer.valueOf(p1);
       objArray[2] = Integer.valueOf(p2);
       objArray[3] = oobject;
       objArray[4] = str;
       return Util.format("%s 0x%08x %5d %-13s %s", objArray);
    }
    public static IllegalArgumentException illegalArgument(String p0,Object[] p1){
       throw new IllegalArgumentException(Util.format(p0, p1));
    }
    public static IOException ioException(String p0,Object[] p1){
       throw new IOException(Util.format(p0, p1));
    }
}
