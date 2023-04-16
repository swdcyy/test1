package com.kwai.logger.upload.retrieve.azeroth.e;
import erd.r;
import java.lang.Object;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Task;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class e implements r	// class@000eec
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final boolean test(Object p0){
       return (TextUtils.isEmpty(p0.taskId) ^ 0x01);
    }
}
