package com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import java.lang.Object;
import com.google.protobuf.nano.CodedInputByteBufferNano;

public final class WireFormatNano	// class@0005cd
{
    public static final boolean[] EMPTY_BOOLEAN_ARRAY;
    public static final byte[] EMPTY_BYTES;
    public static final byte[][] EMPTY_BYTES_ARRAY;
    public static final double[] EMPTY_DOUBLE_ARRAY;
    public static final float[] EMPTY_FLOAT_ARRAY;
    public static final int[] EMPTY_INT_ARRAY;
    public static final long[] EMPTY_LONG_ARRAY;
    public static final String[] EMPTY_STRING_ARRAY;

    static {
       int[] ointArray = new int[0];
       WireFormatNano.EMPTY_INT_ARRAY = ointArray;
       long[] olongArray = new long[0];
       WireFormatNano.EMPTY_LONG_ARRAY = olongArray;
       float[] uofloatArray = new float[0];
       WireFormatNano.EMPTY_FLOAT_ARRAY = uofloatArray;
       double[] uodoubleArra = new double[0];
       WireFormatNano.EMPTY_DOUBLE_ARRAY = uodoubleArra;
       boolean[] uobooleanArr = new boolean[0];
       WireFormatNano.EMPTY_BOOLEAN_ARRAY = uobooleanArr;
       String[] stringArray = new String[0];
       WireFormatNano.EMPTY_STRING_ARRAY = stringArray;
       byte[][] uobyteArray = new byte[][0];
       WireFormatNano.EMPTY_BYTES_ARRAY = uobyteArray;
       byte[] uobyteArray1 = new byte[0];
       WireFormatNano.EMPTY_BYTES = uobyteArray1;
    }
    public void WireFormatNano(){
       super();
    }
    public static final int getRepeatedFieldArrayLength(CodedInputByteBufferNano p0,int p1){
       int position = p0.getPosition();
       p0.skipField(p1);
       int i = 1;
       while (p0.readTag() == p1) {
          p0.skipField(p1);
          i = i + 1;
       }
       p0.rewindToPosition(position);
       return i;
    }
    public static int getTagFieldNumber(int p0){
       return (p0 >> 3);
    }
    public static int getTagWireType(int p0){
       return (p0 & 0x07);
    }
    public static int makeTag(int p0,int p1){
       return ((p0 << 3) | p1);
    }
    public static boolean parseUnknownField(CodedInputByteBufferNano p0,int p1){
       return p0.skipField(p1);
    }
}
