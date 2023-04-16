package com.kwai.android.register.Register;
import com.kwai.android.register.Register$Companion;
import nsd.u;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public abstract class Register	// class@0009db
{
    public Context context;
    public static final Register$Companion Companion;
    public static final CopyOnWriteArraySet registerSuccessChannel;

    static {
       Register.Companion = new Register$Companion(null);
       Register.registerSuccessChannel = new CopyOnWriteArraySet();
    }
    public void Register(Context p0){
       a.p(p0, "context");
       super();
       this.context = p0;
    }
    public final Context getContext(){
       return this.context;
    }
    public abstract void refreshToken(boolean p0);
    public abstract boolean register();
    public abstract String sdkVersion();
    public final void setContext(Context p0){
       a.p(p0, "<set-?>");
       this.context = p0;
    }
}
