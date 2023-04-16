package com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement;

public class PhotoAdvertisement$AxisDirection implements Serializable, Cloneable	// class@0008cf
{
    public int mRotateDegree;
    public int mRotateDirection;
    public static final long serialVersionUID = 0x227648b8d46f8296;

    public void PhotoAdvertisement$AxisDirection(){
       super();
       this.mRotateDegree = PhotoAdvertisement.ROTATE_DEGREE_DEFAULT;
       this.mRotateDirection = 3;
    }
}
