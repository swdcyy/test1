package com.tencent.open.web.security.a;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputConnection;
import java.lang.CharSequence;
import java.lang.String;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import android.view.KeyEvent;

public class a extends InputConnectionWrapper	// class@000f89
{
    public static String a;
    public static boolean b;
    public static boolean c;

    public void a(InputConnection p0,boolean p1){
       super(p0, p1);
    }
    public boolean commitText(CharSequence p0,int p1){
       a.c = true;
       a.a = p0.toString();
       SLog.v("openSDK_LOG.CaptureInputConnection", "-->commitText: "+p0.toString());
       return super.commitText(p0, p1);
    }
    public boolean sendKeyEvent(KeyEvent p0){
       if (!p0.getAction()) {
          SLog.i("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
          a.a = String.valueOf((char)p0.getUnicodeChar());
          a.c = true;
          SLog.d("openSDK_LOG.CaptureInputConnection", "s: "+a.a);
       }
       SLog.d("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: "+a.a);
       return super.sendKeyEvent(p0);
    }
    public boolean setComposingText(CharSequence p0,int p1){
       a.c = true;
       a.a = p0.toString();
       SLog.v("openSDK_LOG.CaptureInputConnection", "-->setComposingText: "+p0.toString());
       return super.setComposingText(p0, p1);
    }
}
