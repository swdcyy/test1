package com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$liveLiteRecoGuideShowRecordTimestamp$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import v63.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.Long;

public final class LiveLiteRecoGuideController$liveLiteRecoGuideShowRecordTimestamp$2 extends Lambda implements a	// class@000ad8
{
    public static final LiveLiteRecoGuideController$liveLiteRecoGuideShowRecordTimestamp$2 INSTANCE;

    static {
       LiveLiteRecoGuideController$liveLiteRecoGuideShowRecordTimestamp$2.INSTANCE = new LiveLiteRecoGuideController$liveLiteRecoGuideShowRecordTimestamp$2();
    }
    public void LiveLiteRecoGuideController$liveLiteRecoGuideShowRecordTimestamp$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoGuideController$liveLiteRecoGuideShowRecordTimestamp$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.a.getLong(b.d("user")+"liveLiteRecoGuideShowRecordTimeStamp", 0);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
