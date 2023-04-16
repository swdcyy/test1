package com.google.protobuf.nano.InternalNano;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.FieldArray;
import java.util.Map;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.IllegalStateException;
import java.util.Arrays;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MessageNano;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;

public final class InternalNano	// class@0005c7
{
    public static final Charset ISO_8859_1;
    public static final Object LAZY_INIT_LOCK;
    public static final Charset UTF_8;

    static {
       InternalNano.UTF_8 = Charset.forName("UTF-8");
       InternalNano.ISO_8859_1 = Charset.forName("ISO-8859-1");
       InternalNano.LAZY_INIT_LOCK = new Object();
    }
    public void InternalNano(){
       super();
    }
    public static byte[] bytesDefaultValue(String p0){
       return p0.getBytes(InternalNano.ISO_8859_1);
    }
    public static void cloneUnknownFieldData(ExtendableMessageNano p0,ExtendableMessageNano p1){
       p0 = p0.unknownFieldData;
       if (p0 != null) {
          p1.unknownFieldData = p0.clone();
       }
       return;
    }
    public static int computeMapFieldSize(Map p0,int p1,int p2,int p3){
       p1 = CodedOutputByteBufferNano.computeTagSize(p1);
       Iterator iterator = p0.entrySet().iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return i;
          }
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          Object value = uEntry.getValue();
          if (key != null && value != null) {
             int i1 = CodedOutputByteBufferNano.computeFieldSize(1, p2, key) + CodedOutputByteBufferNano.computeFieldSize(2, p3, value);
             int i2 = p1 + i1;
             i2 = i2 + CodedOutputByteBufferNano.computeRawVarint32Size(i1);
             i = i + i2;
          }else {
             break ;
          }
       }
       throw new IllegalStateException("keys and values in maps cannot be null");
    }
    public static byte[] copyFromUtf8(String p0){
       return p0.getBytes(InternalNano.UTF_8);
    }
    public static boolean equals(Map p0,Map p1){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       if (p0 == null) {
          if (p1.size()) {
             b = false;
          }
          return b;
       }else if(p1 == null){
          if (p0.size()) {
             b = false;
          }
          return b;
       }else if(p0.size() != p1.size()){
          return false;
       }else {
          Iterator iterator = p0.entrySet().iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return b;
             }
             Map$Entry uEntry = iterator.next();
             if (!p1.containsKey(uEntry.getKey())) {
                break ;
             }else if(!InternalNano.equalsMapValue(uEntry.getValue(), p1.get(uEntry.getKey()))){
                return false;
             }
          }
          return false;
       }
    }
    public static boolean equals(double[] p0,double[] p1){
       if (p0 != null && p0.length) {
          return Arrays.equals(p0, p1);
       }
       boolean b = (p1 == null || !p1.length)? true: false;
       return b;
    }
    public static boolean equals(float[] p0,float[] p1){
       if (p0 != null && p0.length) {
          return Arrays.equals(p0, p1);
       }
       boolean b = (p1 == null || !p1.length)? true: false;
       return b;
    }
    public static boolean equals(int[] p0,int[] p1){
       if (p0 != null && p0.length) {
          return Arrays.equals(p0, p1);
       }
       boolean b = (p1 == null || !p1.length)? true: false;
       return b;
    }
    public static boolean equals(long[] p0,long[] p1){
       if (p0 != null && p0.length) {
          return Arrays.equals(p0, p1);
       }
       boolean b = (p1 == null || !p1.length)? true: false;
       return b;
    }
    public static boolean equals(Object[] p0,Object[] p1){
       int i = (p0 == null)? 0: p0.length;
       int i1 = (p1 == null)? 0: p1.length;
       int i2 = 0;
       int i3 = 0;
       while (i2 < i && p0[i2] == null) {
          i2 = i2 + 1;
       }
       while (i3 < i1 && p1[i3] == null) {
          i3 = i3 + 1;
       }
       boolean b = true;
       object oobject = (i2 >= i)? 1: null;
       int i4 = (i3 >= i1)? 1: 0;
       if (oobject && i4) {
          return b;
       }else if(oobject != i4){
          return false;
       }else if(!p0[i2].equals(p1[i3])){
          return false;
       }else {
          i2 = i2 + 1;
          i3 = i3 + 1;
          goto label_000d ;
       }
    }
    public static boolean equals(boolean[] p0,boolean[] p1){
       if (p0 != null && p0.length) {
          return Arrays.equals(p0, p1);
       }
       boolean b = (p1 == null || !p1.length)? true: false;
       return b;
    }
    public static boolean equals(byte[][] p0,byte[][] p1){
       int i = (p0 == null)? 0: p0.length;
       int i1 = (p1 == null)? 0: p1.length;
       int i2 = 0;
       int i3 = 0;
       while (i2 < i && p0[i2] == null) {
          i2 = i2 + 1;
       }
       while (i3 < i1 && p1[i3] == null) {
          i3 = i3 + 1;
       }
       boolean b = true;
       object oobject = (i2 >= i)? 1: null;
       int i4 = (i3 >= i1)? 1: 0;
       if (oobject && i4) {
          return b;
       }else if(oobject != i4){
          return false;
       }else if(!Arrays.equals(p0[i2], p1[i3])){
          return false;
       }else {
          i2 = i2 + 1;
          i3 = i3 + 1;
          goto label_000d ;
       }
    }
    public static boolean equalsMapValue(Object p0,Object p1){
       if (p0 == null || p1 == null) {
          throw new IllegalStateException("keys and values in maps cannot be null");
       }
       if (p0 instanceof byte[] && p1 instanceof byte[]) {
          return Arrays.equals(p0, p1);
       }
       return p0.equals(p1);
    }
    public static int hashCode(Map p0){
       int i = 0;
       if (p0 == null) {
          return i;
       }
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i1 = InternalNano.hashCodeForMap(uEntry.getValue()) ^ InternalNano.hashCodeForMap(uEntry.getKey());
          i = i + i1;
       }
       return i;
    }
    public static int hashCode(double[] p0){
       int i = (p0 == null || !p0.length)? 0: Arrays.hashCode(p0);
       return i;
    }
    public static int hashCode(float[] p0){
       int i = (p0 == null || !p0.length)? 0: Arrays.hashCode(p0);
       return i;
    }
    public static int hashCode(int[] p0){
       int i = (p0 == null || !p0.length)? 0: Arrays.hashCode(p0);
       return i;
    }
    public static int hashCode(long[] p0){
       int i = (p0 == null || !p0.length)? 0: Arrays.hashCode(p0);
       return i;
    }
    public static int hashCode(Object[] p0){
       int i = 0;
       int i1 = (p0 == null)? 0: p0.length;
       int i2 = 0;
       while (i < i1) {
          object oobject = p0[i];
          if (oobject != null) {
             i2 = i2 * 31;
             i2 = i2 + oobject.hashCode();
          }
          i = i + 1;
       }
       return i2;
    }
    public static int hashCode(boolean[] p0){
       int i = (p0 == null || !p0.length)? 0: Arrays.hashCode(p0);
       return i;
    }
    public static int hashCode(byte[][] p0){
       int i = 0;
       int i1 = (p0 == null)? 0: p0.length;
       int i2 = 0;
       while (i < i1) {
          object oobject = p0[i];
          if (oobject != null) {
             i2 = i2 * 31;
             i2 = i2 + Arrays.hashCode(oobject);
          }
          i = i + 1;
       }
       return i2;
    }
    public static int hashCodeForMap(Object p0){
       if (p0 instanceof byte[]) {
          return Arrays.hashCode(p0);
       }
       return p0.hashCode();
    }
    public static final Map mergeMapEntry(CodedInputByteBufferNano p0,Map p1,MapFactories$MapFactory p2,int p3,int p4,Object p5,int p6,int p7){
       p1 = p2.forMap(p1);
       int i = p0.pushLimit(p0.readRawVarint32());
       Object obj = null;
       int i1 = p0.readTag();
       while (i1) {
          if (i1 == p6) {
             obj = p0.readPrimitiveField(p3);
          }else if(i1 == p7){
             if (p4 == 11) {
                p0.readMessage(p5);
             }else {
                p5 = p0.readPrimitiveField(p4);
             }
          }else if(!p0.skipField(i1)){
             break ;
          }
       }
       p0.checkLastTagWas(0);
       p0.popLimit(i);
       if (obj == null) {
          obj = InternalNano.primitiveDefaultValue(p3);
       }
       if (p5 == null) {
          p5 = InternalNano.primitiveDefaultValue(p4);
       }
       p1.put(obj, p5);
       return p1;
    }
    public static Object primitiveDefaultValue(int p0){
       switch (p0){
           case 1:
             return Double.valueOf(0);
           case 2:
             return Float.valueOf(0);
           case 3:
           case 6:
           case 16:
           case 18:
           case 4:
             return Long.valueOf(0);
           case 5:
           case 13:
           case 14:
           case 15:
           case 17:
           case 7:
             return Integer.valueOf(0);
           case 8:
             return Boolean.FALSE;
           case 9:
             return "";
           case 12:
             return WireFormatNano.EMPTY_BYTES;
           default:
          label_0003 :
             throw new IllegalArgumentException("Type: "+p0+" is not a primitive type.");
       }
    }
    public static void serializeMapField(CodedOutputByteBufferNano p0,Map p1,int p2,int p3,int p4){
       Iterator iterator = p1.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          Object value = uEntry.getValue();
          if (key != null && value != null) {
             int i = CodedOutputByteBufferNano.computeFieldSize(1, p3, key) + CodedOutputByteBufferNano.computeFieldSize(2, p4, value);
             p0.writeTag(p2, 2);
             p0.writeRawVarint32(i);
             p0.writeField(1, p3, key);
             p0.writeField(2, p4, value);
          }else {
             break ;
          }
       }
       throw new IllegalStateException("keys and values in maps cannot be null");
    }
    public static String stringDefaultValue(String p0){
       return new String(p0.getBytes(InternalNano.ISO_8859_1), InternalNano.UTF_8);
    }
}
