package com.ta.utdid2.a.a.d;

public class d	// class@000cc1
{

    public static byte[] getBytes(int p0){
       byte[] uobyteArray = new byte[]{(byte)((p0 >> 8) % 256),(byte)(p0 % 256),(byte)(p0 % 256),(byte)(p0 % 256)};
       p0 = p0 >> 8;
       p0 = p0 >> 8;
       return uobyteArray;
    }
}
