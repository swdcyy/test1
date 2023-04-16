package com.yxcorp.gifshow.v3.m;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class m implements g	// class@001541
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("EditorActivity", "mCropPhotoWorkEventDisposable", p0);
    }
}
