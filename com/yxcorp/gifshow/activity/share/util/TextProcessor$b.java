package com.yxcorp.gifshow.activity.share.util.TextProcessor$b;
import com.yxcorp.gifshow.activity.share.util.TextProcessor;
import java.lang.CharSequence;
import java.lang.Object;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$d;

public final class TextProcessor$b	// class@00148e
{

    public static CharSequence a(TextProcessor p0,CharSequence p1,int p2,int p3,int p4,Object p5){
       TextProcessor$d uod;
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          uod = p1.length();
       }
       return p0.a(p1, p2, uod);
    }
}
