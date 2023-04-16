package com.google.protobuf.Internal;
import java.lang.String;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedInputStream;
import java.lang.Object;
import com.google.protobuf.ByteString;
import java.util.Objects;
import java.nio.Buffer;
import java.util.List;
import java.util.Arrays;
import java.lang.Class;
import com.google.protobuf.MessageLite;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.util.Iterator;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Utf8;
import com.google.protobuf.MessageLite$Builder;

public final class Internal	// class@000457
{
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    public static final Charset ISO_8859_1;
    public static final Charset UTF_8;

    static {
       Internal.UTF_8 = Charset.forName("UTF-8");
       Internal.ISO_8859_1 = Charset.forName("ISO-8859-1");
       byte[] uobyteArray = new byte[0];
       Internal.EMPTY_BYTE_ARRAY = uobyteArray;
       Internal.EMPTY_BYTE_BUFFER = ByteBuffer.wrap(uobyteArray);
       Internal.EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(uobyteArray);
    }
    public void Internal(){
       super();
    }
    public static byte[] byteArrayDefaultValue(String p0){
       return p0.getBytes(Internal.ISO_8859_1);
    }
    public static ByteBuffer byteBufferDefaultValue(String p0){
       return ByteBuffer.wrap(Internal.byteArrayDefaultValue(p0));
    }
    public static ByteString bytesDefaultValue(String p0){
       return ByteString.copyFrom(p0.getBytes(Internal.ISO_8859_1));
    }
    public static Object checkNotNull(Object p0){
       Objects.requireNonNull(p0);
       return p0;
    }
    public static Object checkNotNull(Object p0,String p1){
       Objects.requireNonNull(p0, p1);
       return p0;
    }
    public static ByteBuffer copyByteBuffer(ByteBuffer p0){
       p0 = p0.duplicate();
       p0.clear();
       ByteBuffer uByteBuffer = ByteBuffer.allocate(p0.capacity());
       uByteBuffer.put(p0);
       uByteBuffer.clear();
       return uByteBuffer;
    }
    public static boolean equals(List p0,List p1){
       if (p0.size() != p1.size()) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p0.size()) {
             return true;
          }
          if (!Arrays.equals(p0.get(i), p1.get(i))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static boolean equalsByteBuffer(ByteBuffer p0,ByteBuffer p1){
       if (p0.capacity() != p1.capacity()) {
          return false;
       }
       return p0.duplicate().clear().equals(p1.duplicate().clear());
    }
    public static boolean equalsByteBuffer(List p0,List p1){
       if (p0.size() != p1.size()) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p0.size()) {
             return true;
          }
          if (!Internal.equalsByteBuffer(p0.get(i), p1.get(i))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static MessageLite getDefaultInstance(Class p0){
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return p0.getMethod("getDefaultInstance", uClassArray).invoke(p0.getMethod("getDefaultInstance", uClassArray), objArray);
       }catch(java.lang.Exception e0){
          throw new RuntimeException("Failed to get default instance for "+p0, e0);
       }
    }
    public static int hashBoolean(boolean p0){
       int i = (p0)? 1231: 1237;
       return i;
    }
    public static int hashCode(List p0){
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          i = i * 31;
          i = i + Internal.hashCode(iterator.next());
       }
       return i;
    }
    public static int hashCode(byte[] p0){
       return Internal.hashCode(p0, 0, p0.length);
    }
    public static int hashCode(byte[] p0,int p1,int p2){
       int i = Internal.partialHash(p2, p0, p1, p2);
       if (!i) {
          i = 1;
       }
       return i;
    }
    public static int hashCodeByteBuffer(ByteBuffer p0){
       int i1;
       int i = 1;
       if (p0.hasArray()) {
          i1 = Internal.partialHash(p0.capacity(), p0.array(), p0.arrayOffset(), p0.capacity());
          if (i1) {
             i = i1;
          }
          return i;
       }else {
          int i2 = 4096;
          if (p0.capacity() <= i2) {
             i2 = p0.capacity();
          }
          byte[] uobyteArray = new byte[i2];
          ByteBuffer uByteBuffer = p0.duplicate();
          uByteBuffer.clear();
          i1 = p0.capacity();
          while (uByteBuffer.remaining() > 0) {
             int i3 = (uByteBuffer.remaining() <= i2)? uByteBuffer.remaining(): i2;
             uByteBuffer.get(uobyteArray, 0, i3);
             i1 = Internal.partialHash(i1, uobyteArray, 0, i3);
          }
          if (i1) {
             i = i1;
          }
          return i;
       }
    }
    public static int hashCodeByteBuffer(List p0){
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          i = i * 31;
          i = i + Internal.hashCodeByteBuffer(iterator.next());
       }
       return i;
    }
    public static int hashEnum(Internal$EnumLite p0){
       return p0.getNumber();
    }
    public static int hashEnumList(List p0){
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          i = i * 31;
          i = i + Internal.hashEnum(iterator.next());
       }
       return i;
    }
    public static int hashLong(long p0){
       return (int)(p0 ^ (p0 >> 32));
    }
    public static boolean isValidUtf8(ByteString p0){
       return p0.isValidUtf8();
    }
    public static boolean isValidUtf8(byte[] p0){
       return Utf8.isValidUtf8(p0);
    }
    public static Object mergeMessage(Object p0,Object p1){
       return p0.toBuilder().mergeFrom(p1).buildPartial();
    }
    public static int partialHash(int p0,byte[] p1,int p2,int p3){
       int i = p2;
       int i1 = p2 + p3;
       while (i < i1) {
          p0 = p0 * 31;
          p0 = p0 + p1[i];
          i = i + 1;
       }
       return p0;
    }
    public static String stringDefaultValue(String p0){
       return new String(p0.getBytes(Internal.ISO_8859_1), Internal.UTF_8);
    }
    public static byte[] toByteArray(String p0){
       return p0.getBytes(Internal.UTF_8);
    }
    public static String toStringUtf8(byte[] p0){
       return new String(p0, Internal.UTF_8);
    }
}
