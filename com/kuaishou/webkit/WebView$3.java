package com.kuaishou.webkit.WebView$3;
import android.webkit.WebView$PictureListener;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebView$PictureListener;
import java.lang.Object;
import android.webkit.WebView;
import android.graphics.Picture;

public class WebView$3 implements WebView$PictureListener	// class@001281
{
    public final WebView this$0;
    public final WebView$PictureListener val$listener;

    public void WebView$3(WebView p0,WebView$PictureListener p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void onNewPicture(WebView p0,Picture p1){
       this.val$listener.onNewPicture(this.this$0, p1);
    }
}
