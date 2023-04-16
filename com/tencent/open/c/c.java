package com.tencent.open.c.c;
import com.tencent.open.c.b;
import android.content.Context;
import android.view.KeyEvent;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.kuaishou.webkit.WebView;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.open.web.security.a;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.Object;

public class c extends b	// class@000f5b
{
    public KeyEvent b;
    public a c;
    public static boolean a;

    public void c(Context p0){
       super(p0);
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       SLog.d("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: "+c.a);
       if (!c.a) {
          return super.dispatchKeyEvent(p0);
       }
       if (p0.getAction()) {
          return super.dispatchKeyEvent(p0);
       }
       int keyCode = p0.getKeyCode();
       if (keyCode == 4) {
          return super.dispatchKeyEvent(p0);
       }
       if (keyCode == 66) {
          return super.dispatchKeyEvent(p0);
       }
       if (keyCode != 67) {
          if (!p0.getUnicodeChar()) {
             return super.dispatchKeyEvent(p0);
          }
          if (SecureJsInterface.isPWDEdit) {
             keyCode = p0.getUnicodeChar();
             if (keyCode < 33 || (keyCode <= 95 || (keyCode >= 97 && keyCode <= 125))) {
                p0 = new KeyEvent(0, 17);
                this.b = p0;
                return super.dispatchKeyEvent(p0);
             }
          }
          return super.dispatchKeyEvent(p0);
       }else {
          a.b = true;
          return super.dispatchKeyEvent(p0);
       }
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       SLog.i("openSDK_LOG.SecureWebView", "-->create input connection, is edit: "+SecureJsInterface.isPWDEdit);
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       SLog.v("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is "+inputConnect);
       if (inputConnect != null) {
          c.a = true;
          a uoa = new a(super.onCreateInputConnection(p0), false);
          this.c = uoa;
          return uoa;
       }else {
          c.a = false;
          return inputConnect;
       }
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       SLog.d("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: "+c.a);
       if (!c.a) {
          return super.onKeyDown(p0, p1);
       }
       if (p1.getAction()) {
          return super.onKeyDown(p0, p1);
       }
       int keyCode = p1.getKeyCode();
       if (keyCode == 4) {
          return super.onKeyDown(p0, p1);
       }
       if (keyCode == 66) {
          return super.onKeyDown(p0, p1);
       }
       if (keyCode != 67) {
          if (!p1.getUnicodeChar()) {
             return super.onKeyDown(p0, p1);
          }
          if (SecureJsInterface.isPWDEdit) {
             keyCode = p1.getUnicodeChar();
             if (keyCode < 33 || (keyCode <= 95 || (keyCode >= 97 && keyCode <= 125))) {
                KeyEvent keyEvent = new KeyEvent(0, 17);
                this.b = keyEvent;
                return super.onKeyDown(keyEvent.getKeyCode(), this.b);
             }
          }
          return super.onKeyDown(p0, p1);
       }else {
          a.b = true;
          return super.onKeyDown(p0, p1);
       }
    }
}
