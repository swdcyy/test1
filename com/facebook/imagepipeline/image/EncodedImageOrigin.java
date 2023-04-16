package com.facebook.imagepipeline.image.EncodedImageOrigin;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class EncodedImageOrigin extends Enum	// class@0010f9
{
    public final String mOrigin;
    public static final EncodedImageOrigin[] $VALUES;
    public static final EncodedImageOrigin DISK;
    public static final EncodedImageOrigin ENCODED_MEM_CACHE;
    public static final EncodedImageOrigin NETWORK;
    public static final EncodedImageOrigin NOT_SET;

    static {
       EncodedImageOrigin uEncodedImag = new EncodedImageOrigin("NOT_SET", 0, "not_set");
       EncodedImageOrigin.NOT_SET = uEncodedImag;
       EncodedImageOrigin uEncodedImag1 = new EncodedImageOrigin("NETWORK", 1, "network");
       EncodedImageOrigin.NETWORK = uEncodedImag1;
       EncodedImageOrigin uEncodedImag2 = new EncodedImageOrigin("DISK", 2, "disk");
       EncodedImageOrigin.DISK = uEncodedImag2;
       EncodedImageOrigin uEncodedImag3 = new EncodedImageOrigin("ENCODED_MEM_CACHE", 3, "encoded_mem_cache");
       EncodedImageOrigin.ENCODED_MEM_CACHE = uEncodedImag3;
       EncodedImageOrigin[] uEncodedImag4 = new EncodedImageOrigin[]{uEncodedImag,uEncodedImag1,uEncodedImag2,uEncodedImag3};
       EncodedImageOrigin.$VALUES = uEncodedImag4;
    }
    public void EncodedImageOrigin(String p0,int p1,String p2){
       super(p0, p1);
       this.mOrigin = p2;
    }
    public static EncodedImageOrigin valueOf(String p0){
       return Enum.valueOf(EncodedImageOrigin.class, p0);
    }
    public static EncodedImageOrigin[] values(){
       return EncodedImageOrigin.$VALUES.clone();
    }
    public String toString(){
       return this.mOrigin;
    }
}
