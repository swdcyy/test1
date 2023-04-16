package com.unionpay.utils.f;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;

public final class f	// class@00100e
{

    public static int a(Context p0,float p1){
       return (int)((p1 * c.c(p0.getResources()).density) + 0x3f000000);
    }
}
