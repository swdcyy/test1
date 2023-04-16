package com.google.protobuf.TextFormatEscaper;
import java.lang.Object;
import com.google.protobuf.ByteString;
import java.lang.String;
import com.google.protobuf.TextFormatEscaper$1;
import com.google.protobuf.TextFormatEscaper$ByteSequence;
import java.lang.StringBuilder;
import com.google.protobuf.TextFormatEscaper$2;
import java.lang.CharSequence;

public final class TextFormatEscaper	// class@0004ca
{

    public void TextFormatEscaper(){
       super();
    }
    public static String escapeBytes(ByteString p0){
       return TextFormatEscaper.escapeBytes(new TextFormatEscaper$1(p0));
    }
    public static String escapeBytes(TextFormatEscaper$ByteSequence p0){
       StringBuilder str = new StringBuilder(p0.size());
       int i = 0;
       while (i < p0.size()) {
          int b = p0.byteAt(i);
          if (b != 34) {
             if (b != 39) {
                char c = '\';
                if (b != c) {
                   switch (b){
                       case 7:
                         str = str+"\\a";
                         break;
                       case 8:
                         str = str+"\\b";
                         break;
                       case 9:
                         str = str+"\\t";
                         break;
                       case 10:
                         str = str+"\\n";
                         break;
                       case 11:
                         str = str+"\\v";
                         break;
                       case 12:
                         str = str+"\\f";
                         break;
                       case 13:
                         str = str+"\\r";
                         break;
                       default:
                         if (b >= 32 && b <= 126) {
                            str = str+(char)b;
                         }else {
                            int i1 = b >> 6;
                            i1 = i1 & 0x03;
                            i1 = i1 + 48;
                            i1 = b >> 3;
                            i1 = i1 & 0x07;
                            i1 = i1 + 48;
                            b = b & 0x07;
                            b = b + 48;
                            str = str+c+(char)i1+(char)i1+(char)b;
                         }
                   }
                }else {
                   str = str+"\\\\";
                }
             }else {
                str = str+"\\\'";
             }
          }else {
             str = str+"\\\"";
          }
          i = i + 1;
       }
       return str;
    }
    public static String escapeBytes(byte[] p0){
       return TextFormatEscaper.escapeBytes(new TextFormatEscaper$2(p0));
    }
    public static String escapeDoubleQuotesAndBackslashes(String p0){
       return (p0.replace("\\", "\\\\")).replace("\"", "\\\"");
    }
    public static String escapeText(String p0){
       return TextFormatEscaper.escapeBytes(ByteString.copyFromUtf8(p0));
    }
}
