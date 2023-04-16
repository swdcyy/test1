package com.yxcorp.gifshow.media.util.a;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import android.app.Application;
import o56.a;
import x6b.b;
import android.content.Context;
import android.media.MediaScannerConnection$OnScanCompletedListener;
import android.media.MediaScannerConnection;

public final class a implements g	// class@001d1d
{
    public final String b;

    public void a(String p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       String[] stringArray = new String[]{this.b};
       MediaScannerConnection.scanFile(a.b(), stringArray, null, new b(p0));
    }
}
