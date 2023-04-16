package com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView$a;
import java.lang.Runnable;
import java.lang.Object;
import zyc.b;
import java.util.List;
import java.util.Iterator;
import zyc.a;
import zyc.f;
import android.content.Context;
import java.lang.String;
import zyc.c;

public final class KwaiCDNImageView$a implements Runnable	// class@001961
{
    public static final KwaiCDNImageView$a b;

    static {
       KwaiCDNImageView$a.b = new KwaiCDNImageView$a();
    }
    public void KwaiCDNImageView$a(){
       super();
    }
    public final void run(){
       Application d = b.d;
       if (d != null) {
          Iterator iterator = b.b().iterator();
          while (iterator.hasNext()) {
             f.l(f.b, d, iterator.next(), "icon", null, false, 24, null);
          }
       }
       return;
    }
}
