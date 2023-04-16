package com.kuaishou.webkit.adapter.WebIconDatabaseAdapter$IconListenerAdapter;
import android.webkit.WebIconDatabase$IconListener;
import com.kuaishou.webkit.adapter.WebIconDatabaseAdapter;
import com.kuaishou.webkit.WebIconDatabase$IconListener;
import java.lang.Object;
import java.lang.String;
import android.graphics.Bitmap;

public class WebIconDatabaseAdapter$IconListenerAdapter implements WebIconDatabase$IconListener	// class@0012bd
{
    public WebIconDatabase$IconListener mStub;
    public final WebIconDatabaseAdapter this$0;

    public void WebIconDatabaseAdapter$IconListenerAdapter(WebIconDatabaseAdapter p0,WebIconDatabase$IconListener p1){
       this.this$0 = p0;
       super();
       this.mStub = p1;
    }
    public void onReceivedIcon(String p0,Bitmap p1){
       this.mStub.onReceivedIcon(p0, p1);
    }
}
