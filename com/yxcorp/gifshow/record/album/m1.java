package com.yxcorp.gifshow.record.album.m1;
import erd.r;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsGetEditDraftDataResult$a;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class m1 implements r	// class@001735
{
    public static final m1 b;

    static {
       m1.b = new m1();
    }
    public void m1(){
       super();
    }
    public final boolean test(Object p0){
       return (TextUtils.isEmpty(p0.mCoverPath) ^ 0x01);
    }
}
