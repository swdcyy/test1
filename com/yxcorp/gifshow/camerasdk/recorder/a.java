package com.yxcorp.gifshow.camerasdk.recorder.a;
import com.yxcorp.gifshow.camerasdk.recorder.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import aj9.d;
import java.io.File;
import java.lang.String;
import km6.d;
import aj9.c;
import java.lang.Runnable;
import ekd.k1;
import qi9.q1;
import java.lang.Integer;
import java.lang.Float;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class a	// class@001042
{
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final VideoContext e;
    public final List f;
    public final String[] g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public List l;
    public final List m;
    public k$i[] n;

    public void a(b p0,VideoContext p1,int p2,int p3,List p4){
       a uoa = this;
       super();
       boolean b = true;
       uoa.k = b;
       uoa.e = p1;
       b i = p0.i;
       int i1 = i.size();
       uoa.f = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       float f = 0;
       float f1 = 0;
       float f2 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i2 < i1) {
          d uod = i.get(i2);
          File uFile = new File(uod.c);
          if (!uFile.exists() || (uFile.isFile() && uFile.length() - null > 0)) {
             int i4 = uod.e - i3;
             if (i4 > 0) {
                uArrayList.add(uod.c);
                f = f + uod.f;
                d g = uod.g;
                f1 = f1 + g;
                d uod1 = new d();
                uod1.a = i4;
                uod1.b = uod.b;
                uod1.c = g;
                uod1.d = uod.h;
                uod1.e = uod.i;
                uod1.f = uod.k;
                uod1.h = uod.c;
                uod1.g = uod.j;
                uoa.f.add(uod1);
                float f3 = uod1.c * (float)uod1.a;
                f2 = f2 + f3;
                g = uod.e;
             }
          }
          i2 = i2 + 1;
       }
       k1.o(new c(uoa, f, i1, f1));
       String[] stringArray = new String[uArrayList.size()];
       uoa.g = uArrayList.toArray(stringArray);
       uoa.c = i3;
       f2 = f2 / (float)i3;
       uoa.d = f2;
       Object[] objArray = new Object[]{Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(i3),Float.valueOf(f2)};
       objArray = new Object[0];
       q1.C().w("Recorder", String.format("w:%d h:%d duration:%d fps:%f", objArray), objArray);
       uoa.a = p2;
       uoa.b = p3;
       ArrayList uArrayList1 = (p4 == null)? new ArrayList(): p4;
       uoa.m = uArrayList1;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecordInfo{mWidth="+this.a+", mHeight="+this.b+", mDuration="+this.c+", mAverageFps="+this.d+", mRecordParts="+this.f+", mVideoFiles="+Arrays.toString(this.g)+", mMagicAudioFile=\'"+this.h+'''+", mBGMAudioFile=\'"+this.i+'''+", mBGMAudioFileIsWhole=\'"+this.j+'''+", mRawAudioFileEnabled="+this.k+'}';
    }
}
