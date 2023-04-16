package com.yxcorp.gifshow.postentrance.util.b$a;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class b$a	// class@00108c
{
    public String mMissId;
    public String mMissInfo;
    public int mMissType;

    public void b$a(int p0,String p1,String p2){
       super();
       this.mMissType = p0;
       if (!TextUtils.x(p2)) {
          this.mMissId = p2;
       }
       if (!TextUtils.x(p1)) {
          this.mMissInfo = p1;
       }
       return;
    }
}
